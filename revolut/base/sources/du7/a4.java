package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a4 {

    @NotNull
    public static final i3 Companion = new i3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f117598c = {null, yhm.j.c(yhm.k.PUBLICATION, new e2(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117600b;

    public a4(int i, String str, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(h3.f117695a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117599a = str;
        if ((i & 2) == 0) {
            this.f117600b = zhm.f0.f322471a;
        } else {
            this.f117600b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj2;
        return Intrinsics.f(this.f117599a, a4Var.f117599a) && Intrinsics.f(this.f117600b, a4Var.f117600b);
    }

    public final int hashCode() {
        return this.f117600b.hashCode() + (this.f117599a.hashCode() * 31);
    }
}
