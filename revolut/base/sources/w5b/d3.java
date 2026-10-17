package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class d3 {

    @NotNull
    public static final c3 Companion = new c3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294812c;
    public final t4 d;
    public final k4 e;

    public /* synthetic */ d3(int i, String str, String str2, String str3, t4 t4Var, k4 k4Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(b3.f294786a.getDescriptor(), i, 31);
            throw null;
        }
        this.f294810a = str;
        this.f294811b = str2;
        this.f294812c = str3;
        this.d = t4Var;
        this.e = k4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f294810a, d3Var.f294810a) && Intrinsics.f(this.f294811b, d3Var.f294811b) && Intrinsics.f(this.f294812c, d3Var.f294812c) && Intrinsics.f(this.d, d3Var.d) && Intrinsics.f(this.e, d3Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f294810a.hashCode() * 31, 31, this.f294811b);
        String str = this.f294812c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        t4 t4Var = this.d;
        return this.e.hashCode() + ((iHashCode + (t4Var != null ? t4Var.hashCode() : 0)) * 31);
    }

    public d3(String iconUrl, String title, String str, t4 t4Var, k4 tabs) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f294810a = iconUrl;
        this.f294811b = title;
        this.f294812c = str;
        this.d = t4Var;
        this.e = tabs;
    }
}
