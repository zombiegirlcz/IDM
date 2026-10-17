package dda;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f113159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f113160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113161c;
    public final String d;
    public final List e;

    public a(ArrayList accounts, k countries, String str, String str2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f113159a = accounts;
        this.f113160b = countries;
        this.f113161c = str;
        this.d = str2;
        this.e = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f113159a.equals(aVar.f113159a) && this.f113160b.equals(aVar.f113160b) && Intrinsics.f(this.f113161c, aVar.f113161c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f113160b.hashCode() + (this.f113159a.hashCode() * 31)) * 31;
        String str = this.f113161c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
