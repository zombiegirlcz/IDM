package aj0;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class v implements d0 {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f5375b = {yhm.j.c(yhm.k.PUBLICATION, new o(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5376a;

    public /* synthetic */ v(int i, List list) {
        if (1 == (i & 1)) {
            this.f5376a = list;
        } else {
            j1.f(t.f5374a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f5376a, ((v) obj2).f5376a);
    }

    public final int hashCode() {
        return this.f5376a.hashCode();
    }

    public v(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5376a = items;
    }
}
