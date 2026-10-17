package z10;

import ald.p;
import androidx.lifecycle.DefaultLifecycleObserver;
import az0.r1;
import eg.l0;
import java.time.Instant;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kg.o;
import kmm.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import ukm.f;
import v30.e1;
import vkm.d2;
import vkm.h2;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.t1;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements r20.b, DefaultLifecycleObserver {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f318710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f318711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f318712c;
    public volatile h d;
    public e1 e;
    public Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f318713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f318714h;
    public final z1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1 f318715j;
    public final t1 k;

    public e(p10.b config, OkHttpClient okHttpClient, o gson, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f318710a = okHttpClient;
        this.f318711b = gson;
        this.f318712c = scope;
        Instant MAX = Instant.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        this.f = MAX;
        this.f318713g = new AtomicInteger(0);
        this.f318714h = q.c(new r20.c(0, "Init"));
        f fVar = f.DROP_OLDEST;
        this.i = q.b(0, 2, fVar);
        this.f318715j = q.a(0, 1, fVar);
        Continuation continuation = null;
        Flow flowE = com.google.crypto.tink.shaded.protobuf.t1.E(new q0(rd0.e.e(q.L(q.k(new afe.a(this, continuation, 20)), Long.MAX_VALUE, new r1(this, continuation, 20)), h0.f322473a, new l0(3, 1, null)), new p(this, continuation, 15), 1));
        d2.Companion.getClass();
        this.k = q.M(flowE, scope, new h2(500L, 0L), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(z10.e r22, v30.e1 r23, int r24, gim.c r25) {
        /*
            r0 = r25
            boolean r1 = r0 instanceof z10.c
            if (r1 == 0) goto L15
            r1 = r0
            z10.c r1 = (z10.c) r1
            int r2 = r1.f318706w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f318706w = r2
            goto L1c
        L15:
            z10.c r1 = new z10.c
            r2 = r22
            r1.<init>(r2, r0)
        L1c:
            java.lang.Object r0 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f318706w
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r0)
            goto Lbd
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            yhm.o.b(r0)
            if (r23 == 0) goto Lbc
            v30.e1$a r0 = r23.getOpenConnectionBackoff()
            if (r0 == 0) goto Lbc
            long r5 = r0.getMaxMillis()
            long r7 = r0.getMinMillis()
            double r7 = (double) r7
            r3 = r24
            double r9 = (double) r3
            r3 = 2
            double r11 = (double) r3
            double r9 = java.lang.Math.pow(r9, r11)
            double r9 = r9 * r7
            double r7 = (double) r4
            tim.c$a r3 = tim.c.INSTANCE
            r3.getClass()
            tim.a r3 = tim.c.f271589b
            r3.getClass()
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            boolean r15 = java.lang.Double.isInfinite(r13)
            r16 = 0
            if (r15 == 0) goto L91
            double r18 = java.lang.Math.abs(r16)
            r20 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r15 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r15 > 0) goto L91
            double r18 = java.lang.Math.abs(r13)
            int r15 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r15 > 0) goto L91
            java.util.Random r3 = r3.h()
            double r18 = r3.nextDouble()
            double r20 = r13 / r11
            double r11 = r16 / r11
            double r20 = r20 - r11
            double r20 = r20 * r18
            double r16 = r16 + r20
            double r16 = r16 + r20
            goto L9c
        L91:
            java.util.Random r3 = r3.h()
            double r11 = r3.nextDouble()
            double r11 = r11 * r13
            double r16 = r11 + r16
        L9c:
            int r3 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r3 < 0) goto La6
            r11 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r16 = java.lang.Math.nextAfter(r13, r11)
        La6:
            double r11 = r0.getRandomFactor()
            double r11 = r11 * r16
            double r11 = r11 + r7
            double r11 = r11 * r9
            long r7 = (long) r11
            long r5 = java.lang.Math.min(r5, r7)
            r1.f318706w = r4
            java.lang.Object r0 = skm.k0.b(r5, r1)
            if (r0 != r2) goto Lbd
            return r2
        Lbc:
            r4 = 0
        Lbd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z10.e.a(z10.e, v30.e1, int, gim.c):java.lang.Object");
    }

    public final void b(p20.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "OkHttpChatWsApiV2", "send event: type=" + event.getType() + ", id=" + event.getId(), null, null, 16);
        p0 p0Var = p0.f264001a;
        e0.C(this.f318712c, elm.f.f127540b, null, new yy6.f(this, event, null, 4), 2);
    }
}
