package com.revolut.feature.push_to_card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rtf.c;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushToCardTransferData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PushToCardTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f81529c;
    public final b d;
    public final FundingSource e;
    public final AccountId f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f81530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f81531h;
    public final TransferAppSource i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f81532j;
    public final boolean k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PushToCardTransferData(parcel.readString(), parcel.readLong(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (FundingSource) parcel.readParcelable(PushToCardTransferData.class.getClassLoader()), (AccountId) parcel.readParcelable(PushToCardTransferData.class.getClassLoader()), parcel.readString(), (c) parcel.readSerializable(), (TransferAppSource) parcel.readParcelable(PushToCardTransferData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushToCardTransferData[i];
        }
    }

    public PushToCardTransferData(String recipientId, long j2, b targetCurrency, b sourceCurrency, FundingSource fundingSource, AccountId accountId, String note, c cVar, TransferAppSource transferAppSource) {
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        this.f81527a = recipientId;
        this.f81528b = j2;
        this.f81529c = targetCurrency;
        this.d = sourceCurrency;
        this.e = fundingSource;
        this.f = accountId;
        this.f81530g = note;
        this.f81531h = cVar;
        this.i = transferAppSource;
        this.f81532j = new d(j2, targetCurrency);
        this.k = !Intrinsics.f(sourceCurrency, targetCurrency);
    }

    public static PushToCardTransferData a(PushToCardTransferData pushToCardTransferData, long j2, b bVar, b bVar2, FundingSource fundingSource, AccountId accountId, String str, c cVar, int i) {
        String recipientId = pushToCardTransferData.f81527a;
        if ((i & 2) != 0) {
            j2 = pushToCardTransferData.f81528b;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            bVar = pushToCardTransferData.f81529c;
        }
        b targetCurrency = bVar;
        b sourceCurrency = (i & 8) != 0 ? pushToCardTransferData.d : bVar2;
        FundingSource fundingSource2 = (i & 16) != 0 ? pushToCardTransferData.e : fundingSource;
        AccountId accountId2 = (i & 32) != 0 ? pushToCardTransferData.f : accountId;
        String note = (i & 64) != 0 ? pushToCardTransferData.f81530g : str;
        c cVar2 = (i & 128) != 0 ? pushToCardTransferData.f81531h : cVar;
        TransferAppSource transferAppSource = pushToCardTransferData.i;
        pushToCardTransferData.getClass();
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        return new PushToCardTransferData(recipientId, j3, targetCurrency, sourceCurrency, fundingSource2, accountId2, note, cVar2, transferAppSource);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PushToCardTransferData)) {
            return false;
        }
        PushToCardTransferData pushToCardTransferData = (PushToCardTransferData) obj2;
        return Intrinsics.f(this.f81527a, pushToCardTransferData.f81527a) && this.f81528b == pushToCardTransferData.f81528b && Intrinsics.f(this.f81529c, pushToCardTransferData.f81529c) && Intrinsics.f(this.d, pushToCardTransferData.d) && Intrinsics.f(this.e, pushToCardTransferData.e) && Intrinsics.f(this.f, pushToCardTransferData.f) && Intrinsics.f(this.f81530g, pushToCardTransferData.f81530g) && Intrinsics.f(this.f81531h, pushToCardTransferData.f81531h) && Intrinsics.f(this.i, pushToCardTransferData.i);
    }

    public final int hashCode() {
        int iC = p.a.c(l.b(this.f, (this.e.hashCode() + l.j(this.d, l.j(this.f81529c, a0.d.c(this.f81527a.hashCode() * 31, 31, this.f81528b), 31), 31)) * 31, 31), 31, this.f81530g);
        c cVar = this.f81531h;
        return this.i.hashCode() + ((iC + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81527a);
        dest.writeLong(this.f81528b);
        dest.writeSerializable(this.f81529c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f81530g);
        dest.writeSerializable(this.f81531h);
        dest.writeParcelable(this.i, i);
    }

    public /* synthetic */ PushToCardTransferData(String str, long j2, b bVar, b bVar2, FundingSource fundingSource, AccountId accountId, String str2, c cVar) {
        this(str, j2, bVar, bVar2, fundingSource, accountId, str2, cVar, TransferAppSource.DEFAULT.f92298a);
    }
}
