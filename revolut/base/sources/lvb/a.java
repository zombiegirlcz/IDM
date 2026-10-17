package lvb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200353b;

    public a(String name, String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f200352a = name;
        this.f200353b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200352a, aVar.f200352a) && Intrinsics.f(this.f200353b, aVar.f200353b);
    }

    public final int hashCode() {
        return this.f200353b.hashCode() + (this.f200352a.hashCode() * 31);
    }
}
