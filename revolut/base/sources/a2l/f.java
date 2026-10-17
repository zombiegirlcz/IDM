package a2l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f899c;
    public final String d;
    public final g e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f901h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f902j;

    public f(String id10, String name, String tier, String iconUrl, g status, e eVar, String str, String str2, String str3, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f897a = id10;
        this.f898b = name;
        this.f899c = tier;
        this.d = iconUrl;
        this.e = status;
        this.f = eVar;
        this.f900g = str;
        this.f901h = str2;
        this.i = str3;
        this.f902j = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f897a, fVar.f897a) && Intrinsics.f(this.f898b, fVar.f898b) && Intrinsics.f(this.f899c, fVar.f899c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && Intrinsics.f(this.f900g, fVar.f900g) && Intrinsics.f(this.f901h, fVar.f901h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f902j, fVar.f902j);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f897a.hashCode() * 31, 31, this.f898b), 31, this.f899c), 31, this.d)) * 31;
        e eVar = this.f;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f900g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f901h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f902j;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }
}
