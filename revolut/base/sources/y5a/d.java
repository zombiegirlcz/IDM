package y5a;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f311018b = {j.c(k.PUBLICATION, new y4f.c(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f311019a;

    public /* synthetic */ d(int i, List list) {
        if (1 == (i & 1)) {
            this.f311019a = list;
        } else {
            j1.f(b.f311017a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f311019a, ((d) obj2).f311019a);
    }

    public final int hashCode() {
        return this.f311019a.hashCode();
    }

    public d(List blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f311019a = blocks;
    }
}
