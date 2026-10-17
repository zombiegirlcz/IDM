package g9f;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new g53.e(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f141548c;

    public /* synthetic */ c(int i, String str, String str2, n0 n0Var) {
        if (3 != (i & 3)) {
            j1.f(a.f141542a.getDescriptor(), i, 3);
            throw null;
        }
        this.f141546a = str;
        this.f141547b = str2;
        if ((i & 4) == 0) {
            this.f141548c = n0.UNKNOWN;
        } else {
            this.f141548c = n0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f141546a, cVar.f141546a) && Intrinsics.f(this.f141547b, cVar.f141547b) && this.f141548c == cVar.f141548c;
    }

    public final int hashCode() {
        return this.f141548c.hashCode() + p.a.c(this.f141546a.hashCode() * 31, 31, this.f141547b);
    }

    public c(String name, String icon, n0 transferType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        this.f141546a = name;
        this.f141547b = icon;
        this.f141548c = transferType;
    }
}
