package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.BuyBlockService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BuyBlockService f287948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f287949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f287950c;
    public final x4l.c d;

    public d(BuyBlockService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f287948a = service;
        this.f287949b = memoryCache;
        this.f287950c = storage;
        Continuation continuation = null;
        int i = 22;
        this.d = new x4l.c(new pti.s(this, continuation, 26), new a(this, 0), new v48.d(this, 15), new uwe.f(this, continuation, i), new ska.c(this, continuation, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vdl.c
            if (r0 == 0) goto L13
            r0 = r7
            vdl.c r0 = (vdl.c) r0
            int r1 = r0.f287942y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287942y = r1
            goto L18
        L13:
            vdl.c r0 = new vdl.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f287940w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287942y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wel.d r6 = r0.v
            yhm.o.b(r7)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L4f
        L3a:
            yhm.o.b(r7)
            gdl.h r7 = new gdl.h
            r7.<init>(r6)
            r0.u = r6
            r0.f287942y = r4
            com.revolut.shared.feature.wealth.domain.impl.data.network.BuyBlockService r2 = r5.f287948a
            java.lang.Object r7 = r2.setBuyBlock(r7, r0)
            if (r7 != r1) goto L4f
            goto L65
        L4f:
            gdl.c r7 = (gdl.c) r7
            wel.d r7 = zi0.c.U(r7)
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r0.v = r7
            r0.u = r6
            r0.f287942y = r3
            x4l.c r6 = r5.d
            java.lang.Object r6 = r6.f(r2, r7, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vdl.d.a(boolean, gim.c):java.lang.Object");
    }
}
