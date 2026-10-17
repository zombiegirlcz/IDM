package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class e6 {

    @NotNull
    public static final d6 Companion = new d6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f294826b = {yhm.j.c(yhm.k.PUBLICATION, new b6(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294827a;

    public /* synthetic */ e6(int i, List list) {
        if (1 == (i & 1)) {
            this.f294827a = list;
        } else {
            qlm.j1.f(c6.f294799a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e6) && Intrinsics.f(this.f294827a, ((e6) obj2).f294827a);
    }

    public final int hashCode() {
        return this.f294827a.hashCode();
    }

    public e6(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f294827a = items;
    }
}
