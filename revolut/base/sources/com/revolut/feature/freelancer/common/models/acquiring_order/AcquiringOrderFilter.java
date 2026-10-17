package com.revolut.feature.freelancer.common.models.acquiring_order;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import nr6.c0;
import nr6.e;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.a1;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "Landroid/os/Parcelable;", "Channel", "Currency", "DateRange", "Id", "InitiationPageId", "FractionalAmount", "Query", "Status", "All", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$All;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Channel;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Currency;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$DateRange;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$FractionalAmount;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Id;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$InitiationPageId;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Query;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Status;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AcquiringOrderFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$All;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class All implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<All> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f73345a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(All.class, parcel, linkedHashSet, iE, 1);
                }
                return new All(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new All[i];
            }
        }

        public All(Set filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f73345a = filters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof All) && Intrinsics.f(this.f73345a, ((All) obj2).f73345a);
        }

        public final int hashCode() {
            return this.f73345a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f73345a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Channel;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Channel implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<Channel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f73346a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(e.valueOf(parcel.readString()));
                }
                return new Channel(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Channel[i];
            }
        }

        public Channel(Set channels) {
            Intrinsics.checkNotNullParameter(channels, "channels");
            this.f73346a = channels;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Channel) && Intrinsics.f(this.f73346a, ((Channel) obj2).f73346a);
        }

        public final int hashCode() {
            return this.f73346a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f73346a, dest);
            while (itV.hasNext()) {
                dest.writeString(((e) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Currency;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Currency implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<Currency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f73347a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                while (iD != i) {
                    iD = v7.d(parcel, linkedHashSet, iD, 1);
                }
                return new Currency(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Currency[i];
            }
        }

        public Currency(Set currencies) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f73347a = currencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Currency) && Intrinsics.f(this.f73347a, ((Currency) obj2).f73347a);
        }

        public final int hashCode() {
            return this.f73347a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f73347a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$DateRange;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateRange implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<DateRange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FilteringDateRange f73348a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateRange((FilteringDateRange) parcel.readParcelable(DateRange.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateRange[i];
            }
        }

        public DateRange(FilteringDateRange dateRange) {
            Intrinsics.checkNotNullParameter(dateRange, "dateRange");
            this.f73348a = dateRange;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateRange) && Intrinsics.f(this.f73348a, ((DateRange) obj2).f73348a);
        }

        public final int hashCode() {
            return this.f73348a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73348a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$FractionalAmount;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FractionalAmount implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<FractionalAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73350b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FractionalAmount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FractionalAmount[i];
            }
        }

        public FractionalAmount(String str, String str2) {
            this.f73349a = str;
            this.f73350b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FractionalAmount)) {
                return false;
            }
            FractionalAmount fractionalAmount = (FractionalAmount) obj2;
            return Intrinsics.f(this.f73349a, fractionalAmount.f73349a) && Intrinsics.f(this.f73350b, fractionalAmount.f73350b);
        }

        public final int hashCode() {
            String str = this.f73349a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f73350b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73349a);
            dest.writeString(this.f73350b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Id;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f73351a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(AcquiringOrder$Id.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Id(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(ArrayList ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.f73351a = ids;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Id) && this.f73351a.equals(((Id) obj2).f73351a);
        }

        public final int hashCode() {
            return this.f73351a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f73351a, dest);
            while (itY.hasNext()) {
                String str = ((AcquiringOrder$Id) itY.next()).f73342a;
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(str);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$InitiationPageId;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitiationPageId implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<InitiationPageId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f73352a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new InitiationPageId(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InitiationPageId[i];
            }
        }

        public InitiationPageId(Set ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.f73352a = ids;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InitiationPageId) && Intrinsics.f(this.f73352a, ((InitiationPageId) obj2).f73352a);
        }

        public final int hashCode() {
            return this.f73352a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f73352a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Query;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Query implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<Query> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73353a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Query(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Query[i];
            }
        }

        public Query(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            this.f73353a = query;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Query) && Intrinsics.f(this.f73353a, ((Query) obj2).f73353a);
        }

        public final int hashCode() {
            return this.f73353a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73353a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter$Status;", "Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderFilter;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Status implements AcquiringOrderFilter {

        @NotNull
        public static final Parcelable.Creator<Status> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f73354a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(c0.valueOf(parcel.readString()));
                }
                return new Status(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Status[i];
            }
        }

        public Status(Set statuses) {
            Intrinsics.checkNotNullParameter(statuses, "statuses");
            this.f73354a = statuses;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Status) && Intrinsics.f(this.f73354a, ((Status) obj2).f73354a);
        }

        public final int hashCode() {
            return this.f73354a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f73354a, dest);
            while (itV.hasNext()) {
                dest.writeString(((c0) itV.next()).name());
            }
        }
    }

    default FilteringDateRange B2() {
        DateRange dateRange;
        if (this instanceof All) {
            Set set = ((All) this).f73345a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof DateRange) {
                    arrayList.add(obj2);
                }
            }
            AcquiringOrderFilter acquiringOrderFilter = (AcquiringOrderFilter) d0.d0(arrayList);
            if (acquiringOrderFilter == null) {
                return null;
            }
            dateRange = (DateRange) acquiringOrderFilter;
        } else {
            if (!(this instanceof DateRange)) {
                return null;
            }
            dateRange = (DateRange) this;
        }
        return dateRange.f73348a;
    }

    default Set F9() {
        Status status;
        if (this instanceof All) {
            Set set = ((All) this).f73345a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof Status) {
                    arrayList.add(obj2);
                }
            }
            AcquiringOrderFilter acquiringOrderFilter = (AcquiringOrderFilter) d0.d0(arrayList);
            if (acquiringOrderFilter == null) {
                return null;
            }
            status = (Status) acquiringOrderFilter;
        } else {
            if (!(this instanceof Status)) {
                return null;
            }
            status = (Status) this;
        }
        return status.f73354a;
    }

    default String W2() {
        FractionalAmount fractionalAmount;
        if (this instanceof All) {
            Set set = ((All) this).f73345a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof FractionalAmount) {
                    arrayList.add(obj2);
                }
            }
            AcquiringOrderFilter acquiringOrderFilter = (AcquiringOrderFilter) d0.d0(arrayList);
            if (acquiringOrderFilter == null) {
                return null;
            }
            fractionalAmount = (FractionalAmount) acquiringOrderFilter;
        } else {
            if (!(this instanceof FractionalAmount)) {
                return null;
            }
            fractionalAmount = (FractionalAmount) this;
        }
        return fractionalAmount.f73349a;
    }

    default String Z6() {
        FractionalAmount fractionalAmount;
        if (this instanceof All) {
            Set set = ((All) this).f73345a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof FractionalAmount) {
                    arrayList.add(obj2);
                }
            }
            AcquiringOrderFilter acquiringOrderFilter = (AcquiringOrderFilter) d0.d0(arrayList);
            if (acquiringOrderFilter == null) {
                return null;
            }
            fractionalAmount = (FractionalAmount) acquiringOrderFilter;
        } else {
            if (!(this instanceof FractionalAmount)) {
                return null;
            }
            fractionalAmount = (FractionalAmount) this;
        }
        return fractionalAmount.f73350b;
    }

    default Set d2() {
        Currency currency;
        if (this instanceof All) {
            Set set = ((All) this).f73345a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof Currency) {
                    arrayList.add(obj2);
                }
            }
            AcquiringOrderFilter acquiringOrderFilter = (AcquiringOrderFilter) d0.d0(arrayList);
            if (acquiringOrderFilter == null) {
                return null;
            }
            currency = (Currency) acquiringOrderFilter;
        } else {
            if (!(this instanceof Currency)) {
                return null;
            }
            currency = (Currency) this;
        }
        return currency.f73347a;
    }

    default AcquiringOrderFilter j9(KClass filterClass) {
        Intrinsics.checkNotNullParameter(filterClass, "filterClass");
        Set setB = this instanceof All ? ((All) this).f73345a : y0.b(this);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setB) {
            if (!o0.f186429a.b(((AcquiringOrderFilter) obj2).getClass()).equals(filterClass)) {
                arrayList.add(obj2);
            }
        }
        Set setI1 = d0.i1(arrayList);
        if (setI1.isEmpty()) {
            return null;
        }
        return setI1.size() == 1 ? (AcquiringOrderFilter) d0.J0(setI1) : new All(setI1);
    }

    default Set r1() {
        Channel channel;
        if (this instanceof All) {
            Set set = ((All) this).f73345a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof Channel) {
                    arrayList.add(obj2);
                }
            }
            AcquiringOrderFilter acquiringOrderFilter = (AcquiringOrderFilter) d0.d0(arrayList);
            if (acquiringOrderFilter == null) {
                return null;
            }
            channel = (Channel) acquiringOrderFilter;
        } else {
            if (!(this instanceof Channel)) {
                return null;
            }
            channel = (Channel) this;
        }
        return channel.f73346a;
    }

    default AcquiringOrderFilter z2(AcquiringOrderFilter other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Set setB = this instanceof All ? ((All) this).f73345a : y0.b(this);
        Set setB2 = other instanceof All ? ((All) other).f73345a : y0.b(other);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setB) {
            AcquiringOrderFilter acquiringOrderFilter = (AcquiringOrderFilter) obj2;
            Set set = setB2;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    if (((AcquiringOrderFilter) it8.next()).getClass() == acquiringOrderFilter.getClass()) {
                        break;
                    }
                }
            }
            arrayList.add(obj2);
        }
        LinkedHashSet linkedHashSetL = a1.l(d0.i1(arrayList), setB2);
        return linkedHashSetL.size() == 1 ? (AcquiringOrderFilter) d0.J0(linkedHashSetL) : new All(linkedHashSetL);
    }
}
