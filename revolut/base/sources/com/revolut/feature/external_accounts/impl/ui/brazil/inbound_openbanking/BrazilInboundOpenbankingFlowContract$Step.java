package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PixSmartTransferProductArticle", "BankSelection", "BranchSelection", "InstitutionNotListedDialog", "BranchNotListedDialog", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$BankSelection;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$BranchNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$BranchSelection;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$InstitutionNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$PixSmartTransferProductArticle;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrazilInboundOpenbankingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$BankSelection;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BankSelection extends BrazilInboundOpenbankingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BankSelection f72589a = new BankSelection();

        @NotNull
        public static final Parcelable.Creator<BankSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BankSelection.f72589a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankSelection[i];
            }
        }

        private BankSelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$BranchNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BranchNotListedDialog extends BrazilInboundOpenbankingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BranchNotListedDialog f72590a = new BranchNotListedDialog();

        @NotNull
        public static final Parcelable.Creator<BranchNotListedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BranchNotListedDialog.f72590a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BranchNotListedDialog[i];
            }
        }

        private BranchNotListedDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$BranchSelection;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BranchSelection extends BrazilInboundOpenbankingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BranchSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io3.b f72593c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BranchSelection(parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BranchSelection[i];
            }
        }

        public BranchSelection(String institutionId, String institutionName, io3.b bVar) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72591a = institutionId;
            this.f72592b = institutionName;
            this.f72593c = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BranchSelection)) {
                return false;
            }
            BranchSelection branchSelection = (BranchSelection) obj2;
            return Intrinsics.f(this.f72591a, branchSelection.f72591a) && Intrinsics.f(this.f72592b, branchSelection.f72592b) && Intrinsics.f(this.f72593c, branchSelection.f72593c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f72591a.hashCode() * 31, 31, this.f72592b);
            io3.b bVar = this.f72593c;
            return iC + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72591a);
            dest.writeString(this.f72592b);
            dest.writeSerializable(this.f72593c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$InstitutionNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionNotListedDialog extends BrazilInboundOpenbankingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionNotListedDialog f72594a = new InstitutionNotListedDialog();

        @NotNull
        public static final Parcelable.Creator<InstitutionNotListedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionNotListedDialog.f72594a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionNotListedDialog[i];
            }
        }

        private InstitutionNotListedDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step$PixSmartTransferProductArticle;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/BrazilInboundOpenbankingFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PixSmartTransferProductArticle extends BrazilInboundOpenbankingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PixSmartTransferProductArticle f72595a = new PixSmartTransferProductArticle();

        @NotNull
        public static final Parcelable.Creator<PixSmartTransferProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PixSmartTransferProductArticle.f72595a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixSmartTransferProductArticle[i];
            }
        }

        private PixSmartTransferProductArticle() {
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

    private BrazilInboundOpenbankingFlowContract$Step() {
    }
}
