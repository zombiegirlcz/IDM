package kye;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.new_request.CardReaderNewRequestScreen;
import com.revolut.feature.junior_graduation.impl.service.JuniorGraduationDebugService;
import com.revolut.feature.payments.profile.impl.data.network.passes.DigitalPassService;
import com.revolut.feature.retail.reauth.impl.network.service.ReauthService;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import com.revolut.feature.transfer_reasons.impl.data.network.service.TransferReasonsService;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.OnboardingService;
import io.reactivex.rxjava3.disposables.Disposable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements zp0.c, sji.a, kfm.o, o2h.a, ix0.b1, igm.g, t1h.l, qxl.a, pc.c, bki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f190729b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f190728a = i;
        this.f190729b = obj2;
    }

    public static z3i.b r(tof.a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = mjf.v.f206035a[transaction.L1.ordinal()];
        if (i == 1) {
            return z3i.b.RETAIL;
        }
        if (i == 2) {
            return z3i.b.CRYPTO_EXCHANGE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // sji.a
    public Object S(BaseScreen baseScreen) {
        throw null;
    }

    @Override // bki.a
    public void a(View controllerView, os2.g uiStateBlockHandle, hli.a blockUserInteractionHandle, cli.r transitionStateLatch) {
        oii.a aVar = (oii.a) this.f190729b;
        Intrinsics.checkNotNullParameter(controllerView, "controllerView");
        Intrinsics.checkNotNullParameter(uiStateBlockHandle, "uiStateBlockHandle");
        Intrinsics.checkNotNullParameter(blockUserInteractionHandle, "blockUserInteractionHandle");
        Intrinsics.checkNotNullParameter(transitionStateLatch, "transitionStateLatch");
        Context context = controllerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityM = kli.a.m(context);
        if (activityM == null) {
            r6.b.r("activity is null on Wave effect start");
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        View viewFindViewById = activityM.findViewById(R.id.content);
        if (viewFindViewById == null) {
            r6.b.r("activityView is null on Wave effect start");
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        hli.c cVar = (hli.c) blockUserInteractionHandle;
        cVar.a();
        ((pki.a) uiStateBlockHandle.f229224b).J1(uiStateBlockHandle);
        transitionStateLatch.a(new b4c.v(this, activityM, viewFindViewById, transitionStateLatch.b(), uiStateBlockHandle, cVar));
    }

    @Override // igm.g
    public void accept(Object obj2) {
        Disposable it8 = (Disposable) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        hx7.e.f(((nl.v0) this.f190729b).f216956a);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f190728a) {
            case 4:
                return ((lak.l) this.f190729b).invoke(obj2);
            case 12:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 8) {
                    return ((kfm.m) this.f190729b).e(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
                }
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            case 14:
                return ((m08.i) this.f190729b).invoke(obj2);
            case 21:
                return ((ne0.e) this.f190729b).invoke(obj2);
            default:
                return ((ny7.t) this.f190729b).invoke(obj2);
        }
    }

    @Override // o2h.a
    public void b(bfl.g tradeSide, hdh.e actions) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(actions, "actions");
        ((gdh.a) this.f190729b).b3(tradeSide, actions, false);
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public sji.b mo3800build() {
        vc.s.h((BaseScreen) this.f190729b, BaseScreen.class);
        lal.d dVar = new lal.d();
        int i = 9;
        dVar.f193434a = e4m.b.b(new kyk.n(dVar, 1, i));
        dVar.f193435b = e4m.b.b(new kyk.n(dVar, 0, i));
        return dVar;
    }

    @Override // t1h.l
    public t1h.o e(j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        return new npc.b(bottomExpandableDialogControllerExtension, (npc.d) this.f190729b);
    }

    public aim.f f(j8l.h sourceAccount, j8l.h targetAccount) {
        Map mapG;
        String str;
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        aim.f builder = new aim.f();
        t7i.p pVar = (t7i.p) this.f190729b;
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        if ((!t7i.p.f(sourceAccount, targetAccount) || ((AccountWrapper) sourceAccount).f97224a == ((AccountWrapper) targetAccount).f97224a) && !pVar.g(sourceAccount, targetAccount)) {
            mapG = zhm.r0.g();
        } else {
            if (!(targetAccount instanceof AccountWrapper)) {
                throw new IllegalArgumentException(("Unexpected type of target account: " + targetAccount).toString());
            }
            AccountWrapper accountWrapper = (AccountWrapper) targetAccount;
            AccountSource accountSource = accountWrapper.d;
            if (accountSource instanceof AccountSource.SavingsSource) {
                str = ((AccountSource.SavingsSource) accountSource).f97216a.f86460a.f234881a;
            } else if (accountSource instanceof AccountSource.JuniorSavingsSource) {
                str = ((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a.f234881a;
            } else {
                if (!(accountSource instanceof AccountSource.JointSavingsSource)) {
                    throw new IllegalArgumentException(j6.a.q("Unexpected type of target account: ", a6i.a.b(accountWrapper)));
                }
                str = ((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a.f234881a;
            }
            mapG = a0.d.x("target_moneybox_id", str);
        }
        builder.putAll(mapG);
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        builder.putAll(zhm.r0.p(t7i.i.e(t7i.i.a(sourceAccount), false), t7i.i.e(t7i.i.a(targetAccount), true)));
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        if (fVarB.isEmpty()) {
            return null;
        }
        return fVarB;
    }

    public short g(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f190729b;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    @Override // ix0.b1
    public int getBottom() {
        switch (this.f190728a) {
            case 16:
                return ((Number) ((mt0.j) this.f190729b).f208703c.invoke()).intValue();
            default:
                ChatInputLayoutView chatInputLayoutView = (ChatInputLayoutView) this.f190729b;
                return chatInputLayoutView.i - chatInputLayoutView.f58433j;
        }
    }

    public int h(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f190729b;
        if (byteBuffer.remaining() - i >= 4) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public int j() {
        return ((ByteBuffer) this.f190729b).remaining();
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        switch (this.f190728a) {
            case 0:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((AmountNewScreen) this.f190729b).O.k(formattedValue);
                break;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                nc1.m mVar = (nc1.m) ((CardReaderNewRequestScreen) this.f190729b).T2();
                mVar.getClass();
                Intrinsics.checkNotNullParameter(formattedValue, "amount");
                mVar.G.d(formattedValue);
                if (z) {
                    mVar.G2(nc1.d.AMOUNT);
                }
                break;
        }
    }

    public vkm.d l(t1e.o params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g2e.n0 n0Var = (g2e.n0) this.f190729b;
        List list = params.f267267a;
        g2e.f0 params2 = new g2e.f0(16, params.f267269c, params.d, params.f267268b, list);
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(params2, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        String strZ = n0Var.d.z();
        x4l.c cVar = n0Var.f140018g;
        List filter = params2.f139983a;
        Intrinsics.checkNotNullParameter(filter, "filter");
        return cVar.b(new g2e.f0(filter, params2.f139984b, params2.f139985c, params2.d, strZ), loadingStrategy);
    }

    public Flow m(tof.a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String str = transaction.f272600m;
        return str == null ? new go.g(new Data(null, null, false, 7, null), 2) : rd0.e.b(((kgm.c) this.f190729b).f(str, r(transaction)));
    }

    public vkm.d n(t1e.c0 params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g2e.n0 n0Var = (g2e.n0) this.f190729b;
        g2e.g0 params2 = new g2e.g0(4, params.f267252a, params.f267253b);
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(params2, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return n0Var.i.b(new g2e.g0(n0Var.d.z(), params2.f139987a, params2.f139988b), loadingStrategy);
    }

    public void o(ByteOrder byteOrder) {
        ((ByteBuffer) this.f190729b).order(byteOrder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r9 == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r9 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable p(vm3.a r8, gim.c r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f190729b
            wl3.c r0 = (wl3.c) r0
            boolean r1 = r9 instanceof om3.b
            if (r1 == 0) goto L17
            r1 = r9
            om3.b r1 = (om3.b) r1
            int r2 = r1.f226508w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f226508w = r2
            goto L1c
        L17:
            om3.b r1 = new om3.b
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f226508w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r9)
            goto L60
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            goto L76
        L3a:
            yhm.o.b(r9)
            boolean r9 = r8.d
            java.lang.String r3 = r8.f290522b
            java.lang.String r6 = r8.f290521a
            vm3.b r8 = r8.f290523c
            if (r9 == 0) goto L7c
            int[] r9 = om3.a.f226507a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r5) goto L69
            if (r8 != r4) goto L63
            ufm.i r8 = r0.a(r6, r3)
            r1.f226508w = r4
            java.lang.Object r9 = nim.a.b(r8, r1)
            if (r9 != r2) goto L60
            goto L75
        L60:
            zm3.a r9 = (zm3.a) r9
            goto L78
        L63:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L69:
            ufm.i r8 = r0.b(r6, r3)
            r1.f226508w = r5
            java.lang.Object r9 = nim.a.b(r8, r1)
            if (r9 != r2) goto L76
        L75:
            return r2
        L76:
            zm3.a r9 = (zm3.a) r9
        L78:
            kotlin.jvm.internal.Intrinsics.h(r9)
            return r9
        L7c:
            int[] r9 = om3.a.f226507a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            r9 = 0
            r0 = 0
            if (r8 == r5) goto L97
            if (r8 != r4) goto L91
            zm3.n r8 = new zm3.n
            r8.<init>(r3, r0, r9)
            return r8
        L91:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L97:
            zm3.o r8 = new zm3.o
            r8.<init>(r3, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.e.p(vm3.a, gim.c):java.io.Serializable");
    }

    public pfm.r s(xel.d kyc2) {
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        hyk.l lVar = (hyk.l) this.f190729b;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        OnboardingService onboardingService = lVar.f156904a;
        Intrinsics.checkNotNullParameter(kyc2, "<this>");
        List<xel.c> list = kyc2.f304711a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (xel.c cVar : list) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new fyk.q(cVar.f304705a.f297794a, cVar.f304706b, cVar.i));
        }
        return te0.w.g0(onboardingService.updateKyc(new fyk.t(arrayList)));
    }

    @Override // pc.c
    public Object zza() {
        oc.e eVar = (oc.e) ((pc.c) this.f190729b).zza();
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public e(lak.l function) {
        this.f190728a = 4;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f190729b = function;
    }

    public e(m08.i function) {
        this.f190728a = 14;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f190729b = function;
    }

    public e(ne0.e function) {
        this.f190728a = 21;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f190729b = function;
    }

    public e(ny7.t function) {
        this.f190728a = 22;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f190729b = function;
    }

    public e(Activity activity) {
        this.f190728a = 15;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f190729b = activity;
    }

    public e(npc.d mapper, gte.a featureToggleInteractor) {
        this.f190728a = 20;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f190729b = mapper;
    }

    public e(DigitalPassService service) {
        this.f190728a = 8;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f190729b = service;
    }

    public e(ReauthService service) {
        this.f190728a = 26;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f190729b = service;
    }

    public e(gdh.a navigationExtension) {
        this.f190728a = 10;
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        this.f190729b = navigationExtension;
    }

    public e(t7i.p savingsMoveMoneyDelegate, t7i.i investMoveMoneyDelegate) {
        this.f190728a = 24;
        Intrinsics.checkNotNullParameter(savingsMoveMoneyDelegate, "savingsMoveMoneyDelegate");
        Intrinsics.checkNotNullParameter(investMoveMoneyDelegate, "investMoveMoneyDelegate");
        this.f190729b = savingsMoveMoneyDelegate;
    }

    public e(JuniorGraduationDebugService juniorGraduationDebugService) {
        this.f190728a = 27;
        Intrinsics.checkNotNullParameter(juniorGraduationDebugService, "juniorGraduationDebugService");
        this.f190729b = juniorGraduationDebugService;
    }

    public e(wl3.c addContactsInteractor) {
        this.f190728a = 29;
        Intrinsics.checkNotNullParameter(addContactsInteractor, "addContactsInteractor");
        this.f190729b = addContactsInteractor;
    }

    public e(xtc.c securityHubCardItemMapper) {
        this.f190728a = 7;
        Intrinsics.checkNotNullParameter(securityHubCardItemMapper, "securityHubCardItemMapper");
        this.f190729b = securityHubCardItemMapper;
    }

    public e(kgm.c orderQuoteFeeAndLimitsInteractor) {
        this.f190728a = 13;
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        this.f190729b = orderQuoteFeeAndLimitsInteractor;
    }

    public e(ppk.f ratesInteractor) {
        this.f190728a = 11;
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f190729b = ratesInteractor;
    }

    public e(TransferReasonsService service) {
        this.f190728a = 6;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f190729b = service;
    }

    public e(hyk.l repository) {
        this.f190728a = 9;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f190729b = repository;
    }

    public e(ryc.a popularAssetsInteractor, lnh.b paramsMapper) {
        this.f190728a = 5;
        Intrinsics.checkNotNullParameter(popularAssetsInteractor, "popularAssetsInteractor");
        Intrinsics.checkNotNullParameter(paramsMapper, "paramsMapper");
        this.f190729b = popularAssetsInteractor;
    }

    public e(g2e.n0 exclusivesRepository, lvb.d auctionsInteractor) {
        this.f190728a = 1;
        Intrinsics.checkNotNullParameter(exclusivesRepository, "exclusivesRepository");
        Intrinsics.checkNotNullParameter(auctionsInteractor, "auctionsInteractor");
        this.f190729b = exclusivesRepository;
    }

    public e(oii.a aVar, oii.e waveEffectProvider) {
        this.f190728a = 28;
        Intrinsics.checkNotNullParameter(waveEffectProvider, "waveEffectProvider");
        this.f190729b = aVar;
    }

    public e(lal.k kVar, lal.l lVar) {
        this.f190728a = 3;
    }

    public e(byte[] bArr, int i) {
        this.f190728a = 2;
        this.f190729b = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }
}
