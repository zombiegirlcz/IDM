package com.revolut.feature.cash_topup.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Entry", "SelectLocation", "LocationDetails", "Barcode", "Amount", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$Amount;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$Barcode;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$Entry;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$LocationDetails;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$SelectLocation;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CashTopUpFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$Amount;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount extends CashTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65634a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(String locationId) {
            Intrinsics.checkNotNullParameter(locationId, "locationId");
            this.f65634a = locationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amount) && Intrinsics.f(this.f65634a, ((Amount) obj2).f65634a);
        }

        public final int hashCode() {
            return this.f65634a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65634a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$Barcode;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Barcode extends CashTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Barcode f65635a = new Barcode();

        @NotNull
        public static final Parcelable.Creator<Barcode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Barcode.f65635a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Barcode[i];
            }
        }

        private Barcode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$Entry;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Entry extends CashTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Entry f65636a = new Entry();

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Entry.f65636a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Entry[i];
            }
        }

        private Entry() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$LocationDetails;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationDetails extends CashTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LocationDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CashTopUpLocationInfo f65637a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocationDetails((CashTopUpLocationInfo) parcel.readParcelable(LocationDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationDetails[i];
            }
        }

        public LocationDetails(CashTopUpLocationInfo location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f65637a = location;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LocationDetails) && Intrinsics.f(this.f65637a, ((LocationDetails) obj2).f65637a);
        }

        public final int hashCode() {
            return this.f65637a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65637a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step$SelectLocation;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectLocation extends CashTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectLocation f65638a = new SelectLocation();

        @NotNull
        public static final Parcelable.Creator<SelectLocation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectLocation.f65638a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectLocation[i];
            }
        }

        private SelectLocation() {
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

    private CashTopUpFlowContract$Step() {
    }
}
