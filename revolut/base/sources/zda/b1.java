package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321363c;
    public final List d;

    public /* synthetic */ b1(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            j1.f(z0.f321431a.getDescriptor(), i, 15);
            throw null;
        }
        this.f321361a = str;
        this.f321362b = str2;
        this.f321363c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f321361a, b1Var.f321361a) && Intrinsics.f(this.f321362b, b1Var.f321362b) && Intrinsics.f(this.f321363c, b1Var.f321363c) && Intrinsics.f(this.d, b1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f321361a.hashCode() * 31, 31, this.f321362b);
        String str = this.f321363c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public b1(String value, String icon, String str, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f321361a = value;
        this.f321362b = icon;
        this.f321363c = str;
        this.d = highlights;
    }
}
