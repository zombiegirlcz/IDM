package meg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfi.i f204658b;

    public a(String reference, zfi.i newValue) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.f204657a = reference;
        this.f204658b = newValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f204657a, aVar.f204657a) && Intrinsics.f(this.f204658b, aVar.f204658b);
    }

    public final int hashCode() {
        return this.f204658b.hashCode() + (this.f204657a.hashCode() * 31);
    }
}
