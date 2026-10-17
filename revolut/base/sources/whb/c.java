package whb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297476a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f297476a = str;
        } else {
            j1.f(a.f297475a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f297476a, ((c) obj2).f297476a);
    }

    public final int hashCode() {
        return this.f297476a.hashCode();
    }

    public c(String workEmail) {
        Intrinsics.checkNotNullParameter(workEmail, "workEmail");
        this.f297476a = workEmail;
    }
}
