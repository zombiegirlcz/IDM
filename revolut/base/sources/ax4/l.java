package ax4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10889c;

    public l(String parameterKey, int i, long j2) {
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f10887a = parameterKey;
        this.f10888b = i;
        this.f10889c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f10887a, lVar.f10887a) && this.f10888b == lVar.f10888b && this.f10889c == lVar.f10889c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10889c) + j6.a.b(this.f10888b, this.f10887a.hashCode() * 31, 31);
    }
}
