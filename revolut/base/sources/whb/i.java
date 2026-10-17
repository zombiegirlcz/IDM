package whb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f297481b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(g.f297479a.getDescriptor(), i, 3);
            throw null;
        }
        this.f297480a = str;
        this.f297481b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f297480a, iVar.f297480a) && Intrinsics.f(this.f297481b, iVar.f297481b);
    }

    public final int hashCode() {
        return this.f297481b.hashCode() + (this.f297480a.hashCode() * 31);
    }

    public i(String workEmail) {
        Intrinsics.checkNotNullParameter("UPDATE_PAYROLL_PLATFORM_WORK_EMAIL", "method");
        Intrinsics.checkNotNullParameter(workEmail, "workEmail");
        this.f297480a = "UPDATE_PAYROLL_PLATFORM_WORK_EMAIL";
        this.f297481b = workEmail;
    }
}
