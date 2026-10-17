package bec;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f14809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14810c;
    public final aw0.i d;

    public s(List items, r titleConfiguration, List menuItems, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(titleConfiguration, "titleConfiguration");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f14808a = items;
        this.f14809b = titleConfiguration;
        this.f14810c = menuItems;
        this.d = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f14808a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f14808a, sVar.f14808a) && Intrinsics.f(this.f14809b, sVar.f14809b) && Intrinsics.f(this.f14810c, sVar.f14810c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f14809b.hashCode() + (this.f14808a.hashCode() * 31)) * 31, 31, this.f14810c);
        aw0.i iVar = this.d;
        return iD + (iVar == null ? 0 : iVar.hashCode());
    }
}
