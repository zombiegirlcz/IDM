package com.revolut.feature.external_accounts.impl.ui.consents_kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ClientsList", "ConsentsList", "ConsentDetails", "InactiveConsentsList", "RevokeDialog", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$ClientsList;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$ConsentDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$ConsentsList;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$InactiveConsentsList;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$RevokeDialog;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenBankingConsentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$ClientsList;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClientsList extends OpenBankingConsentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ClientsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OpenBankingConsentsFlowContract$FlowType f72743a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClientsList((OpenBankingConsentsFlowContract$FlowType) parcel.readParcelable(ClientsList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClientsList[i];
            }
        }

        public ClientsList(OpenBankingConsentsFlowContract$FlowType flowType) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f72743a = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClientsList) && Intrinsics.f(this.f72743a, ((ClientsList) obj2).f72743a);
        }

        public final int hashCode() {
            return this.f72743a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72743a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$ConsentDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentDetails extends OpenBankingConsentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConsentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundOpenBankingClient f72744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OpenBankingConsent f72745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OpenBankingConsentsFlowContract$FlowType f72746c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OutboundOpenBankingClient outboundOpenBankingClient = (OutboundOpenBankingClient) parcel.readParcelable(ConsentDetails.class.getClassLoader());
                OpenBankingConsent openBankingConsent = (OpenBankingConsent) parcel.readParcelable(ConsentDetails.class.getClassLoader());
                OpenBankingConsentsFlowContract$FlowType openBankingConsentsFlowContract$FlowType = (OpenBankingConsentsFlowContract$FlowType) parcel.readParcelable(ConsentDetails.class.getClassLoader());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new ConsentDetails(outboundOpenBankingClient, openBankingConsent, openBankingConsentsFlowContract$FlowType, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentDetails[i];
            }
        }

        public ConsentDetails(OutboundOpenBankingClient client, OpenBankingConsent consent, OpenBankingConsentsFlowContract$FlowType flowType, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(consent, "consent");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f72744a = client;
            this.f72745b = consent;
            this.f72746c = flowType;
            this.d = z;
            this.e = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConsentDetails)) {
                return false;
            }
            ConsentDetails consentDetails = (ConsentDetails) obj2;
            return Intrinsics.f(this.f72744a, consentDetails.f72744a) && Intrinsics.f(this.f72745b, consentDetails.f72745b) && Intrinsics.f(this.f72746c, consentDetails.f72746c) && this.d == consentDetails.d && this.e == consentDetails.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c((this.f72746c.hashCode() + ((this.f72745b.hashCode() + (this.f72744a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72744a, i);
            dest.writeParcelable(this.f72745b, i);
            dest.writeParcelable(this.f72746c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$ConsentsList;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentsList extends OpenBankingConsentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConsentsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundOpenBankingClient f72747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OpenBankingConsentsFlowContract$FlowType f72748b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentsList((OutboundOpenBankingClient) parcel.readParcelable(ConsentsList.class.getClassLoader()), (OpenBankingConsentsFlowContract$FlowType) parcel.readParcelable(ConsentsList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentsList[i];
            }
        }

        public ConsentsList(OutboundOpenBankingClient client, OpenBankingConsentsFlowContract$FlowType flowType) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f72747a = client;
            this.f72748b = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConsentsList)) {
                return false;
            }
            ConsentsList consentsList = (ConsentsList) obj2;
            return Intrinsics.f(this.f72747a, consentsList.f72747a) && Intrinsics.f(this.f72748b, consentsList.f72748b);
        }

        public final int hashCode() {
            return this.f72748b.hashCode() + (this.f72747a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72747a, i);
            dest.writeParcelable(this.f72748b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$InactiveConsentsList;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InactiveConsentsList extends OpenBankingConsentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InactiveConsentsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundOpenBankingClient.Australia f72749a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InactiveConsentsList((OutboundOpenBankingClient.Australia) parcel.readParcelable(InactiveConsentsList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InactiveConsentsList[i];
            }
        }

        public InactiveConsentsList(OutboundOpenBankingClient.Australia client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.f72749a = client;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InactiveConsentsList) && Intrinsics.f(this.f72749a, ((InactiveConsentsList) obj2).f72749a);
        }

        public final int hashCode() {
            return this.f72749a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72749a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step$RevokeDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeDialog extends OpenBankingConsentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevokeDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OpenBankingConsent f72751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OpenBankingConsentsFlowContract$FlowType f72752c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeDialog(parcel.readString(), (OpenBankingConsent) parcel.readParcelable(RevokeDialog.class.getClassLoader()), (OpenBankingConsentsFlowContract$FlowType) parcel.readParcelable(RevokeDialog.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeDialog[i];
            }
        }

        public RevokeDialog(String clientName, OpenBankingConsent consent, OpenBankingConsentsFlowContract$FlowType flowType, boolean z) {
            Intrinsics.checkNotNullParameter(clientName, "clientName");
            Intrinsics.checkNotNullParameter(consent, "consent");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f72750a = clientName;
            this.f72751b = consent;
            this.f72752c = flowType;
            this.d = z;
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
            return Intrinsics.f(this.f72750a, revokeDialog.f72750a) && Intrinsics.f(this.f72751b, revokeDialog.f72751b) && Intrinsics.f(this.f72752c, revokeDialog.f72752c) && this.d == revokeDialog.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f72752c.hashCode() + ((this.f72751b.hashCode() + (this.f72750a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72750a);
            dest.writeParcelable(this.f72751b, i);
            dest.writeParcelable(this.f72752c, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private OpenBankingConsentsFlowContract$Step() {
    }
}
