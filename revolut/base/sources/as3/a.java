package as3;

import it3.k;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f8786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8787b;

    public a(k type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f8786a = type;
        this.f8787b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f8786a == aVar.f8786a && Intrinsics.f(this.f8787b, aVar.f8787b);
    }

    public final int hashCode() {
        int iHashCode = this.f8786a.hashCode() * 31;
        String str = this.f8787b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
