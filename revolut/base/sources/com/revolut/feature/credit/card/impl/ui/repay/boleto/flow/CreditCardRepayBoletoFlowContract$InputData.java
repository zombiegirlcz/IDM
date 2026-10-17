package com.revolut.feature.credit.card.impl.ui.repay.boleto.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay/boleto/flow/CreditCardRepayBoletoFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Create", "Details", "Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/flow/CreditCardRepayBoletoFlowContract$InputData$Create;", "Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/flow/CreditCardRepayBoletoFlowContract$InputData$Details;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardRepayBoletoFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/flow/CreditCardRepayBoletoFlowContract$InputData$Create;", "Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/flow/CreditCardRepayBoletoFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Create extends CreditCardRepayBoletoFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69552a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Create[i];
            }
        }

        public Create(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f69552a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Create) && Intrinsics.f(this.f69552a, ((Create) obj2).f69552a);
        }

        public final int hashCode() {
            return this.f69552a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69552a);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69553a() {
            return this.f69552a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/flow/CreditCardRepayBoletoFlowContract$InputData$Details;", "Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/flow/CreditCardRepayBoletoFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends CreditCardRepayBoletoFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69554b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String facilityId, String boletoId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(boletoId, "boletoId");
            this.f69553a = facilityId;
            this.f69554b = boletoId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f69553a, details.f69553a) && Intrinsics.f(this.f69554b, details.f69554b);
        }

        public final int hashCode() {
            return this.f69554b.hashCode() + (this.f69553a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69553a);
            dest.writeString(this.f69554b);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69553a() {
            return this.f69553a;
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract String getF69553a();
}
