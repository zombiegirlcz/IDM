package cv3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109233c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f109234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f109235h;
    public final String i;

    public a(String title, String str, String str2, ArrayList arrayList, List items, List bottomItems, String str3, String buttonTitle, String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f109231a = title;
        this.f109232b = str;
        this.f109233c = str2;
        this.d = arrayList;
        this.e = items;
        this.f = bottomItems;
        this.f109234g = str3;
        this.f109235h = buttonTitle;
        this.i = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f109231a, aVar.f109231a) && Intrinsics.f(this.f109232b, aVar.f109232b) && Intrinsics.f(this.f109233c, aVar.f109233c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f109234g, aVar.f109234g) && Intrinsics.f(this.f109235h, aVar.f109235h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f109231a.hashCode() * 31;
        String str = this.f109232b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f109233c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iD = p.a.d(p.a.d((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31, this.f);
        String str3 = this.f109234g;
        int iC = p.a.c((iD + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f109235h);
        String str4 = this.i;
        return iC + (str4 != null ? str4.hashCode() : 0);
    }
}
