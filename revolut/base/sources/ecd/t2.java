package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class t2 {

    @NotNull
    public static final m2 Companion = new m2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f124675g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124678c;
    public final p2 d;
    public final String e;
    public final List f;

    public /* synthetic */ t2(int i, String str, String str2, String str3, p2 p2Var, String str4, List list) {
        if (63 != (i & 63)) {
            qlm.j1.f(l2.f124608a.getDescriptor(), i, 63);
            throw null;
        }
        this.f124676a = str;
        this.f124677b = str2;
        this.f124678c = str3;
        this.d = p2Var;
        this.e = str4;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return Intrinsics.f(this.f124676a, t2Var.f124676a) && Intrinsics.f(this.f124677b, t2Var.f124677b) && Intrinsics.f(this.f124678c, t2Var.f124678c) && Intrinsics.f(this.d, t2Var.d) && Intrinsics.f(this.e, t2Var.e) && Intrinsics.f(this.f, t2Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f124676a.hashCode() * 31;
        String str = this.f124677b;
        int iHashCode2 = (this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f124678c)) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public t2(String groupType, String str, String title, p2 displayRate, String str2, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f124676a = groupType;
        this.f124677b = str;
        this.f124678c = title;
        this.d = displayRate;
        this.e = str2;
        this.f = highlights;
    }
}
