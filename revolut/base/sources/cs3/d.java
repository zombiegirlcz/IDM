package cs3;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f108444c = new d(c.a(), false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f108445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f108446b;

    public d(Set productOrdering, boolean z) {
        Intrinsics.checkNotNullParameter(productOrdering, "productOrdering");
        this.f108445a = productOrdering;
        this.f108446b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f108445a, dVar.f108445a) && this.f108446b == dVar.f108446b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108446b) + (this.f108445a.hashCode() * 31);
    }
}
