package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class j3 {

    @NotNull
    public static final i3 Companion = new i3();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f294885j = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(18)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4 f294886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f294887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2 f294888c;
    public final List d;
    public final o2 e;
    public final o2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f294889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f294890h;
    public final n5 i;

    public /* synthetic */ j3(int i, h4 h4Var, m3 m3Var, x2 x2Var, List list, o2 o2Var, o2 o2Var2, String str, String str2, n5 n5Var) {
        if (255 != (i & 255)) {
            qlm.j1.f(h3.f294863a.getDescriptor(), i, 255);
            throw null;
        }
        this.f294886a = h4Var;
        this.f294887b = m3Var;
        this.f294888c = x2Var;
        this.d = list;
        this.e = o2Var;
        this.f = o2Var2;
        this.f294889g = str;
        this.f294890h = str2;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = n5Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj2;
        return Intrinsics.f(this.f294886a, j3Var.f294886a) && Intrinsics.f(this.f294887b, j3Var.f294887b) && Intrinsics.f(this.f294888c, j3Var.f294888c) && Intrinsics.f(this.d, j3Var.d) && Intrinsics.f(this.e, j3Var.e) && Intrinsics.f(this.f, j3Var.f) && Intrinsics.f(this.f294889g, j3Var.f294889g) && Intrinsics.f(this.f294890h, j3Var.f294890h) && Intrinsics.f(this.i, j3Var.i);
    }

    public final int hashCode() {
        h4 h4Var = this.f294886a;
        int iHashCode = (h4Var == null ? 0 : h4Var.hashCode()) * 31;
        m3 m3Var = this.f294887b;
        int iHashCode2 = (iHashCode + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        x2 x2Var = this.f294888c;
        int iHashCode3 = (iHashCode2 + (x2Var == null ? 0 : x2Var.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        o2 o2Var = this.e;
        int iHashCode5 = (iHashCode4 + (o2Var == null ? 0 : o2Var.hashCode())) * 31;
        o2 o2Var2 = this.f;
        int iHashCode6 = (iHashCode5 + (o2Var2 == null ? 0 : o2Var2.hashCode())) * 31;
        String str = this.f294889g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f294890h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n5 n5Var = this.i;
        return iHashCode8 + (n5Var != null ? n5Var.hashCode() : 0);
    }

    public j3(h4 h4Var, m3 m3Var, x2 x2Var, ArrayList arrayList, o2 o2Var, o2 o2Var2, String str, String str2, n5 n5Var) {
        this.f294886a = h4Var;
        this.f294887b = m3Var;
        this.f294888c = x2Var;
        this.d = arrayList;
        this.e = o2Var;
        this.f = o2Var2;
        this.f294889g = str;
        this.f294890h = str2;
        this.i = n5Var;
    }
}
