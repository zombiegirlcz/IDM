package j6k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171797b;

    public b(String str, String str2) {
        this.f171796a = str;
        this.f171797b = str2;
    }

    public final String a() {
        return this.f171796a;
    }

    public final String b() {
        return this.f171797b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f171796a, bVar.f171796a) && Intrinsics.f(this.f171797b, bVar.f171797b);
    }

    public final int hashCode() {
        String str = this.f171796a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f171797b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
