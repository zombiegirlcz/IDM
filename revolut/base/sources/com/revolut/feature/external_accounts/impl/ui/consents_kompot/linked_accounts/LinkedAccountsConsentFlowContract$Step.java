package com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LinkedAccountsConsentScreen", "LinkedAccountConsentDetailsScreen", "ReviewAccountLinkingDetailsScreen", "RevokeDialog", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step$LinkedAccountConsentDetailsScreen;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step$LinkedAccountsConsentScreen;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step$ReviewAccountLinkingDetailsScreen;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step$RevokeDialog;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LinkedAccountsConsentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step$LinkedAccountConsentDetailsScreen;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountConsentDetailsScreen extends LinkedAccountsConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountConsentDetailsScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72793a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountConsentDetailsScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountConsentDetailsScreen[i];
            }
        }

        public LinkedAccountConsentDetailsScreen(String consentId) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72793a = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedAccountConsentDetailsScreen) && Intrinsics.f(this.f72793a, ((LinkedAccountConsentDetailsScreen) obj2).f72793a);
        }

        public final int hashCode() {
            return this.f72793a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72793a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step$LinkedAccountsConsentScreen;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkedAccountsConsentScreen extends LinkedAccountsConsentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkedAccountsConsentScreen f72794a = new LinkedAccountsConsentScreen();

        @NotNull
        public static final Parcelable.Creator<LinkedAccountsConsentScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkedAccountsConsentScreen.f72794a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountsConsentScreen[i];
            }
        }

        private LinkedAccountsConsentScreen() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step$ReviewAccountLinkingDetailsScreen;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewAccountLinkingDetailsScreen extends LinkedAccountsConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewAccountLinkingDetailsScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72796b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewAccountLinkingDetailsScreen(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewAccountLinkingDetailsScreen[i];
            }
        }

        public ReviewAccountLinkingDetailsScreen(String institutionId, String institutionName) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72795a = institutionId;
            this.f72796b = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewAccountLinkingDetailsScreen)) {
                return false;
            }
            ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen = (ReviewAccountLinkingDetailsScreen) obj2;
            return Intrinsics.f(this.f72795a, reviewAccountLinkingDetailsScreen.f72795a) && Intrinsics.f(this.f72796b, reviewAccountLinkingDetailsScreen.f72796b);
        }

        public final int hashCode() {
            return this.f72796b.hashCode() + (this.f72795a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72795a);
            dest.writeString(this.f72796b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step$RevokeDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/LinkedAccountsConsentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeDialog extends LinkedAccountsConsentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevokeDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72798b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeDialog(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeDialog[i];
            }
        }

        public RevokeDialog(String institutionId, String institutionName) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72797a = institutionId;
            this.f72798b = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevokeDialog)) {
                return false;
            }
            RevokeDialog revokeDialog = (RevokeDialog) obj2;
            return Intrinsics.f(this.f72797a, revokeDialog.f72797a) && Intrinsics.f(this.f72798b, revokeDialog.f72798b);
        }

        public final int hashCode() {
            return this.f72798b.hashCode() + (this.f72797a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72797a);
            dest.writeString(this.f72798b);
        }
    }

    private LinkedAccountsConsentFlowContract$Step() {
    }
}
