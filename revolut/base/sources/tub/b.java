package tub;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274559c;

    public b(String str, String str2, String str3) {
        this.f274557a = str;
        this.f274558b = str2;
        this.f274559c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f274557a, bVar.f274557a) && Intrinsics.f(this.f274558b, bVar.f274558b) && Intrinsics.f(this.f274559c, bVar.f274559c);
    }

    public final int hashCode() {
        String str = this.f274557a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f274558b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f274559c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
