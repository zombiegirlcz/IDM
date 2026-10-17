package eu3;

import dx4.x4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f129484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f129485c;
    public final x4 d;
    public final x4 e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f129486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f129487h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f129488j;

    public c(String title, String str, String str2, x4 x4Var, x4 x4Var2, b slidersOrder, List items, List bottomItems, String str3, String confirmButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(slidersOrder, "slidersOrder");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        Intrinsics.checkNotNullParameter(confirmButtonTitle, "confirmButtonTitle");
        this.f129483a = title;
        this.f129484b = str;
        this.f129485c = str2;
        this.d = x4Var;
        this.e = x4Var2;
        this.f = slidersOrder;
        this.f129486g = items;
        this.f129487h = bottomItems;
        this.i = str3;
        this.f129488j = confirmButtonTitle;
    }

    public static c a(c cVar, x4 x4Var, x4 x4Var2, int i) {
        String title = cVar.f129483a;
        String str = cVar.f129484b;
        String str2 = cVar.f129485c;
        if ((i & 8) != 0) {
            x4Var = cVar.d;
        }
        x4 x4Var3 = x4Var;
        if ((i & 16) != 0) {
            x4Var2 = cVar.e;
        }
        b slidersOrder = cVar.f;
        List items = cVar.f129486g;
        List bottomItems = cVar.f129487h;
        String str3 = cVar.i;
        String confirmButtonTitle = cVar.f129488j;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(slidersOrder, "slidersOrder");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        Intrinsics.checkNotNullParameter(confirmButtonTitle, "confirmButtonTitle");
        return new c(title, str, str2, x4Var3, x4Var2, slidersOrder, items, bottomItems, str3, confirmButtonTitle);
    }

    public final Long b() {
        x4 x4Var = this.d;
        if (x4Var != null) {
            return Long.valueOf(x4Var.e);
        }
        return null;
    }

    public final Long c() {
        x4 x4Var = this.e;
        if (x4Var != null) {
            return Long.valueOf(x4Var.e);
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f129483a, cVar.f129483a) && Intrinsics.f(this.f129484b, cVar.f129484b) && Intrinsics.f(this.f129485c, cVar.f129485c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f && Intrinsics.f(this.f129486g, cVar.f129486g) && Intrinsics.f(this.f129487h, cVar.f129487h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f129488j, cVar.f129488j);
    }

    public final int hashCode() {
        int iHashCode = this.f129483a.hashCode() * 31;
        String str = this.f129484b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f129485c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        x4 x4Var = this.d;
        int iHashCode4 = (iHashCode3 + (x4Var == null ? 0 : x4Var.hashCode())) * 31;
        x4 x4Var2 = this.e;
        int iD = p.a.d(p.a.d((this.f.hashCode() + ((iHashCode4 + (x4Var2 == null ? 0 : x4Var2.hashCode())) * 31)) * 31, 31, this.f129486g), 31, this.f129487h);
        String str3 = this.i;
        return this.f129488j.hashCode() + ((iD + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
