package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "PassDetails", "Checkout", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$InputData$Checkout;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$InputData$PassDetails;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AirportLoungePassDetailsFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$InputData$Checkout;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$InputData;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Checkout extends AirportLoungePassDetailsFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Checkout f98984a = new Checkout();

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Checkout.f98984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        private Checkout() {
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

    private AirportLoungePassDetailsFlowContract$InputData() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$InputData$PassDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassDetails extends AirportLoungePassDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PassDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f98985a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassDetails(parcel.readInt() == 0 ? null : q.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassDetails[i];
            }
        }

        public PassDetails(q qVar) {
            this.f98985a = qVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PassDetails) && this.f98985a == ((PassDetails) obj2).f98985a;
        }

        public final int hashCode() {
            q qVar = this.f98985a;
            if (qVar == null) {
                return 0;
            }
            return qVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            q qVar = this.f98985a;
            if (qVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(qVar.name());
            }
        }

        public PassDetails() {
            this(null);
        }
    }
}
