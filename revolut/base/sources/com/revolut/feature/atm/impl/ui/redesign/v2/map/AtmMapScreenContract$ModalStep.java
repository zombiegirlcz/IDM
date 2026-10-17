package com.revolut.feature.atm.impl.ui.redesign.v2.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RequestLocationPermissions", "ShowAtmList", "ShowAtmDetails", "ShowError", "Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep$RequestLocationPermissions;", "Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep$ShowAtmDetails;", "Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep$ShowAtmList;", "Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep$ShowError;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AtmMapScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep$RequestLocationPermissions;", "Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestLocationPermissions implements AtmMapScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestLocationPermissions f63179a = new RequestLocationPermissions();

        @NotNull
        public static final Parcelable.Creator<RequestLocationPermissions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestLocationPermissions.f63179a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestLocationPermissions[i];
            }
        }

        private RequestLocationPermissions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep$ShowAtmDetails;", "Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowAtmDetails implements AtmMapScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowAtmDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Atm f63180a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowAtmDetails((Atm) parcel.readParcelable(ShowAtmDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAtmDetails[i];
            }
        }

        public ShowAtmDetails(Atm atm) {
            Intrinsics.checkNotNullParameter(atm, "atm");
            this.f63180a = atm;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowAtmDetails) && Intrinsics.f(this.f63180a, ((ShowAtmDetails) obj2).f63180a);
        }

        public final int hashCode() {
            return this.f63180a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63180a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep$ShowAtmList;", "Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowAtmList implements AtmMapScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowAtmList f63181a = new ShowAtmList();

        @NotNull
        public static final Parcelable.Creator<ShowAtmList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowAtmList.f63181a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAtmList[i];
            }
        }

        private ShowAtmList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep$ShowError;", "Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreenContract$ModalStep;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowError implements AtmMapScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowError f63182a = new ShowError();

        @NotNull
        public static final Parcelable.Creator<ShowError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowError.f63182a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowError[i];
            }
        }

        private ShowError() {
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
}
