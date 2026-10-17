package com.revolut.sso.impl.ui.consent.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Confirmation", "DelegatedAuthentication", "UnexpectedLocationCheck", "Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step$Confirmation;", "Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step$DelegatedAuthentication;", "Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step$UnexpectedLocationCheck;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AppConsentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step$Confirmation;", "Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends AppConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentChallenge.App f106445a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation((ConsentChallenge.App) parcel.readParcelable(Confirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(ConsentChallenge.App challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.f106445a = challenge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f106445a, ((Confirmation) obj2).f106445a);
        }

        public final int hashCode() {
            return this.f106445a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106445a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step$DelegatedAuthentication;", "Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DelegatedAuthentication extends AppConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DelegatedAuthentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106446a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DelegatedAuthentication(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DelegatedAuthentication[i];
            }
        }

        public DelegatedAuthentication(String authenticationId) {
            Intrinsics.checkNotNullParameter(authenticationId, "authenticationId");
            this.f106446a = authenticationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DelegatedAuthentication) && Intrinsics.f(this.f106446a, ((DelegatedAuthentication) obj2).f106446a);
        }

        public final int hashCode() {
            return this.f106446a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106446a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step$UnexpectedLocationCheck;", "Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnexpectedLocationCheck extends AppConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnexpectedLocationCheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentChallenge.App f106447a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnexpectedLocationCheck((ConsentChallenge.App) parcel.readParcelable(UnexpectedLocationCheck.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnexpectedLocationCheck[i];
            }
        }

        public UnexpectedLocationCheck(ConsentChallenge.App challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.f106447a = challenge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnexpectedLocationCheck) && Intrinsics.f(this.f106447a, ((UnexpectedLocationCheck) obj2).f106447a);
        }

        public final int hashCode() {
            return this.f106447a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106447a, i);
        }
    }

    private AppConsentFlowContract$Step() {
    }
}
