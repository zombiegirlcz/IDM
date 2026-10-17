package fq3;

import a08.g0;
import a08.o0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.credit.application.close.ui.legacy.CreditApplicationCloseLegacyActivity;
import com.revolut.feature.credit.application.close.ui.legacy.CreditApplicationCloseLegacyContract$Configuration;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import sri.m;
import wli.x;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends pri.b implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CreditApplicationCloseLegacyContract$Configuration f137181h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dq3.a f137182j;
    public final opi.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final eq3.b f137183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f137184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f137185n;
    public final hw3.c o;

    public j(CreditApplicationCloseLegacyContract$Configuration configuration, m navigator, dq3.a creditApplicationCancellationFacade, opi.d expandableDialogView, eq3.b cancellationDialogProvider, w revolutJobInteractor, x deeplinkHandler, hw3.c actionPathInteractor) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(creditApplicationCancellationFacade, "creditApplicationCancellationFacade");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(cancellationDialogProvider, "cancellationDialogProvider");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(actionPathInteractor, "actionPathInteractor");
        this.f137181h = configuration;
        this.i = navigator;
        this.f137182j = creditApplicationCancellationFacade;
        this.k = expandableDialogView;
        this.f137183l = cancellationDialogProvider;
        this.f137184m = revolutJobInteractor;
        this.f137185n = deeplinkHandler;
        this.o = actionPathInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (lg0.b.x1(r7.f137185n, r2, null, null, r5, 6) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r7.o.c(r8, r5) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof fq3.g
            if (r0 == 0) goto L14
            r0 = r9
            fq3.g r0 = (fq3.g) r0
            int r1 = r0.f137178x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f137178x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            fq3.g r0 = new fq3.g
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f137178x
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L41
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            yhm.o.b(r9)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            goto L6e
        L3b:
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action r8 = r5.u
            yhm.o.b(r9)
            goto L55
        L41:
            yhm.o.b(r9)
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action r9 = r8.getF66310b()
            if (r9 == 0) goto L55
            r5.u = r8
            r5.f137178x = r4
            java.lang.Object r9 = r7.N(r9, r5)
            if (r9 != r0) goto L55
            goto L85
        L55:
            boolean r9 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Deeplink
            r1 = 0
            if (r9 == 0) goto L71
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action$Deeplink r8 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Deeplink) r8
            java.lang.String r2 = r8.f66307a
            r5.u = r1
            r5.f137178x = r3
            wli.x r1 = r7.f137185n
            r3 = 0
            r4 = 0
            r6 = 6
            java.lang.Object r8 = lg0.b.x1(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L6e
            goto L85
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L71:
            boolean r9 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.PostRequest
            if (r9 == 0) goto L89
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action$PostRequest r8 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.PostRequest) r8
            java.lang.String r8 = r8.f66309a
            r5.u = r1
            r5.f137178x = r2
            hw3.c r9 = r7.o
            java.lang.Object r8 = r9.c(r8, r5)
            if (r8 != r0) goto L86
        L85:
            return r0
        L86:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L89:
            boolean r8 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Close
            if (r8 == 0) goto L93
            r7.O()
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L93:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fq3.j.N(com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action, gim.c):java.lang.Object");
    }

    public final void O() {
        efm.b bVarO = ((opi.b) this.k).O();
        fp3.a aVar = new fp3.a(this, 3);
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(bVarO, new o0(15, new fa9.c(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new g0(17, function1K), new ea9.c(8, aVar));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarA0 = te0.w.a0(((CreditApplicationCloseLegacyActivity) view).f66216s0.d.f121375b, new fo9.a(8));
        e eVar = new e(this, 1);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarA0.onErrorResumeNext(new o0(15, new fa9.c(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(17, eVar), new g0(17, function1K), new ea9.c(8, function0J));
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        opi.b bVar2 = (opi.b) this.k;
        r rVarFilter = bVar2.R().filter(new fjj.b(new fo9.a(9), 21));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        e eVar2 = new e(this, 2);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarFilter.onErrorResumeNext(new o0(15, new fa9.c(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new g0(17, eVar2), new g0(17, function1K2), new ea9.c(8, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.b bVarA0 = bVar2.a0(((ow3.a) this.f137183l).b(this.f137181h.f66219b, "CLOSE_DELEGATES_KEY"));
        Function1 function1K3 = K();
        pfm.a aVar2 = new pfm.a(bVarA0, new o0(15, new fa9.c(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new g0(17, function1K3), new ea9.c(8, f.f137176a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar, hVarW);
    }
}
