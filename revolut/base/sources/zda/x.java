package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f321426c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new zc0.m(13)), yhm.j.c(kVar, new zc0.m(14))};
    }

    public /* synthetic */ x(int i, String str, String str2, List list, List list2) {
        if (15 != (i & 15)) {
            j1.f(v.f321419a.getDescriptor(), i, 15);
            throw null;
        }
        this.f321424a = str;
        this.f321425b = str2;
        this.f321426c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f321424a, xVar.f321424a) && Intrinsics.f(this.f321425b, xVar.f321425b) && Intrinsics.f(this.f321426c, xVar.f321426c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f321424a.hashCode() * 31, 31, this.f321425b), 31, this.f321426c);
    }

    public x(String str, String selected, ArrayList all2, ArrayList available) {
        Intrinsics.checkNotNullParameter(str, "default");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(all2, "all");
        Intrinsics.checkNotNullParameter(available, "available");
        this.f321424a = str;
        this.f321425b = selected;
        this.f321426c = all2;
        this.d = available;
    }
}
