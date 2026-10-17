package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f264569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f264570b;

    public a0(wi0.b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f264569a = countryCode;
        this.f264570b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f264569a, a0Var.f264569a) && this.f264570b == a0Var.f264570b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264570b) + (this.f264569a.f297794a.hashCode() * 31);
    }
}
