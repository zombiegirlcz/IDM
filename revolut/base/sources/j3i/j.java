package j3i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f171195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f171196b;

    public j(float f, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f171195a = f;
        this.f171196b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Float.compare(this.f171195a, jVar.f171195a) == 0 && Intrinsics.f(this.f171196b, jVar.f171196b);
    }

    public final int hashCode() {
        return this.f171196b.hashCode() + (Float.hashCode(this.f171195a) * 31);
    }
}
