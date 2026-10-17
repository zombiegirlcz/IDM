package h19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, j.c(k.PUBLICATION, new gx2.a(15)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f148480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148481c;
    public final String d;

    public /* synthetic */ d(int i, String str, c cVar, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f148478a.getDescriptor(), i, 7);
            throw null;
        }
        this.f148479a = str;
        this.f148480b = cVar;
        this.f148481c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f148479a, dVar.f148479a) && this.f148480b == dVar.f148480b && Intrinsics.f(this.f148481c, dVar.f148481c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f148480b.hashCode() + (this.f148479a.hashCode() * 31)) * 31, 31, this.f148481c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public d(String title, c type, String deeplink, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f148479a = title;
        this.f148480b = type;
        this.f148481c = deeplink;
        this.d = str;
    }
}
