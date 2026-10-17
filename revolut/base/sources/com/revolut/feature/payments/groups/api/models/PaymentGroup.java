package com.revolut.feature.payments.groups.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.models.GroupAnalytics;
import com.revolut.feature.payments.groups.models.GroupSettings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/api/models/PaymentGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79287c;
    public final List d;
    public final b e;
    public final oq9.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f79288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f79289h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GroupSettings f79290j;
    public final GroupAnalytics k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new PaymentGroup(string, string2, string3, arrayList, (b) parcel.readSerializable(), (oq9.a) parcel.readSerializable(), parcel.readInt() != 0, (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), GroupSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupAnalytics.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentGroup[i];
        }
    }

    public PaymentGroup(String id10, String name, String str, List members, b bVar, oq9.a aVar, boolean z, DateTime updatedDate, DateTime dateTime, GroupSettings settings, GroupAnalytics groupAnalytics) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f79285a = id10;
        this.f79286b = name;
        this.f79287c = str;
        this.d = members;
        this.e = bVar;
        this.f = aVar;
        this.f79288g = z;
        this.f79289h = updatedDate;
        this.i = dateTime;
        this.f79290j = settings;
        this.k = groupAnalytics;
    }

    public static PaymentGroup a(PaymentGroup paymentGroup, List members) {
        String id10 = paymentGroup.f79285a;
        String name = paymentGroup.f79286b;
        String str = paymentGroup.f79287c;
        b bVar = paymentGroup.e;
        oq9.a aVar = paymentGroup.f;
        boolean z = paymentGroup.f79288g;
        DateTime updatedDate = paymentGroup.f79289h;
        DateTime dateTime = paymentGroup.i;
        GroupSettings settings = paymentGroup.f79290j;
        GroupAnalytics groupAnalytics = paymentGroup.k;
        paymentGroup.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new PaymentGroup(id10, name, str, members, bVar, aVar, z, updatedDate, dateTime, settings, groupAnalytics);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF79289h() {
        return this.f79289h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentGroup)) {
            return false;
        }
        PaymentGroup paymentGroup = (PaymentGroup) obj2;
        return Intrinsics.f(this.f79285a, paymentGroup.f79285a) && Intrinsics.f(this.f79286b, paymentGroup.f79286b) && Intrinsics.f(this.f79287c, paymentGroup.f79287c) && Intrinsics.f(this.d, paymentGroup.d) && Intrinsics.f(this.e, paymentGroup.e) && Intrinsics.f(this.f, paymentGroup.f) && this.f79288g == paymentGroup.f79288g && Intrinsics.f(this.f79289h, paymentGroup.f79289h) && Intrinsics.f(this.i, paymentGroup.i) && Intrinsics.f(this.f79290j, paymentGroup.f79290j) && Intrinsics.f(this.k, paymentGroup.k);
    }

    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF79285a() {
        return this.f79285a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f79285a.hashCode() * 31, 31, this.f79286b);
        String str = this.f79287c;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        b bVar = this.e;
        int iHashCode = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
        oq9.a aVar = this.f;
        int iF = m72.b.f(this.f79289h, j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f79288g), 31);
        DateTime dateTime = this.i;
        int iHashCode2 = (this.f79290j.hashCode() + ((iF + (dateTime == null ? 0 : dateTime.hashCode())) * 31)) * 31;
        GroupAnalytics groupAnalytics = this.k;
        return iHashCode2 + (groupAnalytics != null ? groupAnalytics.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79285a);
        dest.writeString(this.f79286b);
        dest.writeString(this.f79287c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f79288g ? 1 : 0);
        dest.writeSerializable(this.f79289h);
        dest.writeSerializable(this.i);
        this.f79290j.writeToParcel(dest, i);
        GroupAnalytics groupAnalytics = this.k;
        if (groupAnalytics == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            groupAnalytics.writeToParcel(dest, i);
        }
    }
}
