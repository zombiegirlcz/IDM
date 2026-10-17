package s1l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f259177c = {null, yhm.j.c(yhm.k.PUBLICATION, new s1g.a(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f259179b;

    public /* synthetic */ g0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(e0.f259174a.getDescriptor(), i, 3);
            throw null;
        }
        this.f259178a = str;
        this.f259179b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f259178a, g0Var.f259178a) && Intrinsics.f(this.f259179b, g0Var.f259179b);
    }

    public final int hashCode() {
        return this.f259179b.hashCode() + (this.f259178a.hashCode() * 31);
    }

    public g0(String title, ArrayList buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f259178a = title;
        this.f259179b = buttons;
    }
}
