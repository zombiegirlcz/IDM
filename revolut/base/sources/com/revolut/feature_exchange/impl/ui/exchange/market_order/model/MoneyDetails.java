package com.revolut.feature_exchange.impl.ui.exchange.market_order.model;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r1i.e;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/market_order/model/MoneyDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "r1i/e", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoneyDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f96897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f96898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f96899c;
    public final e d;
    public final boolean e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyDetails((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() != 0 ? e.valueOf(parcel.readString()) : null, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyDetails[i];
        }
    }

    public MoneyDetails(b currency, Long l2, long j2, e eVar, boolean z, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f96897a = currency;
        this.f96898b = l2;
        this.f96899c = j2;
        this.d = eVar;
        this.e = z;
        this.f = str;
    }

    public static MoneyDetails a(MoneyDetails moneyDetails, b currency, Long l2, e eVar) {
        long j2 = moneyDetails.f96899c;
        boolean z = moneyDetails.e;
        String str = moneyDetails.f;
        moneyDetails.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new MoneyDetails(currency, l2, j2, eVar, z, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyDetails)) {
            return false;
        }
        MoneyDetails moneyDetails = (MoneyDetails) obj2;
        return Intrinsics.f(this.f96897a, moneyDetails.f96897a) && Intrinsics.f(this.f96898b, moneyDetails.f96898b) && this.f96899c == moneyDetails.f96899c && this.d == moneyDetails.d && this.e == moneyDetails.e && Intrinsics.f(this.f, moneyDetails.f);
    }

    public final int hashCode() {
        int iHashCode = this.f96897a.hashCode() * 31;
        Long l2 = this.f96898b;
        int iC = d.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f96899c);
        e eVar = this.d;
        int iC2 = j6.a.c((iC + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iC2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96897a);
        Long l2 = this.f96898b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeLong(this.f96899c);
        e eVar = this.d;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
    }

    public /* synthetic */ MoneyDetails(b bVar, Long l2, boolean z, String str, int i) {
        this(bVar, (i & 2) != 0 ? null : l2, 0L, null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str);
    }
}
