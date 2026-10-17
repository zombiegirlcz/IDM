package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280542a;

    public /* synthetic */ a0(int i, String str) {
        if (1 == (i & 1)) {
            this.f280542a = str;
        } else {
            j1.f(y.f280599a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f280542a, ((a0) obj2).f280542a);
    }

    public final int hashCode() {
        return this.f280542a.hashCode();
    }

    public a0(String scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f280542a = scope;
    }
}
