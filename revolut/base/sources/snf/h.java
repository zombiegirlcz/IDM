package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements u {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f264583a;

    public h(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f264583a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f264583a, ((h) obj2).f264583a);
    }

    public final int hashCode() {
        return this.f264583a.hashCode();
    }
}
