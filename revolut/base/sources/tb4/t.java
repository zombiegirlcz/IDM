package tb4;

import android.content.Context;
import com.revolut.chat.data.network.MessagesApi;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$InputData;
import com.revolut.feature.junior_onboarding.impl.service.JuniorDetailsValidationService;
import com.revolut.feature.topup_screen.impl.data.network.service.BrazilPixTopUpService;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.c0;
import efm.d0;
import efm.w;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import tb4.t;
import wf6.o;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements kfm.o, fgm.p, xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f269456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f269457c;

    public /* synthetic */ t(Object obj2, Object obj3, int i) {
        this.f269455a = i;
        this.f269456b = obj2;
        this.f269457c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f269457c
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input r0 = (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input) r0
            boolean r1 = r7 instanceof ybh.l0
            if (r1 == 0) goto L17
            r1 = r7
            ybh.l0 r1 = (ybh.l0) r1
            int r2 = r1.f312318w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f312318w = r2
            goto L1c
        L17:
            ybh.l0 r1 = new ybh.l0
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f312318w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r7)
            goto L55
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f269456b
            m1h.k r7 = (m1h.k) r7
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r3 = r0.f95583a
            go.g r7 = r7.c(r3)
            y65.n r3 = new y65.n
            r5 = 22
            r3.<init>(r5)
            r5 = 0
            jhi.b r7 = mo3.a.g(r7, r5, r3, r4)
            r1.f312318w = r4
            java.lang.Object r7 = vkm.q.x(r7, r1)
            if (r7 != r2) goto L55
            return r2
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r1 = r7.booleanValue()
            if (r1 != 0) goto L83
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r2 = r0.f95583a
            java.lang.String r2 = r2.getF95657a()
            com.revolut.analytics.tracking.v3.AnalyticsProduct r0 = r0.f95584b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Recurring deposit is not enabled for portfolio "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " of product "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            hx7.e.n(r1)
        L83:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb4.t.B(gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public boolean E(String selectedDeviceId) {
        Intrinsics.checkNotNullParameter(selectedDeviceId, "selectedDeviceId");
        ?? r06 = this.f269457c;
        return Intrinsics.f(((dm0.b) r06.getValue()).d, selectedDeviceId) || Intrinsics.f(((dm0.b) r06.getValue()).f115814c, selectedDeviceId);
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        Object objApply = ((kfm.o) this.f269456b).apply((efm.r) obj2);
        mfm.f.b(objApply, "The selector returned a null ObservableSource");
        return efm.r.wrap((w) objApply).observeOn((c0) this.f269457c);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b(ry3.b r38) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb4.t.b(ry3.b):java.util.List");
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f269457c, ViewController.class);
        return new z09.a((z09.b) this.f269456b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r13 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r13 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r13 == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(y20.t r11, boolean r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb4.t.c(y20.t, boolean, gim.c):java.lang.Object");
    }

    public Object d(gim.c cVar) {
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, new wr1.s(this, null, 6), cVar);
    }

    public ArrayList i() {
        return (ArrayList) this.f269457c;
    }

    public ArrayList k() {
        return (ArrayList) this.f269456b;
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        Object objApply;
        fgm.p pVar = (fgm.p) this.f269456b;
        tgm.g gVar = (tgm.g) this.f269457c;
        igm.o oVar = gVar.f271217c;
        if (oVar != null) {
            try {
                objApply = oVar.apply(th10);
            } catch (Throwable th11) {
                ce9.m.F(th11);
                pVar.onError(new CompositeException(th10, th11));
                return;
            }
        } else {
            gVar.getClass();
            objApply = null;
        }
        if (objApply != null) {
            pVar.onSuccess(objApply);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
        nullPointerException.initCause(th10);
        pVar.onError(nullPointerException);
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        ((fgm.p) this.f269456b).onSubscribe(disposable);
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        ((fgm.p) this.f269456b).onSuccess(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof x92.a
            if (r0 == 0) goto L13
            r0 = r8
            x92.a r0 = (x92.a) r0
            int r1 = r0.f303532w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303532w = r1
            goto L18
        L13:
            x92.a r0 = new x92.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303532w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28
            goto L5a
        L28:
            r8 = move-exception
            goto L5d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.f269456b     // Catch: java.lang.Exception -> L28
            xg0.a r8 = (xg0.a) r8     // Catch: java.lang.Exception -> L28
            java.lang.Object r2 = r7.f269457c     // Catch: java.lang.Exception -> L28
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Exception -> L28
            java.lang.String r5 = "feature_apm_multibanco_sdk_impl"
            java.util.Set r5 = zhm.y0.b(r5)     // Catch: java.lang.Exception -> L28
            oi0.b r8 = (oi0.b) r8     // Catch: java.lang.Exception -> L28
            vkm.d r8 = r8.e(r2, r5)     // Catch: java.lang.Exception -> L28
            tk9.i r2 = new tk9.i     // Catch: java.lang.Exception -> L28
            r5 = 2
            r6 = 27
            r2.<init>(r5, r6, r3)     // Catch: java.lang.Exception -> L28
            r0.f303532w = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r8 = vkm.q.y(r8, r2, r0)     // Catch: java.lang.Exception -> L28
            if (r8 != r1) goto L5a
            return r1
        L5a:
            xg0.u r8 = (xg0.u) r8     // Catch: java.lang.Exception -> L28
            return r8
        L5d:
            xg0.o r0 = new xg0.o
            r0.<init>(r4, r8, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb4.t.q(gim.c):java.lang.Object");
    }

    public String toString() {
        switch (this.f269455a) {
            case 7:
                return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", (ArrayList) this.f269456b, (ArrayList) this.f269457c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(toh.d dVar) {
        this.f269455a = 7;
        this.f269456b = new ArrayList((ArrayList) dVar.f273214a);
        this.f269457c = new ArrayList((ArrayList) dVar.f273215b);
    }

    public t(xlk.l groupNamesProvider, xlk.e combinedItemResourcesProvider) {
        this.f269455a = 14;
        Intrinsics.checkNotNullParameter(groupNamesProvider, "groupNamesProvider");
        Intrinsics.checkNotNullParameter(combinedItemResourcesProvider, "combinedItemResourcesProvider");
        this.f269456b = groupNamesProvider;
        this.f269457c = combinedItemResourcesProvider;
    }

    public t(dm0.d deviceIdProvider) {
        this.f269455a = 17;
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f269456b = deviceIdProvider;
        this.f269457c = te0.w.y0(new y99.c(this, 27));
    }

    public t(wj0.a idempotencyKeyHolder) {
        this.f269455a = 3;
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f269456b = idempotencyKeyHolder;
    }

    public t(SummaryScreenContract$InputData inputData, v itemsMapper) {
        this.f269455a = 0;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f269456b = inputData;
        this.f269457c = itemsMapper;
    }

    public t(ffk.t pricingPlanInteractor, ang.f userInteractor) {
        this.f269455a = 20;
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f269456b = pricingPlanInteractor;
        this.f269457c = userInteractor;
    }

    public t(wtc.e connectedWifiInfoProvider, wtc.f connectedWifiSsidInteractor, tul.b connectedWifiSecurityTypeInteractor) {
        this.f269455a = 11;
        Intrinsics.checkNotNullParameter(connectedWifiInfoProvider, "connectedWifiInfoProvider");
        Intrinsics.checkNotNullParameter(connectedWifiSsidInteractor, "connectedWifiSsidInteractor");
        Intrinsics.checkNotNullParameter(connectedWifiSecurityTypeInteractor, "connectedWifiSecurityTypeInteractor");
        this.f269456b = connectedWifiInfoProvider;
        this.f269457c = connectedWifiSecurityTypeInteractor;
    }

    public t(xg0.a dynamicDelivery, Context context) {
        this.f269455a = 13;
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f269456b = dynamicDelivery;
        this.f269457c = context;
    }

    public t(BrazilPixTopUpService service, lue.d limitV2DtoMapper) {
        this.f269455a = 21;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(limitV2DtoMapper, "limitV2DtoMapper");
        this.f269456b = service;
        this.f269457c = limitV2DtoMapper;
    }

    public t(JuniorDetailsValidationService service) {
        this.f269455a = 10;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f269456b = service;
        final int i = 0;
        new ao.h(20, new Function1(this) { // from class: wh8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f297432b;

            {
                this.f297432b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                uh8.h request = (uh8.h) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<uh8.j> d0VarCheckMatching = ((JuniorDetailsValidationService) this.f297432b.f269456b).checkMatching(request);
                        o oVar = new o(9, new wgk.f(4));
                        d0VarCheckMatching.getClass();
                        ufm.i iVar = new ufm.i(d0VarCheckMatching, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<uh8.i> d0VarValidate = ((JuniorDetailsValidationService) this.f297432b.f269456b).validate(request);
                        o oVar2 = new o(8, new wgk.f(3));
                        d0VarValidate.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarValidate, oVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        });
        final int i2 = 1;
        this.f269457c = new ao.h(20, new Function1(this) { // from class: wh8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f297432b;

            {
                this.f297432b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                uh8.h request = (uh8.h) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<uh8.j> d0VarCheckMatching = ((JuniorDetailsValidationService) this.f297432b.f269456b).checkMatching(request);
                        o oVar = new o(9, new wgk.f(4));
                        d0VarCheckMatching.getClass();
                        ufm.i iVar = new ufm.i(d0VarCheckMatching, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<uh8.i> d0VarValidate = ((JuniorDetailsValidationService) this.f297432b.f269456b).validate(request);
                        o oVar2 = new o(8, new wgk.f(3));
                        d0VarValidate.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarValidate, oVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        });
    }

    public t(vl0.a platformBiometrics, wl0.s promptChooser) {
        this.f269455a = 5;
        Intrinsics.checkNotNullParameter(platformBiometrics, "platformBiometrics");
        Intrinsics.checkNotNullParameter(promptChooser, "promptChooser");
        this.f269456b = platformBiometrics;
        this.f269457c = promptChooser;
    }

    public t(l72.i mbInteractor, whf.b transactionsContentProvider) {
        this.f269455a = 12;
        Intrinsics.checkNotNullParameter(mbInteractor, "mbInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f269456b = mbInteractor;
        this.f269457c = transactionsContentProvider;
    }

    public t(ppk.f ratesInteractor, u80.t ratesFormatter) {
        this.f269455a = 9;
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(ratesFormatter, "ratesFormatter");
        this.f269456b = ratesInteractor;
        this.f269457c = ratesFormatter;
    }

    public t(MessagesApi messagesApi, v60.g messagesEnricher) {
        this.f269455a = 15;
        Intrinsics.checkNotNullParameter(messagesApi, "messagesApi");
        Intrinsics.checkNotNullParameter(messagesEnricher, "messagesEnricher");
        this.f269456b = messagesApi;
        this.f269457c = messagesEnricher;
    }

    public t(d8e.a aVar) {
        this.f269455a = 8;
        this.f269456b = zhm.v.k(new uw2.n(24), new uw2.n(25));
        this.f269457c = yhm.j.b(new vt3.a(aVar, 0));
    }

    public t(u0b.a repository, l80.e dateProvider, je0.d objectMapper) {
        this.f269455a = 6;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        this.f269456b = repository;
        this.f269457c = objectMapper;
    }

    public t(tgm.g gVar, fgm.p pVar) {
        this.f269455a = 2;
        this.f269457c = gVar;
        this.f269456b = pVar;
    }

    public t(z09.b bVar) {
        this.f269455a = 18;
        this.f269456b = bVar;
    }

    public t(dgm.e processor, xfm.d disposable) {
        this.f269455a = 19;
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.f269456b = processor;
        this.f269457c = disposable;
    }

    public t(m1h.k portfolioInfoProvider, CompositeAddMoneyScreenContract$Input input) {
        this.f269455a = 16;
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f269456b = portfolioInfoProvider;
        this.f269457c = input;
    }
}
