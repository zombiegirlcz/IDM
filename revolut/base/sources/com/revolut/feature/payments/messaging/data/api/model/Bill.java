package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.messaging.data.api.model.GroupMessageAuthor;
import com.revolut.feature.transfer.core.models.CountryProfile;
import dv9.n;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.i;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/Bill;", "Lcom/revolut/feature/payments/messaging/data/api/model/GroupChatItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Bill implements GroupChatItem {

    @NotNull
    public static final Parcelable.Creator<Bill> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f79513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f79514c;
    public final boolean d;
    public final boolean e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f79515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f79516h;
    public final CountryProfile i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            n nVarValueOf = n.valueOf(parcel.readString());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new Bill(string, dateTime, nVarValueOf, z3, parcel.readInt() == 0 ? z : true, (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (i) parcel.readSerializable(), (CountryProfile) parcel.readParcelable(Bill.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Bill[i];
        }
    }

    public Bill(String id10, DateTime date, n direction, boolean z, boolean z3, dj0.d amountOwed, dj0.d amountOwe, i bill, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amountOwed, "amountOwed");
        Intrinsics.checkNotNullParameter(amountOwe, "amountOwe");
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f79512a = id10;
        this.f79513b = date;
        this.f79514c = direction;
        this.d = z;
        this.e = z3;
        this.f = amountOwed;
        this.f79515g = amountOwe;
        this.f79516h = bill;
        this.i = countryProfile;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.GroupChatItem
    public final GroupMessageAuthor a0() {
        return this.f79514c == n.OUTGOING ? GroupMessageAuthor.CurrentUser.f79520a : new GroupMessageAuthor.Person(oi0.d.k(this.f79516h.c()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Bill)) {
            return false;
        }
        Bill bill = (Bill) obj2;
        return Intrinsics.f(this.f79512a, bill.f79512a) && Intrinsics.f(this.f79513b, bill.f79513b) && this.f79514c == bill.f79514c && this.d == bill.d && this.e == bill.e && Intrinsics.f(this.f, bill.f) && Intrinsics.f(this.f79515g, bill.f79515g) && Intrinsics.f(this.f79516h, bill.f79516h) && Intrinsics.f(this.i, bill.i);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getDate, reason: from getter */
    public final DateTime getF79562b() {
        return this.f79513b;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.GroupChatItem
    public final String h9() {
        if (this.f79514c == n.OUTGOING) {
            return null;
        }
        return oi0.d.p(this.f79516h.c());
    }

    public final int hashCode() {
        int iHashCode = (this.f79516h.hashCode() + v7.c(v7.c(j6.a.c(j6.a.c((this.f79514c.hashCode() + m72.b.f(this.f79513b, this.f79512a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f79515g)) * 31;
        CountryProfile countryProfile = this.i;
        return iHashCode + (countryProfile == null ? 0 : countryProfile.hashCode());
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getF79563c() {
        return this.f79514c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79512a);
        dest.writeSerializable(this.f79513b);
        dest.writeString(this.f79514c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f79515g);
        dest.writeSerializable(this.f79516h);
        dest.writeParcelable(this.i, i);
    }
}
