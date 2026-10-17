package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16187b;

    public s(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f16186a = code;
        this.f16187b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f16186a, sVar.f16186a) && Intrinsics.f(this.f16187b, sVar.f16187b);
    }

    public final int hashCode() {
        int iHashCode = this.f16186a.hashCode() * 31;
        String str = this.f16187b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
