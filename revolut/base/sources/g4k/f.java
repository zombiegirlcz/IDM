package g4k;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq2.f f140546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f140547c;
    public final PaymentPocketInfo d;
    public final r e;
    public final f2k.h f;

    public f(Data availableTypes, kq2.f fVar, long j2, PaymentPocketInfo paymentPocketInfo, r validationData, f2k.h hVar) {
        Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        this.f140545a = availableTypes;
        this.f140546b = fVar;
        this.f140547c = j2;
        this.d = paymentPocketInfo;
        this.e = validationData;
        this.f = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f140545a, fVar.f140545a) && Intrinsics.f(this.f140546b, fVar.f140546b) && this.f140547c == fVar.f140547c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f140545a.hashCode() * 31;
        kq2.f fVar = this.f140546b;
        int iC = a0.d.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f140547c);
        PaymentPocketInfo paymentPocketInfo = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iC + (paymentPocketInfo == null ? 0 : paymentPocketInfo.hashCode())) * 31)) * 31;
        f2k.h hVar = this.f;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }
}
