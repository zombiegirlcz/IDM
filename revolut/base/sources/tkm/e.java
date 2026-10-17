package tkm;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.i0;
import skm.l;
import skm.p0;
import skm.r0;
import skm.u1;
import skm.x1;
import zkm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends u1 implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f271975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271976c;
    public final boolean d;
    public final e e;

    public e(Handler handler, String str, boolean z) {
        this.f271975b = handler;
        this.f271976c = str;
        this.d = z;
        this.e = z ? this : new e(handler, str, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f271975b.post(runnable)) {
            return;
        }
        m(coroutineContext, runnable);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return eVar.f271975b == this.f271975b && eVar.d == this.d;
    }

    @Override // skm.i0
    public final void g(long j2, l lVar) {
        p6.e eVar = new p6.e(lVar, this, 26);
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f271975b.postDelayed(eVar, j2)) {
            lVar.r(new d(this, eVar, 0));
        } else {
            m(lVar.e, eVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f271975b) ^ (this.d ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return (this.d && Intrinsics.f(Looper.myLooper(), this.f271975b.getLooper())) ? false : true;
    }

    @Override // skm.i0
    public final r0 j(long j2, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f271975b.postDelayed(runnable, j2)) {
            return new r0() { // from class: tkm.c
                @Override // skm.r0
                public final void dispose() {
                    this.f271970a.f271975b.removeCallbacks(runnable);
                }
            };
        }
        m(coroutineContext, runnable);
        return x1.f264019a;
    }

    public final void m(CoroutineContext coroutineContext, Runnable runnable) {
        e0.j(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        p0 p0Var = p0.f264001a;
        elm.f.f127540b.dispatch(coroutineContext, runnable);
    }

    @Override // skm.u1, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        e eVar;
        String str;
        p0 p0Var = p0.f264001a;
        e eVar2 = o.f323119a;
        if (this == eVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar2.e;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f271976c;
        if (string == null) {
            string = this.f271975b.toString();
        }
        return this.d ? a0.d.r(string, ".immediate") : string;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
