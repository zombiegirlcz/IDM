package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h3 implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f120614b;

    public h3(String str, e3 details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f120613a = str;
        this.f120614b = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f120613a, h3Var.f120613a) && Intrinsics.f(this.f120614b, h3Var.f120614b);
    }

    public final int hashCode() {
        String str = this.f120613a;
        return this.f120614b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
