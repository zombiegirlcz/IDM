package bu7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l0 extends i0 {

    @NotNull
    public static final k0 Companion = new k0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new y(4))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18724c;

    public /* synthetic */ l0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(j0.f18721a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18723b = str;
        this.f18724c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f18723b, l0Var.f18723b) && Intrinsics.f(this.f18724c, l0Var.f18724c);
    }

    public final int hashCode() {
        return this.f18724c.hashCode() + (this.f18723b.hashCode() * 31);
    }

    public l0(String name, ArrayList descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        this.f18723b = name;
        this.f18724c = descriptors;
    }
}
