package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f223127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f223128b;

    public s(int i, p pVar) {
        this.f223127a = i;
        this.f223128b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f223127a == sVar.f223127a && Intrinsics.f(this.f223128b, sVar.f223128b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f223127a) * 31;
        p pVar = this.f223128b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
