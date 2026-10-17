package u2i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.e f276661a;

    public a(wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f276661a = exchangeMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f276661a == ((a) obj2).f276661a;
    }

    public final int hashCode() {
        return this.f276661a.hashCode();
    }
}
