package qzb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f250502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f250503c;
    public final i d;

    public l(List items, List menuItems, aw0.i iVar, i header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f250501a = items;
        this.f250502b = menuItems;
        this.f250503c = iVar;
        this.d = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f250501a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f250501a, lVar.f250501a) && Intrinsics.f(this.f250502b, lVar.f250502b) && Intrinsics.f(this.f250503c, lVar.f250503c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f250501a.hashCode() * 31, 31, this.f250502b);
        aw0.i iVar = this.f250503c;
        return this.d.hashCode() + ((iD + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
