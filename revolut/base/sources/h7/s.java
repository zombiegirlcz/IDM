package h7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f149821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f149822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f149823c;

    public s(Integer num, Integer num2) {
        this.f149821a = num;
        this.f149822b = num2;
        this.f149823c = num2 == null ? null : num2;
    }

    @Override // h7.u
    public final float a(d7.j composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        if (this.f149823c == null) {
            return 1.0f;
        }
        return kotlin.ranges.f.f(r1.intValue() / composition.f111684m, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    @Override // h7.u
    public final float b(d7.j composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        return this.f149821a == null ? BitmapDescriptorFactory.HUE_RED : kotlin.ranges.f.f(r1.intValue() / composition.f111684m, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f149821a, sVar.f149821a) && Intrinsics.f(this.f149822b, sVar.f149822b);
    }

    public final int hashCode() {
        Integer num = this.f149821a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f149822b;
        return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(true);
    }

    public final String toString() {
        return "Frame(min=" + this.f149821a + ", max=" + this.f149822b + ", maxInclusive=true)";
    }
}
