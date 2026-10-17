package ne0;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements j {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd0.d f214396b;

    public n(long j2, int i) {
        this.f214395a = j2;
        this.f214396b = new fd0.d(i);
    }

    @Override // od0.e
    public final void clear() {
        this.f214396b.i(-1);
    }

    @Override // ne0.j
    public final boolean contains(Object obj2) {
        return get(obj2) != null;
    }

    @Override // ne0.j
    public final void f(Object obj2, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f214396b.d(obj2, new m(value));
    }

    @Override // ne0.j
    public final Object get(Object obj2) {
        Object obj3;
        m mVar = (m) this.f214396b.c(obj2);
        if (mVar != null) {
            if (jli.b.d() - mVar.f214394b <= this.f214395a && (obj3 = mVar.f214393a) != null) {
                return obj3;
            }
        }
        return null;
    }

    @Override // ne0.j
    public final List getAll() {
        List listJ = y.J(y.x(y.o(d0.Q(this.f214396b.h().values()), new n7h.c(this, 21)), new nd8.i(3)));
        Intrinsics.i(listJ, "null cannot be cast to non-null type kotlin.collections.List<T of com.revolut.core.data.memory.TimeBasedCache.extractNotExpiredValues>");
        return listJ;
    }

    @Override // ne0.j
    public final Object remove(Object obj2) {
        Object objE = this.f214396b.e(obj2);
        if (objE == null) {
            return null;
        }
        return objE;
    }

    @Override // ne0.j
    public final void t1(Collection values, Function1 keySelector) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        clear();
        for (Object obj2 : values) {
            f(keySelector.invoke(obj2), obj2);
        }
    }
}
