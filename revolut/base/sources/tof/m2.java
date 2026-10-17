package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f272927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f272928c;

    public m2(String str, dj0.d dVar, d dVar2) {
        this.f272926a = str;
        this.f272927b = dVar;
        this.f272928c = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.f272926a, m2Var.f272926a) && Intrinsics.f(this.f272927b, m2Var.f272927b) && Intrinsics.f(this.f272928c, m2Var.f272928c);
    }

    public final int hashCode() {
        String str = this.f272926a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        dj0.d dVar = this.f272927b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f272928c;
        return iHashCode2 + (dVar2 != null ? dVar2.f272675a.hashCode() : 0);
    }
}
