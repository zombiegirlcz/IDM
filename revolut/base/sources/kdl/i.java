package kdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f182913c;
    public final String d;

    public /* synthetic */ i(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            j1.f(g.f182910a.getDescriptor(), i, 7);
            throw null;
        }
        this.f182911a = str;
        this.f182912b = str2;
        this.f182913c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f182911a, iVar.f182911a) && Intrinsics.f(this.f182912b, iVar.f182912b) && Intrinsics.f(this.f182913c, iVar.f182913c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f182911a.hashCode() * 31, 31, this.f182912b), 31, this.f182913c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public i(String id10, String name, String icon, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f182911a = id10;
        this.f182912b = name;
        this.f182913c = icon;
        this.d = str;
    }
}
