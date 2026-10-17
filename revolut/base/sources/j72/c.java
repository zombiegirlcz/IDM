package j72;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f171837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171839c;

    public c(int i, String str, String str2) {
        this.f171837a = i;
        this.f171838b = str;
        this.f171839c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f171837a == cVar.f171837a && Intrinsics.f(this.f171838b, cVar.f171838b) && Intrinsics.f(this.f171839c, cVar.f171839c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f171837a) * 31;
        String str = this.f171838b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f171839c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
