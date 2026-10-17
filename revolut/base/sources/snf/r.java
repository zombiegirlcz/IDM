package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements u {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f264601a;

    public r(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f264601a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f264601a, ((r) obj2).f264601a);
    }

    public final int hashCode() {
        return this.f264601a.hashCode();
    }
}
