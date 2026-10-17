package com.revolut.feature.shared.beneficiary.common.cop;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.BeneficiaryCreationType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction;", "Landroid/os/Parcelable;", "EditInfo", "KeepInfo", "ReplaceName", "Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction$EditInfo;", "Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction$KeepInfo;", "Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction$ReplaceName;", "feature_shared_beneficiary_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConfirmationOfPayeeButtonAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction$EditInfo;", "Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction;", "<init>", "()V", "feature_shared_beneficiary_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditInfo implements ConfirmationOfPayeeButtonAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditInfo f86055a = new EditInfo();

        @NotNull
        public static final Parcelable.Creator<EditInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditInfo.f86055a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditInfo[i];
            }
        }

        private EditInfo() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction$KeepInfo;", "Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction;", "<init>", "()V", "feature_shared_beneficiary_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KeepInfo implements ConfirmationOfPayeeButtonAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KeepInfo f86056a = new KeepInfo();

        @NotNull
        public static final Parcelable.Creator<KeepInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KeepInfo.f86056a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KeepInfo[i];
            }
        }

        private KeepInfo() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction$ReplaceName;", "Lcom/revolut/feature/shared/beneficiary/common/cop/ConfirmationOfPayeeButtonAction;", "", "toString", "()Ljava/lang/String;", "feature_shared_beneficiary_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReplaceName implements ConfirmationOfPayeeButtonAction {

        @NotNull
        public static final Parcelable.Creator<ReplaceName> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BeneficiaryCreationType f86057a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReplaceName((BeneficiaryCreationType) parcel.readParcelable(ReplaceName.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReplaceName[i];
            }
        }

        public ReplaceName(BeneficiaryCreationType replacementName) {
            Intrinsics.checkNotNullParameter(replacementName, "replacementName");
            this.f86057a = replacementName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReplaceName) && Intrinsics.f(this.f86057a, ((ReplaceName) obj2).f86057a);
        }

        public final int hashCode() {
            return this.f86057a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86057a, i);
        }
    }
}
