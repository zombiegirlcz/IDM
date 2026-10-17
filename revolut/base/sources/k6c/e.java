package k6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f181681a;

    public e(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f181681a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f181681a, ((e) obj2).f181681a);
    }

    public final int hashCode() {
        return this.f181681a.hashCode();
    }
}
