package aj0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f5372b = {yhm.j.c(yhm.k.PUBLICATION, new o(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5373a;

    public /* synthetic */ r(int i, List list) {
        if (1 == (i & 1)) {
            this.f5373a = list;
        } else {
            j1.f(p.f5371a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f5373a, ((r) obj2).f5373a);
    }

    public final int hashCode() {
        return this.f5373a.hashCode();
    }

    public r(ArrayList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f5373a = elements;
    }
}
