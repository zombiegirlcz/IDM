package com.revolut.feature.apm.upi.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.beneficiary.AliasMerchant;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import dj0.d;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "TransferInputIdOrMobile", "Area", "Destination", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Area;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$TransferInputIdOrMobile;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UpiFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Area;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig;", "<init>", "()V", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Area extends UpiFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Area f62932g = new Area();

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Area.f62932g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Area[i];
            }
        }

        private Area() {
            super(Destination.AreaDestination.f62933a);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$TransferInputIdOrMobile;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig;", "<init>", "()V", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransferInputIdOrMobile extends UpiFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final TransferInputIdOrMobile f62954g = new TransferInputIdOrMobile();

        @NotNull
        public static final Parcelable.Creator<TransferInputIdOrMobile> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransferInputIdOrMobile.f62954g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferInputIdOrMobile[i];
            }
        }

        private TransferInputIdOrMobile() {
            super(Destination.TransferInputIdOrMobileDestination.f62953a);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public UpiFeatureConfig(Destination destination) {
        super((ActivityAnimation) null, (ParcelableDestination) destination, false, (Integer) null, 0, 61);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "TransferInputIdOrMobileDestination", "PendingPaymentConfirmationDestination", "IntentPaymentDestination", "Transfer", "AreaDestination", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$AreaDestination;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$IntentPaymentDestination;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$TransferInputIdOrMobileDestination;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Destination implements KompotDestination, Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$AreaDestination;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination;", "<init>", "()V", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AreaDestination extends Destination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AreaDestination f62933a = new AreaDestination();

            @NotNull
            public static final Parcelable.Creator<AreaDestination> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AreaDestination.f62933a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AreaDestination[i];
                }
            }

            private AreaDestination() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$IntentPaymentDestination;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class IntentPaymentDestination extends Destination {

            @NotNull
            public static final Parcelable.Creator<IntentPaymentDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62934a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new IntentPaymentDestination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new IntentPaymentDestination[i];
                }
            }

            public IntentPaymentDestination(String redirectLink) {
                Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
                this.f62934a = redirectLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof IntentPaymentDestination) && Intrinsics.f(this.f62934a, ((IntentPaymentDestination) obj2).f62934a);
            }

            public final int hashCode() {
                return this.f62934a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62934a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PendingPaymentConfirmationDestination extends Destination {

            @NotNull
            public static final Parcelable.Creator<PendingPaymentConfirmationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InputData f62935a;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData;", "Landroid/os/Parcelable;", "PaymentId", "MandateDeeplink", "PendingAction", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData$MandateDeeplink;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData$PaymentId;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData$PendingAction;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface InputData extends Parcelable {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData$MandateDeeplink;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class MandateDeeplink implements InputData {

                    @NotNull
                    public static final Parcelable.Creator<MandateDeeplink> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f62936a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new MandateDeeplink(parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new MandateDeeplink[i];
                        }
                    }

                    public MandateDeeplink(String redirectLink) {
                        Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
                        this.f62936a = redirectLink;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof MandateDeeplink) && Intrinsics.f(this.f62936a, ((MandateDeeplink) obj2).f62936a);
                    }

                    public final int hashCode() {
                        return this.f62936a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f62936a);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData$PaymentId;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class PaymentId implements InputData {

                    @NotNull
                    public static final Parcelable.Creator<PaymentId> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f62937a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f62938b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new PaymentId(parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new PaymentId[i];
                        }
                    }

                    public PaymentId(String pendingPaymentId, String type) {
                        Intrinsics.checkNotNullParameter(pendingPaymentId, "pendingPaymentId");
                        Intrinsics.checkNotNullParameter(type, "type");
                        this.f62937a = pendingPaymentId;
                        this.f62938b = type;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof PaymentId)) {
                            return false;
                        }
                        PaymentId paymentId = (PaymentId) obj2;
                        return Intrinsics.f(this.f62937a, paymentId.f62937a) && Intrinsics.f(this.f62938b, paymentId.f62938b);
                    }

                    public final int hashCode() {
                        return this.f62938b.hashCode() + (this.f62937a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f62937a);
                        dest.writeString(this.f62938b);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData$PendingAction;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class PendingAction implements InputData {

                    @NotNull
                    public static final Parcelable.Creator<PendingAction> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ApmPaymentAuthorisationPendingAction f62939a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new PendingAction((ApmPaymentAuthorisationPendingAction) parcel.readParcelable(PendingAction.class.getClassLoader()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new PendingAction[i];
                        }
                    }

                    public PendingAction(ApmPaymentAuthorisationPendingAction paymentAuthorisationPendingAction) {
                        Intrinsics.checkNotNullParameter(paymentAuthorisationPendingAction, "paymentAuthorisationPendingAction");
                        this.f62939a = paymentAuthorisationPendingAction;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof PendingAction) && Intrinsics.f(this.f62939a, ((PendingAction) obj2).f62939a);
                    }

                    public final int hashCode() {
                        return this.f62939a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeParcelable(this.f62939a, i);
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PendingPaymentConfirmationDestination((InputData) parcel.readParcelable(PendingPaymentConfirmationDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PendingPaymentConfirmationDestination[i];
                }
            }

            public PendingPaymentConfirmationDestination(InputData inputData) {
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                this.f62935a = inputData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PendingPaymentConfirmationDestination) && Intrinsics.f(this.f62935a, ((PendingPaymentConfirmationDestination) obj2).f62935a);
            }

            public final int hashCode() {
                return this.f62935a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f62935a, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$TransferInputIdOrMobileDestination;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination;", "<init>", "()V", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TransferInputIdOrMobileDestination extends Destination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TransferInputIdOrMobileDestination f62953a = new TransferInputIdOrMobileDestination();

            @NotNull
            public static final Parcelable.Creator<TransferInputIdOrMobileDestination> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TransferInputIdOrMobileDestination.f62953a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TransferInputIdOrMobileDestination[i];
                }
            }

            private TransferInputIdOrMobileDestination() {
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

        private Destination() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Transfer extends Destination {

            @NotNull
            public static final Parcelable.Creator<Transfer> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InputData f62940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final we2.a f62941b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final m1l.a f62942c;
            public final p d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Transfer((InputData) parcel.readParcelable(Transfer.class.getClassLoader()), we2.a.valueOf(parcel.readString()), m1l.a.valueOf(parcel.readString()), (p) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Transfer[i];
                }
            }

            public Transfer(InputData inputData, we2.a transferSource, m1l.a scheduleMode, p pVar) {
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(transferSource, "transferSource");
                Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
                this.f62940a = inputData;
                this.f62941b = transferSource;
                this.f62942c = scheduleMode;
                this.d = pVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Transfer)) {
                    return false;
                }
                Transfer transfer = (Transfer) obj2;
                return Intrinsics.f(this.f62940a, transfer.f62940a) && this.f62941b == transfer.f62941b && this.f62942c == transfer.f62942c && Intrinsics.f(this.d, transfer.d);
            }

            public final int hashCode() {
                int iHashCode = (this.f62942c.hashCode() + ((this.f62941b.hashCode() + (this.f62940a.hashCode() * 31)) * 31)) * 31;
                p pVar = this.d;
                return iHashCode + (pVar == null ? 0 : pVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f62940a, i);
                dest.writeString(this.f62941b.name());
                dest.writeString(this.f62942c.name());
                dest.writeSerializable(this.d);
            }

            public /* synthetic */ Transfer(InputData inputData, we2.a aVar, m1l.a aVar2, p pVar, int i) {
                this(inputData, (i & 2) != 0 ? we2.a.REGULAR : aVar, (i & 4) != 0 ? m1l.a.SCHEDULE_ENABLED : aVar2, (i & 8) != 0 ? null : pVar);
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData;", "Landroid/os/Parcelable;", "ToAlias", "ToBeneficiary", "ToMerchant", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData$ToAlias;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData$ToBeneficiary;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData$ToMerchant;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface InputData extends Parcelable {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData$ToBeneficiary;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class ToBeneficiary implements InputData {

                    @NotNull
                    public static final Parcelable.Creator<ToBeneficiary> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final f5j.a f62948a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new ToBeneficiary((f5j.a) parcel.readSerializable());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new ToBeneficiary[i];
                        }
                    }

                    public ToBeneficiary(f5j.a beneficiary) {
                        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                        this.f62948a = beneficiary;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof ToBeneficiary) && Intrinsics.f(this.f62948a, ((ToBeneficiary) obj2).f62948a);
                    }

                    public final int hashCode() {
                        return this.f62948a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeSerializable(this.f62948a);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData$ToMerchant;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class ToMerchant implements InputData {

                    @NotNull
                    public static final Parcelable.Creator<ToMerchant> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final AliasMerchant f62949a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final d f62950b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f62951c;
                    public final String d;
                    public final String e;
                    public final boolean f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final Map f62952g;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            int i;
                            LinkedHashMap linkedHashMap;
                            AliasMerchant aliasMerchant = (AliasMerchant) j6.a.f(parcel, "parcel", ToMerchant.class);
                            d dVar = (d) parcel.readSerializable();
                            String string = parcel.readString();
                            String string2 = parcel.readString();
                            String string3 = parcel.readString();
                            int iD = 0;
                            boolean z = true;
                            if (parcel.readInt() != 0) {
                                i = 1;
                            } else {
                                i = 1;
                                z = false;
                            }
                            if (parcel.readInt() == 0) {
                                linkedHashMap = null;
                            } else {
                                int i2 = parcel.readInt();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                                while (iD != i2) {
                                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, i);
                                }
                                linkedHashMap = linkedHashMap2;
                            }
                            return new ToMerchant(aliasMerchant, dVar, string, string2, string3, z, linkedHashMap);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new ToMerchant[i];
                        }
                    }

                    public ToMerchant(AliasMerchant merchant, d dVar, String str, String str2, String str3, boolean z, Map map) {
                        Intrinsics.checkNotNullParameter(merchant, "merchant");
                        this.f62949a = merchant;
                        this.f62950b = dVar;
                        this.f62951c = str;
                        this.d = str2;
                        this.e = str3;
                        this.f = z;
                        this.f62952g = map;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof ToMerchant)) {
                            return false;
                        }
                        ToMerchant toMerchant = (ToMerchant) obj2;
                        return Intrinsics.f(this.f62949a, toMerchant.f62949a) && Intrinsics.f(this.f62950b, toMerchant.f62950b) && Intrinsics.f(this.f62951c, toMerchant.f62951c) && Intrinsics.f(this.d, toMerchant.d) && Intrinsics.f(this.e, toMerchant.e) && this.f == toMerchant.f && Intrinsics.f(this.f62952g, toMerchant.f62952g);
                    }

                    public final int hashCode() {
                        int iHashCode = this.f62949a.hashCode() * 31;
                        d dVar = this.f62950b;
                        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                        String str = this.f62951c;
                        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.d;
                        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.e;
                        int iC = j6.a.c((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
                        Map map = this.f62952g;
                        return iC + (map != null ? map.hashCode() : 0);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeParcelable(this.f62949a, i);
                        dest.writeSerializable(this.f62950b);
                        dest.writeString(this.f62951c);
                        dest.writeString(this.d);
                        dest.writeString(this.e);
                        dest.writeInt(this.f ? 1 : 0);
                        Map map = this.f62952g;
                        if (map == null) {
                            dest.writeInt(0);
                            return;
                        }
                        Iterator itV = l.v(dest, 1, map);
                        while (itV.hasNext()) {
                            Map.Entry entry = (Map.Entry) itV.next();
                            dest.writeString((String) entry.getKey());
                            dest.writeString((String) entry.getValue());
                        }
                    }

                    public /* synthetic */ ToMerchant(AliasMerchant aliasMerchant, d dVar, String str, String str2, String str3, Map map, int i) {
                        this(aliasMerchant, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0, (i & 64) != 0 ? null : map);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData$ToAlias;", "Lcom/revolut/feature/apm/upi/api/UpiFeatureConfig$Destination$Transfer$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class ToAlias implements InputData {

                    @NotNull
                    public static final Parcelable.Creator<ToAlias> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PaymentCounterpartyInfo f62943a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f62944b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final d f62945c;
                    public final String d;
                    public final String e;
                    public final String f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final boolean f62946g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final Map f62947h;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            int i;
                            LinkedHashMap linkedHashMap;
                            PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) j6.a.f(parcel, "parcel", ToAlias.class);
                            String string = parcel.readString();
                            d dVar = (d) parcel.readSerializable();
                            String string2 = parcel.readString();
                            String string3 = parcel.readString();
                            String string4 = parcel.readString();
                            int iD = 0;
                            boolean z = true;
                            if (parcel.readInt() != 0) {
                                i = 1;
                            } else {
                                i = 1;
                                z = false;
                            }
                            if (parcel.readInt() == 0) {
                                linkedHashMap = null;
                            } else {
                                int i2 = parcel.readInt();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                                while (iD != i2) {
                                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, i);
                                }
                                linkedHashMap = linkedHashMap2;
                            }
                            return new ToAlias(paymentCounterpartyInfo, string, dVar, string2, string3, string4, z, linkedHashMap);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new ToAlias[i];
                        }
                    }

                    public ToAlias(PaymentCounterpartyInfo paymentCounterparty, String alias, d dVar, String str, String str2, String str3, boolean z, Map map) {
                        Intrinsics.checkNotNullParameter(paymentCounterparty, "paymentCounterparty");
                        Intrinsics.checkNotNullParameter(alias, "alias");
                        this.f62943a = paymentCounterparty;
                        this.f62944b = alias;
                        this.f62945c = dVar;
                        this.d = str;
                        this.e = str2;
                        this.f = str3;
                        this.f62946g = z;
                        this.f62947h = map;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof ToAlias)) {
                            return false;
                        }
                        ToAlias toAlias = (ToAlias) obj2;
                        return Intrinsics.f(this.f62943a, toAlias.f62943a) && Intrinsics.f(this.f62944b, toAlias.f62944b) && Intrinsics.f(this.f62945c, toAlias.f62945c) && Intrinsics.f(this.d, toAlias.d) && Intrinsics.f(this.e, toAlias.e) && Intrinsics.f(this.f, toAlias.f) && this.f62946g == toAlias.f62946g && Intrinsics.f(this.f62947h, toAlias.f62947h);
                    }

                    public final int hashCode() {
                        int iC = p.a.c(this.f62943a.hashCode() * 31, 31, this.f62944b);
                        d dVar = this.f62945c;
                        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
                        String str = this.d;
                        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.e;
                        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.f;
                        int iC2 = j6.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f62946g);
                        Map map = this.f62947h;
                        return iC2 + (map != null ? map.hashCode() : 0);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeParcelable(this.f62943a, i);
                        dest.writeString(this.f62944b);
                        dest.writeSerializable(this.f62945c);
                        dest.writeString(this.d);
                        dest.writeString(this.e);
                        dest.writeString(this.f);
                        dest.writeInt(this.f62946g ? 1 : 0);
                        Map map = this.f62947h;
                        if (map == null) {
                            dest.writeInt(0);
                            return;
                        }
                        Iterator itV = l.v(dest, 1, map);
                        while (itV.hasNext()) {
                            Map.Entry entry = (Map.Entry) itV.next();
                            dest.writeString((String) entry.getKey());
                            dest.writeString((String) entry.getValue());
                        }
                    }

                    public /* synthetic */ ToAlias(PaymentCounterpartyInfo paymentCounterpartyInfo, String str, d dVar, String str2, String str3, String str4, Map map, int i) {
                        this(paymentCounterpartyInfo, str, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) == 0, (i & 128) != 0 ? null : map);
                    }
                }
            }
        }
    }
}
