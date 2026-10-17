package hq3;

import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import wli.x;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditApplicationCloseScreenContract$InputData f154600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f154601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eq3.d f154602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dq3.a f154603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ow3.e f154604t;
    public final eq3.b u;
    public final ow3.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f154605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x f154606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hw3.c f154607y;
    public final jki.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, CreditApplicationCloseScreenContract$InputData inputData, j60.a bottomExpandableDialogView, eq3.d creditApplicationLeaveScreenProvider, dq3.a creditApplicationCancellationFacade, ow3.e creditApplicationCancellationInteractor, eq3.b cancellationDialogProvider, ow3.i saveStatusDialogProvider, w revolutJobInteractor, x deeplinkHandler, hw3.c actionPathInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogView, "bottomExpandableDialogView");
        Intrinsics.checkNotNullParameter(creditApplicationLeaveScreenProvider, "creditApplicationLeaveScreenProvider");
        Intrinsics.checkNotNullParameter(creditApplicationCancellationFacade, "creditApplicationCancellationFacade");
        Intrinsics.checkNotNullParameter(creditApplicationCancellationInteractor, "creditApplicationCancellationInteractor");
        Intrinsics.checkNotNullParameter(cancellationDialogProvider, "cancellationDialogProvider");
        Intrinsics.checkNotNullParameter(saveStatusDialogProvider, "saveStatusDialogProvider");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(actionPathInteractor, "actionPathInteractor");
        this.f154600p = inputData;
        this.f154601q = bottomExpandableDialogView;
        this.f154602r = creditApplicationLeaveScreenProvider;
        this.f154603s = creditApplicationCancellationFacade;
        this.f154604t = creditApplicationCancellationInteractor;
        this.u = cancellationDialogProvider;
        this.v = saveStatusDialogProvider;
        this.f154605w = revolutJobInteractor;
        this.f154606x = deeplinkHandler;
        this.f154607y = actionPathInteractor;
        this.z = jki.j.f175191a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r1 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(hq3.o r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hq3.o.y2(hq3.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(hq3.o r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hq3.o.z2(hq3.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (lg0.b.x1(r7.f154606x, r8, null, null, r5, 6) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (r7.f154607y.c(r8, r5) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A2(com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof hq3.h
            if (r0 == 0) goto L14
            r0 = r9
            hq3.h r0 = (hq3.h) r0
            int r1 = r0.f154595x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f154595x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            hq3.h r0 = new hq3.h
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f154595x
            r2 = 2
            r3 = 1
            r4 = 3
            if (r1 == 0) goto L41
            if (r1 == r3) goto L3b
            if (r1 == r2) goto L37
            if (r1 != r4) goto L2f
            yhm.o.b(r9)
            goto L87
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            goto L6f
        L3b:
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action r8 = r5.u
            yhm.o.b(r9)
            goto L55
        L41:
            yhm.o.b(r9)
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action r9 = r8.getF66310b()
            if (r9 == 0) goto L55
            r5.u = r8
            r5.f154595x = r3
            java.lang.Object r9 = r7.A2(r9, r5)
            if (r9 != r0) goto L55
            goto L86
        L55:
            boolean r9 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Deeplink
            r1 = 0
            if (r9 == 0) goto L72
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action$Deeplink r8 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Deeplink) r8
            java.lang.String r8 = r8.f66307a
            r5.u = r1
            r5.f154595x = r2
            wli.x r1 = r7.f154606x
            r3 = 0
            r4 = 0
            r6 = 6
            r2 = r8
            java.lang.Object r8 = lg0.b.x1(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L6f
            goto L86
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L72:
            boolean r9 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.PostRequest
            if (r9 == 0) goto L8a
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action$PostRequest r8 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.PostRequest) r8
            java.lang.String r8 = r8.f66309a
            r5.u = r1
            r5.f154595x = r4
            hw3.c r9 = r7.f154607y
            java.lang.Object r8 = r9.c(r8, r5)
            if (r8 != r0) goto L87
        L86:
            return r0
        L87:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L8a:
            boolean r8 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Close
            if (r8 == 0) goto L97
            j60.a r8 = r7.f154601q
            r9 = 0
            j60.a.v(r8, r9, r1, r4)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L97:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hq3.o.A2(com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new j(this, continuation, 1), new whi.b(6));
        yji.l.b1(this, rd0.e.b(this.f154601q.E()), new d4f.m(2, 27, continuation), new hbg.h(this, continuation, 20), 2);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }
}
