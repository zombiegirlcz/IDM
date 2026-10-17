package x23;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c93.j f302482a;

    public k(c93.j jVar) {
        this.f302482a = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f302482a, ((k) obj2).f302482a);
    }

    public final int hashCode() {
        c93.j jVar = this.f302482a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }
}
