package ck1;

import b6a.d;
import bwb.n;
import cbh.g;
import com.revolut.feature.air.tip.learn.impl.data.network.LearnAirTipService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnAirTipService f24741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f24742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f24743c;
    public final x4l.c d;

    public c(LearnAirTipService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f24741a = service;
        this.f24742b = memoryCache;
        this.f24743c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new d(this, continuation, 26), new ce9.a(this, 14), new c9f.c(this, 22), new g(this, continuation, 27), new n(this, continuation, 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (skm.e0.J(r11, r4, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, yj1.e r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ck1.b
            if (r0 == 0) goto L13
            r0 = r13
            ck1.b r0 = (ck1.b) r0
            int r1 = r0.f24740y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24740y = r1
            goto L18
        L13:
            ck1.b r0 = new ck1.b
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f24738w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24740y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L7f
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yj1.e r12 = r0.v
            java.lang.String r11 = r0.u
            yhm.o.b(r13)
        L39:
            r7 = r11
            r6 = r12
            goto L4e
        L3c:
            yhm.o.b(r13)
            r0.u = r11
            r0.v = r12
            r0.f24740y = r4
            com.revolut.feature.air.tip.learn.impl.data.network.LearnAirTipService r13 = r10.f24741a
            java.lang.Object r13 = r13.markAirTipAsViewed(r11, r0)
            if (r13 != r1) goto L39
            goto L7e
        L4e:
            retrofit2.Response r13 = (retrofit2.Response) r13
            boolean r11 = r13.isSuccessful()
            if (r11 == 0) goto L82
            java.lang.Object r11 = r13.body()
            bk1.e r11 = (bk1.e) r11
            r8 = 0
            if (r11 == 0) goto L62
            bk1.g r11 = r11.f16221a
            goto L63
        L62:
            r11 = r8
        L63:
            bk1.g r12 = bk1.g.DEACTIVATED
            if (r11 != r12) goto L82
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            chf.a r4 = new chf.a
            r9 = 2
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.u = r8
            r0.v = r8
            r0.f24740y = r3
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L82:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ck1.c.a(java.lang.String, yj1.e, gim.c):java.lang.Object");
    }
}
