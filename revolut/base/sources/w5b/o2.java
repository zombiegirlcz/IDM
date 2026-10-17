package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class o2 {

    @NotNull
    public static final n2 Companion = new n2();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f294963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f294964c;

    public /* synthetic */ o2(int i, String str, List list, l2 l2Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(m2.f294921a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294962a = str;
        this.f294963b = list;
        this.f294964c = l2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.f294962a, o2Var.f294962a) && Intrinsics.f(this.f294963b, o2Var.f294963b) && Intrinsics.f(this.f294964c, o2Var.f294964c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f294962a.hashCode() * 31, 31, this.f294963b);
        l2 l2Var = this.f294964c;
        return iD + (l2Var == null ? 0 : l2Var.hashCode());
    }

    public o2(String title, ArrayList items, l2 l2Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f294962a = title;
        this.f294963b = items;
        this.f294964c = l2Var;
    }
}
