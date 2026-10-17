package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f321371c = {null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321373b;

    public /* synthetic */ e1(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(c1.f321366a.getDescriptor(), i, 3);
            throw null;
        }
        this.f321372a = str;
        this.f321373b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f321372a, e1Var.f321372a) && Intrinsics.f(this.f321373b, e1Var.f321373b);
    }

    public final int hashCode() {
        String str = this.f321372a;
        return this.f321373b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public e1(String str, ArrayList tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.f321372a = str;
        this.f321373b = tips;
    }
}
