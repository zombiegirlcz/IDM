package w3g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Number f294392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f294393b;

    public e(Number number, d measureUnit) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(measureUnit, "measureUnit");
        this.f294392a = number;
        this.f294393b = measureUnit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f294392a, eVar.f294392a) && this.f294393b == eVar.f294393b;
    }

    public final int hashCode() {
        return this.f294393b.hashCode() + (this.f294392a.hashCode() * 31);
    }
}
