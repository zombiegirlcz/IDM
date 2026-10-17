package mid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205731c;
    public final List d;
    public final List e;
    public final bo3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f205732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f205733h;

    public n(String id10, String type, String title, List tiles, List actions, bo3.a aVar, ArrayList arrayList, Map campaignOffers) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(campaignOffers, "campaignOffers");
        this.f205729a = id10;
        this.f205730b = type;
        this.f205731c = title;
        this.d = tiles;
        this.e = actions;
        this.f = aVar;
        this.f205732g = arrayList;
        this.f205733h = campaignOffers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f205729a, nVar.f205729a) && Intrinsics.f(this.f205730b, nVar.f205730b) && this.f205731c.equals(nVar.f205731c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f205732g, nVar.f205732g) && this.f205733h.equals(nVar.f205733h);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.c(p.a.c(this.f205729a.hashCode() * 31, 31, this.f205730b), 31, this.f205731c), 31, this.d), 31, this.e);
        bo3.a aVar = this.f;
        int iHashCode = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f205732g;
        return this.f205733h.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }
}
