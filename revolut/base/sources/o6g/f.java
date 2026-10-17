package o6g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7g.b f222599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String passengerRef, p7g.b code) {
        super(code, false);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(passengerRef, "passengerRef");
        this.f222599b = code;
        this.f222600c = passengerRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f222599b == fVar.f222599b && Intrinsics.f(this.f222600c, fVar.f222600c);
    }

    public final int hashCode() {
        return this.f222600c.hashCode() + (this.f222599b.hashCode() * 31);
    }

    @Override // cam.f
    public final p7g.b l() {
        return this.f222599b;
    }

    @Override // cam.f
    public final String o() {
        return this.f222600c;
    }
}
