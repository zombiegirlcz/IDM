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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/DonationItem;", "Lcom/revolut/feature/payments/messaging/data/api/model/P2PChatItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DonationItem implements P2PChatItem {

    @NotNull
    public static final Parcelable.Creator<DonationItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f79518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f79519c;
    public final a3 d;
    public final CountryProfile e;
    public final n f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DonationItem(parcel.readString(), (DateTime) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (a3) parcel.readSerializable(), (CountryProfile) parcel.readParcelable(DonationItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonationItem[i];
        }
    }

    public DonationItem(String id10, DateTime date, dj0.d amount, a3 transaction, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f79517a = id10;
        this.f79518b = date;
        this.f79519c = amount;
        this.d = transaction;
        this.e = countryProfile;
        this.f = n.OUTGOING;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DonationItem)) {
            return false;
        }
        DonationItem donationItem = (DonationItem) obj2;
        return Intrinsics.f(this.f79517a, donationItem.f79517a) && Intrinsics.f(this.f79518b, donationItem.f79518b) && Intrinsics.f(this.f79519c, donationItem.f79519c) && Intrinsics.f(this.d, donationItem.d) && Intrinsics.f(this.e, donationItem.e);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getDate, reason: from getter */
    public final DateTime getF79562b() {
        return this.f79518b;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF79561a() {
        return this.f79517a;
    }

    public final int hashCode() {
        int iF = y.f(this.d, v7.c(m72.b.f(this.f79518b, this.f79517a.hashCode() * 31, 31), 31, this.f79519c), 31);
        CountryProfile countryProfile = this.e;
        return iF + (countryProfile == null ? 0 : countryProfile.hashCode());
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getF79563c() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79517a);
        dest.writeSerializable(this.f79518b);
        dest.writeSerializable(this.f79519c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
    }
}
