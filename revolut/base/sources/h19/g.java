package h19;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f148483c = {null, j.c(k.PUBLICATION, new gx2.a(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f148485b;

    public /* synthetic */ g(int i, String str, List list) {
        if (2 != (i & 2)) {
            j1.f(e.f148482a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f148484a = null;
        } else {
            this.f148484a = str;
        }
        this.f148485b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f148484a, gVar.f148484a) && Intrinsics.f(this.f148485b, gVar.f148485b);
    }

    public final int hashCode() {
        String str = this.f148484a;
        return this.f148485b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public g(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f148484a = str;
        this.f148485b = items;
    }
}
