package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower;
import com.revolut.kompot.navigable.flow.FlowStep;
import iu3.g;
import iu3.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "SelectContact", "RequestConsent", "Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step$RequestConsent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step$SelectContact;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CoBorrowerConsentInitiatorFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial implements CoBorrowerConsentInitiatorFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f67216a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f67216a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step$RequestConsent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestConsent implements CoBorrowerConsentInitiatorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zv3.a f67217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f67218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CoBorrower f67219c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestConsent(zv3.a.valueOf(parcel.readString()), (g) parcel.readSerializable(), (CoBorrower) parcel.readParcelable(RequestConsent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestConsent[i];
            }
        }

        public RequestConsent(zv3.a navigationIcon, g configuration, CoBorrower coBorrower) {
            Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(coBorrower, "coBorrower");
            this.f67217a = navigationIcon;
            this.f67218b = configuration;
            this.f67219c = coBorrower;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RequestConsent)) {
                return false;
            }
            RequestConsent requestConsent = (RequestConsent) obj2;
            return this.f67217a == requestConsent.f67217a && Intrinsics.f(this.f67218b, requestConsent.f67218b) && Intrinsics.f(this.f67219c, requestConsent.f67219c);
        }

        public final int hashCode() {
            return this.f67219c.hashCode() + ((this.f67218b.hashCode() + (this.f67217a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67217a.name());
            dest.writeSerializable(this.f67218b);
            dest.writeParcelable(this.f67219c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step$SelectContact;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectContact implements CoBorrowerConsentInitiatorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f67220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f67221b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectContact((i) parcel.readSerializable(), (g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectContact[i];
            }
        }

        public SelectContact(i configuration, g consentScreenConfiguration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(consentScreenConfiguration, "consentScreenConfiguration");
            this.f67220a = configuration;
            this.f67221b = consentScreenConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectContact)) {
                return false;
            }
            SelectContact selectContact = (SelectContact) obj2;
            return Intrinsics.f(this.f67220a, selectContact.f67220a) && Intrinsics.f(this.f67221b, selectContact.f67221b);
        }

        public final int hashCode() {
            return this.f67221b.hashCode() + (this.f67220a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67220a);
            dest.writeSerializable(this.f67221b);
        }
    }
}
