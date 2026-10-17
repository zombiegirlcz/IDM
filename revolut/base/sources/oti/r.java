package oti;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class r {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f229681c = {null, yhm.j.c(yhm.k.PUBLICATION, new oqj.d(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f229682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f229683b;

    public /* synthetic */ r(int i, int i2, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(m.f229662a.getDescriptor(), i, 3);
            throw null;
        }
        this.f229682a = i2;
        this.f229683b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f229682a == rVar.f229682a && Intrinsics.f(this.f229683b, rVar.f229683b);
    }

    public final int hashCode() {
        return this.f229683b.hashCode() + (Integer.hashCode(this.f229682a) * 31);
    }

    public r(int i, ArrayList slots) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        this.f229682a = i;
        this.f229683b = slots;
    }
}
