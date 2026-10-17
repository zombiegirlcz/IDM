package ts7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f274044c;
    public final b d;
    public final String e;

    public c(String title, String str, ArrayList arrayList, a aVar, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f274042a = title;
        this.f274043b = str;
        this.f274044c = arrayList;
        this.d = aVar;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f274042a, cVar.f274042a) && Intrinsics.f(this.f274043b, cVar.f274043b) && Intrinsics.f(this.f274044c, cVar.f274044c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f274042a.hashCode() * 31;
        String str = this.f274043b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f274044c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        b bVar = this.d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
