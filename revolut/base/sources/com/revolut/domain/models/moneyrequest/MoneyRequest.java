package com.revolut.domain.models.moneyrequest;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoneyRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyRequestState f60315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyRequestChannel f60316c;
    public final d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f60317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f60318h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f60319j;
    public final MoneyRequestCounterParty k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MoneyRequestCounterParty f60320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MoneyRequestCounterParty f60321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MoneyRequestDirection f60322n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f60323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MoneyRequestSettings f60324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MoneyRequestAttributes f60325r;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            MoneyRequestSettings moneyRequestSettings;
            MoneyRequestAttributes moneyRequestAttributesCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            MoneyRequestState moneyRequestStateValueOf = MoneyRequestState.valueOf(parcel.readString());
            MoneyRequestChannel moneyRequestChannel = (MoneyRequestChannel) parcel.readParcelable(MoneyRequest.class.getClassLoader());
            d dVar = (d) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            MoneyRequestCounterParty moneyRequestCounterParty = (MoneyRequestCounterParty) parcel.readParcelable(MoneyRequest.class.getClassLoader());
            MoneyRequestCounterParty moneyRequestCounterParty2 = (MoneyRequestCounterParty) parcel.readParcelable(MoneyRequest.class.getClassLoader());
            MoneyRequestCounterParty moneyRequestCounterParty3 = (MoneyRequestCounterParty) parcel.readParcelable(MoneyRequest.class.getClassLoader());
            MoneyRequestDirection moneyRequestDirectionValueOf = MoneyRequestDirection.valueOf(parcel.readString());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            MoneyRequestSettings moneyRequestSettingsCreateFromParcel = parcel.readInt() == 0 ? null : MoneyRequestSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                moneyRequestAttributesCreateFromParcel = null;
                moneyRequestSettings = moneyRequestSettingsCreateFromParcel;
            } else {
                moneyRequestSettings = moneyRequestSettingsCreateFromParcel;
                moneyRequestAttributesCreateFromParcel = MoneyRequestAttributes.CREATOR.createFromParcel(parcel);
            }
            return new MoneyRequest(string, moneyRequestStateValueOf, moneyRequestChannel, dVar, string2, string3, string4, dateTime, dateTime2, dateTime3, moneyRequestCounterParty, moneyRequestCounterParty2, moneyRequestCounterParty3, moneyRequestDirectionValueOf, string5, string6, moneyRequestSettings, moneyRequestAttributesCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequest[i];
        }
    }

    public MoneyRequest(String id10, MoneyRequestState state, MoneyRequestChannel channel, d money, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, DateTime updateDate, MoneyRequestCounterParty moneyRequestCounterParty, MoneyRequestCounterParty creator, MoneyRequestCounterParty moneyRequestCounterParty2, MoneyRequestDirection direction, String str4, String str5, MoneyRequestSettings moneyRequestSettings, MoneyRequestAttributes moneyRequestAttributes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(updateDate, "updateDate");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f60314a = id10;
        this.f60315b = state;
        this.f60316c = channel;
        this.d = money;
        this.e = str;
        this.f = str2;
        this.f60317g = str3;
        this.f60318h = dateTime;
        this.i = dateTime2;
        this.f60319j = updateDate;
        this.k = moneyRequestCounterParty;
        this.f60320l = creator;
        this.f60321m = moneyRequestCounterParty2;
        this.f60322n = direction;
        this.o = str4;
        this.f60323p = str5;
        this.f60324q = moneyRequestSettings;
        this.f60325r = moneyRequestAttributes;
    }

    public static MoneyRequest a(MoneyRequest moneyRequest, DateTime dateTime, MoneyRequestCounterParty.Revolut revolut, MoneyRequestCounterParty.Revolut revolut2, int i) {
        String id10 = moneyRequest.f60314a;
        MoneyRequestState state = moneyRequest.f60315b;
        MoneyRequestChannel channel = moneyRequest.f60316c;
        d money = moneyRequest.d;
        String str = moneyRequest.e;
        String str2 = moneyRequest.f;
        String str3 = moneyRequest.f60317g;
        DateTime dateTime2 = moneyRequest.f60318h;
        DateTime dateTime3 = (i & 256) != 0 ? moneyRequest.i : dateTime;
        DateTime updateDate = moneyRequest.f60319j;
        MoneyRequestCounterParty moneyRequestCounterParty = (i & 1024) != 0 ? moneyRequest.k : revolut;
        MoneyRequestCounterParty creator = (i & 2048) != 0 ? moneyRequest.f60320l : revolut2;
        MoneyRequestCounterParty moneyRequestCounterParty2 = moneyRequest.f60321m;
        MoneyRequestDirection direction = moneyRequest.f60322n;
        String str4 = moneyRequest.o;
        String str5 = moneyRequest.f60323p;
        MoneyRequestSettings moneyRequestSettings = moneyRequest.f60324q;
        MoneyRequestAttributes moneyRequestAttributes = moneyRequest.f60325r;
        moneyRequest.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(updateDate, "updateDate");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new MoneyRequest(id10, state, channel, money, str, str2, str3, dateTime2, dateTime3, updateDate, moneyRequestCounterParty, creator, moneyRequestCounterParty2, direction, str4, str5, moneyRequestSettings, moneyRequestAttributes);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MoneyRequestChannel getF60316c() {
        return this.f60316c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final MoneyRequestCounterParty getF60320l() {
        return this.f60320l;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MoneyRequestDirection getF60322n() {
        return this.f60322n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final MoneyRequestCounterParty getK() {
        return this.k;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequest)) {
            return false;
        }
        MoneyRequest moneyRequest = (MoneyRequest) obj2;
        return Intrinsics.f(this.f60314a, moneyRequest.f60314a) && this.f60315b == moneyRequest.f60315b && Intrinsics.f(this.f60316c, moneyRequest.f60316c) && Intrinsics.f(this.d, moneyRequest.d) && Intrinsics.f(this.e, moneyRequest.e) && Intrinsics.f(this.f, moneyRequest.f) && Intrinsics.f(this.f60317g, moneyRequest.f60317g) && Intrinsics.f(this.f60318h, moneyRequest.f60318h) && Intrinsics.f(this.i, moneyRequest.i) && Intrinsics.f(this.f60319j, moneyRequest.f60319j) && Intrinsics.f(this.k, moneyRequest.k) && Intrinsics.f(this.f60320l, moneyRequest.f60320l) && Intrinsics.f(this.f60321m, moneyRequest.f60321m) && this.f60322n == moneyRequest.f60322n && Intrinsics.f(this.o, moneyRequest.o) && Intrinsics.f(this.f60323p, moneyRequest.f60323p) && Intrinsics.f(this.f60324q, moneyRequest.f60324q) && Intrinsics.f(this.f60325r, moneyRequest.f60325r);
    }

    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF60314a() {
        return this.f60314a;
    }

    public final int hashCode() {
        int iC = v7.c((this.f60316c.hashCode() + ((this.f60315b.hashCode() + (this.f60314a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60317g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DateTime dateTime = this.f60318h;
        int iHashCode4 = (iHashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.i;
        int iF = m72.b.f(this.f60319j, (iHashCode4 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31, 31);
        MoneyRequestCounterParty moneyRequestCounterParty = this.k;
        int iHashCode5 = (this.f60320l.hashCode() + ((iF + (moneyRequestCounterParty == null ? 0 : moneyRequestCounterParty.hashCode())) * 31)) * 31;
        MoneyRequestCounterParty moneyRequestCounterParty2 = this.f60321m;
        int iHashCode6 = (this.f60322n.hashCode() + ((iHashCode5 + (moneyRequestCounterParty2 == null ? 0 : moneyRequestCounterParty2.hashCode())) * 31)) * 31;
        String str4 = this.o;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f60323p;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MoneyRequestSettings moneyRequestSettings = this.f60324q;
        int iHashCode9 = (iHashCode8 + (moneyRequestSettings == null ? 0 : moneyRequestSettings.hashCode())) * 31;
        MoneyRequestAttributes moneyRequestAttributes = this.f60325r;
        return iHashCode9 + (moneyRequestAttributes != null ? moneyRequestAttributes.hashCode() : 0);
    }

    public final boolean j(String str, String str2) {
        if (Intrinsics.f(this.f60320l.getF60343a(), str) || str2 == null) {
            return false;
        }
        MoneyRequestCounterParty moneyRequestCounterParty = this.f60321m;
        return Intrinsics.f(moneyRequestCounterParty != null ? moneyRequestCounterParty.getF60343a() : null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60314a);
        dest.writeString(this.f60315b.name());
        dest.writeParcelable(this.f60316c, i);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f60317g);
        dest.writeSerializable(this.f60318h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f60319j);
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f60320l, i);
        dest.writeParcelable(this.f60321m, i);
        dest.writeString(this.f60322n.name());
        dest.writeString(this.o);
        dest.writeString(this.f60323p);
        MoneyRequestSettings moneyRequestSettings = this.f60324q;
        if (moneyRequestSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            moneyRequestSettings.writeToParcel(dest, i);
        }
        MoneyRequestAttributes moneyRequestAttributes = this.f60325r;
        if (moneyRequestAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            moneyRequestAttributes.writeToParcel(dest, i);
        }
    }
}
