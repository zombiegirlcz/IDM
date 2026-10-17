package a79;

import kg.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f1811b;

    public p(String type, u body) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f1810a = type;
        this.f1811b = body;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f1810a, pVar.f1810a) && Intrinsics.f(this.f1811b, pVar.f1811b);
    }

    public final int hashCode() {
        return this.f1811b.hashCode() + (this.f1810a.hashCode() * 31);
    }
}
