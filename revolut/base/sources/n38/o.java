package n38;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o implements p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211956a;

    public /* synthetic */ o(int i, String str) {
        if (1 == (i & 1)) {
            this.f211956a = str;
        } else {
            j1.f(m.f211955a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f211956a, ((o) obj2).f211956a);
    }

    public final int hashCode() {
        return this.f211956a.hashCode();
    }

    public o(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f211956a = pocketId;
    }
}
