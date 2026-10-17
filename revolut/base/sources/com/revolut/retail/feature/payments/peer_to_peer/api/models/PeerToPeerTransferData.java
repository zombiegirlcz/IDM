package com.revolut.retail.feature.payments.peer_to_peer.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerCustomization;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dj0.d;
import hrf.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.m3;
import org.jetbrains.annotations.NotNull;
import rtf.c;
import xi0.b;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/models/PeerToPeerTransferData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeerToPeerTransferData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PeerToPeerTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f102245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f102246c;
    public final b d;
    public final FundingSource e;
    public final AccountId f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PeerToPeerRecipient f102247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f102248h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PeerToPeerCustomization f102249j;
    public final m3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f102250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1l.a f102251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TransferScheduleData f102252n;
    public final TransferTrustData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransferQuoteUserIdentifier f102253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f102254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TransferAppSource f102255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f102256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f102257t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f102258w;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeerToPeerTransferData(parcel.readLong(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (FundingSource) parcel.readParcelable(PeerToPeerTransferData.class.getClassLoader()), (AccountId) parcel.readParcelable(PeerToPeerTransferData.class.getClassLoader()), PeerToPeerRecipient.CREATOR.createFromParcel(parcel), f.valueOf(parcel.readString()), parcel.readString(), (PeerToPeerCustomization) parcel.readParcelable(PeerToPeerTransferData.class.getClassLoader()), parcel.readInt() == 0 ? null : m3.valueOf(parcel.readString()), (c) parcel.readSerializable(), m1l.a.valueOf(parcel.readString()), (TransferScheduleData) parcel.readParcelable(PeerToPeerTransferData.class.getClassLoader()), (TransferTrustData) parcel.readParcelable(PeerToPeerTransferData.class.getClassLoader()), (TransferQuoteUserIdentifier) parcel.readParcelable(PeerToPeerTransferData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (TransferAppSource) parcel.readParcelable(PeerToPeerTransferData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeerToPeerTransferData[i];
        }
    }

    public PeerToPeerTransferData(long j2, b targetCurrency, b sourceCurrency, b baseCurrency, FundingSource fundingSource, AccountId accountId, PeerToPeerRecipient recipient, f direction, String note, PeerToPeerCustomization peerToPeerCustomization, m3 m3Var, c cVar, m1l.a scheduleMode, TransferScheduleData scheduleData, TransferTrustData trustData, TransferQuoteUserIdentifier userIdentifierCode, Integer num, TransferAppSource transferAppSource) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        Intrinsics.checkNotNullParameter(userIdentifierCode, "userIdentifierCode");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        this.f102244a = j2;
        this.f102245b = targetCurrency;
        this.f102246c = sourceCurrency;
        this.d = baseCurrency;
        this.e = fundingSource;
        this.f = accountId;
        this.f102247g = recipient;
        this.f102248h = direction;
        this.i = note;
        this.f102249j = peerToPeerCustomization;
        this.k = m3Var;
        this.f102250l = cVar;
        this.f102251m = scheduleMode;
        this.f102252n = scheduleData;
        this.o = trustData;
        this.f102253p = userIdentifierCode;
        this.f102254q = num;
        this.f102255r = transferAppSource;
        this.f102256s = new d(j2, targetCurrency);
        this.f102257t = !Intrinsics.f(sourceCurrency, targetCurrency);
        String str2 = null;
        if (peerToPeerCustomization instanceof PeerToPeerCustomization.Gif) {
            str = ((PeerToPeerCustomization.Gif) peerToPeerCustomization).f102242a;
        } else {
            if (!(peerToPeerCustomization instanceof PeerToPeerCustomization.Personalisation) && peerToPeerCustomization != null) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        this.u = str;
        if (peerToPeerCustomization instanceof PeerToPeerCustomization.Personalisation) {
            str2 = ((PeerToPeerCustomization.Personalisation) peerToPeerCustomization).f102243a.f79969a;
        } else if (!(peerToPeerCustomization instanceof PeerToPeerCustomization.Gif) && peerToPeerCustomization != null) {
            throw new NoWhenBranchMatchedException();
        }
        this.v = str2;
        int i = r8k.a.f252469a[direction.ordinal()];
        if (i == 1) {
            z = recipient.f102270a instanceof l;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        this.f102258w = z;
    }

    public static PeerToPeerTransferData a(PeerToPeerTransferData peerToPeerTransferData, long j2, b bVar, b bVar2, FundingSource fundingSource, AccountId accountId, String str, PeerToPeerCustomization peerToPeerCustomization, c cVar, TransferScheduleData transferScheduleData, TransferTrustData transferTrustData, Integer num, int i) {
        long j3 = (i & 1) != 0 ? peerToPeerTransferData.f102244a : j2;
        b targetCurrency = (i & 2) != 0 ? peerToPeerTransferData.f102245b : bVar;
        b sourceCurrency = (i & 4) != 0 ? peerToPeerTransferData.f102246c : bVar2;
        b baseCurrency = peerToPeerTransferData.d;
        FundingSource fundingSource2 = (i & 16) != 0 ? peerToPeerTransferData.e : fundingSource;
        AccountId accountId2 = (i & 32) != 0 ? peerToPeerTransferData.f : accountId;
        PeerToPeerRecipient recipient = peerToPeerTransferData.f102247g;
        f direction = peerToPeerTransferData.f102248h;
        String note = (i & 256) != 0 ? peerToPeerTransferData.i : str;
        PeerToPeerCustomization peerToPeerCustomization2 = (i & 512) != 0 ? peerToPeerTransferData.f102249j : peerToPeerCustomization;
        m3 m3Var = peerToPeerTransferData.k;
        c cVar2 = (i & 2048) != 0 ? peerToPeerTransferData.f102250l : cVar;
        m1l.a scheduleMode = peerToPeerTransferData.f102251m;
        TransferScheduleData scheduleData = (i & 8192) != 0 ? peerToPeerTransferData.f102252n : transferScheduleData;
        TransferTrustData trustData = (i & 16384) != 0 ? peerToPeerTransferData.o : transferTrustData;
        TransferQuoteUserIdentifier userIdentifierCode = peerToPeerTransferData.f102253p;
        long j5 = j3;
        Integer num2 = (i & 65536) != 0 ? peerToPeerTransferData.f102254q : num;
        TransferAppSource transferAppSource = peerToPeerTransferData.f102255r;
        peerToPeerTransferData.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        Intrinsics.checkNotNullParameter(userIdentifierCode, "userIdentifierCode");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        return new PeerToPeerTransferData(j5, targetCurrency, sourceCurrency, baseCurrency, fundingSource2, accountId2, recipient, direction, note, peerToPeerCustomization2, m3Var, cVar2, scheduleMode, scheduleData, trustData, userIdentifierCode, num2, transferAppSource);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PeerToPeerTransferData)) {
            return false;
        }
        PeerToPeerTransferData peerToPeerTransferData = (PeerToPeerTransferData) obj2;
        return this.f102244a == peerToPeerTransferData.f102244a && Intrinsics.f(this.f102245b, peerToPeerTransferData.f102245b) && Intrinsics.f(this.f102246c, peerToPeerTransferData.f102246c) && Intrinsics.f(this.d, peerToPeerTransferData.d) && Intrinsics.f(this.e, peerToPeerTransferData.e) && Intrinsics.f(this.f, peerToPeerTransferData.f) && Intrinsics.f(this.f102247g, peerToPeerTransferData.f102247g) && this.f102248h == peerToPeerTransferData.f102248h && Intrinsics.f(this.i, peerToPeerTransferData.i) && Intrinsics.f(this.f102249j, peerToPeerTransferData.f102249j) && this.k == peerToPeerTransferData.k && Intrinsics.f(this.f102250l, peerToPeerTransferData.f102250l) && this.f102251m == peerToPeerTransferData.f102251m && Intrinsics.f(this.f102252n, peerToPeerTransferData.f102252n) && Intrinsics.f(this.o, peerToPeerTransferData.o) && Intrinsics.f(this.f102253p, peerToPeerTransferData.f102253p) && Intrinsics.f(this.f102254q, peerToPeerTransferData.f102254q) && Intrinsics.f(this.f102255r, peerToPeerTransferData.f102255r);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f102248h.hashCode() + ((this.f102247g.hashCode() + h30.l.b(this.f, (this.e.hashCode() + h30.l.j(this.d, h30.l.j(this.f102246c, h30.l.j(this.f102245b, Long.hashCode(this.f102244a) * 31, 31), 31), 31)) * 31, 31)) * 31)) * 31, 31, this.i);
        PeerToPeerCustomization peerToPeerCustomization = this.f102249j;
        int iHashCode = (iC + (peerToPeerCustomization == null ? 0 : peerToPeerCustomization.hashCode())) * 31;
        m3 m3Var = this.k;
        int iHashCode2 = (iHashCode + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        c cVar = this.f102250l;
        int iHashCode3 = (this.f102253p.hashCode() + ((this.o.hashCode() + h30.l.f(this.f102252n, (this.f102251m.hashCode() + ((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31)) * 31)) * 31;
        Integer num = this.f102254q;
        return this.f102255r.hashCode() + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f102244a);
        dest.writeSerializable(this.f102245b);
        dest.writeSerializable(this.f102246c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        this.f102247g.writeToParcel(dest, i);
        dest.writeString(this.f102248h.name());
        dest.writeString(this.i);
        dest.writeParcelable(this.f102249j, i);
        m3 m3Var = this.k;
        if (m3Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(m3Var.name());
        }
        dest.writeSerializable(this.f102250l);
        dest.writeString(this.f102251m.name());
        dest.writeParcelable(this.f102252n, i);
        dest.writeParcelable(this.o, i);
        dest.writeParcelable(this.f102253p, i);
        Integer num = this.f102254q;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f102255r, i);
    }
}
