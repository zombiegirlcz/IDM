package ml;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class s extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f206546a;

    public s(List backstackSnapshot) {
        Intrinsics.checkNotNullParameter(backstackSnapshot, "backstackSnapshot");
        this.f206546a = backstackSnapshot;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f206546a, ((s) obj2).f206546a);
    }

    public final int hashCode() {
        return this.f206546a.hashCode();
    }

    public final String toString() {
        return "OnBackstackChange(backstackSnapshot=" + this.f206546a + ")";
    }
}
