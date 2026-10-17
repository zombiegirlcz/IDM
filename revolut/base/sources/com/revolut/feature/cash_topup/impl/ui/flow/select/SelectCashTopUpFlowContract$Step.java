package com.revolut.feature.cash_topup.impl.ui.flow.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Guide", "Map", "LocationPermissions", "Details", "Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step$Details;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step$Guide;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step$LocationPermissions;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step$Map;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SelectCashTopUpFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step$Details;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends SelectCashTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CashTopUpLocationInfo f65662a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details((CashTopUpLocationInfo) parcel.readParcelable(Details.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(CashTopUpLocationInfo location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f65662a = location;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f65662a, ((Details) obj2).f65662a);
        }

        public final int hashCode() {
            return this.f65662a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65662a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step$Guide;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Guide extends SelectCashTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Guide f65663a = new Guide();

        @NotNull
        public static final Parcelable.Creator<Guide> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Guide.f65663a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Guide[i];
            }
        }

        private Guide() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step$LocationPermissions;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationPermissions extends SelectCashTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LocationPermissions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f65664a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocationPermissions(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationPermissions[i];
            }
        }

        public LocationPermissions(boolean z) {
            this.f65664a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LocationPermissions) && this.f65664a == ((LocationPermissions) obj2).f65664a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f65664a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f65664a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step$Map;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Map extends SelectCashTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map f65665a = new Map();

        @NotNull
        public static final Parcelable.Creator<Map> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Map.f65665a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Map[i];
            }
        }

        private Map() {
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

    private SelectCashTopUpFlowContract$Step() {
    }
}
