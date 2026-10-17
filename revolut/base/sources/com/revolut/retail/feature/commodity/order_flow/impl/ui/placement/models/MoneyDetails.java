package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import i7j.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/models/MoneyDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "i7j/g", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoneyDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f99904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f99905c;
    public final g d;
    public final boolean e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyDetails((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() != 0 ? g.valueOf(parcel.readString()) : null, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyDetails[i];
        }
    }

    public MoneyDetails(b currency, Long l2, long j2, g gVar, boolean z, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f99903a = currency;
        this.f99904b = l2;
        this.f99905c = j2;
        this.d = gVar;
        this.e = z;
        this.f = str;
    }

    public static MoneyDetails a(MoneyDetails moneyDetails, b currency, Long l2, g gVar) {
        long j2 = moneyDetails.f99905c;
        boolean z = moneyDetails.e;
        String str = moneyDetails.f;
        moneyDetails.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new MoneyDetails(currency, l2, j2, gVar, z, str);
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
        return Intrinsics.f(this.f99903a, moneyDetails.f99903a) && Intrinsics.f(this.f99904b, moneyDetails.f99904b) && this.f99905c == moneyDetails.f99905c && this.d == moneyDetails.d && this.e == moneyDetails.e && Intrinsics.f(this.f, moneyDetails.f);
    }

    public final int hashCode() {
        int iHashCode = this.f99903a.hashCode() * 31;
        Long l2 = this.f99904b;
        int iC = d.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f99905c);
        g gVar = this.d;
        int iC2 = j6.a.c((iC + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iC2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99903a);
        Long l2 = this.f99904b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeLong(this.f99905c);
        g gVar = this.d;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
    }

    public /* synthetic */ MoneyDetails(String str, b bVar) {
        this(bVar, null, 0L, null, false, str);
    }
}
