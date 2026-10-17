package puj;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.rev_points.models.Logo;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f239907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239908c;
    public final String d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logo f239909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Address f239910h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f239911j;
    public final LocalDateTime k;

    public b(String id10, boolean z, String str, String title, String subtitle, d subtitleColor, Logo logo, Address address, String str2, c type, LocalDateTime date) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f239906a = id10;
        this.f239907b = z;
        this.f239908c = str;
        this.d = title;
        this.e = subtitle;
        this.f = subtitleColor;
        this.f239909g = logo;
        this.f239910h = address;
        this.i = str2;
        this.f239911j = type;
        this.k = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f239906a, bVar.f239906a) && this.f239907b == bVar.f239907b && Intrinsics.f(this.f239908c, bVar.f239908c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && Intrinsics.f(this.f239909g, bVar.f239909g) && Intrinsics.f(this.f239910h, bVar.f239910h) && Intrinsics.f(this.i, bVar.i) && this.f239911j == bVar.f239911j && Intrinsics.f(this.k, bVar.k);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f239906a.hashCode() * 31, 31, this.f239907b);
        String str = this.f239908c;
        int iHashCode = (this.f.hashCode() + p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31;
        Logo logo = this.f239909g;
        int iHashCode2 = (iHashCode + (logo == null ? 0 : logo.hashCode())) * 31;
        Address address = this.f239910h;
        int iHashCode3 = (iHashCode2 + (address == null ? 0 : address.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        return this.k.hashCode() + ((this.f239911j.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
    }
}
