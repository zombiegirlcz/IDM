package te0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class r implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f270016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.j f270017b;

    public r() {
        this.f270017b = p.a.h("toSerialized(...)");
    }

    @Override // te0.v
    public final efm.r a() {
        return c(s.f270018a);
    }

    @Override // te0.v
    public final efm.r b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        efm.r rVarFromCallable = efm.r.fromCallable(new pu9.a(this, value, 28));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }

    public final efm.r c(x strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        efm.r rVarCompose = efm.r.defer(new af.d(this, 8)).compose(strategy.a());
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return rVarCompose;
    }

    @Override // te0.v
    public final Object get() {
        Object obj2 = this.f270016a;
        if (obj2 != null) {
            return obj2;
        }
        Intrinsics.r("value");
        throw null;
    }

    @Override // te0.v
    public final boolean isInitialized() {
        return this.f270016a != null;
    }

    @Override // te0.v
    public final void set(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f270016a = value;
        this.f270017b.onNext(value);
    }

    public r(Object obj2) {
        Intrinsics.checkNotNullParameter(obj2, "default");
        this.f270016a = obj2;
        this.f270017b = p.a.h("toSerialized(...)");
    }
}
