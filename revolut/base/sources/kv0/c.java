package kv0;

import android.graphics.SurfaceTexture;
import androidx.media3.exoplayer.ExoPlayer;
import k7c.l0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rd0.e;
import skm.a2;
import skm.e0;
import skm.g0;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExoPlayer f189909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceTexture f189910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f189911c;
    public a d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f189912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a2 f189913h;
    public g0 i;

    public c() {
        p0 p0Var = p0.f264001a;
        this.f189912g = e.a(o.f323119a.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kv0.c r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof kv0.b
            if (r0 == 0) goto L13
            r0 = r6
            kv0.b r0 = (kv0.b) r0
            int r1 = r0.f189908w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189908w = r1
            goto L18
        L13:
            kv0.b r0 = new kv0.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189908w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L4e
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            skm.g0 r6 = r5.i
            if (r6 != 0) goto L41
            kv0.a r6 = r5.d
            if (r6 == 0) goto L40
            skm.r r6 = r6.dispose()
            goto L41
        L40:
            r6 = r3
        L41:
            r5.i = r6
            if (r6 == 0) goto L4e
            r0.f189908w = r4
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r5.i = r3
            android.graphics.SurfaceTexture r6 = r5.f189910b
            if (r6 != 0) goto L57
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L57:
            androidx.media3.exoplayer.ExoPlayer r0 = r5.f189909a
            if (r0 != 0) goto L5e
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L5e:
            od0.a r1 = od0.a.f224253a
            boolean r1 = od0.a.i()
            boolean r2 = r5.f189911c
            if (r2 == 0) goto L70
            if (r1 != 0) goto L70
            mv0.j r1 = new mv0.j
            r1.<init>(r6, r0)
            goto L75
        L70:
            jt0.b r1 = new jt0.b
            r1.<init>(r6, r0)
        L75:
            r5.d = r1
            int r6 = r5.e
            int r5 = r5.f
            r1.b(r6, r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kv0.c.a(kv0.c, gim.c):java.lang.Object");
    }

    public final void b() {
        g0 g0VarDispose = this.i;
        if (g0VarDispose == null) {
            a aVar = this.d;
            g0VarDispose = aVar != null ? aVar.dispose() : null;
        }
        this.i = g0VarDispose;
        this.d = null;
        a2 a2Var = this.f189913h;
        if (a2Var != null) {
            a2Var.f(null);
        }
    }

    public final float c(float f) {
        a aVar = this.d;
        return aVar != null ? aVar.k(f) : f;
    }

    public final void d(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.f189909a = player;
        f();
    }

    public final void e(boolean z) {
        if (z != this.f189911c || this.d == null) {
            this.f189911c = z;
            f();
        }
    }

    public final void f() {
        a2 a2Var = this.f189913h;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f189913h = e0.C(this.f189912g, null, null, new l0(this, continuation, 27), 3);
    }
}
