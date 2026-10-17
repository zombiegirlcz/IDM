package mu3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f208947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f208948c;
    public final String d;
    public final String e;
    public final List f;

    public b(String id10, String str, String str2, List tabs, String str3, String selectedTab) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f208946a = id10;
        this.f208947b = str;
        this.f208948c = str2;
        this.d = str3;
        this.e = selectedTab;
        this.f = tabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f208946a, bVar.f208946a) && Intrinsics.f(this.f208947b, bVar.f208947b) && Intrinsics.f(this.f208948c, bVar.f208948c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f208946a.hashCode() * 31;
        String str = this.f208947b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f208948c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.f.hashCode() + p.a.c((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.e);
    }
}
