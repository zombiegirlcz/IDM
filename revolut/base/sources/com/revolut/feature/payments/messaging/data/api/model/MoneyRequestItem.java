package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer.core.models.CountryProfile;
import dv9.n;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MoneyRequestItem;", "Lcom/revolut/feature/payments/messaging/data/api/model/P2PChatItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequestItem implements P2PChatItem {

    @NotNull
    public static final Parcelable.Creator<MoneyRequestItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f79562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f79563c;
    public final dj0.d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MoneyRequest f79564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f79565h;
    public final CountryProfile i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f79566j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyRequestItem(parcel.readString(), (DateTime) parcel.readSerializable(), n.valueOf(parcel.readString()), (dj0.d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (MoneyRequest) parcel.readParcelable(MoneyRequestItem.class.getClassLoader()), parcel.readString(), (CountryProfile) parcel.readParcelable(MoneyRequestItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequestItem[i];
        }
    }

    public MoneyRequestItem(String id10, DateTime date, n direction, dj0.d amount, String str, String str2, MoneyRequest moneyRequest, String str3, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f79561a = id10;
        this.f79562b = date;
        this.f79563c = direction;
        this.d = amount;
        this.e = str;
        this.f = str2;
        this.f79564g = moneyRequest;
        this.f79565h = str3;
        this.i = countryProfile;
        this.f79566j = com.revolut.domain.models.moneyrequest.b.f(moneyRequest);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequestItem)) {
            return false;
        }
        MoneyRequestItem moneyRequestItem = (MoneyRequestItem) obj2;
        return Intrinsics.f(this.f79561a, moneyRequestItem.f79561a) && Intrinsics.f(this.f79562b, moneyRequestItem.f79562b) && this.f79563c == moneyRequestItem.f79563c && Intrinsics.f(this.d, moneyRequestItem.d) && Intrinsics.f(this.e, moneyRequestItem.e) && Intrinsics.f(this.f, moneyRequestItem.f) && Intrinsics.f(this.f79564g, moneyRequestItem.f79564g) && Intrinsics.f(this.f79565h, moneyRequestItem.f79565h) && Intrinsics.f(this.i, moneyRequestItem.i);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getDate, reason: from getter */
    public final DateTime getF79571b() {
        return this.f79562b;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF79578a() {
        return this.f79561a;
    }

    public final int hashCode() {
        int iC = v7.c((this.f79563c.hashCode() + m72.b.f(this.f79562b, this.f79561a.hashCode() * 31, 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (this.f79564g.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f79565h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CountryProfile countryProfile = this.i;
        return iHashCode3 + (countryProfile != null ? countryProfile.hashCode() : 0);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getF79572c() {
        return this.f79563c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79561a);
        dest.writeSerializable(this.f79562b);
        dest.writeString(this.f79563c.name());
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeParcelable(this.f79564g, i);
        dest.writeString(this.f79565h);
        dest.writeParcelable(this.i, i);
    }
}
