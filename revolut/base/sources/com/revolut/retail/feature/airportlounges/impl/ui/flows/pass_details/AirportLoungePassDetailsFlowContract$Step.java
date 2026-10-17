package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.k;
import svi.m;
import svi.q;
import svi.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PassList", "PassDetails", "Checkout", "Refund", "GetHelp", "EditPassenger", "GiftedPassesBreakdown", "DisclaimerAcceptance", "UnlimitedPassWelcome", "RecurringPassWelcome", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$DisclaimerAcceptance;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$EditPassenger;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$GetHelp;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$GiftedPassesBreakdown;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$PassDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$PassList;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$RecurringPassWelcome;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$Refund;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$UnlimitedPassWelcome;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AirportLoungePassDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98989a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(boolean z) {
            this.f98989a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checkout) && this.f98989a == ((Checkout) obj2).f98989a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98989a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98989a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$DisclaimerAcceptance;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisclaimerAcceptance extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DisclaimerAcceptance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AirportLoungesDisclaimer f98990a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisclaimerAcceptance((AirportLoungesDisclaimer) parcel.readParcelable(DisclaimerAcceptance.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisclaimerAcceptance[i];
            }
        }

        public DisclaimerAcceptance(AirportLoungesDisclaimer disclaimer) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            this.f98990a = disclaimer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DisclaimerAcceptance) && Intrinsics.f(this.f98990a, ((DisclaimerAcceptance) obj2).f98990a);
        }

        public final int hashCode() {
            return this.f98990a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98990a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$EditPassenger;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPassenger extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditPassenger> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f98993c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditPassenger(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditPassenger[i];
            }
        }

        public EditPassenger(String passId, String str, String str2) {
            Intrinsics.checkNotNullParameter(passId, "passId");
            this.f98991a = passId;
            this.f98992b = str;
            this.f98993c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditPassenger)) {
                return false;
            }
            EditPassenger editPassenger = (EditPassenger) obj2;
            return Intrinsics.f(this.f98991a, editPassenger.f98991a) && Intrinsics.f(this.f98992b, editPassenger.f98992b) && Intrinsics.f(this.f98993c, editPassenger.f98993c);
        }

        public final int hashCode() {
            int iHashCode = this.f98991a.hashCode() * 31;
            String str = this.f98992b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f98993c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98991a);
            dest.writeString(this.f98992b);
            dest.writeString(this.f98993c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$GetHelp;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetHelp extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GetHelp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f98994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w f98996c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetHelp((k) parcel.readSerializable(), parcel.readString(), (w) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetHelp[i];
            }
        }

        public GetHelp(k pass, String termsAndConditionsUrl, w wVar) {
            Intrinsics.checkNotNullParameter(pass, "pass");
            Intrinsics.checkNotNullParameter(termsAndConditionsUrl, "termsAndConditionsUrl");
            this.f98994a = pass;
            this.f98995b = termsAndConditionsUrl;
            this.f98996c = wVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GetHelp)) {
                return false;
            }
            GetHelp getHelp = (GetHelp) obj2;
            return Intrinsics.f(this.f98994a, getHelp.f98994a) && Intrinsics.f(this.f98995b, getHelp.f98995b) && Intrinsics.f(this.f98996c, getHelp.f98996c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f98994a.hashCode() * 31, 31, this.f98995b);
            w wVar = this.f98996c;
            return iC + (wVar == null ? 0 : wVar.f266012a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f98994a);
            dest.writeString(this.f98995b);
            dest.writeSerializable(this.f98996c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$GiftedPassesBreakdown;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GiftedPassesBreakdown extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GiftedPassesBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f98997a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GiftedPassesBreakdown((m) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftedPassesBreakdown[i];
            }
        }

        public GiftedPassesBreakdown(m gifted) {
            Intrinsics.checkNotNullParameter(gifted, "gifted");
            this.f98997a = gifted;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GiftedPassesBreakdown) && Intrinsics.f(this.f98997a, ((GiftedPassesBreakdown) obj2).f98997a);
        }

        public final int hashCode() {
            return this.f98997a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f98997a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$PassList;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassList extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PassList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f99000b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassList(parcel.readString(), parcel.readInt() == 0 ? null : q.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassList[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PassList() {
            this(null, 0 == true ? 1 : 0, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PassList)) {
                return false;
            }
            PassList passList = (PassList) obj2;
            return Intrinsics.f(this.f98999a, passList.f98999a) && this.f99000b == passList.f99000b;
        }

        public final int hashCode() {
            String str = this.f98999a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            q qVar = this.f99000b;
            return iHashCode + (qVar != null ? qVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98999a);
            q qVar = this.f99000b;
            if (qVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(qVar.name());
            }
        }

        public PassList(String str, q qVar) {
            this.f98999a = str;
            this.f99000b = qVar;
        }

        public /* synthetic */ PassList(String str, q qVar, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : qVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$RecurringPassWelcome;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringPassWelcome extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RecurringPassWelcome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanSubscription f99001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99002b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringPassWelcome((PricingPlanSubscription) parcel.readParcelable(RecurringPassWelcome.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringPassWelcome[i];
            }
        }

        public RecurringPassWelcome(PricingPlanSubscription subscription, int i) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f99001a = subscription;
            this.f99002b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecurringPassWelcome)) {
                return false;
            }
            RecurringPassWelcome recurringPassWelcome = (RecurringPassWelcome) obj2;
            return Intrinsics.f(this.f99001a, recurringPassWelcome.f99001a) && this.f99002b == recurringPassWelcome.f99002b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f99002b) + (this.f99001a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99001a, i);
            dest.writeInt(this.f99002b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$Refund;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refund extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Refund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f99005c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Refund(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refund[i];
            }
        }

        public Refund() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj2;
            return Intrinsics.f(this.f99003a, refund.f99003a) && this.f99004b == refund.f99004b && Intrinsics.f(this.f99005c, refund.f99005c) && Intrinsics.f(this.d, refund.d);
        }

        public final int hashCode() {
            String str = this.f99003a;
            int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f99004b);
            String str2 = this.f99005c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99003a);
            dest.writeInt(this.f99004b ? 1 : 0);
            dest.writeString(this.f99005c);
            dest.writeString(this.d);
        }

        public Refund(String str, String str2, String str3, boolean z) {
            this.f99003a = str;
            this.f99004b = z;
            this.f99005c = str2;
            this.d = str3;
        }

        public /* synthetic */ Refund(int i) {
            this(null, null, null, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$UnlimitedPassWelcome;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "<init>", "()V", "Ultra", "Private", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$UnlimitedPassWelcome$Private;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$UnlimitedPassWelcome$Ultra;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class UnlimitedPassWelcome extends AirportLoungePassDetailsFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$UnlimitedPassWelcome$Private;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$UnlimitedPassWelcome;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Private extends UnlimitedPassWelcome {

            @NotNull
            public static final Parcelable.Creator<Private> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PricingPlanSubscription f99006a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f99007b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Private((PricingPlanSubscription) parcel.readParcelable(Private.class.getClassLoader()), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Private[i];
                }
            }

            public Private(PricingPlanSubscription subscription, int i) {
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                this.f99006a = subscription;
                this.f99007b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Private)) {
                    return false;
                }
                Private r56 = (Private) obj2;
                return Intrinsics.f(this.f99006a, r56.f99006a) && this.f99007b == r56.f99007b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f99007b) + (this.f99006a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99006a, i);
                dest.writeInt(this.f99007b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$UnlimitedPassWelcome$Ultra;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$UnlimitedPassWelcome;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Ultra extends UnlimitedPassWelcome {

            @NotNull
            public static final Parcelable.Creator<Ultra> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PricingPlanSubscription f99008a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f99009b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Ultra((PricingPlanSubscription) parcel.readParcelable(Ultra.class.getClassLoader()), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Ultra[i];
                }
            }

            public Ultra(PricingPlanSubscription subscription, int i) {
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                this.f99008a = subscription;
                this.f99009b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Ultra)) {
                    return false;
                }
                Ultra ultra = (Ultra) obj2;
                return Intrinsics.f(this.f99008a, ultra.f99008a) && this.f99009b == ultra.f99009b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f99009b) + (this.f99008a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99008a, i);
                dest.writeInt(this.f99009b);
            }
        }

        private UnlimitedPassWelcome() {
        }
    }

    private AirportLoungePassDetailsFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step$PassDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassDetails extends AirportLoungePassDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PassDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Pair f98998a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassDetails((Pair) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassDetails[i];
            }
        }

        public PassDetails(Pair pair) {
            this.f98998a = pair;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PassDetails) && Intrinsics.f(this.f98998a, ((PassDetails) obj2).f98998a);
        }

        public final int hashCode() {
            Pair pair = this.f98998a;
            if (pair == null) {
                return 0;
            }
            return pair.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f98998a);
        }

        public PassDetails() {
            this(null);
        }
    }
}
