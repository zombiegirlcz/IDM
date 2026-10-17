package com.revolut.sso.impl.ui.consent.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Confirmation", "RequestLocation", "SelectIdentity", "UnexpectedLocationCheck", "Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step$Confirmation;", "Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step$RequestLocation;", "Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step$SelectIdentity;", "Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step$UnexpectedLocationCheck;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class QrConsentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step$Confirmation;", "Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends QrConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentChallenge.Qr f106469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConsentChallenge.Qr.Delegated.Selection.Identity f106470b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation((ConsentChallenge.Qr) parcel.readParcelable(Confirmation.class.getClassLoader()), (ConsentChallenge.Qr.Delegated.Selection.Identity) parcel.readParcelable(Confirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(ConsentChallenge.Qr challenge, ConsentChallenge.Qr.Delegated.Selection.Identity identity) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.f106469a = challenge;
            this.f106470b = identity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f106469a, confirmation.f106469a) && Intrinsics.f(this.f106470b, confirmation.f106470b);
        }

        public final int hashCode() {
            int iHashCode = this.f106469a.hashCode() * 31;
            ConsentChallenge.Qr.Delegated.Selection.Identity identity = this.f106470b;
            return iHashCode + (identity == null ? 0 : identity.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106469a, i);
            dest.writeParcelable(this.f106470b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step$RequestLocation;", "Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestLocation extends QrConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestLocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentChallenge.Qr f106471a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestLocation((ConsentChallenge.Qr) parcel.readParcelable(RequestLocation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestLocation[i];
            }
        }

        public RequestLocation(ConsentChallenge.Qr challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.f106471a = challenge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestLocation) && Intrinsics.f(this.f106471a, ((RequestLocation) obj2).f106471a);
        }

        public final int hashCode() {
            return this.f106471a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106471a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step$SelectIdentity;", "Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectIdentity extends QrConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectIdentity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentChallenge.Qr.Delegated f106472a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectIdentity((ConsentChallenge.Qr.Delegated) parcel.readParcelable(SelectIdentity.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectIdentity[i];
            }
        }

        public SelectIdentity(ConsentChallenge.Qr.Delegated challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.f106472a = challenge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectIdentity) && Intrinsics.f(this.f106472a, ((SelectIdentity) obj2).f106472a);
        }

        public final int hashCode() {
            return this.f106472a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106472a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step$UnexpectedLocationCheck;", "Lcom/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnexpectedLocationCheck extends QrConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnexpectedLocationCheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentChallenge f106473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConsentChallenge.Qr.Delegated.Selection.Identity f106474b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnexpectedLocationCheck((ConsentChallenge) parcel.readParcelable(UnexpectedLocationCheck.class.getClassLoader()), (ConsentChallenge.Qr.Delegated.Selection.Identity) parcel.readParcelable(UnexpectedLocationCheck.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnexpectedLocationCheck[i];
            }
        }

        public UnexpectedLocationCheck(ConsentChallenge challenge, ConsentChallenge.Qr.Delegated.Selection.Identity identity) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.f106473a = challenge;
            this.f106474b = identity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnexpectedLocationCheck)) {
                return false;
            }
            UnexpectedLocationCheck unexpectedLocationCheck = (UnexpectedLocationCheck) obj2;
            return Intrinsics.f(this.f106473a, unexpectedLocationCheck.f106473a) && Intrinsics.f(this.f106474b, unexpectedLocationCheck.f106474b);
        }

        public final int hashCode() {
            int iHashCode = this.f106473a.hashCode() * 31;
            ConsentChallenge.Qr.Delegated.Selection.Identity identity = this.f106474b;
            return iHashCode + (identity == null ? 0 : identity.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106473a, i);
            dest.writeParcelable(this.f106474b, i);
        }
    }

    private QrConsentFlowContract$Step() {
    }
}
