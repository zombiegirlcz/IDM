package hha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f152325b;

    public m0(w0 tier, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(tier, "tier");
        this.f152324a = id10;
        this.f152325b = tier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f152324a, m0Var.f152324a) && this.f152325b == m0Var.f152325b;
    }

    public final int hashCode() {
        return this.f152325b.hashCode() + (this.f152324a.hashCode() * 31);
    }
}
