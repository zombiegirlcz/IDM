package nuj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219329c;
    public final List d;
    public final List e;

    static {
        k kVar = k.PUBLICATION;
        f = new Lazy[]{null, null, null, yhm.j.c(kVar, new ns1.a(22)), yhm.j.c(kVar, new ns1.a(23))};
    }

    public /* synthetic */ i(int i, String str, String str2, String str3, List list, List list2) {
        if (31 != (i & 31)) {
            j1.f(g.f219326a.getDescriptor(), i, 31);
            throw null;
        }
        this.f219327a = str;
        this.f219328b = str2;
        this.f219329c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f219327a, iVar.f219327a) && Intrinsics.f(this.f219328b, iVar.f219328b) && Intrinsics.f(this.f219329c, iVar.f219329c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.c(p.a.c(this.f219327a.hashCode() * 31, 31, this.f219328b), 31, this.f219329c), 31, this.d);
    }

    public i(String id10, String countryCode, String assetUrl, ArrayList tools, ArrayList products) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f219327a = id10;
        this.f219328b = countryCode;
        this.f219329c = assetUrl;
        this.d = tools;
        this.e = products;
    }
}
