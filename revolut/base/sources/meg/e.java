package meg;

import kotlin.jvm.internal.Intrinsics;
import zfi.q;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f204668b;

    public e(String reference, q newValue) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.f204667a = reference;
        this.f204668b = newValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f204667a, eVar.f204667a) && Intrinsics.f(this.f204668b, eVar.f204668b);
    }

    public final int hashCode() {
        return this.f204668b.hashCode() + (this.f204667a.hashCode() * 31);
    }
}
