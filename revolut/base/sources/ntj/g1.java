package ntj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f219068g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ns1.a(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219071c;
    public final String d;
    public final String e;
    public final List f;

    public /* synthetic */ g1(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if (63 != (i & 63)) {
            qlm.j1.f(e1.f219058a.getDescriptor(), i, 63);
            throw null;
        }
        this.f219069a = str;
        this.f219070b = str2;
        this.f219071c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f219069a, g1Var.f219069a) && Intrinsics.f(this.f219070b, g1Var.f219070b) && Intrinsics.f(this.f219071c, g1Var.f219071c) && Intrinsics.f(this.d, g1Var.d) && Intrinsics.f(this.e, g1Var.e) && Intrinsics.f(this.f, g1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f219069a.hashCode() * 31, 31, this.f219070b), 31, this.f219071c), 31, this.d), 31, this.e);
    }

    public g1(String id10, String title, String subtitle, String asset, String deeplink, ArrayList items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f219069a = id10;
        this.f219070b = title;
        this.f219071c = subtitle;
        this.d = asset;
        this.e = deeplink;
        this.f = items;
    }
}
