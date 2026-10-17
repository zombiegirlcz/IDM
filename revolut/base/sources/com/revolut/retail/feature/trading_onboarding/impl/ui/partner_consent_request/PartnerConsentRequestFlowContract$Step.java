package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ConsentExplanation", "RequestConsent", "ManualConsent", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step$ConsentExplanation;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step$ManualConsent;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step$RequestConsent;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PartnerConsentRequestFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step$ConsentExplanation;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConsentExplanation extends PartnerConsentRequestFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConsentExplanation f104265a = new ConsentExplanation();

        @NotNull
        public static final Parcelable.Creator<ConsentExplanation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConsentExplanation.f104265a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentExplanation[i];
            }
        }

        private ConsentExplanation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step$ManualConsent;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManualConsent extends PartnerConsentRequestFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManualConsent f104266a = new ManualConsent();

        @NotNull
        public static final Parcelable.Creator<ManualConsent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManualConsent.f104266a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualConsent[i];
            }
        }

        private ManualConsent() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step$RequestConsent;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/PartnerConsentRequestFlowContract$Step;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestConsent extends PartnerConsentRequestFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestConsent f104267a = new RequestConsent();

        @NotNull
        public static final Parcelable.Creator<RequestConsent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestConsent.f104267a;
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

    private PartnerConsentRequestFlowContract$Step() {
    }
}
