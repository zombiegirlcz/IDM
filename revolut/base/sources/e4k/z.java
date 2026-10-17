package e4k;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f122655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq2.f f122656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f122657c;
    public final List d;
    public final List e;
    public final PaymentPocketInfo f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f122658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hrf.h f122659h;
    public final Exception i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RemittanceAccountSwitchingInformation f122660j;
    public final g4k.r k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f2k.h f122661l;

    public z(Data availableTypes, kq2.f fVar, long j2, List transferOptions, List referenceOptions, PaymentPocketInfo paymentPocketInfo, List suggestions, hrf.h errorState, Exception exc2, RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation, g4k.r validationData, f2k.h hVar) {
        Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
        Intrinsics.checkNotNullParameter(transferOptions, "transferOptions");
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        this.f122655a = availableTypes;
        this.f122656b = fVar;
        this.f122657c = j2;
        this.d = transferOptions;
        this.e = referenceOptions;
        this.f = paymentPocketInfo;
        this.f122658g = suggestions;
        this.f122659h = errorState;
        this.i = exc2;
        this.f122660j = remittanceAccountSwitchingInformation;
        this.k = validationData;
        this.f122661l = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f122655a, zVar.f122655a) && Intrinsics.f(this.f122656b, zVar.f122656b) && this.f122657c == zVar.f122657c && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f122658g, zVar.f122658g) && Intrinsics.f(this.f122659h, zVar.f122659h) && Intrinsics.f(this.i, zVar.i) && Intrinsics.f(this.f122660j, zVar.f122660j) && Intrinsics.f(this.k, zVar.k) && Intrinsics.f(this.f122661l, zVar.f122661l);
    }

    public final int hashCode() {
        int iHashCode = this.f122655a.hashCode() * 31;
        kq2.f fVar = this.f122656b;
        int iD = p.a.d(p.a.d(a0.d.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f122657c), 31, this.d), 31, this.e);
        PaymentPocketInfo paymentPocketInfo = this.f;
        int iHashCode2 = (this.f122659h.hashCode() + p.a.d((iD + (paymentPocketInfo == null ? 0 : paymentPocketInfo.hashCode())) * 31, 31, this.f122658g)) * 31;
        Exception exc2 = this.i;
        int iHashCode3 = (iHashCode2 + (exc2 == null ? 0 : exc2.hashCode())) * 31;
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = this.f122660j;
        int iHashCode4 = (this.k.hashCode() + ((iHashCode3 + (remittanceAccountSwitchingInformation == null ? 0 : remittanceAccountSwitchingInformation.hashCode())) * 31)) * 31;
        f2k.h hVar = this.f122661l;
        return iHashCode4 + (hVar != null ? hVar.hashCode() : 0);
    }
}
