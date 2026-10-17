package av3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9905c;
    public final String d;
    public final List e;

    public h(String title, String str, String str2, String str3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f9903a = title;
        this.f9904b = str;
        this.f9905c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f9903a, hVar.f9903a) && Intrinsics.f(this.f9904b, hVar.f9904b) && Intrinsics.f(this.f9905c, hVar.f9905c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f9903a.hashCode() * 31;
        String str = this.f9904b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9905c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
