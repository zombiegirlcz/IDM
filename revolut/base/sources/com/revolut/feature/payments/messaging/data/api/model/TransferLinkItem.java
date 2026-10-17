package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.CountryProfile;
import dv9.n;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.a3;
import tof.v6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/TransferLinkItem;", "Lcom/revolut/feature/payments/messaging/data/api/model/P2PChatItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferLinkItem implements P2PChatItem {

    @NotNull
    public static final Parcelable.Creator<TransferLinkItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f79579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f79580c;
    public final dj0.d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a3 f79581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f79582h;
    public final CountryProfile i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f79583j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferLinkItem(parcel.readString(), (DateTime) parcel.readSerializable(), n.valueOf(parcel.readString()), (dj0.d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (a3) parcel.readSerializable(), parcel.readString(), (CountryProfile) parcel.readParcelable(TransferLinkItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferLinkItem[i];
        }
    }

    public TransferLinkItem(String id10, DateTime date, n direction, dj0.d amount, String str, String str2, a3 a3Var, String transferLinkId, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        this.f79578a = id10;
        this.f79579b = date;
        this.f79580c = direction;
        this.d = amount;
        this.e = str;
        this.f = str2;
        this.f79581g = a3Var;
        this.f79582h = transferLinkId;
        this.i = countryProfile;
        this.f79583j = (a3Var != null ? a3Var.f : null) == v6.CANCELLED;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferLinkItem)) {
            return false;
        }
        TransferLinkItem transferLinkItem = (TransferLinkItem) obj2;
        return Intrinsics.f(this.f79578a, transferLinkItem.f79578a) && Intrinsics.f(this.f79579b, transferLinkItem.f79579b) && this.f79580c == transferLinkItem.f79580c && Intrinsics.f(this.d, transferLinkItem.d) && Intrinsics.f(this.e, transferLinkItem.e) && Intrinsics.f(this.f, transferLinkItem.f) && Intrinsics.f(this.f79581g, transferLinkItem.f79581g) && Intrinsics.f(this.f79582h, transferLinkItem.f79582h) && Intrinsics.f(this.i, transferLinkItem.i);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getDate, reason: from getter */
    public final DateTime getF79562b() {
        return this.f79579b;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF79561a() {
        return this.f79578a;
    }

    public final int hashCode() {
        int iC = v7.c((this.f79580c.hashCode() + m72.b.f(this.f79579b, this.f79578a.hashCode() * 31, 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a3 a3Var = this.f79581g;
        int iC2 = p.a.c((iHashCode2 + (a3Var == null ? 0 : a3Var.hashCode())) * 31, 31, this.f79582h);
        CountryProfile countryProfile = this.i;
        return iC2 + (countryProfile != null ? countryProfile.hashCode() : 0);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getF79563c() {
        return this.f79580c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79578a);
        dest.writeSerializable(this.f79579b);
        dest.writeString(this.f79580c.name());
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeSerializable(this.f79581g);
        dest.writeString(this.f79582h);
        dest.writeParcelable(this.i, i);
    }
}
