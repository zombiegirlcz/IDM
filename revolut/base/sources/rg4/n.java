package rg4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f254027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f254028b;

    public n(Data checks, boolean z) {
        Intrinsics.checkNotNullParameter(checks, "checks");
        this.f254027a = checks;
        this.f254028b = z;
    }

    public static n a(n nVar, Data checks, boolean z, int i) {
        if ((i & 1) != 0) {
            checks = nVar.f254027a;
        }
        if ((i & 2) != 0) {
            z = nVar.f254028b;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(checks, "checks");
        return new n(checks, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f254027a, nVar.f254027a) && this.f254028b == nVar.f254028b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254028b) + (this.f254027a.hashCode() * 31);
    }
}
