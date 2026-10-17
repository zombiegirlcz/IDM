package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321393c;
    public final List d;
    public final g0 e;

    public /* synthetic */ j0(int i, String str, String str2, String str3, List list, g0 g0Var) {
        if (31 != (i & 31)) {
            j1.f(h0.f321381a.getDescriptor(), i, 31);
            throw null;
        }
        this.f321391a = str;
        this.f321392b = str2;
        this.f321393c = str3;
        this.d = list;
        this.e = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f321391a, j0Var.f321391a) && Intrinsics.f(this.f321392b, j0Var.f321392b) && Intrinsics.f(this.f321393c, j0Var.f321393c) && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(this.f321391a.hashCode() * 31, 31, this.f321392b), 31, this.f321393c), 31, this.d);
        g0 g0Var = this.e;
        return iD + (g0Var == null ? 0 : g0Var.hashCode());
    }

    public j0(String icon, String title, String value, ArrayList highlights, g0 g0Var) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f321391a = icon;
        this.f321392b = title;
        this.f321393c = value;
        this.d = highlights;
        this.e = g0Var;
    }
}
