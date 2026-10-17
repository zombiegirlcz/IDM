package n29;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f211476b = {yhm.j.c(yhm.k.PUBLICATION, new n08.b(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f211477a;

    public /* synthetic */ k0(int i, List list) {
        if (1 == (i & 1)) {
            this.f211477a = list;
        } else {
            j1.f(i0.f211474a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f211477a, ((k0) obj2).f211477a);
    }

    public final int hashCode() {
        return this.f211477a.hashCode();
    }

    public k0(ArrayList cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f211477a = cards;
    }
}
