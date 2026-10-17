package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f161336c;

    public l(String type, String str, k kVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f161334a = type;
        this.f161335b = str;
        this.f161336c = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f161334a, lVar.f161334a) && Intrinsics.f(this.f161335b, lVar.f161335b) && Intrinsics.f(this.f161336c, lVar.f161336c);
    }

    public final int hashCode() {
        int iHashCode = this.f161334a.hashCode() * 31;
        String str = this.f161335b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.f161336c;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }
}
