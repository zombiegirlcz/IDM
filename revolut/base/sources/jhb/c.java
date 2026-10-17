package jhb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174192a;

    public c() {
        Intrinsics.checkNotNullParameter("EMAIL_PAYROLL_MANAGER", "method");
        this.f174192a = "EMAIL_PAYROLL_MANAGER";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f174192a, ((c) obj2).f174192a);
    }

    public final int hashCode() {
        return this.f174192a.hashCode();
    }

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f174192a = str;
        } else {
            j1.f(a.f174191a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
