package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f321430c;

    public /* synthetic */ y0(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(w0.f321423a.getDescriptor(), i, 7);
            throw null;
        }
        this.f321428a = str;
        this.f321429b = str2;
        this.f321430c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f321428a, y0Var.f321428a) && Intrinsics.f(this.f321429b, y0Var.f321429b) && Intrinsics.f(this.f321430c, y0Var.f321430c);
    }

    public final int hashCode() {
        return this.f321430c.hashCode() + p.a.c(this.f321428a.hashCode() * 31, 31, this.f321429b);
    }

    public y0(String title, String value, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f321428a = title;
        this.f321429b = value;
        this.f321430c = highlights;
    }
}
