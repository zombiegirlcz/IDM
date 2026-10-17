package ulk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f281040a;

    public l(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f281040a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f281040a, ((l) obj2).f281040a);
    }

    public final int hashCode() {
        return this.f281040a.hashCode();
    }
}
