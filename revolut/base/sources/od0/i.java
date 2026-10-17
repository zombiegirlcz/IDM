package od0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f224256b = new i(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f224257a;

    public i(Object obj2) {
        this.f224257a = obj2;
    }

    public final void a(f consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        if (d()) {
            consumer.accept(c());
        }
    }

    public final i b(Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!d() || ((Boolean) predicate.invoke(c())).booleanValue()) {
            return this;
        }
        Companion.getClass();
        return f224256b;
    }

    public final Object c() {
        Object obj2 = this.f224257a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalArgumentException("Value must be nonNull");
    }

    public final boolean d() {
        return this.f224257a != null;
    }

    public final void e(f consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        if (d()) {
            consumer.accept(c());
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!i.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.common.Optional<*>");
        return Intrinsics.f(this.f224257a, ((i) obj2).f224257a);
    }

    public final i f(Function1 mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        if (!d()) {
            Companion.getClass();
            return f224256b;
        }
        h hVar = Companion;
        Object objInvoke = mapper.invoke(c());
        hVar.getClass();
        return h.a(objInvoke);
    }

    public final Object g() {
        if (d()) {
            return c();
        }
        return null;
    }

    public final int hashCode() {
        Object obj2 = this.f224257a;
        if (obj2 != null) {
            return obj2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return v0.a.h(this.f224257a, "Optional(item=", ")");
    }
}
