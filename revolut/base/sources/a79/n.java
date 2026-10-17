package a79;

import kg.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f1807b;

    public n(String type, u body) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f1806a = type;
        this.f1807b = body;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f1806a, nVar.f1806a) && Intrinsics.f(this.f1807b, nVar.f1807b);
    }

    public final int hashCode() {
        return this.f1807b.hashCode() + (this.f1806a.hashCode() * 31);
    }
}
