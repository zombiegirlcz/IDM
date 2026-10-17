package aj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5359b;

    public /* synthetic */ j(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h.f5354a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5358a = str;
        this.f5359b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f5358a, jVar.f5358a) && Intrinsics.f(this.f5359b, jVar.f5359b);
    }

    public final int hashCode() {
        int iHashCode = this.f5358a.hashCode() * 31;
        String str = this.f5359b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public j(String category, String str) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f5358a = category;
        this.f5359b = str;
    }
}
