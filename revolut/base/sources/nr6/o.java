package nr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218577b;

    public o(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f218576a = id10;
        this.f218577b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f218576a, oVar.f218576a) && Intrinsics.f(this.f218577b, oVar.f218577b);
    }

    public final int hashCode() {
        int iHashCode = this.f218576a.hashCode() * 31;
        String str = this.f218577b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
