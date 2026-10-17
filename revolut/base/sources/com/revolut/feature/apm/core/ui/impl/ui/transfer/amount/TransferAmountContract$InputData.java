package com.revolut.feature.apm.core.ui.impl.ui.transfer.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/transfer/amount/TransferAmountContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewTransfer", "WithTransferData", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/amount/TransferAmountContract$InputData$NewTransfer;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/amount/TransferAmountContract$InputData$WithTransferData;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferAmountContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/amount/TransferAmountContract$InputData$NewTransfer;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/amount/TransferAmountContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer implements TransferAmountContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTransferDirection f62424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f62425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ApmTransferContract$InputData.FooterConfig f62426c;
        public final boolean d;
        public final boolean e;
        public final ApmPaymentProfile f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TransferMoneyPocket f62427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Clause f62428h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewTransfer((ApmTransferDirection) parcel.readParcelable(NewTransfer.class.getClassLoader()), (Clause) parcel.readParcelable(NewTransfer.class.getClassLoader()), (ApmTransferContract$InputData.FooterConfig) parcel.readParcelable(NewTransfer.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (ApmPaymentProfile) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferMoneyPocket) parcel.readParcelable(NewTransfer.class.getClassLoader()), (Clause) parcel.readParcelable(NewTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(ApmTransferDirection direction, Clause descriptor, ApmTransferContract$InputData.FooterConfig footerConfig, boolean z, boolean z3, ApmPaymentProfile apmPaymentProfile, TransferMoneyPocket fundingSource, Clause clause) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(apmPaymentProfile, "apmPaymentProfile");
            Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
            this.f62424a = direction;
            this.f62425b = descriptor;
            this.f62426c = footerConfig;
            this.d = z;
            this.e = z3;
            this.f = apmPaymentProfile;
            this.f62427g = fundingSource;
            this.f62428h = clause;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: G4, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: K6, reason: from getter */
        public final ApmPaymentProfile getF() {
            return this.f;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: W6, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewTransfer)) {
                return false;
            }
            NewTransfer newTransfer = (NewTransfer) obj2;
            return Intrinsics.f(this.f62424a, newTransfer.f62424a) && Intrinsics.f(this.f62425b, newTransfer.f62425b) && Intrinsics.f(this.f62426c, newTransfer.f62426c) && this.d == newTransfer.d && this.e == newTransfer.e && this.f == newTransfer.f && Intrinsics.f(this.f62427g, newTransfer.f62427g) && Intrinsics.f(this.f62428h, newTransfer.f62428h);
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: getDescriptor, reason: from getter */
        public final Clause getF62430b() {
            return this.f62425b;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f62424a.hashCode() * 31, 31, this.f62425b);
            ApmTransferContract$InputData.FooterConfig footerConfig = this.f62426c;
            int iHashCode = (this.f62427g.hashCode() + ((this.f.hashCode() + j6.a.c(j6.a.c((iA + (footerConfig == null ? 0 : footerConfig.hashCode())) * 31, 31, this.d), 31, this.e)) * 31)) * 31;
            Clause clause = this.f62428h;
            return iHashCode + (clause != null ? clause.hashCode() : 0);
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final ApmTransferDirection getF62429a() {
            return this.f62424a;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: v9, reason: from getter */
        public final ApmTransferContract$InputData.FooterConfig getF62431c() {
            return this.f62426c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62424a, i);
            dest.writeParcelable(this.f62425b, i);
            dest.writeParcelable(this.f62426c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f62427g, i);
            dest.writeParcelable(this.f62428h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/amount/TransferAmountContract$InputData$WithTransferData;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/amount/TransferAmountContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithTransferData implements TransferAmountContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithTransferData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTransferDirection f62429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f62430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ApmTransferContract$InputData.FooterConfig f62431c;
        public final boolean d;
        public final boolean e;
        public final ApmPaymentProfile f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TransferData f62432g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithTransferData((ApmTransferDirection) parcel.readParcelable(WithTransferData.class.getClassLoader()), (Clause) parcel.readParcelable(WithTransferData.class.getClassLoader()), (ApmTransferContract$InputData.FooterConfig) parcel.readParcelable(WithTransferData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (ApmPaymentProfile) parcel.readParcelable(WithTransferData.class.getClassLoader()), TransferData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTransferData[i];
            }
        }

        public WithTransferData(ApmTransferDirection direction, Clause descriptor, ApmTransferContract$InputData.FooterConfig footerConfig, boolean z, boolean z3, ApmPaymentProfile apmPaymentProfile, TransferData transferData) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(apmPaymentProfile, "apmPaymentProfile");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.f62429a = direction;
            this.f62430b = descriptor;
            this.f62431c = footerConfig;
            this.d = z;
            this.e = z3;
            this.f = apmPaymentProfile;
            this.f62432g = transferData;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: G4, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: K6, reason: from getter */
        public final ApmPaymentProfile getF() {
            return this.f;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: W6, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithTransferData)) {
                return false;
            }
            WithTransferData withTransferData = (WithTransferData) obj2;
            return Intrinsics.f(this.f62429a, withTransferData.f62429a) && Intrinsics.f(this.f62430b, withTransferData.f62430b) && Intrinsics.f(this.f62431c, withTransferData.f62431c) && this.d == withTransferData.d && this.e == withTransferData.e && this.f == withTransferData.f && Intrinsics.f(this.f62432g, withTransferData.f62432g);
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: getDescriptor, reason: from getter */
        public final Clause getF62430b() {
            return this.f62430b;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f62429a.hashCode() * 31, 31, this.f62430b);
            ApmTransferContract$InputData.FooterConfig footerConfig = this.f62431c;
            return this.f62432g.hashCode() + ((this.f.hashCode() + j6.a.c(j6.a.c((iA + (footerConfig == null ? 0 : footerConfig.hashCode())) * 31, 31, this.d), 31, this.e)) * 31);
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final ApmTransferDirection getF62429a() {
            return this.f62429a;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData
        /* JADX INFO: renamed from: v9, reason: from getter */
        public final ApmTransferContract$InputData.FooterConfig getF62431c() {
            return this.f62431c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62429a, i);
            dest.writeParcelable(this.f62430b, i);
            dest.writeParcelable(this.f62431c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
            this.f62432g.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: G4 */
    boolean getD();

    /* JADX INFO: renamed from: K6 */
    ApmPaymentProfile getF();

    /* JADX INFO: renamed from: W6 */
    boolean getE();

    /* JADX INFO: renamed from: getDescriptor */
    Clause getF62430b();

    /* JADX INFO: renamed from: k */
    ApmTransferDirection getF62429a();

    /* JADX INFO: renamed from: v9 */
    ApmTransferContract$InputData.FooterConfig getF62431c();
}
