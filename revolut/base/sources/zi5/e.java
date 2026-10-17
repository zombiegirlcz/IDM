package zi5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322505b;

    public e(String address, String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f322504a = address;
        this.f322505b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f322504a, eVar.f322504a) && Intrinsics.f(this.f322505b, eVar.f322505b);
    }

    public final int hashCode() {
        int iHashCode = this.f322504a.hashCode() * 31;
        String str = this.f322505b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
