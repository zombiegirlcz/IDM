package dp5;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f116773b = {yhm.j.c(yhm.k.PUBLICATION, new dmj.b(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116774a;

    public /* synthetic */ k1(int i, List list) {
        if (1 == (i & 1)) {
            this.f116774a = list;
        } else {
            qlm.j1.f(i1.f116768a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k1) && Intrinsics.f(this.f116774a, ((k1) obj2).f116774a);
    }

    public final int hashCode() {
        return this.f116774a.hashCode();
    }

    public k1(List breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f116774a = breakdown;
    }
}
