package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoWithdrawFeesBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawFeesBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawFeesBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f71091c;
    public final d d;
    public final d e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            d dVar5 = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CryptoWithdrawFeesBreakdown.class, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            return new CryptoWithdrawFeesBreakdown(dVar, dVar2, dVar3, dVar4, dVar5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawFeesBreakdown[i];
        }
    }

    public CryptoWithdrawFeesBreakdown(d dVar, d dVar2, d dVar3, d dVar4, d total, List list) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.f71089a = dVar;
        this.f71090b = dVar2;
        this.f71091c = dVar3;
        this.d = dVar4;
        this.e = total;
        this.f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawFeesBreakdown)) {
            return false;
        }
        CryptoWithdrawFeesBreakdown cryptoWithdrawFeesBreakdown = (CryptoWithdrawFeesBreakdown) obj2;
        return Intrinsics.f(this.f71089a, cryptoWithdrawFeesBreakdown.f71089a) && Intrinsics.f(this.f71090b, cryptoWithdrawFeesBreakdown.f71090b) && Intrinsics.f(this.f71091c, cryptoWithdrawFeesBreakdown.f71091c) && Intrinsics.f(this.d, cryptoWithdrawFeesBreakdown.d) && Intrinsics.f(this.e, cryptoWithdrawFeesBreakdown.e) && Intrinsics.f(this.f, cryptoWithdrawFeesBreakdown.f);
    }

    public final int hashCode() {
        d dVar = this.f71089a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f71090b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.f71091c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.d;
        int iC = v7.c((iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31, 31, this.e);
        List list = this.f;
        return iC + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71089a);
        dest.writeSerializable(this.f71090b);
        dest.writeSerializable(this.f71091c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
