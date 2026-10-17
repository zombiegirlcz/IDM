package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation;
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
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankTransferInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankTransferInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f101950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f101951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankTransferInputReference f101952c;
    public final TransferMoneyPocket d;
    public final m1l.a e;
    public final TransferScheduleData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f101953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlowExtras f101954h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UltimateDebtor f101955j;
    public final g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RemittanceAccountSwitchingInformation f101956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f101957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f101958n;
    public final ScannedBillDetails o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransferAppSource f101959p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f5j.a aVar = (f5j.a) parcel.readSerializable();
            TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(BankTransferInputData.class.getClassLoader());
            BankTransferInputReference bankTransferInputReference = (BankTransferInputReference) parcel.readParcelable(BankTransferInputData.class.getClassLoader());
            TransferMoneyPocket transferMoneyPocket = (TransferMoneyPocket) parcel.readParcelable(BankTransferInputData.class.getClassLoader());
            m1l.a aVarValueOf = m1l.a.valueOf(parcel.readString());
            TransferScheduleData transferScheduleData = (TransferScheduleData) parcel.readParcelable(BankTransferInputData.class.getClassLoader());
            p pVar = (p) parcel.readSerializable();
            FlowExtras flowExtras = (FlowExtras) parcel.readParcelable(BankTransferInputData.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            UltimateDebtor ultimateDebtor = (UltimateDebtor) parcel.readParcelable(BankTransferInputData.class.getClassLoader());
            g gVarValueOf = parcel.readInt() == 0 ? null : g.valueOf(parcel.readString());
            RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformationCreateFromParcel = parcel.readInt() != 0 ? RemittanceAccountSwitchingInformation.CREATOR.createFromParcel(parcel) : null;
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            int iE = 0;
            while (iE != i2) {
                iE = d.e(BankTransferInputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new BankTransferInputData(aVar, transferFlowType, bankTransferInputReference, transferMoneyPocket, aVarValueOf, transferScheduleData, pVar, flowExtras, linkedHashMap, ultimateDebtor, gVarValueOf, remittanceAccountSwitchingInformationCreateFromParcel, linkedHashSet, parcel.readInt() != 0, (ScannedBillDetails) parcel.readParcelable(BankTransferInputData.class.getClassLoader()), (TransferAppSource) parcel.readParcelable(BankTransferInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankTransferInputData[i];
        }
    }

    public BankTransferInputData(f5j.a beneficiary, TransferFlowType flowType, BankTransferInputReference bankTransferInputReference, TransferMoneyPocket moneyPocket, m1l.a scheduleMode, TransferScheduleData scheduleData, p pVar, FlowExtras flowExtras, Map additionalInputs, UltimateDebtor ultimateDebtor, g gVar, RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation, Set extraConfigurations, boolean z, ScannedBillDetails scannedBillDetails, TransferAppSource transferAppSource) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(additionalInputs, "additionalInputs");
        Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        this.f101950a = beneficiary;
        this.f101951b = flowType;
        this.f101952c = bankTransferInputReference;
        this.d = moneyPocket;
        this.e = scheduleMode;
        this.f = scheduleData;
        this.f101953g = pVar;
        this.f101954h = flowExtras;
        this.i = additionalInputs;
        this.f101955j = ultimateDebtor;
        this.k = gVar;
        this.f101956l = remittanceAccountSwitchingInformation;
        this.f101957m = extraConfigurations;
        this.f101958n = z;
        this.o = scannedBillDetails;
        this.f101959p = transferAppSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankTransferInputData)) {
            return false;
        }
        BankTransferInputData bankTransferInputData = (BankTransferInputData) obj2;
        return Intrinsics.f(this.f101950a, bankTransferInputData.f101950a) && Intrinsics.f(this.f101951b, bankTransferInputData.f101951b) && Intrinsics.f(this.f101952c, bankTransferInputData.f101952c) && Intrinsics.f(this.d, bankTransferInputData.d) && this.e == bankTransferInputData.e && Intrinsics.f(this.f, bankTransferInputData.f) && Intrinsics.f(this.f101953g, bankTransferInputData.f101953g) && Intrinsics.f(this.f101954h, bankTransferInputData.f101954h) && Intrinsics.f(this.i, bankTransferInputData.i) && Intrinsics.f(this.f101955j, bankTransferInputData.f101955j) && this.k == bankTransferInputData.k && Intrinsics.f(this.f101956l, bankTransferInputData.f101956l) && Intrinsics.f(this.f101957m, bankTransferInputData.f101957m) && this.f101958n == bankTransferInputData.f101958n && Intrinsics.f(this.o, bankTransferInputData.o) && Intrinsics.f(this.f101959p, bankTransferInputData.f101959p);
    }

    public final int hashCode() {
        int iC = d.c(this.f101951b, this.f101950a.hashCode() * 31, 31);
        BankTransferInputReference bankTransferInputReference = this.f101952c;
        int iF = l.f(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((iC + (bankTransferInputReference == null ? 0 : bankTransferInputReference.hashCode())) * 31)) * 31)) * 31, 31);
        p pVar = this.f101953g;
        int iHashCode = (iF + (pVar == null ? 0 : pVar.hashCode())) * 31;
        FlowExtras flowExtras = this.f101954h;
        int iE = p.a.e((iHashCode + (flowExtras == null ? 0 : flowExtras.hashCode())) * 31, 31, this.i);
        UltimateDebtor ultimateDebtor = this.f101955j;
        int iHashCode2 = (iE + (ultimateDebtor == null ? 0 : ultimateDebtor.hashCode())) * 31;
        g gVar = this.k;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = this.f101956l;
        int iC2 = j6.a.c(p.a.f((iHashCode3 + (remittanceAccountSwitchingInformation == null ? 0 : remittanceAccountSwitchingInformation.hashCode())) * 31, 31, this.f101957m), 31, this.f101958n);
        ScannedBillDetails scannedBillDetails = this.o;
        return this.f101959p.hashCode() + ((iC2 + (scannedBillDetails != null ? scannedBillDetails.f92265a.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101950a);
        dest.writeParcelable(this.f101951b, i);
        dest.writeParcelable(this.f101952c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f101953g);
        dest.writeParcelable(this.f101954h, i);
        Iterator itZ = j6.a.z(this.i, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeParcelable(this.f101955j, i);
        g gVar = this.k;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = this.f101956l;
        if (remittanceAccountSwitchingInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            remittanceAccountSwitchingInformation.writeToParcel(dest, i);
        }
        Iterator itV = n.v(this.f101957m, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.f101958n ? 1 : 0);
        dest.writeParcelable(this.o, i);
        dest.writeParcelable(this.f101959p, i);
    }

    public BankTransferInputData(f5j.a aVar, TransferFlowType transferFlowType, BankTransferInputReference bankTransferInputReference, TransferMoneyPocket transferMoneyPocket, m1l.a aVar2, TransferScheduleData transferScheduleData, p pVar, FlowExtras flowExtras, Map map, UltimateDebtor ultimateDebtor, g gVar, Set set, boolean z, ScannedBillDetails scannedBillDetails, TransferAppSource.AIR_WIDGET air_widget, int i) {
        this(aVar, transferFlowType, bankTransferInputReference, transferMoneyPocket, aVar2, transferScheduleData, pVar, (i & 128) != 0 ? null : flowExtras, (i & 256) != 0 ? r0.g() : map, (i & 512) != 0 ? null : ultimateDebtor, (i & 1024) != 0 ? null : gVar, (RemittanceAccountSwitchingInformation) null, (i & 4096) != 0 ? h0.f322473a : set, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? null : scannedBillDetails, (i & 32768) != 0 ? TransferAppSource.BANK_TRANSFER.f92297a : air_widget);
    }
}
