package hha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f152330b;

    public o0(String id10, wi0.b country) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f152329a = id10;
        this.f152330b = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f152329a, o0Var.f152329a) && Intrinsics.f(this.f152330b, o0Var.f152330b);
    }

    public final int hashCode() {
        return this.f152330b.f297794a.hashCode() + (this.f152329a.hashCode() * 31);
    }
}
