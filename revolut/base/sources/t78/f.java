package t78;

import cc7.l;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f268610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f268611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kb8.e f268612n;
    public final r10.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kb8.f f268613p;

    public f(l juniorDashboardBottomSheetDelegate, j60.a bottomSheetDialogExtension, kb8.e juniorGraduationPendingBottomSheetProvider, r10.f juniorGraduationUiInteractor, kb8.f juniorGraduationPendingShareDestinationProvider) {
        Intrinsics.checkNotNullParameter(juniorDashboardBottomSheetDelegate, "juniorDashboardBottomSheetDelegate");
        Intrinsics.checkNotNullParameter(bottomSheetDialogExtension, "bottomSheetDialogExtension");
        Intrinsics.checkNotNullParameter(juniorGraduationPendingBottomSheetProvider, "juniorGraduationPendingBottomSheetProvider");
        Intrinsics.checkNotNullParameter(juniorGraduationUiInteractor, "juniorGraduationUiInteractor");
        Intrinsics.checkNotNullParameter(juniorGraduationPendingShareDestinationProvider, "juniorGraduationPendingShareDestinationProvider");
        this.f268610l = juniorDashboardBottomSheetDelegate;
        this.f268611m = bottomSheetDialogExtension;
        this.f268612n = juniorGraduationPendingBottomSheetProvider;
        this.o = juniorGraduationUiInteractor;
        this.f268613p = juniorGraduationPendingShareDestinationProvider;
    }

    @Override // yji.n
    public final void H2() {
        l lVar = this.f268610l;
        n.l2(this, rd0.e.b(((LargeActionButtonDelegate) lVar.f22961s).d.f121375b), null, new d(this, null), 3);
        n.l2(this, rd0.e.b(((ListCellDelegate) lVar.f22959q).d), null, new e(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r9 != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002a, B:40:0x009d, B:20:0x0040, B:34:0x0081, B:37:0x0098, B:23:0x004a, B:30:0x0068, B:26:0x0053), top: B:45:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload.GraduationPendingDialog r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof t78.c
            if (r0 == 0) goto L13
            r0 = r10
            t78.c r0 = (t78.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            t78.c r0 = new t78.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f268608x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L2f
            goto L9d
        L2f:
            r9 = move-exception
            goto La0
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            int r9 = r0.f268607w
            int r2 = r0.v
            com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload$GraduationPendingDialog r4 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L2f
            goto L81
        L44:
            int r9 = r0.f268607w
            int r2 = r0.v
            com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload$GraduationPendingDialog r5 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L2f
            r7 = r9
            r9 = r5
            goto L68
        L50:
            yhm.o.b(r10)
            kb8.e r10 = r8.f268612n     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = r9.f76712a     // Catch: java.lang.Exception -> L2f
            r0.u = r9     // Catch: java.lang.Exception -> L2f
            r7 = 0
            r0.v = r7     // Catch: java.lang.Exception -> L2f
            r0.f268607w = r7     // Catch: java.lang.Exception -> L2f
            r0.z = r5     // Catch: java.lang.Exception -> L2f
            java.lang.Object r10 = r10.a(r2, r0)     // Catch: java.lang.Exception -> L2f
            if (r10 != r1) goto L67
            goto L9c
        L67:
            r2 = r7
        L68:
            rp0.y r10 = (rp0.y) r10     // Catch: java.lang.Exception -> L2f
            j60.a r5 = r8.f268611m     // Catch: java.lang.Exception -> L2f
            efm.b r10 = r5.G(r10)     // Catch: java.lang.Exception -> L2f
            r0.u = r9     // Catch: java.lang.Exception -> L2f
            r0.v = r2     // Catch: java.lang.Exception -> L2f
            r0.f268607w = r7     // Catch: java.lang.Exception -> L2f
            r0.z = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r10 = nim.a.a(r10, r0)     // Catch: java.lang.Exception -> L2f
            if (r10 != r1) goto L7f
            goto L9c
        L7f:
            r4 = r9
            r9 = r7
        L81:
            r10.f r10 = r8.o     // Catch: java.lang.Exception -> L2f
            java.lang.String r4 = r4.f76712a     // Catch: java.lang.Exception -> L2f
            r0.u = r6     // Catch: java.lang.Exception -> L2f
            r0.v = r2     // Catch: java.lang.Exception -> L2f
            r0.f268607w = r9     // Catch: java.lang.Exception -> L2f
            r0.z = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r10.b     // Catch: java.lang.Exception -> L2f
            gb8.g r9 = (gb8.g) r9     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r9.b(r4, r0)     // Catch: java.lang.Exception -> L2f
            if (r9 != r1) goto L98
            goto L9a
        L98:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2f
        L9a:
            if (r9 != r1) goto L9d
        L9c:
            return r1
        L9d:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2f
            goto La9
        La0:
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r6, r6, r9, r10)
        La9:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t78.f.Z2(com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload$GraduationPendingDialog, gim.c):java.lang.Object");
    }
}
