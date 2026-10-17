package av7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl7.a f9931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9932c;

    public f(dl7.a subtype, String insuranceId, String title) {
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f9930a = insuranceId;
        this.f9931b = subtype;
        this.f9932c = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f9930a, fVar.f9930a) && this.f9931b == fVar.f9931b && Intrinsics.f(this.f9932c, fVar.f9932c);
    }

    public final int hashCode() {
        return this.f9932c.hashCode() + ((this.f9931b.hashCode() + (this.f9930a.hashCode() * 31)) * 31);
    }
}
