package whb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297478a;

    public f() {
        Intrinsics.checkNotNullParameter("UPDATE_PAYROLL_PLATFORM_IN_APP", "method");
        this.f297478a = "UPDATE_PAYROLL_PLATFORM_IN_APP";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f297478a, ((f) obj2).f297478a);
    }

    public final int hashCode() {
        return this.f297478a.hashCode();
    }

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f297478a = str;
        } else {
            j1.f(d.f297477a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
