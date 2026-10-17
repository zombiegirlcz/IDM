package com.revolut.retail.feature.airportlounges.impl.ui.flows.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Home", "PurchasePass", "LoungeSearch", "PassDetails", "SavedLounges", "PassActivity", "LoungeDetails", "LoungeAmenities", "AirportDetails", "Refund", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$AirportDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$Home;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$LoungeAmenities;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$LoungeDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$LoungeSearch;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$PassActivity;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$PassDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$PurchasePass;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$Refund;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$SavedLounges;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoungePassHomeFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$AirportDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AirportDetails extends LoungePassHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AirportDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98962a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AirportDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportDetails[i];
            }
        }

        public AirportDetails(String airportId) {
            Intrinsics.checkNotNullParameter(airportId, "airportId");
            this.f98962a = airportId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AirportDetails) && Intrinsics.f(this.f98962a, ((AirportDetails) obj2).f98962a);
        }

        public final int hashCode() {
            return this.f98962a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98962a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$Home;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends LoungePassHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98963a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(boolean z) {
            this.f98963a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && this.f98963a == ((Home) obj2).f98963a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98963a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98963a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$LoungeAmenities;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoungeAmenities extends LoungePassHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LoungeAmenities> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98964a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoungeAmenities(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoungeAmenities[i];
            }
        }

        public LoungeAmenities(String loungeId) {
            Intrinsics.checkNotNullParameter(loungeId, "loungeId");
            this.f98964a = loungeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoungeAmenities) && Intrinsics.f(this.f98964a, ((LoungeAmenities) obj2).f98964a);
        }

        public final int hashCode() {
            return this.f98964a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98964a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$LoungeDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoungeDetails extends LoungePassHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LoungeDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98966b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoungeDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoungeDetails[i];
            }
        }

        public LoungeDetails(String loungeId, String str) {
            Intrinsics.checkNotNullParameter(loungeId, "loungeId");
            this.f98965a = loungeId;
            this.f98966b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoungeDetails)) {
                return false;
            }
            LoungeDetails loungeDetails = (LoungeDetails) obj2;
            return Intrinsics.f(this.f98965a, loungeDetails.f98965a) && Intrinsics.f(this.f98966b, loungeDetails.f98966b);
        }

        public final int hashCode() {
            int iHashCode = this.f98965a.hashCode() * 31;
            String str = this.f98966b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98965a);
            dest.writeString(this.f98966b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$LoungeSearch;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LoungeSearch extends LoungePassHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoungeSearch f98967a = new LoungeSearch();

        @NotNull
        public static final Parcelable.Creator<LoungeSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoungeSearch.f98967a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoungeSearch[i];
            }
        }

        private LoungeSearch() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$PassActivity;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PassActivity extends LoungePassHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassActivity f98968a = new PassActivity();

        @NotNull
        public static final Parcelable.Creator<PassActivity> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PassActivity.f98968a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassActivity[i];
            }
        }

        private PassActivity() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$PurchasePass;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PurchasePass extends LoungePassHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PurchasePass f98970a = new PurchasePass();

        @NotNull
        public static final Parcelable.Creator<PurchasePass> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PurchasePass.f98970a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurchasePass[i];
            }
        }

        private PurchasePass() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$Refund;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Refund extends LoungePassHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Refund f98971a = new Refund();

        @NotNull
        public static final Parcelable.Creator<Refund> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Refund.f98971a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refund[i];
            }
        }

        private Refund() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$SavedLounges;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavedLounges extends LoungePassHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SavedLounges f98972a = new SavedLounges();

        @NotNull
        public static final Parcelable.Creator<SavedLounges> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SavedLounges.f98972a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedLounges[i];
            }
        }

        private SavedLounges() {
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

    private LoungePassHomeFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step$PassDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/home/LoungePassHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassDetails extends LoungePassHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PassDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f98969a;

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
            this.f98969a = qVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PassDetails) && this.f98969a == ((PassDetails) obj2).f98969a;
        }

        public final int hashCode() {
            q qVar = this.f98969a;
            if (qVar == null) {
                return 0;
            }
            return qVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            q qVar = this.f98969a;
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
