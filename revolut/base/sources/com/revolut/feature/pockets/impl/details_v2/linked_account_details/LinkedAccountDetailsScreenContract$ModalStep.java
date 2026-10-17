package com.revolut.feature.pockets.impl.details_v2.linked_account_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevokeConfirmation", "InstitutionOfflineError", "Lcom/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreenContract$ModalStep$InstitutionOfflineError;", "Lcom/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreenContract$ModalStep$RevokeConfirmation;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LinkedAccountDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreenContract$ModalStep$InstitutionOfflineError;", "Lcom/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionOfflineError implements LinkedAccountDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionOfflineError f80814a = new InstitutionOfflineError();

        @NotNull
        public static final Parcelable.Creator<InstitutionOfflineError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionOfflineError.f80814a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionOfflineError[i];
            }
        }

        private InstitutionOfflineError() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreenContract$ModalStep$RevokeConfirmation;", "Lcom/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeConfirmation implements LinkedAccountDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevokeConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80815a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeConfirmation[i];
            }
        }

        public RevokeConfirmation(String institutionName) {
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f80815a = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevokeConfirmation) && Intrinsics.f(this.f80815a, ((RevokeConfirmation) obj2).f80815a);
        }

        public final int hashCode() {
            return this.f80815a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80815a);
        }
    }
}
