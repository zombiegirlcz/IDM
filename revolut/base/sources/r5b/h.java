package r5b;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251572b;

    public h(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f251571a = title;
        this.f251572b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f251571a, hVar.f251571a) && Intrinsics.f(this.f251572b, hVar.f251572b);
    }

    public final int hashCode() {
        int iHashCode = this.f251571a.hashCode() * 31;
        String str = this.f251572b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
