package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f131728l = {null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new i(10)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131731c;
    public final String d;
    public final t4 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f131732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g2 f131733h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f131734j;
    public final h3 k;

    public v0(String id10, String style, String str, String str2, t4 t4Var, String str3, String str4, g2 g2Var, ArrayList arrayList, y0 y0Var, h3 h3Var, int i) {
        str2 = (i & 8) != 0 ? null : str2;
        t4Var = (i & 16) != 0 ? null : t4Var;
        str3 = (i & 32) != 0 ? null : str3;
        str4 = (i & 64) != 0 ? null : str4;
        g2Var = (i & 128) != 0 ? null : g2Var;
        arrayList = (i & 256) != 0 ? null : arrayList;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f131729a = id10;
        this.f131730b = style;
        this.f131731c = str;
        this.d = str2;
        this.e = t4Var;
        this.f = str3;
        this.f131732g = str4;
        this.f131733h = g2Var;
        this.i = arrayList;
        this.f131734j = y0Var;
        this.k = h3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f131729a, v0Var.f131729a) && Intrinsics.f(this.f131730b, v0Var.f131730b) && Intrinsics.f(this.f131731c, v0Var.f131731c) && Intrinsics.f(this.d, v0Var.d) && Intrinsics.f(this.e, v0Var.e) && Intrinsics.f(this.f, v0Var.f) && Intrinsics.f(this.f131732g, v0Var.f131732g) && Intrinsics.f(this.f131733h, v0Var.f131733h) && Intrinsics.f(this.i, v0Var.i) && Intrinsics.f(this.f131734j, v0Var.f131734j) && Intrinsics.f(this.k, v0Var.k);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f131729a.hashCode() * 31, 31, this.f131730b);
        String str = this.f131731c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        t4 t4Var = this.e;
        int iHashCode3 = (iHashCode2 + (t4Var == null ? 0 : t4Var.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f131732g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        g2 g2Var = this.f131733h;
        int iHashCode6 = (iHashCode5 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        List list = this.i;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        y0 y0Var = this.f131734j;
        int iHashCode8 = (iHashCode7 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        h3 h3Var = this.k;
        return iHashCode8 + (h3Var != null ? h3Var.hashCode() : 0);
    }

    public /* synthetic */ v0(int i, String str, String str2, String str3, String str4, t4 t4Var, String str5, String str6, g2 g2Var, List list, y0 y0Var, h3 h3Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(t0.f131714a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131729a = str;
        this.f131730b = str2;
        if ((i & 4) == 0) {
            this.f131731c = null;
        } else {
            this.f131731c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = t4Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.f131732g = null;
        } else {
            this.f131732g = str6;
        }
        if ((i & 128) == 0) {
            this.f131733h = null;
        } else {
            this.f131733h = g2Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.f131734j = null;
        } else {
            this.f131734j = y0Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = h3Var;
        }
    }
}
