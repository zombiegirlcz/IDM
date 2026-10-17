package cx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109872b;

    public a(String name, String checksum) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checksum, "checksum");
        this.f109871a = name;
        this.f109872b = checksum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f109871a, aVar.f109871a) && Intrinsics.f(this.f109872b, aVar.f109872b);
    }

    public final int hashCode() {
        return this.f109872b.hashCode() + (this.f109871a.hashCode() * 31);
    }
}
