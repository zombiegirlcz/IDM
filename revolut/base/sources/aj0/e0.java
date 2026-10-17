package aj0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class e0 implements l0 {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f5348b = {yhm.j.c(yhm.k.PUBLICATION, new a92.d(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5349a;

    public /* synthetic */ e0(int i, List list) {
        if (1 == (i & 1)) {
            this.f5349a = list;
        } else {
            j1.f(n.f5369a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f5349a, ((e0) obj2).f5349a);
    }

    public final int hashCode() {
        return this.f5349a.hashCode();
    }

    public e0(ArrayList blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f5349a = blocks;
    }
}
