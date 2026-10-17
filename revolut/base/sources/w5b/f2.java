package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f2 {

    @NotNull
    public static final e2 Companion = new e2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f294832c = {null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f294834b;

    public /* synthetic */ f2(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(d2.f294809a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294833a = str;
        this.f294834b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f294833a, f2Var.f294833a) && Intrinsics.f(this.f294834b, f2Var.f294834b);
    }

    public final int hashCode() {
        return this.f294834b.hashCode() + (this.f294833a.hashCode() * 31);
    }

    public f2(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f294833a = title;
        this.f294834b = items;
    }
}
