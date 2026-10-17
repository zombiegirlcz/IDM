package v69;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f286337c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f286338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f286339h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f286340j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f286341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f286342m;

    public b(String id10, String type, DateTime createdDate, String state, String title, String subtitle, String icon, String str, Integer num, c cVar, List buttons, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f286335a = id10;
        this.f286336b = type;
        this.f286337c = createdDate;
        this.d = state;
        this.e = title;
        this.f = subtitle;
        this.f286338g = icon;
        this.f286339h = str;
        this.i = num;
        this.f286340j = cVar;
        this.k = buttons;
        this.f286341l = str2;
        this.f286342m = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f286335a, bVar.f286335a) && Intrinsics.f(this.f286336b, bVar.f286336b) && Intrinsics.f(this.f286337c, bVar.f286337c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f286338g, bVar.f286338g) && Intrinsics.f(this.f286339h, bVar.f286339h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f286340j, bVar.f286340j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f286341l, bVar.f286341l) && Intrinsics.f(this.f286342m, bVar.f286342m);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(m72.b.f(this.f286337c, p.a.c(this.f286335a.hashCode() * 31, 31, this.f286336b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f286338g);
        String str = this.f286339h;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.f286340j;
        int iD = p.a.d((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.k);
        String str2 = this.f286341l;
        int iHashCode3 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f286342m;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
