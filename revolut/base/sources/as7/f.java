package as7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8834a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f8834a = str;
        } else {
            j1.f(d.f8829a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f8834a, ((f) obj2).f8834a);
    }

    public final int hashCode() {
        return this.f8834a.hashCode();
    }

    public f(String newCoverageType) {
        Intrinsics.checkNotNullParameter(newCoverageType, "newCoverageType");
        this.f8834a = newCoverageType;
    }
}
