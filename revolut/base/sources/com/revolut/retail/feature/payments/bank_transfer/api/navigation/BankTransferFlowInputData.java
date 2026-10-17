package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.flow.FlowExtras;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "NewTransfer", "ReviewOnly", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferFlowInputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferFlowInputData$ReviewOnly;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BankTransferFlowInputData implements IOData$Input, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f101940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f101941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankTransferEntryPoint f101942c;
    public final FlowExtras d;
    public final boolean e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransferAppSource f101943g;

    public BankTransferFlowInputData(f5j.a aVar, TransferFlowType transferFlowType, BankTransferEntryPoint bankTransferEntryPoint, FlowExtras flowExtras, boolean z, Set set, TransferAppSource transferAppSource) {
        this.f101940a = aVar;
        this.f101941b = transferFlowType;
        this.f101942c = bankTransferEntryPoint;
        this.d = flowExtras;
        this.e = z;
        this.f = set;
        this.f101943g = transferAppSource;
    }

    /* JADX INFO: renamed from: C7, reason: from getter */
    public boolean getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public TransferFlowType getF101941b() {
        return this.f101941b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public BankTransferEntryPoint getF101942c() {
        return this.f101942c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public f5j.a getF101940a() {
        return this.f101940a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public TransferAppSource getF101943g() {
        return this.f101943g;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferFlowInputData$ReviewOnly;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewOnly extends BankTransferFlowInputData {

        @NotNull
        public static final Parcelable.Creator<ReviewOnly> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final f5j.a f101945h;
        public final TransferFlowType i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final BankTransferEntryPoint f101946j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Set f101947l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final TransferAppSource f101948m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final BankTransferData f101949n;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iE;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                f5j.a aVar = (f5j.a) parcel.readSerializable();
                TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(ReviewOnly.class.getClassLoader());
                BankTransferEntryPoint bankTransferEntryPointCreateFromParcel = BankTransferEntryPoint.CREATOR.createFromParcel(parcel);
                boolean z = false;
                if (parcel.readInt() != 0) {
                    iE = 0;
                    z = true;
                } else {
                    iE = 0;
                }
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                while (iE != i) {
                    iE = d.e(ReviewOnly.class, parcel, linkedHashSet, iE, 1);
                }
                return new ReviewOnly(aVar, transferFlowType, bankTransferEntryPointCreateFromParcel, z, linkedHashSet, (TransferAppSource) parcel.readParcelable(ReviewOnly.class.getClassLoader()), BankTransferData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewOnly[i];
            }
        }

        public ReviewOnly(f5j.a aVar, BankTransferEntryPoint bankTransferEntryPoint, TransferAppSource.AIR_WIDGET air_widget, BankTransferData bankTransferData, int i) {
            this(aVar, TransferFlowType.Default.f92257b, bankTransferEntryPoint, false, h0.f322473a, (i & 32) != 0 ? TransferAppSource.BANK_TRANSFER.f92297a : air_widget, bankTransferData);
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData
        /* JADX INFO: renamed from: C7, reason: from getter */
        public final boolean getE() {
            return this.k;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF101941b() {
            return this.i;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BankTransferEntryPoint getF101942c() {
            return this.f101946j;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final f5j.a getF101940a() {
            return this.f101945h;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TransferAppSource getF101943g() {
            return this.f101948m;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewOnly)) {
                return false;
            }
            ReviewOnly reviewOnly = (ReviewOnly) obj2;
            return Intrinsics.f(this.f101945h, reviewOnly.f101945h) && Intrinsics.f(this.i, reviewOnly.i) && this.f101946j == reviewOnly.f101946j && this.k == reviewOnly.k && Intrinsics.f(this.f101947l, reviewOnly.f101947l) && Intrinsics.f(this.f101948m, reviewOnly.f101948m) && Intrinsics.f(this.f101949n, reviewOnly.f101949n);
        }

        public final int hashCode() {
            return this.f101949n.hashCode() + ((this.f101948m.hashCode() + p.a.f(j6.a.c((this.f101946j.hashCode() + d.c(this.i, this.f101945h.hashCode() * 31, 31)) * 31, 31, this.k), 31, this.f101947l)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101945h);
            dest.writeParcelable(this.i, i);
            this.f101946j.writeToParcel(dest, i);
            dest.writeInt(this.k ? 1 : 0);
            Iterator itV = n.v(this.f101947l, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f101948m, i);
            this.f101949n.writeToParcel(dest, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReviewOnly(f5j.a recipient, TransferFlowType flowType, BankTransferEntryPoint entryPoint, boolean z, Set extraConfigurations, TransferAppSource transferAppSource, BankTransferData transferData) {
            super(recipient, flowType, entryPoint, null, z, extraConfigurations, transferAppSource);
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.f101945h = recipient;
            this.i = flowType;
            this.f101946j = entryPoint;
            this.k = z;
            this.f101947l = extraConfigurations;
            this.f101948m = transferAppSource;
            this.f101949n = transferData;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferFlowInputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer extends BankTransferFlowInputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final BankTransferInputData f101944h;
        public final boolean i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewTransfer(BankTransferInputData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewTransfer(BankTransferInputData inputData, boolean z) {
            super(inputData.f101950a, inputData.f101951b, BankTransferEntryPoint.REGULAR_TRANSFER, inputData.f101954h, inputData.f101958n, inputData.f101957m, inputData.f101959p);
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f101944h = inputData;
            this.i = z;
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
            return Intrinsics.f(this.f101944h, newTransfer.f101944h) && this.i == newTransfer.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (this.f101944h.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101944h.writeToParcel(dest, i);
            dest.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ NewTransfer(BankTransferInputData bankTransferInputData) {
            this(bankTransferInputData, false);
        }
    }
}
