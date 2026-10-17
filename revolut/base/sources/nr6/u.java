package nr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218584b;

    public u(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f218583a = id10;
        this.f218584b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f218583a, uVar.f218583a) && Intrinsics.f(this.f218584b, uVar.f218584b);
    }

    public final int hashCode() {
        int iHashCode = this.f218583a.hashCode() * 31;
        String str = this.f218584b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
