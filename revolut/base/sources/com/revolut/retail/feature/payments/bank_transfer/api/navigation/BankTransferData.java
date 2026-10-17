package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dj0.d;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq2.g;
import kq2.o;
import org.jetbrains.annotations.NotNull;
import qua.p;
import rtf.c;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankTransferData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BankTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f101925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f101926c;
    public final FundingSource d;
    public final AccountId e;
    public final TransferNote f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f101927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m1l.a f101928h;
    public final TransferScheduleData i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f101929j;
    public final kq2.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f101930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f101931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f101932n;
    public final UltimateDebtor o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f101933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RemittanceAccountSwitchingInformation f101934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RemittanceRouteId f101935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f101936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ScannedBillDetails f101937t;
    public final d u;
    public final boolean v;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j2 = parcel.readLong();
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            xi0.b bVar2 = (xi0.b) parcel.readSerializable();
            FundingSource fundingSource = (FundingSource) parcel.readParcelable(BankTransferData.class.getClassLoader());
            AccountId accountId = (AccountId) parcel.readParcelable(BankTransferData.class.getClassLoader());
            TransferNote transferNote = (TransferNote) parcel.readParcelable(BankTransferData.class.getClassLoader());
            c cVar = (c) parcel.readSerializable();
            m1l.a aVarValueOf = m1l.a.valueOf(parcel.readString());
            TransferScheduleData transferScheduleData = (TransferScheduleData) parcel.readParcelable(BankTransferData.class.getClassLoader());
            p pVar = (p) parcel.readSerializable();
            kq2.c cVarValueOf = parcel.readInt() == 0 ? null : kq2.c.valueOf(parcel.readString());
            o oVarValueOf = parcel.readInt() == 0 ? null : o.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            kq2.c cVar2 = cVarValueOf;
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (true) {
                linkedHashMap = linkedHashMap2;
                if (iA == i2) {
                    break;
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RemittanceReferenceOption.CREATOR, parcel, arrayList, iA, 1);
                linkedHashMap2 = linkedHashMap;
            }
            return new BankTransferData(j2, bVar, bVar2, fundingSource, accountId, transferNote, cVar, aVarValueOf, transferScheduleData, pVar, cVar2, oVarValueOf, linkedHashMap, arrayList, (UltimateDebtor) parcel.readParcelable(BankTransferData.class.getClassLoader()), parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RemittanceAccountSwitchingInformation.CREATOR.createFromParcel(parcel), (RemittanceRouteId) parcel.readParcelable(BankTransferData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ScannedBillDetails) parcel.readParcelable(BankTransferData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankTransferData[i];
        }
    }

    public BankTransferData(long j2, xi0.b targetCurrency, xi0.b sourceCurrency, FundingSource fundingSource, AccountId accountId, TransferNote note, c cVar, m1l.a scheduleMode, TransferScheduleData scheduleData, p pVar, kq2.c cVar2, o oVar, Map additionalInputs, List referenceOptions, UltimateDebtor ultimateDebtor, g gVar, RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation, RemittanceRouteId remittanceRouteId, Integer num, ScannedBillDetails scannedBillDetails) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(additionalInputs, "additionalInputs");
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        this.f101924a = j2;
        this.f101925b = targetCurrency;
        this.f101926c = sourceCurrency;
        this.d = fundingSource;
        this.e = accountId;
        this.f = note;
        this.f101927g = cVar;
        this.f101928h = scheduleMode;
        this.i = scheduleData;
        this.f101929j = pVar;
        this.k = cVar2;
        this.f101930l = oVar;
        this.f101931m = additionalInputs;
        this.f101932n = referenceOptions;
        this.o = ultimateDebtor;
        this.f101933p = gVar;
        this.f101934q = remittanceAccountSwitchingInformation;
        this.f101935r = remittanceRouteId;
        this.f101936s = num;
        this.f101937t = scannedBillDetails;
        this.u = new d(j2, targetCurrency);
        this.v = !Intrinsics.f(sourceCurrency, targetCurrency);
    }

    public static BankTransferData a(BankTransferData bankTransferData, long j2, xi0.b bVar, FundingSource fundingSource, AccountId accountId, TransferNote transferNote, c cVar, TransferScheduleData transferScheduleData, kq2.c cVar2, o oVar, Map map, List list, RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation, Integer num, int i) {
        long j3 = (i & 1) != 0 ? bankTransferData.f101924a : j2;
        xi0.b targetCurrency = bankTransferData.f101925b;
        xi0.b sourceCurrency = (i & 4) != 0 ? bankTransferData.f101926c : bVar;
        FundingSource fundingSource2 = (i & 8) != 0 ? bankTransferData.d : fundingSource;
        AccountId accountId2 = (i & 16) != 0 ? bankTransferData.e : accountId;
        TransferNote note = (i & 32) != 0 ? bankTransferData.f : transferNote;
        c cVar3 = (i & 64) != 0 ? bankTransferData.f101927g : cVar;
        m1l.a scheduleMode = bankTransferData.f101928h;
        TransferScheduleData scheduleData = (i & 256) != 0 ? bankTransferData.i : transferScheduleData;
        p pVar = bankTransferData.f101929j;
        kq2.c cVar4 = (i & 1024) != 0 ? bankTransferData.k : cVar2;
        o oVar2 = (i & 2048) != 0 ? bankTransferData.f101930l : oVar;
        Map additionalInputs = (i & 4096) != 0 ? bankTransferData.f101931m : map;
        List referenceOptions = (i & 8192) != 0 ? bankTransferData.f101932n : list;
        UltimateDebtor ultimateDebtor = bankTransferData.o;
        g gVar = bankTransferData.f101933p;
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation2 = (i & 65536) != 0 ? bankTransferData.f101934q : remittanceAccountSwitchingInformation;
        RemittanceRouteId remittanceRouteId = bankTransferData.f101935r;
        Integer num2 = (i & 262144) != 0 ? bankTransferData.f101936s : num;
        ScannedBillDetails scannedBillDetails = (i & 524288) != 0 ? bankTransferData.f101937t : null;
        bankTransferData.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(additionalInputs, "additionalInputs");
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        return new BankTransferData(j3, targetCurrency, sourceCurrency, fundingSource2, accountId2, note, cVar3, scheduleMode, scheduleData, pVar, cVar4, oVar2, additionalInputs, referenceOptions, ultimateDebtor, gVar, remittanceAccountSwitchingInformation2, remittanceRouteId, num2, scannedBillDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankTransferData)) {
            return false;
        }
        BankTransferData bankTransferData = (BankTransferData) obj2;
        return this.f101924a == bankTransferData.f101924a && Intrinsics.f(this.f101925b, bankTransferData.f101925b) && Intrinsics.f(this.f101926c, bankTransferData.f101926c) && Intrinsics.f(this.d, bankTransferData.d) && Intrinsics.f(this.e, bankTransferData.e) && Intrinsics.f(this.f, bankTransferData.f) && Intrinsics.f(this.f101927g, bankTransferData.f101927g) && this.f101928h == bankTransferData.f101928h && Intrinsics.f(this.i, bankTransferData.i) && Intrinsics.f(this.f101929j, bankTransferData.f101929j) && this.k == bankTransferData.k && this.f101930l == bankTransferData.f101930l && Intrinsics.f(this.f101931m, bankTransferData.f101931m) && Intrinsics.f(this.f101932n, bankTransferData.f101932n) && Intrinsics.f(this.o, bankTransferData.o) && this.f101933p == bankTransferData.f101933p && Intrinsics.f(this.f101934q, bankTransferData.f101934q) && Intrinsics.f(this.f101935r, bankTransferData.f101935r) && Intrinsics.f(this.f101936s, bankTransferData.f101936s) && Intrinsics.f(this.f101937t, bankTransferData.f101937t);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + l.b(this.e, (this.d.hashCode() + l.j(this.f101926c, l.j(this.f101925b, Long.hashCode(this.f101924a) * 31, 31), 31)) * 31, 31)) * 31;
        c cVar = this.f101927g;
        int iF = l.f(this.i, (this.f101928h.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31);
        p pVar = this.f101929j;
        int iHashCode2 = (iF + (pVar == null ? 0 : pVar.hashCode())) * 31;
        kq2.c cVar2 = this.k;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        o oVar = this.f101930l;
        int iD = p.a.d(p.a.e((iHashCode3 + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.f101931m), 31, this.f101932n);
        UltimateDebtor ultimateDebtor = this.o;
        int iHashCode4 = (iD + (ultimateDebtor == null ? 0 : ultimateDebtor.hashCode())) * 31;
        g gVar = this.f101933p;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = this.f101934q;
        int iHashCode6 = (iHashCode5 + (remittanceAccountSwitchingInformation == null ? 0 : remittanceAccountSwitchingInformation.hashCode())) * 31;
        RemittanceRouteId remittanceRouteId = this.f101935r;
        int iHashCode7 = (iHashCode6 + (remittanceRouteId == null ? 0 : remittanceRouteId.hashCode())) * 31;
        Integer num = this.f101936s;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        ScannedBillDetails scannedBillDetails = this.f101937t;
        return iHashCode8 + (scannedBillDetails != null ? scannedBillDetails.f92265a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f101924a);
        dest.writeSerializable(this.f101925b);
        dest.writeSerializable(this.f101926c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f101927g);
        dest.writeString(this.f101928h.name());
        dest.writeParcelable(this.i, i);
        dest.writeSerializable(this.f101929j);
        kq2.c cVar = this.k;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        o oVar = this.f101930l;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
        Iterator itZ = j6.a.z(this.f101931m, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        Iterator itV = p.a.v(this.f101932n, dest);
        while (itV.hasNext()) {
            ((RemittanceReferenceOption) itV.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.o, i);
        g gVar = this.f101933p;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = this.f101934q;
        if (remittanceAccountSwitchingInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            remittanceAccountSwitchingInformation.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f101935r, i);
        Integer num = this.f101936s;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f101937t, i);
    }

    public BankTransferData(long j2, xi0.b bVar, xi0.b bVar2, FundingSource fundingSource, AccountId accountId, TransferNote transferNote, c cVar, m1l.a aVar, TransferScheduleData transferScheduleData, p pVar, kq2.c cVar2, o oVar, Map map, UltimateDebtor ultimateDebtor, g gVar, RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation, RemittanceRouteId remittanceRouteId, ScannedBillDetails scannedBillDetails, int i) {
        this(j2, bVar, bVar2, fundingSource, accountId, transferNote, cVar, aVar, transferScheduleData, pVar, cVar2, (i & 2048) != 0 ? null : oVar, (i & 4096) != 0 ? r0.g() : map, f0.f322471a, (i & 16384) != 0 ? null : ultimateDebtor, (32768 & i) != 0 ? null : gVar, (65536 & i) != 0 ? null : remittanceAccountSwitchingInformation, (131072 & i) != 0 ? null : remittanceRouteId, null, (i & 524288) != 0 ? null : scannedBillDetails);
    }
}
