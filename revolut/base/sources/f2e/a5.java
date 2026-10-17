package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a5 {

    @NotNull
    public static final z4 Companion = new z4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131540a;

    public /* synthetic */ a5(int i, String str) {
        if (1 == (i & 1)) {
            this.f131540a = str;
        } else {
            qlm.j1.f(y4.f131775a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a5) && Intrinsics.f(this.f131540a, ((a5) obj2).f131540a);
    }

    public final int hashCode() {
        String str = this.f131540a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public a5(String str) {
        this.f131540a = str;
    }
}
