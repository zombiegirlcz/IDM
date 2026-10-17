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
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/TransactionItem;", "Lcom/revolut/feature/payments/messaging/data/api/model/P2PChatItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionItem implements P2PChatItem {

    @NotNull
    public static final Parcelable.Creator<TransactionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f79574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f79575c;
    public final dj0.d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a3 f79576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CountryProfile f79577h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionItem(parcel.readString(), (DateTime) parcel.readSerializable(), n.valueOf(parcel.readString()), (dj0.d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (a3) parcel.readSerializable(), (CountryProfile) parcel.readParcelable(TransactionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionItem[i];
        }
    }

    public TransactionItem(String id10, DateTime date, n direction, dj0.d amount, String str, String str2, a3 transaction, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f79573a = id10;
        this.f79574b = date;
        this.f79575c = direction;
        this.d = amount;
        this.e = str;
        this.f = str2;
        this.f79576g = transaction;
        this.f79577h = countryProfile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionItem)) {
            return false;
        }
        TransactionItem transactionItem = (TransactionItem) obj2;
        return Intrinsics.f(this.f79573a, transactionItem.f79573a) && Intrinsics.f(this.f79574b, transactionItem.f79574b) && this.f79575c == transactionItem.f79575c && Intrinsics.f(this.d, transactionItem.d) && Intrinsics.f(this.e, transactionItem.e) && Intrinsics.f(this.f, transactionItem.f) && Intrinsics.f(this.f79576g, transactionItem.f79576g) && Intrinsics.f(this.f79577h, transactionItem.f79577h);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getDate, reason: from getter */
    public final DateTime getF79562b() {
        return this.f79574b;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF79561a() {
        return this.f79573a;
    }

    public final int hashCode() {
        int iC = v7.c((this.f79575c.hashCode() + m72.b.f(this.f79574b, this.f79573a.hashCode() * 31, 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iF = y.f(this.f79576g, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        CountryProfile countryProfile = this.f79577h;
        return iF + (countryProfile != null ? countryProfile.hashCode() : 0);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getF79563c() {
        return this.f79575c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79573a);
        dest.writeSerializable(this.f79574b);
        dest.writeString(this.f79575c.name());
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeSerializable(this.f79576g);
        dest.writeParcelable(this.f79577h, i);
    }
}
