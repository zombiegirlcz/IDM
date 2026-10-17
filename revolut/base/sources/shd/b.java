package shd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f263456b;

    public b(String str, String str2) {
        this.f263455a = str;
        this.f263456b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f263455a, bVar.f263455a) && Intrinsics.f(this.f263456b, bVar.f263456b);
    }

    public final int hashCode() {
        String str = this.f263455a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f263456b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
