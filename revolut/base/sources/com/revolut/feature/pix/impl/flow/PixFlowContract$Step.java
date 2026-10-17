package com.revolut.feature.pix.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.navigation.PixCommonModal;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"com/revolut/feature/pix/impl/flow/PixFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "Area", "Automatico", "CopyPaste", "AliasRegistration", "QrRequest", "QrPayment", "Transfer", "Refund", "AuthorisationRequest", "AuthorisationDetails", "PortabilityDetails", "OpenModal", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$AliasRegistration;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Area;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$AuthorisationDetails;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$AuthorisationRequest;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Automatico;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$CopyPaste;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Intro;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$OpenModal;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$PortabilityDetails;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$QrPayment;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$QrRequest;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Refund;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Transfer;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PixFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$AliasRegistration;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AliasRegistration extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AliasRegistration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f80545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AliasRegistrationType f80546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f80547c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AliasRegistration((AccountId) parcel.readParcelable(AliasRegistration.class.getClassLoader()), (AliasRegistrationType) parcel.readParcelable(AliasRegistration.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AliasRegistration[i];
            }
        }

        public AliasRegistration(AccountId accountId, AliasRegistrationType aliasRegistrationType, d dVar) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f80545a = accountId;
            this.f80546b = aliasRegistrationType;
            this.f80547c = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AliasRegistration)) {
                return false;
            }
            AliasRegistration aliasRegistration = (AliasRegistration) obj2;
            return Intrinsics.f(this.f80545a, aliasRegistration.f80545a) && Intrinsics.f(this.f80546b, aliasRegistration.f80546b) && Intrinsics.f(this.f80547c, aliasRegistration.f80547c);
        }

        public final int hashCode() {
            int iHashCode = this.f80545a.hashCode() * 31;
            AliasRegistrationType aliasRegistrationType = this.f80546b;
            int iHashCode2 = (iHashCode + (aliasRegistrationType == null ? 0 : aliasRegistrationType.hashCode())) * 31;
            d dVar = this.f80547c;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80545a, i);
            dest.writeParcelable(this.f80546b, i);
            dest.writeSerializable(this.f80547c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Area;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Area extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f80548a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Area((AccountId) parcel.readParcelable(Area.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Area[i];
            }
        }

        public Area(AccountId accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f80548a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Area) && Intrinsics.f(this.f80548a, ((Area) obj2).f80548a);
        }

        public final int hashCode() {
            return this.f80548a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80548a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$AuthorisationDetails;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthorisationDetails extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AuthorisationDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80549a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuthorisationDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthorisationDetails[i];
            }
        }

        public AuthorisationDetails(String authorisationId) {
            Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
            this.f80549a = authorisationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AuthorisationDetails) && Intrinsics.f(this.f80549a, ((AuthorisationDetails) obj2).f80549a);
        }

        public final int hashCode() {
            return this.f80549a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80549a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$AuthorisationRequest;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthorisationRequest extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AuthorisationRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixQrCodeDecodeData f80551b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuthorisationRequest(parcel.readString(), (PixQrCodeDecodeData) parcel.readParcelable(AuthorisationRequest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthorisationRequest[i];
            }
        }

        public AuthorisationRequest(String authorisationId, PixQrCodeDecodeData pixQrCodeDecodeData) {
            Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
            this.f80550a = authorisationId;
            this.f80551b = pixQrCodeDecodeData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuthorisationRequest)) {
                return false;
            }
            AuthorisationRequest authorisationRequest = (AuthorisationRequest) obj2;
            return Intrinsics.f(this.f80550a, authorisationRequest.f80550a) && Intrinsics.f(this.f80551b, authorisationRequest.f80551b);
        }

        public final int hashCode() {
            int iHashCode = this.f80550a.hashCode() * 31;
            PixQrCodeDecodeData pixQrCodeDecodeData = this.f80551b;
            return iHashCode + (pixQrCodeDecodeData == null ? 0 : pixQrCodeDecodeData.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80550a);
            dest.writeParcelable(this.f80551b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Automatico;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Automatico extends PixFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Automatico f80552a = new Automatico();

        @NotNull
        public static final Parcelable.Creator<Automatico> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Automatico.f80552a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Automatico[i];
            }
        }

        private Automatico() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$CopyPaste;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CopyPaste extends PixFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CopyPaste f80553a = new CopyPaste();

        @NotNull
        public static final Parcelable.Creator<CopyPaste> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CopyPaste.f80553a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CopyPaste[i];
            }
        }

        private CopyPaste() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Intro;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro extends PixFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f80554a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f80554a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$OpenModal;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenModal extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenModal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixCommonModal f80555a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenModal((PixCommonModal) parcel.readParcelable(OpenModal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenModal[i];
            }
        }

        public OpenModal(PixCommonModal modal) {
            Intrinsics.checkNotNullParameter(modal, "modal");
            this.f80555a = modal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenModal) && Intrinsics.f(this.f80555a, ((OpenModal) obj2).f80555a);
        }

        public final int hashCode() {
            return this.f80555a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80555a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$PortabilityDetails;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortabilityDetails extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortabilityDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f80556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixKey f80557b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortabilityDetails((AccountId) parcel.readParcelable(PortabilityDetails.class.getClassLoader()), (PixKey) parcel.readParcelable(PortabilityDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortabilityDetails[i];
            }
        }

        public PortabilityDetails(AccountId accountId, PixKey key) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f80556a = accountId;
            this.f80557b = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortabilityDetails)) {
                return false;
            }
            PortabilityDetails portabilityDetails = (PortabilityDetails) obj2;
            return Intrinsics.f(this.f80556a, portabilityDetails.f80556a) && Intrinsics.f(this.f80557b, portabilityDetails.f80557b);
        }

        public final int hashCode() {
            return this.f80557b.hashCode() + (this.f80556a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80556a, i);
            dest.writeParcelable(this.f80557b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$QrPayment;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrPayment extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixQrCodeDecodeData f80559b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrPayment(parcel.readString(), (PixQrCodeDecodeData) parcel.readParcelable(QrPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrPayment[i];
            }
        }

        public QrPayment(String decodedOperationId, PixQrCodeDecodeData pixQrCodeDecodeResult) {
            Intrinsics.checkNotNullParameter(decodedOperationId, "decodedOperationId");
            Intrinsics.checkNotNullParameter(pixQrCodeDecodeResult, "pixQrCodeDecodeResult");
            this.f80558a = decodedOperationId;
            this.f80559b = pixQrCodeDecodeResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QrPayment)) {
                return false;
            }
            QrPayment qrPayment = (QrPayment) obj2;
            return Intrinsics.f(this.f80558a, qrPayment.f80558a) && Intrinsics.f(this.f80559b, qrPayment.f80559b);
        }

        public final int hashCode() {
            return this.f80559b.hashCode() + (this.f80558a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80558a);
            dest.writeParcelable(this.f80559b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$QrRequest;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrRequest extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f80560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixKey f80561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f80562c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrRequest((AccountId) parcel.readParcelable(QrRequest.class.getClassLoader()), (PixKey) parcel.readParcelable(QrRequest.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrRequest[i];
            }
        }

        public QrRequest(AccountId accountId, PixKey pixKey, d dVar) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f80560a = accountId;
            this.f80561b = pixKey;
            this.f80562c = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QrRequest)) {
                return false;
            }
            QrRequest qrRequest = (QrRequest) obj2;
            return Intrinsics.f(this.f80560a, qrRequest.f80560a) && Intrinsics.f(this.f80561b, qrRequest.f80561b) && Intrinsics.f(this.f80562c, qrRequest.f80562c);
        }

        public final int hashCode() {
            int iHashCode = this.f80560a.hashCode() * 31;
            PixKey pixKey = this.f80561b;
            int iHashCode2 = (iHashCode + (pixKey == null ? 0 : pixKey.hashCode())) * 31;
            d dVar = this.f80562c;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80560a, i);
            dest.writeParcelable(this.f80561b, i);
            dest.writeSerializable(this.f80562c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Refund;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refund extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Refund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f80565c;
        public final Instant d;
        public final d e;
        public final Instant f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f80566g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Refund(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (Instant) parcel.readSerializable(), (d) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refund[i];
            }
        }

        public Refund(String payerName, String groupId, d limit, Instant until, d originalAmount, Instant instant, boolean z) {
            Intrinsics.checkNotNullParameter(payerName, "payerName");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(limit, "limit");
            Intrinsics.checkNotNullParameter(until, "until");
            Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
            this.f80563a = payerName;
            this.f80564b = groupId;
            this.f80565c = limit;
            this.d = until;
            this.e = originalAmount;
            this.f = instant;
            this.f80566g = z;
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
            return Intrinsics.f(this.f80563a, refund.f80563a) && Intrinsics.f(this.f80564b, refund.f80564b) && Intrinsics.f(this.f80565c, refund.f80565c) && Intrinsics.f(this.d, refund.d) && Intrinsics.f(this.e, refund.e) && Intrinsics.f(this.f, refund.f) && this.f80566g == refund.f80566g;
        }

        public final int hashCode() {
            int iC = v7.c(r6.b.c(v7.c(p.a.c(this.f80563a.hashCode() * 31, 31, this.f80564b), 31, this.f80565c), 31, this.d), 31, this.e);
            Instant instant = this.f;
            return Boolean.hashCode(this.f80566g) + ((iC + (instant == null ? 0 : instant.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80563a);
            dest.writeString(this.f80564b);
            dest.writeSerializable(this.f80565c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
            dest.writeInt(this.f80566g ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step$Transfer;", "Lcom/revolut/feature/pix/impl/flow/PixFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer extends PixFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixTransferNavigation$InputData f80567a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((PixTransferNavigation$InputData) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(PixTransferNavigation$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f80567a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transfer) && Intrinsics.f(this.f80567a, ((Transfer) obj2).f80567a);
        }

        public final int hashCode() {
            return this.f80567a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80567a, i);
        }
    }

    private PixFlowContract$Step() {
    }
}
