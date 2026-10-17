package do3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116429b;

    public p() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f116428a, pVar.f116428a) && Intrinsics.f(this.f116429b, pVar.f116429b);
    }

    public final int hashCode() {
        String str = this.f116428a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f116429b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public p(String str, ArrayList arrayList) {
        this.f116428a = str;
        this.f116429b = arrayList;
    }
}
