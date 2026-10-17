package uzi;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f284679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f284680b;

    public b(c cyclePeriod, int i) {
        Intrinsics.checkNotNullParameter(cyclePeriod, "cyclePeriod");
        this.f284679a = cyclePeriod;
        this.f284680b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f284679a == bVar.f284679a && this.f284680b == bVar.f284680b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f284680b) + (this.f284679a.hashCode() * 31);
    }
}
