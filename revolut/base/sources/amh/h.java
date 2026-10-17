package amh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ylh.a f6402c;
    public final boolean d;
    public final hel.b e;
    public final String f;

    public h(String selectedTabId, List periodItems, ylh.a aVar, boolean z, hel.b bVar, String str) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        this.f6400a = selectedTabId;
        this.f6401b = periodItems;
        this.f6402c = aVar;
        this.d = z;
        this.e = bVar;
        this.f = str;
    }

    public static h a(h hVar, String str, List list, ylh.a aVar, boolean z, hel.b bVar, String str2, int i) {
        if ((i & 1) != 0) {
            str = hVar.f6400a;
        }
        String selectedTabId = str;
        if ((i & 2) != 0) {
            list = hVar.f6401b;
        }
        List periodItems = list;
        if ((i & 4) != 0) {
            aVar = hVar.f6402c;
        }
        ylh.a aVar2 = aVar;
        if ((i & 8) != 0) {
            z = hVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            bVar = hVar.e;
        }
        hel.b bVar2 = bVar;
        if ((i & 32) != 0) {
            str2 = hVar.f;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        return new h(selectedTabId, periodItems, aVar2, z3, bVar2, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f6400a, hVar.f6400a) && Intrinsics.f(this.f6401b, hVar.f6401b) && Intrinsics.f(this.f6402c, hVar.f6402c) && this.d == hVar.d && this.e == hVar.e && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f6400a.hashCode() * 31, 31, this.f6401b);
        ylh.a aVar = this.f6402c;
        int iC = j6.a.c((iD + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.d);
        hel.b bVar = this.e;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
