package pf4;

import dx4.u1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f235449a;

    public m(u1 documentConfiguration) {
        Intrinsics.checkNotNullParameter(documentConfiguration, "documentConfiguration");
        this.f235449a = documentConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f235449a, ((m) obj2).f235449a);
    }

    public final int hashCode() {
        return this.f235449a.hashCode();
    }
}
