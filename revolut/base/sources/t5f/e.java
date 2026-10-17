package t5f;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f268078h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268081c;
    public final String d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f268082g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f268078h = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new szl.a(13)), yhm.j.c(kVar, new szl.a(14)), yhm.j.c(kVar, new szl.a(15))};
    }

    public /* synthetic */ e(int i, String str, String str2, String str3, String str4, List list, List list2, b bVar) {
        if (63 != (i & 63)) {
            j1.f(c.f268077a.getDescriptor(), i, 63);
            throw null;
        }
        this.f268079a = str;
        this.f268080b = str2;
        this.f268081c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
        if ((i & 64) == 0) {
            this.f268082g = null;
        } else {
            this.f268082g = bVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f268079a, eVar.f268079a) && Intrinsics.f(this.f268080b, eVar.f268080b) && Intrinsics.f(this.f268081c, eVar.f268081c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && this.f268082g == eVar.f268082g;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.c(p.a.c(p.a.c(this.f268079a.hashCode() * 31, 31, this.f268080b), 31, this.f268081c), 31, this.d), 31, this.e), 31, this.f);
        b bVar = this.f268082g;
        return iD + (bVar == null ? 0 : bVar.hashCode());
    }

    public e(String title, String iconName, String subtitle, String riskScore, ArrayList items, ArrayList screens, b bVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(riskScore, "riskScore");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f268079a = title;
        this.f268080b = iconName;
        this.f268081c = subtitle;
        this.d = riskScore;
        this.e = items;
        this.f = screens;
        this.f268082g = bVar;
    }
}
