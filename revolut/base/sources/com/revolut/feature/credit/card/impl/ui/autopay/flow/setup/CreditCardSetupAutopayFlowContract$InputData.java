package com.revolut.feature.credit.card.impl.ui.autopay.flow.setup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Create", "Recreate", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$InputData$Create;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$InputData$Recreate;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardSetupAutopayFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$InputData$Recreate;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Recreate implements CreditCardSetupAutopayFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Recreate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69073b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recreate(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Recreate[i];
            }
        }

        public Recreate(String facilityId, String paymentId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            this.f69072a = facilityId;
            this.f69073b = paymentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Recreate)) {
                return false;
            }
            Recreate recreate = (Recreate) obj2;
            return Intrinsics.f(this.f69072a, recreate.f69072a) && Intrinsics.f(this.f69073b, recreate.f69073b);
        }

        public final int hashCode() {
            return this.f69073b.hashCode() + (this.f69072a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69072a);
            dest.writeString(this.f69073b);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69072a() {
            return this.f69072a;
        }
    }

    /* JADX INFO: renamed from: y */
    String getF69072a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$InputData$Create;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Create implements CreditCardSetupAutopayFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final up4.c f69071b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create(parcel.readString(), up4.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Create[i];
            }
        }

        public Create(String facilityId, up4.c successNavigationType) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(successNavigationType, "successNavigationType");
            this.f69070a = facilityId;
            this.f69071b = successNavigationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Create)) {
                return false;
            }
            Create create = (Create) obj2;
            return Intrinsics.f(this.f69070a, create.f69070a) && this.f69071b == create.f69071b;
        }

        public final int hashCode() {
            return this.f69071b.hashCode() + (this.f69070a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69070a);
            dest.writeString(this.f69071b.name());
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69072a() {
            return this.f69070a;
        }

        public /* synthetic */ Create(String str) {
            this(str, up4.c.Quit);
        }
    }
}
