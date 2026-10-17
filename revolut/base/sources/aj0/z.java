package aj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class z implements d0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5379a;

    public /* synthetic */ z(int i, String str) {
        if (1 == (i & 1)) {
            this.f5379a = str;
        } else {
            j1.f(x.f5378a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f5379a, ((z) obj2).f5379a);
    }

    public final int hashCode() {
        return this.f5379a.hashCode();
    }

    public z(String header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f5379a = header;
    }
}
