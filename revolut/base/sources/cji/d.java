package cji;

import cji.e;
import efm.r;
import ihm.k;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f24685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f24686b;

    public d() {
        this(null);
    }

    public final Object a() {
        Object obj2 = this.f24685a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("State property not initialized");
    }

    public final Object b() {
        return this.f24685a;
    }

    public final r c() {
        e.a strategy = e.a.f24687a;
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        r rVarCompose = ((k) this.f24686b.getValue()).compose(new cie.b(3));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return rVarCompose;
    }

    public final void d(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24685a = value;
        ((k) this.f24686b.getValue()).onNext(value);
    }

    public d(Object obj2) {
        this.f24685a = obj2;
        this.f24686b = j.b(new c(obj2, 0));
    }
}
