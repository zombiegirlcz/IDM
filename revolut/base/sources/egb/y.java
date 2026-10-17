package egb;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class y implements g0 {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f125623c = {null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f125625b;

    public /* synthetic */ y(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(t.f125619a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125624a = str;
        this.f125625b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f125624a, yVar.f125624a) && Intrinsics.f(this.f125625b, yVar.f125625b);
    }

    public final int hashCode() {
        return this.f125625b.hashCode() + (this.f125624a.hashCode() * 31);
    }
}
