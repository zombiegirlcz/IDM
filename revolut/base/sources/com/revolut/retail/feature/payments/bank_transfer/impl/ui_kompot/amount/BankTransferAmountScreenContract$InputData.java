package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ehe.n;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq2.g;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewTransfer", "WithTransferData", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreenContract$InputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreenContract$InputData$WithTransferData;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankTransferAmountScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreenContract$InputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer implements BankTransferAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f102069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferFlowType f102070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f102071c;
        public final Set d;
        public final BankTransferInputReference e;
        public final TransferMoneyPocket f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final UltimateDebtor f102072g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final m1l.a f102073h;
        public final TransferScheduleData i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final p f102074j;
        public final Map k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final RemittanceAccountSwitchingInformation f102075l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ScannedBillDetails f102076m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                f5j.a aVar = (f5j.a) parcel.readSerializable();
                Class<NewTransfer> cls = NewTransfer.class;
                TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(cls.getClassLoader());
                g gVarValueOf = parcel.readInt() == 0 ? null : g.valueOf(parcel.readString());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                int iE = 0;
                while (iE != i) {
                    iE = d.e(cls, parcel, linkedHashSet, iE, 1);
                }
                BankTransferInputReference bankTransferInputReference = (BankTransferInputReference) parcel.readParcelable(cls.getClassLoader());
                TransferMoneyPocket transferMoneyPocket = (TransferMoneyPocket) parcel.readParcelable(cls.getClassLoader());
                UltimateDebtor ultimateDebtor = (UltimateDebtor) parcel.readParcelable(cls.getClassLoader());
                m1l.a aVarValueOf = m1l.a.valueOf(parcel.readString());
                TransferScheduleData transferScheduleData = (TransferScheduleData) parcel.readParcelable(cls.getClassLoader());
                p pVar = (p) parcel.readSerializable();
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                while (true) {
                    Class<NewTransfer> cls2 = cls;
                    if (iD == i2) {
                        return new NewTransfer(aVar, transferFlowType, gVarValueOf, linkedHashSet, bankTransferInputReference, transferMoneyPocket, ultimateDebtor, aVarValueOf, transferScheduleData, pVar, linkedHashMap, (RemittanceAccountSwitchingInformation) parcel.readParcelable(cls2.getClassLoader()), (ScannedBillDetails) parcel.readParcelable(cls2.getClassLoader()));
                    }
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                    cls = cls2;
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(f5j.a beneficiary, TransferFlowType flowType, g gVar, Set extraConfigurations, BankTransferInputReference bankTransferInputReference, TransferMoneyPocket moneyPocket, UltimateDebtor ultimateDebtor, m1l.a scheduleMode, TransferScheduleData scheduleData, p pVar, Map additionalInputs, RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation, ScannedBillDetails scannedBillDetails) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
            Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            Intrinsics.checkNotNullParameter(additionalInputs, "additionalInputs");
            this.f102069a = beneficiary;
            this.f102070b = flowType;
            this.f102071c = gVar;
            this.d = extraConfigurations;
            this.e = bankTransferInputReference;
            this.f = moneyPocket;
            this.f102072g = ultimateDebtor;
            this.f102073h = scheduleMode;
            this.i = scheduleData;
            this.f102074j = pVar;
            this.k = additionalInputs;
            this.f102075l = remittanceAccountSwitchingInformation;
            this.f102076m = scannedBillDetails;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF102078b() {
            return this.f102070b;
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
            return Intrinsics.f(this.f102069a, newTransfer.f102069a) && Intrinsics.f(this.f102070b, newTransfer.f102070b) && this.f102071c == newTransfer.f102071c && Intrinsics.f(this.d, newTransfer.d) && Intrinsics.f(this.e, newTransfer.e) && Intrinsics.f(this.f, newTransfer.f) && Intrinsics.f(this.f102072g, newTransfer.f102072g) && this.f102073h == newTransfer.f102073h && Intrinsics.f(this.i, newTransfer.i) && Intrinsics.f(this.f102074j, newTransfer.f102074j) && Intrinsics.f(this.k, newTransfer.k) && Intrinsics.f(this.f102075l, newTransfer.f102075l) && Intrinsics.f(this.f102076m, newTransfer.f102076m);
        }

        public final int hashCode() {
            int iC = d.c(this.f102070b, this.f102069a.hashCode() * 31, 31);
            g gVar = this.f102071c;
            int iF = p.a.f((iC + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.d);
            BankTransferInputReference bankTransferInputReference = this.e;
            int iHashCode = (this.f.hashCode() + ((iF + (bankTransferInputReference == null ? 0 : bankTransferInputReference.hashCode())) * 31)) * 31;
            UltimateDebtor ultimateDebtor = this.f102072g;
            int iF2 = l.f(this.i, (this.f102073h.hashCode() + ((iHashCode + (ultimateDebtor == null ? 0 : ultimateDebtor.hashCode())) * 31)) * 31, 31);
            p pVar = this.f102074j;
            int iE = p.a.e((iF2 + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.k);
            RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = this.f102075l;
            int iHashCode2 = (iE + (remittanceAccountSwitchingInformation == null ? 0 : remittanceAccountSwitchingInformation.hashCode())) * 31;
            ScannedBillDetails scannedBillDetails = this.f102076m;
            return iHashCode2 + (scannedBillDetails != null ? scannedBillDetails.f92265a.hashCode() : 0);
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData
        /* JADX INFO: renamed from: s, reason: from getter */
        public final f5j.a getF102077a() {
            return this.f102069a;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData
        /* JADX INFO: renamed from: u0, reason: from getter */
        public final Set getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102069a);
            dest.writeParcelable(this.f102070b, i);
            g gVar = this.f102071c;
            if (gVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(gVar.name());
            }
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f102072g, i);
            dest.writeString(this.f102073h.name());
            dest.writeParcelable(this.i, i);
            dest.writeSerializable(this.f102074j);
            Iterator itZ = j6.a.z(this.k, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeParcelable(this.f102075l, i);
            dest.writeParcelable(this.f102076m, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreenContract$InputData$WithTransferData;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithTransferData implements BankTransferAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithTransferData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f102077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferFlowType f102078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f102079c;
        public final Set d;
        public final BankTransferData e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                f5j.a aVar = (f5j.a) parcel.readSerializable();
                TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(WithTransferData.class.getClassLoader());
                g gVarValueOf = parcel.readInt() == 0 ? null : g.valueOf(parcel.readString());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(WithTransferData.class, parcel, linkedHashSet, iE, 1);
                }
                return new WithTransferData(aVar, transferFlowType, gVarValueOf, linkedHashSet, (BankTransferData) parcel.readParcelable(WithTransferData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTransferData[i];
            }
        }

        public WithTransferData(f5j.a beneficiary, TransferFlowType flowType, g gVar, Set extraConfigurations, BankTransferData transferData) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.f102077a = beneficiary;
            this.f102078b = flowType;
            this.f102079c = gVar;
            this.d = extraConfigurations;
            this.e = transferData;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF102078b() {
            return this.f102078b;
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
            return Intrinsics.f(this.f102077a, withTransferData.f102077a) && Intrinsics.f(this.f102078b, withTransferData.f102078b) && this.f102079c == withTransferData.f102079c && Intrinsics.f(this.d, withTransferData.d) && Intrinsics.f(this.e, withTransferData.e);
        }

        public final int hashCode() {
            int iC = d.c(this.f102078b, this.f102077a.hashCode() * 31, 31);
            g gVar = this.f102079c;
            return this.e.hashCode() + p.a.f((iC + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.d);
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData
        /* JADX INFO: renamed from: s, reason: from getter */
        public final f5j.a getF102077a() {
            return this.f102077a;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData
        /* JADX INFO: renamed from: u0, reason: from getter */
        public final Set getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102077a);
            dest.writeParcelable(this.f102078b, i);
            g gVar = this.f102079c;
            if (gVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(gVar.name());
            }
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.e, i);
        }
    }

    /* JADX INFO: renamed from: K */
    TransferFlowType getF102078b();

    /* JADX INFO: renamed from: s */
    f5j.a getF102077a();

    /* JADX INFO: renamed from: u0 */
    Set getD();
}
