package t54;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import xq3.d;
import yji.n;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends n implements d84.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f268040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Regex f268041m;

    public b(d declineInvitationInteractor) {
        Intrinsics.checkNotNullParameter(declineInvitationInteractor, "declineInvitationInteractor");
        this.f268040l = declineInvitationInteractor;
        this.f268041m = new Regex("revolut://app/credit/fcc/invitation/([^/?#]+)/decline/?");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r6, kotlin.jvm.functions.Function1 r7, gim.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof t54.a
            if (r0 == 0) goto L13
            r0 = r8
            t54.a r0 = (t54.a) r0
            int r1 = r0.f268039y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268039y = r1
            goto L18
        L13:
            t54.a r0 = new t54.a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f268037w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f268039y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r6 = r0.v
            kotlin.jvm.functions.Function1 r7 = r0.u
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            yhm.o.b(r8)
            goto L72
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r8)
            kotlin.text.Regex$a r8 = kotlin.text.Regex.INSTANCE
            kotlin.text.Regex r8 = r5.f268041m
            kotlin.text.o r6 = r8.b(r6)
            if (r6 != 0) goto L45
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L45:
            java.util.List r6 = r6.c()
            kotlin.text.m r6 = (kotlin.text.m) r6
            java.lang.Object r6 = r6.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            r8 = r7
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.u = r8
            r0.v = r6
            r0.f268039y = r3
            xq3.d r8 = r5.f268040l
            xr3.e r8 = r8.f308066a
            r8.getClass()
            xr3.d r2 = new xr3.d
            r4 = 0
            r2.<init>(r8, r6, r4, r3)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            ds3.c r8 = (ds3.c) r8
            com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreen r0 = new com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreen
            com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreenContract$InputData r1 = new com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreenContract$InputData
            r1.<init>(r6, r8)
            r0.<init>(r1)
            js7.c r6 = new js7.c
            r8 = 26
            r6.<init>(r8, r7)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_IMMEDIATE r7 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a
            r5.N2(r0, r7, r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t54.b.Z2(java.lang.String, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
