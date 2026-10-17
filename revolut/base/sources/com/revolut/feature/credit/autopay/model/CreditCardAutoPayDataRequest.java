package com.revolut.feature.credit.autopay.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.g;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/model/CreditCardAutoPayDataRequest;", "Lcom/revolut/feature/credit/autopay/models/repayment/AutoPayRepaymentDataRequest;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAutoPayDataRequest implements AutoPayRepaymentDataRequest {

    @NotNull
    public static final Parcelable.Creator<CreditCardAutoPayDataRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepaymentSource f68537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutoPayRequest f68539c;
    public final b d;
    public final g e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardAutoPayDataRequest((RepaymentSource) parcel.readParcelable(CreditCardAutoPayDataRequest.class.getClassLoader()), parcel.readString(), (AutoPayRequest) parcel.readParcelable(CreditCardAutoPayDataRequest.class.getClassLoader()), (b) parcel.readSerializable(), (g) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAutoPayDataRequest[i];
        }
    }

    public CreditCardAutoPayDataRequest(RepaymentSource repaymentSource, String facilityId, AutoPayRequest autoPayRequest, b currency, g gVar, boolean z) {
        Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(autoPayRequest, "autoPayRequest");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f68537a = repaymentSource;
        this.f68538b = facilityId;
        this.f68539c = autoPayRequest;
        this.d = currency;
        this.e = gVar;
        this.f = z;
    }

    @Override // com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest
    /* JADX INFO: renamed from: N8, reason: from getter */
    public final RepaymentSource getF68537a() {
        return this.f68537a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAutoPayDataRequest)) {
            return false;
        }
        CreditCardAutoPayDataRequest creditCardAutoPayDataRequest = (CreditCardAutoPayDataRequest) obj2;
        return Intrinsics.f(this.f68537a, creditCardAutoPayDataRequest.f68537a) && Intrinsics.f(this.f68538b, creditCardAutoPayDataRequest.f68538b) && Intrinsics.f(this.f68539c, creditCardAutoPayDataRequest.f68539c) && Intrinsics.f(this.d, creditCardAutoPayDataRequest.d) && Intrinsics.f(this.e, creditCardAutoPayDataRequest.e) && this.f == creditCardAutoPayDataRequest.f;
    }

    public final int hashCode() {
        int iJ = l.j(this.d, (this.f68539c.hashCode() + p.a.c(this.f68537a.hashCode() * 31, 31, this.f68538b)) * 31, 31);
        g gVar = this.e;
        return Boolean.hashCode(this.f) + ((iJ + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68537a, i);
        dest.writeString(this.f68538b);
        dest.writeParcelable(this.f68539c, i);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }
}
