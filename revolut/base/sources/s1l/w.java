package s1l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f259215b = {yhm.j.c(yhm.k.PUBLICATION, new s1g.a(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259216a;

    public /* synthetic */ w(int i, List list) {
        if (1 == (i & 1)) {
            this.f259216a = list;
        } else {
            j1.f(u.f259211a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f259216a, ((w) obj2).f259216a);
    }

    public final int hashCode() {
        return this.f259216a.hashCode();
    }

    public w(ArrayList steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f259216a = steps;
    }
}
