package dv9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f118070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f118072c;

    public j(boolean z, String str, i iVar) {
        this.f118070a = z;
        this.f118071b = str;
        this.f118072c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f118070a == jVar.f118070a && Intrinsics.f(this.f118071b, jVar.f118071b) && this.f118072c == jVar.f118072c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f118070a) * 31;
        String str = this.f118071b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.f118072c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
