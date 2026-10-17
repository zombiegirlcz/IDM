package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements u {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f264579a;

    public f(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f264579a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f264579a, ((f) obj2).f264579a);
    }

    public final int hashCode() {
        return this.f264579a.hashCode();
    }
}
