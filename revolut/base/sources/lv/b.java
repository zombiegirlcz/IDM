package lv;

import kotlin.jvm.internal.Intrinsics;
import vw.d;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.c f200267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f200268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f200269c;
    public final boolean d;

    public b(vw.b bVar, vw.c cVar, d dVar, xv.c cameraCoreDelegate) {
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        this.f200267a = cameraCoreDelegate;
        boolean z = false;
        this.f200268b = bVar != null && bVar.f292572a;
        this.f200269c = cVar != null && cVar.f292574a;
        if (dVar != null && dVar.f292577a) {
            z = true;
        }
        this.d = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof lv.a
            if (r0 == 0) goto L13
            r0 = r9
            lv.a r0 = (lv.a) r0
            int r1 = r0.f200266y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200266y = r1
            goto L18
        L13:
            lv.a r0 = new lv.a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f200264w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200266y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xv.c r7 = r8.f200267a
            if (r2 == 0) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            iw.a r1 = r0.v
            iw.a r0 = r0.u
            yhm.o.b(r9)
            goto L82
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            iw.a r2 = r0.u
            yhm.o.b(r9)
            goto L6a
        L42:
            yhm.o.b(r9)
            goto L56
        L46:
            yhm.o.b(r9)
            boolean r9 = r8.f200268b
            if (r9 == 0) goto L5a
            r0.f200266y = r5
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L56
            goto L7e
        L56:
            iw.a r9 = (iw.a) r9
            r2 = r9
            goto L5b
        L5a:
            r2 = r6
        L5b:
            boolean r9 = r8.d
            if (r9 == 0) goto L6d
            r0.u = r2
            r0.f200266y = r4
            java.lang.Object r9 = r7.c(r0)
            if (r9 != r1) goto L6a
            goto L7e
        L6a:
            iw.a r9 = (iw.a) r9
            goto L6e
        L6d:
            r9 = r6
        L6e:
            boolean r4 = r8.f200269c
            if (r4 == 0) goto L87
            r0.u = r2
            r0.v = r9
            r0.f200266y = r3
            java.lang.Object r0 = r7.l(r0)
            if (r0 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r1 = r9
            r9 = r0
            r0 = r2
        L82:
            r6 = r9
            iw.a r6 = (iw.a) r6
            r2 = r0
            r9 = r1
        L87:
            com.revolut.camerakit.core.camerax.extras.model.ResultInternal$a r0 = com.revolut.camerakit.core.camerax.extras.model.ResultInternal.INSTANCE
            r0.getClass()
            com.revolut.camerakit.core.camerax.extras.model.ResultInternal r0 = new com.revolut.camerakit.core.camerax.extras.model.ResultInternal
            r0.<init>(r2, r6, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lv.b.a(gim.c):java.lang.Object");
    }
}
