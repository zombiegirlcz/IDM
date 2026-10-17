package com.revolut.feature.transfer_reasons.models.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonRecipientIdentification;", "Landroid/os/Parcelable;", "BeneficiaryId", "Code", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonRecipientIdentification$BeneficiaryId;", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonRecipientIdentification$Code;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferReasonRecipientIdentification extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonRecipientIdentification$BeneficiaryId;", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonRecipientIdentification;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeneficiaryId implements TransferReasonRecipientIdentification {

        @NotNull
        public static final Parcelable.Creator<BeneficiaryId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92422a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeneficiaryId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeneficiaryId[i];
            }
        }

        public BeneficiaryId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f92422a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BeneficiaryId) && Intrinsics.f(this.f92422a, ((BeneficiaryId) obj2).f92422a);
        }

        @Override // com.revolut.feature.transfer_reasons.models.interactor.TransferReasonRecipientIdentification
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF92423a() {
            return this.f92422a;
        }

        public final int hashCode() {
            return this.f92422a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92422a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonRecipientIdentification$Code;", "Lcom/revolut/feature/transfer_reasons/models/interactor/TransferReasonRecipientIdentification;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Code implements TransferReasonRecipientIdentification {

        @NotNull
        public static final Parcelable.Creator<Code> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92423a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Code(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Code[i];
            }
        }

        public Code(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f92423a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Code) && Intrinsics.f(this.f92423a, ((Code) obj2).f92423a);
        }

        @Override // com.revolut.feature.transfer_reasons.models.interactor.TransferReasonRecipientIdentification
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF92423a() {
            return this.f92423a;
        }

        public final int hashCode() {
            return this.f92423a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92423a);
        }
    }

    /* JADX INFO: renamed from: getValue */
    String getF92423a();
}
