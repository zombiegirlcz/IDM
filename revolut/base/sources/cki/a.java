package cki;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import vkm.q;
import yhm.j;
import yhm.k;
import yji.n;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f24852l = j.c(k.NONE, new bvb.a(this, 23));

    public Flow F1() {
        return c3();
    }

    public abstract Object Z2();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Object b3() {
        Object objD0 = d0.d0(((MutableSharedFlow) this.f24852l.getValue()).d());
        if (objD0 != null) {
            return objD0;
        }
        throw new IllegalStateException("initialState must be initialised to use coroutines API");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Flow c3() {
        return q.q((MutableSharedFlow) this.f24852l.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void d3(Function1 func) {
        Intrinsics.checkNotNullParameter(func, "func");
        ((MutableSharedFlow) this.f24852l.getValue()).k(func.invoke(b3()));
    }
}
