package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161354b;

    public t(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f161353a = title;
        this.f161354b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f161353a, tVar.f161353a) && Intrinsics.f(this.f161354b, tVar.f161354b);
    }

    public final int hashCode() {
        int iHashCode = this.f161353a.hashCode() * 31;
        String str = this.f161354b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
