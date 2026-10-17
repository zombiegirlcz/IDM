package com.revolut.feature.masav.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/masav/api/navigation/MasavPayToMerchantDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "WithId", "WithPendingAction", "Lcom/revolut/feature/masav/api/navigation/MasavPayToMerchantDestination$WithId;", "Lcom/revolut/feature/masav/api/navigation/MasavPayToMerchantDestination$WithPendingAction;", "feature_masav_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MasavPayToMerchantDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/api/navigation/MasavPayToMerchantDestination$WithId;", "Lcom/revolut/feature/masav/api/navigation/MasavPayToMerchantDestination;", "", "toString", "()Ljava/lang/String;", "feature_masav_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithId implements MasavPayToMerchantDestination {

        @NotNull
        public static final Parcelable.Creator<WithId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78093a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithId[i];
            }
        }

        public WithId(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f78093a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithId) && Intrinsics.f(this.f78093a, ((WithId) obj2).f78093a);
        }

        public final int hashCode() {
            return this.f78093a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78093a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/api/navigation/MasavPayToMerchantDestination$WithPendingAction;", "Lcom/revolut/feature/masav/api/navigation/MasavPayToMerchantDestination;", "", "toString", "()Ljava/lang/String;", "feature_masav_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithPendingAction implements MasavPayToMerchantDestination {

        @NotNull
        public static final Parcelable.Creator<WithPendingAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationPendingAction f78094a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithPendingAction((ApmPaymentAuthorisationPendingAction) parcel.readParcelable(WithPendingAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithPendingAction[i];
            }
        }

        public WithPendingAction(ApmPaymentAuthorisationPendingAction paymentAuthorisation) {
            Intrinsics.checkNotNullParameter(paymentAuthorisation, "paymentAuthorisation");
            this.f78094a = paymentAuthorisation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithPendingAction) && Intrinsics.f(this.f78094a, ((WithPendingAction) obj2).f78094a);
        }

        public final int hashCode() {
            return this.f78094a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78094a, i);
        }
    }
}
