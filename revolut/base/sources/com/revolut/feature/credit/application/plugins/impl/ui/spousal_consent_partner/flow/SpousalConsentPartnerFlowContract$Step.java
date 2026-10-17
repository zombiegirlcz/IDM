package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "GiveConsent", "ModalStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$GiveConsent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$ModalStep;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SpousalConsentPartnerFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$GiveConsent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiveConsent extends SpousalConsentPartnerFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiveConsent f68464a = new GiveConsent();

        @NotNull
        public static final Parcelable.Creator<GiveConsent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiveConsent.f68464a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiveConsent[i];
            }
        }

        private GiveConsent() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step;", "<init>", "()V", "Respond", "Waiting", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$ModalStep$Respond;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$ModalStep$Waiting;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep extends SpousalConsentPartnerFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$ModalStep$Respond;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Respond extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<Respond> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentPartnerPopupScreenConfig.Respond f68465a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Respond((SpousalConsentPartnerPopupScreenConfig.Respond) parcel.readParcelable(Respond.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Respond[i];
                }
            }

            public Respond(SpousalConsentPartnerPopupScreenConfig.Respond config) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.f68465a = config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Respond) && Intrinsics.f(this.f68465a, ((Respond) obj2).f68465a);
            }

            public final int hashCode() {
                return this.f68465a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68465a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$ModalStep$Waiting;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Waiting extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<Waiting> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentPartnerPopupScreenConfig.Waiting f68466a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Waiting((SpousalConsentPartnerPopupScreenConfig.Waiting) parcel.readParcelable(Waiting.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Waiting[i];
                }
            }

            public Waiting(SpousalConsentPartnerPopupScreenConfig.Waiting config) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.f68466a = config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Waiting) && Intrinsics.f(this.f68466a, ((Waiting) obj2).f68466a);
            }

            public final int hashCode() {
                return this.f68466a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68466a, i);
            }
        }

        private ModalStep() {
        }
    }

    private SpousalConsentPartnerFlowContract$Step() {
    }
}
