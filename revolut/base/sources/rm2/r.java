package rm2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f255197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f255199c;
    public final List d;

    public r(String str, List items, List tabItems, List navBarMenuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        this.f255197a = items;
        this.f255198b = tabItems;
        this.f255199c = str;
        this.d = navBarMenuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f255197a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f255197a, rVar.f255197a) && Intrinsics.f(this.f255198b, rVar.f255198b) && Intrinsics.f(this.f255199c, rVar.f255199c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f255197a.hashCode() * 31, 31, this.f255198b);
        String str = this.f255199c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
