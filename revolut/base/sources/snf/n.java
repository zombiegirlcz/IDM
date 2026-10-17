package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements u {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f264598a;

    public n(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f264598a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f264598a, ((n) obj2).f264598a);
    }

    public final int hashCode() {
        return this.f264598a.hashCode();
    }
}
