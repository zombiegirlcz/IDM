package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f322349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f322350b;

    public u(w instalmentType, v vVar) {
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        this.f322349a = instalmentType;
        this.f322350b = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f322349a == uVar.f322349a && Intrinsics.f(this.f322350b, uVar.f322350b);
    }

    public final int hashCode() {
        int iHashCode = this.f322349a.hashCode() * 31;
        v vVar = this.f322350b;
        return iHashCode + (vVar == null ? 0 : vVar.hashCode());
    }
}
