package ukd;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f280727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280729c;
    public final String d;
    public final String e;
    public final Map f;

    public a(String id10, String screenId, String campaignId, String slotType, String actionType, Map map) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(slotType, "slotType");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f280727a = id10;
        this.f280728b = screenId;
        this.f280729c = campaignId;
        this.d = slotType;
        this.e = actionType;
        this.f = map;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f280729c;
    }

    public final String c() {
        return this.f280727a;
    }

    public final Map d() {
        return this.f;
    }

    public final String e() {
        return this.f280728b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f280727a, aVar.f280727a) && Intrinsics.f(this.f280728b, aVar.f280728b) && Intrinsics.f(this.f280729c, aVar.f280729c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final String f() {
        return this.d;
    }

    public final void g(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f280727a = str;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f280727a.hashCode() * 31, 31, this.f280728b), 31, this.f280729c), 31, this.d), 31, this.e);
        Map map = this.f;
        return iC + (map == null ? 0 : map.hashCode());
    }

    public /* synthetic */ a(String str, String str2, Map map, String str3, String str4) {
        this("", str, str2, str3, str4, map);
    }
}
