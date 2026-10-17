package fnc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.impl.data.network.AlipayPlusProxyService;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FileOpenActivityDestination;
import com.youTransactor.uCube.connexion.SendCommandListener;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import d9.t0;
import defpackage.k0;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements b2b.e, kfm.o, el.b, ir0.h, SendCommandListener, igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f136657b;

    public s(g0d.m function) {
        this.f136656a = 3;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f136657b = function;
    }

    public static ImageView a(Context context, hx0.b0 b0Var, float f) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(new BitmapDrawable(imageView.getResources(), b0Var.f156301c));
        imageView.setPivotX(f);
        imageView.setPivotY(BitmapDescriptorFactory.HUE_RED);
        imageView.setTranslationX(b0Var.f156300b);
        imageView.setTranslationY(b0Var.f156299a);
        return imageView;
    }

    public static AnimatorSet b(s sVar, View view, float f, long j2, hx0.j jVar, int i) {
        if ((i & 4) != 0) {
            j2 = 600;
        }
        float f4 = (i & 8) != 0 ? -1.0f : BitmapDescriptorFactory.HUE_RED;
        ObjectAnimator objectAnimatorOfFloat = null;
        if ((i & 16) != 0) {
            jVar = null;
        }
        int i2 = 0;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f, view.getScaleX());
        objectAnimatorOfFloat2.setDuration(j2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, f, view.getScaleY());
        objectAnimatorOfFloat3.setDuration(j2);
        if (jVar != null) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY() + jVar.f156314a, view.getTranslationY());
            objectAnimatorOfFloat.setDuration(jVar.f156315b);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(jq0.r.f177392a);
        ObjectAnimator[] elements = {objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat};
        Intrinsics.checkNotNullParameter(elements, "elements");
        animatorSet.playTogether(kotlin.collections.d.L(elements));
        if (f4 > -1.0f) {
            float pivotY = view.getPivotY();
            view.setPivotY(f4);
            animatorSet.addListener(new hx0.k(view, pivotY, i2));
        }
        return animatorSet;
    }

    public static ObjectAnimator d(View view, long j2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(j2);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    public static boolean k(SplitBillLink splitBillLink, long j2) {
        return splitBillLink.f == b2a.a.ACTIVE && splitBillLink.e > j2;
    }

    public static boolean l(List relatedTransactions, a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(relatedTransactions, "relatedTransactions");
        Iterator it8 = relatedTransactions.iterator();
        long j2 = 0;
        while (it8.hasNext()) {
            j2 += ((a3) it8.next()).k.f115082a;
        }
        return j2 >= transaction.k.a().f115082a;
    }

    public static c5h.d p(j5h.c cVar) {
        c5h.f fVar = new c5h.f(cVar.getMinQty().getAmount(), c5h.g.valueOf(cVar.getMinQty().getUnit()), cVar.getMinQty().getWeightConversionRate());
        List<j5h.d> listA = cVar.getFees();
        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
        for (j5h.d dVar : listA) {
            String strD = dVar.getTitle();
            String strA = dVar.getDescription();
            BigDecimal bigDecimalC = dVar.getRate();
            j5h.b bVarB = dVar.getMinFee();
            BigDecimal amount = bVarB.getAmount();
            xi0.a aVar = xi0.b.Companion;
            String currency = bVarB.getCurrency();
            aVar.getClass();
            arrayList.add(new c5h.e(strD, strA, bigDecimalC, mif.a.Q(new ej0.b(amount, xi0.a.a(currency)))));
        }
        return new c5h.d(fVar, arrayList, cVar.getVatRate());
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f136656a) {
            case 24:
                ((igm.a) this.f136657b).run();
                break;
            case 25:
                Throwable th10 = (Throwable) obj2;
                igm.g gVar = (igm.g) this.f136657b;
                Objects.requireNonNull(th10, "error is null");
                gVar.accept(new fgm.f(new ygm.j(th10)));
                break;
            default:
                ml.o result = (ml.o) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ((WorkflowFragment) this.f136657b).handleOneOffUIEvent(result);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        return ((g0d.m) this.f136657b).invoke(obj2);
    }

    @Override // b2b.e
    public SwipeToActionDelegate c() {
        return (SwipeToActionDelegate) this.f136657b;
    }

    public TextLocalisedClause e() {
        return new TextLocalisedClause(((n5j.b) ((vu.g) this.f136657b)).b(vu.f.business_referrals_active_campaign_header_no_reward_title), null, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof k1a.h
            if (r0 == 0) goto L13
            r0 = r10
            k1a.h r0 = (k1a.h) r0
            int r1 = r0.f180188x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180188x = r1
            goto L18
        L13:
            k1a.h r0 = new k1a.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180188x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            long r0 = r0.u
            yhm.o.b(r10)
            goto L71
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Object r10 = r8.f136657b
            e1a.f r10 = (e1a.f) r10
            r0.u = r5
            r0.f180188x = r4
            r10.getClass()
            java.lang.String r2 = "transactionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            x4l.c r10 = r10.e
            kotlin.Unit r2 = kotlin.Unit.f186387a
            w4l.h r7 = w4l.h.f294642c
            vkm.d r10 = r10.b(r2, r7)
            d7a.p r2 = new d7a.p
            r7 = 29
            r2.<init>(r9, r7)
            akg.n r9 = nim.a.v(r10, r2)
            e07.k r10 = new e07.k
            r2 = 9
            r10.<init>(r2)
            jhi.b r9 = mo3.a.g(r9, r3, r10, r4)
            java.lang.Object r10 = vkm.q.x(r9, r0)
            if (r10 != r1) goto L70
            return r1
        L70:
            r0 = r5
        L71:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L7c:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r10.next()
            r4 = r2
            com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink r4 = (com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink) r4
            boolean r4 = k(r4, r0)
            if (r4 == 0) goto L7c
            r9.add(r2)
            goto L7c
        L93:
            java.util.Iterator r9 = r9.iterator()
            boolean r10 = r9.hasNext()
            if (r10 != 0) goto L9e
            return r3
        L9e:
            java.lang.Object r10 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto La9
            return r10
        La9:
            r0 = r10
            com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink r0 = (com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink) r0
            long r0 = r0.d
        Lae:
            java.lang.Object r2 = r9.next()
            r3 = r2
            com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink r3 = (com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink) r3
            long r3 = r3.d
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lbd
            r10 = r2
            r0 = r3
        Lbd:
            boolean r2 = r9.hasNext()
            if (r2 != 0) goto Lae
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fnc.s.f(java.lang.String, gim.c):java.lang.Object");
    }

    public BridgeDestination g(ScannedBillDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        File file = details.f92265a;
        a80.h hVar = (a80.h) ((zk0.b) this.f136657b);
        return new BridgeDestination(new ActivityNavigateCommand(new FileOpenActivityDestination("android.intent.action.VIEW", hVar.i(file), hVar.j(file), zhm.u.c(1)), null, null, null, 0, null, null, null, null, false, 1022));
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        OnfidoConfig onfidoConfig = (OnfidoConfig) ((il.f) this.f136657b).get();
        il.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        return onfidoConfig.getBiometricTokenCallback();
    }

    public c12.g h(String str) {
        n02.b bVar = n02.b.BLIK;
        hrf.f fVar = hrf.f.OUTGOING;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_new_contact_title, zhm.u.c(ApmBlik.f61809c.e()), null, 12);
        wi0.b.Companion.getClass();
        return new c12.g(new ApmNewContactNavigation$InputData(bVar, (List) null, fVar, textLocalisedClause, wi0.b.t2, (List) null, str, 98), (c12.f) this.f136657b);
    }

    @Override // ir0.h
    public Context i() {
        Context context = ((View) this.f136657b).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // ir0.h
    public void invalidate() {
        ((View) this.f136657b).invalidate();
    }

    public ViewGroup j() {
        jji.u uVar = (jji.u) this.f136657b;
        uVar.b();
        ViewGroup viewGroup = uVar.f174987b;
        return viewGroup == null ? (ViewGroup) uVar.f174986a.D2() : viewGroup;
    }

    public ht2.o m(Data referralWithIncentiveCampaign, boolean z) {
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaign, "referralWithIncentiveCampaign");
        n5j.b bVar = (n5j.b) ((vu.g) this.f136657b);
        return new ht2.o(t0.G(new TextLocalisedClause(z ? com.revolut.retail.feature.business.referrals.shared.impl.R$string.business_referrals_active_campaign_copy_link_button_title : com.revolut.retail.feature.business.referrals.shared.impl.R$string.business_referrals_c2b_refer_button_title, null, null, 14), bVar.b(vu.f.referrals_actions_refer_business)), ((Boolean) iii.c.f(referralWithIncentiveCampaign, new jpl.e(27), new jme.f(20), new jb8.b(21))).booleanValue());
    }

    public TextLocalisedClause n(Data referralWithIncentiveCampaign) {
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaign, "referralWithIncentiveCampaign");
        return t0.G((Clause) iii.c.f(referralWithIncentiveCampaign, new jlh.g(this, 23), new jnf.d(this, 9), new jt2.c(this, 0)), ((n5j.b) ((vu.g) this.f136657b)).b(vu.f.referrals_screen));
    }

    public a6e.b o() {
        return new a6e.b(rd0.e.n(((yud.g) this.f136657b).e(w4l.h.f294642c), h0.f322473a), 27);
    }

    @Override // com.youTransactor.uCube.connexion.SendCommandListener
    public void onDataSent() {
        k0 k0Var = (k0) this.f136657b;
        synchronized (k0Var.f179877c) {
            try {
                if (k0Var.f179877c.isEmpty()) {
                    return;
                }
                RPCCommand rPCCommand = k0Var.d;
                if (rPCCommand == null) {
                    return;
                }
                k0Var.f179877c.remove(rPCCommand);
                defpackage.c0 c0Var = k0Var.f.f210827b;
                RPCCommand rPCCommand2 = k0Var.d;
                if (rPCCommand2 == null) {
                    c0Var.getClass();
                } else {
                    synchronized (c0Var.f20075b) {
                        c0Var.f20075b.add(rPCCommand2);
                    }
                }
                k0Var.d.setState(RPCCommandStatus.SENT);
                synchronized (k0Var.f179875a) {
                    k0Var.f179876b = false;
                }
                k0Var.a();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.youTransactor.uCube.connexion.SendCommandListener
    public void onError() {
        k0.d((k0) this.f136657b);
    }

    public ArrayList q(List dtos) {
        kg.w config;
        Object objA;
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        List<j5h.a> list = dtos;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (j5h.a dto : list) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            String key = dto.getKey();
            c5h.c cVar = "ELIGIBLE".equalsIgnoreCase(dto.getStatus()) ? c5h.c.ELIGIBLE : c5h.c.NON_ELIGIBLE;
            c5h.d dVar = null;
            dVar = null;
            if (Intrinsics.f(dto.getKey(), "PHYSICAL_DELIVERY") && (config = dto.getConfig()) != null) {
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    Object objE = ((kg.o) this.f136657b).e(config, j5h.c.class);
                    Intrinsics.checkNotNullExpressionValue(objE, "fromJson(...)");
                    objA = p((j5h.c) objE);
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                dVar = (c5h.d) (objA instanceof yhm.n ? null : objA);
            }
            arrayList.add(new c5h.b(key, cVar, dVar));
        }
        return arrayList;
    }

    public /* synthetic */ s(Object obj2, int i) {
        this.f136656a = i;
        this.f136657b = obj2;
    }

    public s(n4j.a backendDefinitionsValidator) {
        this.f136656a = 22;
        Intrinsics.checkNotNullParameter(backendDefinitionsValidator, "backendDefinitionsValidator");
        this.f136657b = backendDefinitionsValidator;
    }

    public s(r10.w salarySwitchRequestRepository) {
        this.f136656a = 7;
        Intrinsics.checkNotNullParameter(salarySwitchRequestRepository, "salarySwitchRequestRepository");
        this.f136657b = salarySwitchRequestRepository;
    }

    public s(TransferReasonsScreenContract$InputData inputData) {
        this.f136656a = 10;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f136657b = inputData;
    }

    public s(cw9.d paymentsProductFeatureChecker) {
        this.f136656a = 23;
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f136657b = paymentsProductFeatureChecker;
    }

    public s(oid.e shopsAdvertisingInfoRepository) {
        this.f136656a = 18;
        Intrinsics.checkNotNullParameter(shopsAdvertisingInfoRepository, "shopsAdvertisingInfoRepository");
        this.f136657b = shopsAdvertisingInfoRepository;
    }

    public s(rf3.l chatAuthInfoProvider) {
        this.f136656a = 12;
        Intrinsics.checkNotNullParameter(chatAuthInfoProvider, "chatAuthInfoProvider");
        this.f136657b = chatAuthInfoProvider;
    }

    public s(xoj.a featuresInteractor) {
        this.f136656a = 6;
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f136657b = featuresInteractor;
    }

    public s(AlipayPlusProxyService service) {
        this.f136656a = 26;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f136657b = service;
    }

    public s(SalarySwitchAssistantService salarySwitchAssistantService) {
        this.f136656a = 13;
        Intrinsics.checkNotNullParameter(salarySwitchAssistantService, "salarySwitchAssistantService");
        this.f136657b = salarySwitchAssistantService;
    }

    public s(mp.p revolutXFiatPresentationModel) {
        this.f136656a = 1;
        Intrinsics.checkNotNullParameter(revolutXFiatPresentationModel, "revolutXFiatPresentationModel");
        this.f136657b = revolutXFiatPresentationModel;
    }

    public s(yud.g stakingInteractor) {
        this.f136656a = 29;
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        this.f136657b = stakingInteractor;
    }

    public s(ang.f userInteractor) {
        this.f136656a = 15;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f136657b = userInteractor;
    }

    public s(c12.f apmNewContactExtension) {
        this.f136656a = 4;
        Intrinsics.checkNotNullParameter(apmNewContactExtension, "apmNewContactExtension");
        this.f136657b = apmNewContactExtension;
    }

    public s(zk0.b fileSystemRepository) {
        this.f136656a = 8;
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f136657b = fileSystemRepository;
    }

    public s(yxc.l iconMapper) {
        this.f136656a = 9;
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f136657b = iconMapper;
    }

    public s(e1a.f repository, l80.e dateProvider) {
        this.f136656a = 21;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f136657b = repository;
    }

    public s(vu.g resourceProvider) {
        this.f136656a = 20;
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f136657b = resourceProvider;
    }

    public s(kg.o gson) {
        this.f136656a = 5;
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f136657b = gson;
    }

    public s(jji.u itemsProvider) {
        this.f136656a = 11;
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.f136657b = itemsProvider;
    }

    public s(CfdPositionsController cfdPositionsController) {
        this.f136656a = 2;
        this.f136657b = cfdPositionsController.S;
    }

    public s(kotlin.text.o match) {
        this.f136656a = 28;
        Intrinsics.checkNotNullParameter(match, "match");
        this.f136657b = match;
    }

    public s(f4h.a buildBioWidget, t portfolioStrategyMapper) {
        this.f136656a = 0;
        Intrinsics.checkNotNullParameter(buildBioWidget, "buildBioWidget");
        Intrinsics.checkNotNullParameter(portfolioStrategyMapper, "portfolioStrategyMapper");
        this.f136657b = buildBioWidget;
    }

    public s(View view) {
        this.f136656a = 16;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f136657b = view;
    }
}
