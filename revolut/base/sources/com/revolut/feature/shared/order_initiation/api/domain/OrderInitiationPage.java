package com.revolut.feature.shared.order_initiation.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vad.e;
import vad.f;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/shared/order_initiation/api/domain/OrderInitiationPage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "vad/f", "vad/e", "Usage", "User", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderInitiationPage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderInitiationPage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f86428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f86429c;
    public final e d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f86430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f86431h;
    public final Usage i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDateTime f86432j;
    public final User k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f86433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f86434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f86435n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/order_initiation/api/domain/OrderInitiationPage$Usage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Usage implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Usage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86437b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Usage(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Usage[i];
            }
        }

        public Usage(int i, int i2) {
            this.f86436a = i;
            this.f86437b = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Usage)) {
                return false;
            }
            Usage usage = (Usage) obj2;
            return this.f86436a == usage.f86436a && this.f86437b == usage.f86437b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f86437b) + (Integer.hashCode(this.f86436a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f86436a);
            dest.writeInt(this.f86437b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/order_initiation/api/domain/OrderInitiationPage$User;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class User implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<User> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86440c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new User(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new User[i];
            }
        }

        public User(String id10, String firstName, String lastName) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            this.f86438a = id10;
            this.f86439b = firstName;
            this.f86440c = lastName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof User)) {
                return false;
            }
            User user = (User) obj2;
            return Intrinsics.f(this.f86438a, user.f86438a) && Intrinsics.f(this.f86439b, user.f86439b) && Intrinsics.f(this.f86440c, user.f86440c);
        }

        public final int hashCode() {
            return this.f86440c.hashCode() + p.a.c(this.f86438a.hashCode() * 31, 31, this.f86439b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86438a);
            dest.writeString(this.f86439b);
            dest.writeString(this.f86440c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            f fVarValueOf = f.valueOf(parcel.readString());
            e eVarValueOf = e.valueOf(parcel.readString());
            String string2 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            String string3 = parcel.readString();
            Usage usageCreateFromParcel = parcel.readInt() == 0 ? null : Usage.CREATOR.createFromParcel(parcel);
            LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
            User userCreateFromParcel = parcel.readInt() == 0 ? null : User.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CustomFieldDefinition.CREATOR, parcel, arrayList, iA, 1);
                i2 = i2;
                localDateTime = localDateTime;
            }
            return new OrderInitiationPage(string, localDateTime, fVarValueOf, eVarValueOf, string2, dVar, bVar, string3, usageCreateFromParcel, localDateTime2, userCreateFromParcel, i, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderInitiationPage[i];
        }
    }

    public OrderInitiationPage(String id10, LocalDateTime createdDate, f state, e product, String title, d dVar, b bVar, String paymentLink, Usage usage, LocalDateTime localDateTime, User user, int i, Integer num, List customFieldDefinitions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        Intrinsics.checkNotNullParameter(customFieldDefinitions, "customFieldDefinitions");
        this.f86427a = id10;
        this.f86428b = createdDate;
        this.f86429c = state;
        this.d = product;
        this.e = title;
        this.f = dVar;
        this.f86430g = bVar;
        this.f86431h = paymentLink;
        this.i = usage;
        this.f86432j = localDateTime;
        this.k = user;
        this.f86433l = i;
        this.f86434m = num;
        this.f86435n = customFieldDefinitions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderInitiationPage)) {
            return false;
        }
        OrderInitiationPage orderInitiationPage = (OrderInitiationPage) obj2;
        return Intrinsics.f(this.f86427a, orderInitiationPage.f86427a) && Intrinsics.f(this.f86428b, orderInitiationPage.f86428b) && this.f86429c == orderInitiationPage.f86429c && this.d == orderInitiationPage.d && Intrinsics.f(this.e, orderInitiationPage.e) && Intrinsics.f(this.f, orderInitiationPage.f) && Intrinsics.f(this.f86430g, orderInitiationPage.f86430g) && Intrinsics.f(this.f86431h, orderInitiationPage.f86431h) && Intrinsics.f(this.i, orderInitiationPage.i) && Intrinsics.f(this.f86432j, orderInitiationPage.f86432j) && Intrinsics.f(this.k, orderInitiationPage.k) && this.f86433l == orderInitiationPage.f86433l && Intrinsics.f(this.f86434m, orderInitiationPage.f86434m) && Intrinsics.f(this.f86435n, orderInitiationPage.f86435n);
    }

    public final int hashCode() {
        int iC = p.a.c((this.d.hashCode() + ((this.f86429c.hashCode() + v7.i(this.f86428b, this.f86427a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e);
        d dVar = this.f;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.f86430g;
        int iC2 = p.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f86431h);
        Usage usage = this.i;
        int iHashCode2 = (iC2 + (usage == null ? 0 : usage.hashCode())) * 31;
        LocalDateTime localDateTime = this.f86432j;
        int iHashCode3 = (iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        User user = this.k;
        int iB = j6.a.b(this.f86433l, (iHashCode3 + (user == null ? 0 : user.hashCode())) * 31, 31);
        Integer num = this.f86434m;
        return this.f86435n.hashCode() + ((iB + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86427a);
        dest.writeSerializable(this.f86428b);
        dest.writeString(this.f86429c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f86430g);
        dest.writeString(this.f86431h);
        Usage usage = this.i;
        if (usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            usage.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f86432j);
        User user = this.k;
        if (user == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            user.writeToParcel(dest, i);
        }
        dest.writeInt(this.f86433l);
        Integer num = this.f86434m;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itV = p.a.v(this.f86435n, dest);
        while (itV.hasNext()) {
            ((CustomFieldDefinition) itV.next()).writeToParcel(dest, i);
        }
    }
}
