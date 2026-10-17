package uqk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f282215c;
    public final k d;
    public final ArrayList e;

    public g(String id10, String title, h type, k kVar, ArrayList subItems) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subItems, "subItems");
        this.f282213a = id10;
        this.f282214b = title;
        this.f282215c = type;
        this.d = kVar;
        this.e = subItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f282213a, gVar.f282213a) && Intrinsics.f(this.f282214b, gVar.f282214b) && this.f282215c == gVar.f282215c && Intrinsics.f(this.d, gVar.d) && this.e.equals(gVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f282215c.hashCode() + p.a.c(this.f282213a.hashCode() * 31, 31, this.f282214b)) * 31;
        k kVar = this.d;
        return this.e.hashCode() + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31);
    }
}
