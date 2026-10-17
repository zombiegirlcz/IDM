package jz8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y extends s {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f179680c = {yhm.j.c(yhm.k.PUBLICATION, new jxi.a(18))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179681b;

    public /* synthetic */ y(int i, List list) {
        if (1 == (i & 1)) {
            this.f179681b = list;
        } else {
            j1.f(w.f179677a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f179681b, ((y) obj2).f179681b);
    }

    public final int hashCode() {
        return this.f179681b.hashCode();
    }

    public y(ArrayList children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f179681b = children;
    }
}
