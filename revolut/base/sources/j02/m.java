package j02;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationPaymentMethod f169924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f169925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f169926c;
    public final String d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f169927g;

    public /* synthetic */ m(ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod, l lVar) {
        this(apmPaymentAuthorisationPaymentMethod, lVar, null, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f169924a == mVar.f169924a && Intrinsics.f(this.f169925b, mVar.f169925b) && Intrinsics.f(this.f169926c, mVar.f169926c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f169927g, mVar.f169927g);
    }

    public final int hashCode() {
        int iHashCode = (this.f169925b.hashCode() + (this.f169924a.hashCode() * 31)) * 31;
        dj0.d dVar = this.f169926c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        int iHashCode5 = (iHashCode4 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str2 = this.f169927g;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public m(ApmPaymentAuthorisationPaymentMethod paymentMethod, l paymentMethodDetails, dj0.d dVar, String str, LocalDate localDate, LocalDate localDate2, String str2) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(paymentMethodDetails, "paymentMethodDetails");
        this.f169924a = paymentMethod;
        this.f169925b = paymentMethodDetails;
        this.f169926c = dVar;
        this.d = str;
        this.e = localDate;
        this.f = localDate2;
        this.f169927g = str2;
    }
}
