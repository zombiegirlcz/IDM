package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161351b;

    public r(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f161350a = type;
        this.f161351b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f161350a, rVar.f161350a) && Intrinsics.f(this.f161351b, rVar.f161351b);
    }

    public final int hashCode() {
        int iHashCode = this.f161350a.hashCode() * 31;
        String str = this.f161351b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
