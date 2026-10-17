package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import c12.q0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import hrf.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmTransferContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "TransferReasonConfig", "FooterConfig", "PaymentReference", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTransferContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ApmTransferContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferDirection f62280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f62281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f62282c;
    public final ApmTransferDestination d;
    public final TransferMoneyPocket e;
    public final PaymentReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62284h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f62285j;
    public final FooterConfig k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f62286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f62287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ApmPaymentProfile f62288n;
    public final TransferReasonConfig o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferContract$InputData$FooterConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FooterConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FooterConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmFooterContent f62289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmFooterContent f62290b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FooterConfig((ApmFooterContent) parcel.readParcelable(FooterConfig.class.getClassLoader()), (ApmFooterContent) parcel.readParcelable(FooterConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FooterConfig[i];
            }
        }

        public FooterConfig() {
            this((ApmFooterContent.ImageOnly) null, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FooterConfig)) {
                return false;
            }
            FooterConfig footerConfig = (FooterConfig) obj2;
            return Intrinsics.f(this.f62289a, footerConfig.f62289a) && Intrinsics.f(this.f62290b, footerConfig.f62290b);
        }

        public final int hashCode() {
            ApmFooterContent apmFooterContent = this.f62289a;
            int iHashCode = (apmFooterContent == null ? 0 : apmFooterContent.hashCode()) * 31;
            ApmFooterContent apmFooterContent2 = this.f62290b;
            return iHashCode + (apmFooterContent2 != null ? apmFooterContent2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62289a, i);
            dest.writeParcelable(this.f62290b, i);
        }

        public FooterConfig(ApmFooterContent apmFooterContent, ApmFooterContent apmFooterContent2) {
            this.f62289a = apmFooterContent;
            this.f62290b = apmFooterContent2;
        }

        public /* synthetic */ FooterConfig(ApmFooterContent.ImageOnly imageOnly, int i) {
            this((ApmFooterContent) null, (i & 2) != 0 ? null : imageOnly);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferContract$InputData$PaymentReference;", "Landroid/os/Parcelable;", "PaymentIntent", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferContract$InputData$PaymentReference$PaymentIntent;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PaymentReference extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferContract$InputData$PaymentReference$PaymentIntent;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferContract$InputData$PaymentReference;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PaymentIntent implements PaymentReference {

            @NotNull
            public static final Parcelable.Creator<PaymentIntent> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62291a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaymentIntent(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PaymentIntent[i];
                }
            }

            public PaymentIntent(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f62291a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PaymentIntent) && Intrinsics.f(this.f62291a, ((PaymentIntent) obj2).f62291a);
            }

            public final int hashCode() {
                return this.f62291a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62291a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferContract$InputData$TransferReasonConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferReasonConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TransferReasonConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f62292a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferReasonConfig((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferReasonConfig[i];
            }
        }

        public TransferReasonConfig(b recipientCountry) {
            Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
            this.f62292a = recipientCountry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransferReasonConfig) && Intrinsics.f(this.f62292a, ((TransferReasonConfig) obj2).f62292a);
        }

        public final int hashCode() {
            return this.f62292a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f62292a);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            Clause clause;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ApmTransferDirection apmTransferDirection = (ApmTransferDirection) parcel.readParcelable(ApmTransferContract$InputData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(ApmTransferContract$InputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(ApmTransferContract$InputData.class.getClassLoader());
            ApmTransferDestination apmTransferDestination = (ApmTransferDestination) parcel.readParcelable(ApmTransferContract$InputData.class.getClassLoader());
            TransferMoneyPocket transferMoneyPocket = (TransferMoneyPocket) parcel.readParcelable(ApmTransferContract$InputData.class.getClassLoader());
            PaymentReference paymentReference = (PaymentReference) parcel.readParcelable(ApmTransferContract$InputData.class.getClassLoader());
            boolean z11 = false;
            boolean z12 = true;
            boolean z29 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z12 = z;
            }
            Clause clause4 = (Clause) parcel.readParcelable(ApmTransferContract$InputData.class.getClassLoader());
            FooterConfig footerConfigCreateFromParcel = parcel.readInt() == 0 ? null : FooterConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z4 = z;
                clause = clause4;
                z6 = z3;
            } else {
                z4 = z;
                clause = clause4;
                z6 = z4;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            }
            return new ApmTransferContract$InputData(apmTransferDirection, clause2, clause3, apmTransferDestination, transferMoneyPocket, paymentReference, z29, z11, z12, clause, footerConfigCreateFromParcel, z6, z4, (ApmPaymentProfile) parcel.readParcelable(ApmTransferContract$InputData.class.getClassLoader()), parcel.readInt() != 0 ? TransferReasonConfig.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTransferContract$InputData[i];
        }
    }

    public ApmTransferContract$InputData(ApmTransferDirection direction, Clause amountDescriptor, Clause reviewDescriptor, ApmTransferDestination destinationConfig, TransferMoneyPocket fundingSource, PaymentReference paymentReference, boolean z, boolean z3, boolean z4, Clause clause, FooterConfig footerConfig, boolean z6, boolean z11, ApmPaymentProfile apmPaymentProfile, TransferReasonConfig transferReasonConfig) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amountDescriptor, "amountDescriptor");
        Intrinsics.checkNotNullParameter(reviewDescriptor, "reviewDescriptor");
        Intrinsics.checkNotNullParameter(destinationConfig, "destinationConfig");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(apmPaymentProfile, "apmPaymentProfile");
        this.f62280a = direction;
        this.f62281b = amountDescriptor;
        this.f62282c = reviewDescriptor;
        this.d = destinationConfig;
        this.e = fundingSource;
        this.f = paymentReference;
        this.f62283g = z;
        this.f62284h = z3;
        this.i = z4;
        this.f62285j = clause;
        this.k = footerConfig;
        this.f62286l = z6;
        this.f62287m = z11;
        this.f62288n = apmPaymentProfile;
        this.o = transferReasonConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmTransferContract$InputData)) {
            return false;
        }
        ApmTransferContract$InputData apmTransferContract$InputData = (ApmTransferContract$InputData) obj2;
        return Intrinsics.f(this.f62280a, apmTransferContract$InputData.f62280a) && Intrinsics.f(this.f62281b, apmTransferContract$InputData.f62281b) && Intrinsics.f(this.f62282c, apmTransferContract$InputData.f62282c) && Intrinsics.f(this.d, apmTransferContract$InputData.d) && Intrinsics.f(this.e, apmTransferContract$InputData.e) && Intrinsics.f(this.f, apmTransferContract$InputData.f) && this.f62283g == apmTransferContract$InputData.f62283g && this.f62284h == apmTransferContract$InputData.f62284h && this.i == apmTransferContract$InputData.i && Intrinsics.f(this.f62285j, apmTransferContract$InputData.f62285j) && Intrinsics.f(this.k, apmTransferContract$InputData.k) && this.f62286l == apmTransferContract$InputData.f62286l && this.f62287m == apmTransferContract$InputData.f62287m && this.f62288n == apmTransferContract$InputData.f62288n && Intrinsics.f(this.o, apmTransferContract$InputData.o);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + p.a.a(p.a.a(this.f62280a.hashCode() * 31, 31, this.f62281b), 31, this.f62282c)) * 31)) * 31;
        PaymentReference paymentReference = this.f;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode + (paymentReference == null ? 0 : paymentReference.hashCode())) * 31, 31, this.f62283g), 31, this.f62284h), 31, this.i);
        Clause clause = this.f62285j;
        int iHashCode2 = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        FooterConfig footerConfig = this.k;
        int iHashCode3 = (this.f62288n.hashCode() + j6.a.c(j6.a.c((iHashCode2 + (footerConfig == null ? 0 : footerConfig.hashCode())) * 31, 31, this.f62286l), 31, this.f62287m)) * 31;
        TransferReasonConfig transferReasonConfig = this.o;
        return iHashCode3 + (transferReasonConfig != null ? transferReasonConfig.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62280a, i);
        dest.writeParcelable(this.f62281b, i);
        dest.writeParcelable(this.f62282c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f62283g ? 1 : 0);
        dest.writeInt(this.f62284h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f62285j, i);
        FooterConfig footerConfig = this.k;
        if (footerConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            footerConfig.writeToParcel(dest, i);
        }
        dest.writeInt(this.f62286l ? 1 : 0);
        dest.writeInt(this.f62287m ? 1 : 0);
        dest.writeParcelable(this.f62288n, i);
        TransferReasonConfig transferReasonConfig = this.o;
        if (transferReasonConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferReasonConfig.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ ApmTransferContract$InputData(ApmTransferDirection apmTransferDirection, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ApmTransferDestination apmTransferDestination, TransferMoneyPocket transferMoneyPocket, PaymentReference.PaymentIntent paymentIntent, boolean z, boolean z3, boolean z4, Clause clause, FooterConfig footerConfig, boolean z6, boolean z11, ApmPaymentProfile apmPaymentProfile, TransferReasonConfig transferReasonConfig, int i) {
        this(apmTransferDirection, textLocalisedClause, textLocalisedClause2, apmTransferDestination, transferMoneyPocket, (i & 32) != 0 ? null : paymentIntent, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? null : clause, (i & 1024) != 0 ? null : footerConfig, (i & 2048) != 0 ? false : z6, (i & 4096) != 0 ? false : z11, (i & 8192) != 0 ? ApmPaymentProfile.PERSONAL : apmPaymentProfile, (i & 16384) != 0 ? null : transferReasonConfig);
    }

    public ApmTransferContract$InputData(ApmContact recipient, f direction, TextLocalisedClause amountDescriptor, TextLocalisedClause reviewDescriptor, ApmTransferDestination destinationConfig, TransferMoneyPocket transferMoneyPocket, TextLocalisedClause textLocalisedClause, ApmPaymentProfile apmPaymentProfile, TransferReasonConfig transferReasonConfig, int i) {
        ApmTransferDirection outgoing;
        TransferMoneyPocket fundingSource = (i & 32) != 0 ? new TransferMoneyPocket(null, null, 3) : transferMoneyPocket;
        boolean z = (i & 128) == 0;
        TextLocalisedClause textLocalisedClause2 = (i & 256) != 0 ? null : textLocalisedClause;
        boolean z3 = (i & 1024) == 0;
        boolean z4 = (i & 2048) == 0;
        ApmPaymentProfile apmPaymentProfile2 = (i & 4096) != 0 ? ApmPaymentProfile.PERSONAL : apmPaymentProfile;
        TransferReasonConfig transferReasonConfig2 = (i & 8192) != 0 ? null : transferReasonConfig;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amountDescriptor, "amountDescriptor");
        Intrinsics.checkNotNullParameter(reviewDescriptor, "reviewDescriptor");
        Intrinsics.checkNotNullParameter(destinationConfig, "destinationConfig");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(apmPaymentProfile2, "apmPaymentProfile");
        int i2 = q0.f20347a[direction.ordinal()];
        if (i2 == 1) {
            outgoing = new ApmTransferDirection.Outgoing(new ApmTransferRecipient.Contact(recipient), true, true);
        } else if (i2 == 2) {
            outgoing = new ApmTransferDirection.Incoming(new ApmTransferRecipient.Contact(recipient), null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this(outgoing, amountDescriptor, reviewDescriptor, destinationConfig, fundingSource, null, false, false, z, textLocalisedClause2, null, z3, z4, apmPaymentProfile2, transferReasonConfig2, 160);
    }
}
