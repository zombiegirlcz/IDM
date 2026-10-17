package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import ju3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "RequestConsent", "ModalStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$RequestConsent;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SpousalConsentInitiatorFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro extends SpousalConsentInitiatorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpousalConsentInitiatorIntroScreenConfig f68436a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((SpousalConsentInitiatorIntroScreenConfig) parcel.readParcelable(Intro.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(SpousalConsentInitiatorIntroScreenConfig intro) {
            Intrinsics.checkNotNullParameter(intro, "intro");
            this.f68436a = intro;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f68436a, ((Intro) obj2).f68436a);
        }

        public final int hashCode() {
            return this.f68436a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68436a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step;", "<init>", "()V", "Popup", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$ModalStep$Popup;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep extends SpousalConsentInitiatorFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$ModalStep$Popup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Popup extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<Popup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentInitiatorPopupScreenConfig f68437a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final g f68438b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Popup((SpousalConsentInitiatorPopupScreenConfig) parcel.readParcelable(Popup.class.getClassLoader()), g.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Popup[i];
                }
            }

            public Popup(SpousalConsentInitiatorPopupScreenConfig popup, g popupType) {
                Intrinsics.checkNotNullParameter(popup, "popup");
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                this.f68437a = popup;
                this.f68438b = popupType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Popup)) {
                    return false;
                }
                Popup popup = (Popup) obj2;
                return Intrinsics.f(this.f68437a, popup.f68437a) && this.f68438b == popup.f68438b;
            }

            public final int hashCode() {
                return this.f68438b.hashCode() + (this.f68437a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68437a, i);
                dest.writeString(this.f68438b.name());
            }
        }

        private ModalStep() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step$RequestConsent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestConsent extends SpousalConsentInitiatorFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestConsent f68439a = new RequestConsent();

        @NotNull
        public static final Parcelable.Creator<RequestConsent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestConsent.f68439a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestConsent[i];
            }
        }

        private RequestConsent() {
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

    private SpousalConsentInitiatorFlowContract$Step() {
    }
}
