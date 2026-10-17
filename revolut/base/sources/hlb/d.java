package hlb;

import kotlin.jvm.internal.Intrinsics;
import r10.r;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends yji.n implements j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ccd.a f153424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f80.a f153425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f153426n;
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f153427p;

    public d(ccd.a infoSheetsInteractor, f80.a uriHelper, x deeplinkHandler, r infoSheetDeeplinkHandler) {
        Intrinsics.checkNotNullParameter(infoSheetsInteractor, "infoSheetsInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(infoSheetDeeplinkHandler, "infoSheetDeeplinkHandler");
        this.f153424l = infoSheetsInteractor;
        this.f153425m = uriHelper;
        this.f153426n = deeplinkHandler;
        this.o = infoSheetDeeplinkHandler;
        this.f153427p = new vii.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.Object r9, java.lang.String r10, java.lang.String r11, gim.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof hlb.a
            if (r0 == 0) goto L13
            r0 = r12
            hlb.a r0 = (hlb.a) r0
            int r1 = r0.f153421w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153421w = r1
            goto L18
        L13:
            hlb.a r0 = new hlb.a
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f153421w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            hlb.h r7 = hlb.h.f153431a
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            yhm.o.b(r12)
            return r12
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            yhm.o.b(r12)
            return r12
        L3e:
            yhm.o.b(r12)
            return r7
        L42:
            yhm.o.b(r12)
            return r12
        L46:
            yhm.o.b(r12)
            boolean r12 = r9 instanceof hlb.p
            if (r12 == 0) goto L5b
            hlb.p r9 = (hlb.p) r9
            java.lang.String r9 = r9.f153439a
            r0.f153421w = r6
            java.lang.Object r9 = r8.b3(r9, r11, r0)
            if (r9 != r1) goto L5a
            goto L98
        L5a:
            return r9
        L5b:
            boolean r12 = r9 instanceof hlb.e
            if (r12 == 0) goto L70
            hlb.e r9 = (hlb.e) r9
            java.lang.String r9 = r9.f153428a
            if (r9 != 0) goto L66
            goto L6f
        L66:
            r0.f153421w = r5
            java.lang.Object r9 = r8.b3(r9, r11, r0)
            if (r9 != r1) goto L6f
            goto L98
        L6f:
            return r7
        L70:
            boolean r12 = r9 instanceof java.lang.String
            if (r12 == 0) goto L80
            java.lang.String r9 = (java.lang.String) r9
            r0.f153421w = r4
            java.lang.Object r9 = r8.b3(r9, r11, r0)
            if (r9 != r1) goto L7f
            goto L98
        L7f:
            return r9
        L80:
            java.lang.String r9 = "ERROR_STATE_ID"
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r10, r9)
            if (r9 == 0) goto L90
            vii.b r9 = r8.f153427p
            r9.a()
            hlb.g r9 = hlb.g.f153430a
            return r9
        L90:
            r0.f153421w = r3
            java.lang.Object r9 = r8.b3(r10, r11, r0)
            if (r9 != r1) goto L99
        L98:
            return r1
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hlb.d.Z2(java.lang.Object, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.String r13, java.lang.String r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof hlb.c
            if (r0 == 0) goto L14
            r0 = r15
            hlb.c r0 = (hlb.c) r0
            int r1 = r0.f153423w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f153423w = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            hlb.c r0 = new hlb.c
            r0.<init>(r12, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f153423w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r15)
            goto L5d
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            yhm.o.b(r15)
            f80.a r15 = r12.f153425m
            f80.b r15 = (f80.b) r15
            boolean r15 = r15.e(r13)
            if (r15 == 0) goto L60
            ack.n r3 = new ack.n
            r15 = 22
            r3.<init>(r15)
            g84.u r4 = new g84.u
            r11 = 19
            r10 = 0
            r7 = r12
            r8 = r13
            r9 = r14
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r5.f153423w = r2
            r2 = 0
            r6 = 3
            r1 = r12
            java.lang.Object r13 = n14.k.R(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5d
            return r0
        L5d:
            hlb.g r13 = hlb.g.f153430a
            return r13
        L60:
            r8 = r13
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Unhandled action "
            java.lang.String r14 = r14.concat(r8)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: hlb.d.b3(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
