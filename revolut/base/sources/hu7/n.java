package hu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155592b;

    public n(String product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f155591a = product;
        this.f155592b = j6.a.q("EMBEDDED_INSURANCE_POLICY_", product);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f155591a, ((n) obj2).f155591a);
    }

    public final int hashCode() {
        return this.f155591a.hashCode();
    }
}
