package wq8;

import com.revolut.feature.junior_transfer.impl.service.JuniorDetailedTransferSettingsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import th6.p;
import wde.f;
import wka.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f299421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f299422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JuniorDetailedTransferSettingsService f299423c;
    public final x4l.c d;

    public c(ue0.c storage, j memoryCache, JuniorDetailedTransferSettingsService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f299421a = storage;
        this.f299422b = memoryCache;
        this.f299423c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new p(this, continuation, 28), new wpj.b(this, 1), new f(this, 25), new e(this, continuation, 15), new sne.e(this, continuation, 28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r8.invoke(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(wq8.c r6, java.lang.String r7, wh3.h r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof wq8.b
            if (r0 == 0) goto L13
            r0 = r9
            wq8.b r0 = (wq8.b) r0
            int r1 = r0.f299420x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299420x = r1
            goto L18
        L13:
            wq8.b r0 = new wq8.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299420x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L77
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            wh3.h r8 = r0.u
            yhm.o.b(r9)
            goto L68
        L39:
            yhm.o.b(r9)
            x4l.c r6 = r6.d
            w4l.j r9 = w4l.j.f294644c
            vkm.d r6 = r6.b(r7, r9)
            wm9.k r7 = new wm9.k
            r9 = 18
            r7.<init>(r9)
            jhi.b r6 = mo3.a.g(r6, r5, r7, r4)
            vge.f1 r7 = new vge.f1
            r9 = 3
            r2 = 24
            r7.<init>(r9, r2, r5)
            zhm.h0 r9 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.e(r6, r9, r7)
            r0.u = r8
            r0.f299420x = r4
            java.lang.Object r9 = vkm.q.z(r6, r0)
            if (r9 != r1) goto L68
            goto L76
        L68:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L77
            r0.u = r5
            r0.f299420x = r3
            java.lang.Object r6 = r8.invoke(r9, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wq8.c.a(wq8.c, java.lang.String, wh3.h, gim.c):java.lang.Object");
    }

    public static String b(String str) {
        return j6.a.q("DETAILED_TRANSFER_SETTINGS_", str);
    }
}
