package ruj;

import kotlin.jvm.internal.Intrinsics;
import m1c.n;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f257576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257577c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f257578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f257579h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f257580j;
    public final String k;

    public /* synthetic */ i(int i, String str, boolean z, String str2, String str3, String str4, String str5, n nVar, b bVar, String str6, String str7, String str8) {
        if (2047 != (i & 2047)) {
            j1.f(g.f257574a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f257575a = str;
        this.f257576b = z;
        this.f257577c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f257578g = nVar;
        this.f257579h = bVar;
        this.i = str6;
        this.f257580j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f257575a, iVar.f257575a) && this.f257576b == iVar.f257576b && Intrinsics.f(this.f257577c, iVar.f257577c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f257578g, iVar.f257578g) && Intrinsics.f(this.f257579h, iVar.f257579h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f257580j, iVar.f257580j) && Intrinsics.f(this.k, iVar.k);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f257575a.hashCode() * 31, 31, this.f257576b);
        String str = this.f257577c;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        n nVar = this.f257578g;
        int iHashCode = (iC2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        b bVar = this.f257579h;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.i;
        return this.k.hashCode() + p.a.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f257580j);
    }

    public i(String id10, boolean z, String str, String title, String subtitle, String subtitleColor, n nVar, b bVar, String str2, String type, String date) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f257575a = id10;
        this.f257576b = z;
        this.f257577c = str;
        this.d = title;
        this.e = subtitle;
        this.f = subtitleColor;
        this.f257578g = nVar;
        this.f257579h = bVar;
        this.i = str2;
        this.f257580j = type;
        this.k = date;
    }
}
