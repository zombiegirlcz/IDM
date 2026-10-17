package th1;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressFlowContract$InputData f271238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh1.d f271239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7a.d f271240c;

    public a(AddressFlowContract$InputData inputData, vh1.d dVar, x7a.d dVar2, int i) {
        dVar = (i & 2) != 0 ? null : dVar;
        dVar2 = (i & 4) != 0 ? null : dVar2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f271238a = inputData;
        this.f271239b = dVar;
        this.f271240c = dVar2;
    }

    public final vh1.d b() {
        return this.f271239b;
    }

    public final x7a.d c() {
        return this.f271240c;
    }

    public final AddressFlowContract$InputData d() {
        return this.f271238a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f271238a, aVar.f271238a) && Intrinsics.f(this.f271239b, aVar.f271239b) && Intrinsics.f(this.f271240c, aVar.f271240c);
    }

    public final int hashCode() {
        int iHashCode = this.f271238a.hashCode() * 31;
        vh1.d dVar = this.f271239b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        x7a.d dVar2 = this.f271240c;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
