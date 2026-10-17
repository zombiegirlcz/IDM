package te0;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f270019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f270020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f270021c;
    public final Object d;

    public t(ue0.c storage, String key, Type type, Object obj2) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "default");
        this.f270019a = storage;
        this.f270020b = key;
        this.f270021c = type;
        this.d = obj2;
    }

    @Override // te0.v
    public final efm.r a() {
        return c(s.f270018a);
    }

    @Override // te0.v
    public final efm.r b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        efm.r rVarFromCallable = efm.r.fromCallable(new pu9.a(this, value, 29));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }

    public final efm.r c(x strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        efm.r rVarCompose = rd0.e.c(this.f270019a.C0(this.f270020b, this.f270021c), kotlin.coroutines.g.f186406a).map(new tcg.q(3, new td1.f(this, 5))).compose(strategy.a());
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return rVarCompose;
    }

    @Override // te0.v
    public final Object get() {
        Type type = this.f270021c;
        return this.f270019a.v0(this.d, this.f270020b, type);
    }

    @Override // te0.v
    public final boolean isInitialized() {
        return true;
    }

    @Override // te0.v
    public final void set(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f270019a.G(value, this.f270020b, this.f270021c);
    }
}
