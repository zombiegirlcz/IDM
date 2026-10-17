package com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay/boleto/boleto_details/CreditCardBoletoDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardBoletoDetailsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardBoletoDetailsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69545c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardBoletoDetailsContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardBoletoDetailsContract$InputData[i];
        }
    }

    public CreditCardBoletoDetailsContract$InputData(String facilityId, String boletoId, boolean z) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(boletoId, "boletoId");
        this.f69543a = facilityId;
        this.f69544b = boletoId;
        this.f69545c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardBoletoDetailsContract$InputData)) {
            return false;
        }
        CreditCardBoletoDetailsContract$InputData creditCardBoletoDetailsContract$InputData = (CreditCardBoletoDetailsContract$InputData) obj2;
        return Intrinsics.f(this.f69543a, creditCardBoletoDetailsContract$InputData.f69543a) && Intrinsics.f(this.f69544b, creditCardBoletoDetailsContract$InputData.f69544b) && this.f69545c == creditCardBoletoDetailsContract$InputData.f69545c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69545c) + p.a.c(this.f69543a.hashCode() * 31, 31, this.f69544b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69543a);
        dest.writeString(this.f69544b);
        dest.writeInt(this.f69545c ? 1 : 0);
    }
}
