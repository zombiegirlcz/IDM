package pdg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235216a;

    public s(List roomsList) {
        Intrinsics.checkNotNullParameter(roomsList, "roomsList");
        this.f235216a = roomsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f235216a, ((s) obj2).f235216a);
    }

    public final int hashCode() {
        return this.f235216a.hashCode();
    }
}
