package pf6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235498b;

    public /* synthetic */ v(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(t.f235496a.getDescriptor(), i, 3);
            throw null;
        }
        this.f235497a = str;
        this.f235498b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f235497a, vVar.f235497a) && Intrinsics.f(this.f235498b, vVar.f235498b);
    }

    public final int hashCode() {
        int iHashCode = this.f235497a.hashCode() * 31;
        String str = this.f235498b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public v(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f235497a = id10;
        this.f235498b = str;
    }
}
