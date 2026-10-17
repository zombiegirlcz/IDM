package l1j;

import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DualChooserContract$InputData f191549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1j.a f191550b;

    public d(DualChooserContract$InputData inputData, i1j.a aVar) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f191549a = inputData;
        this.f191550b = aVar;
    }

    public final i1j.a b() {
        return this.f191550b;
    }

    public final DualChooserContract$InputData c() {
        return this.f191549a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f191549a, dVar.f191549a) && Intrinsics.f(this.f191550b, dVar.f191550b);
    }

    public final int hashCode() {
        int iHashCode = this.f191549a.hashCode() * 31;
        i1j.a aVar = this.f191550b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
