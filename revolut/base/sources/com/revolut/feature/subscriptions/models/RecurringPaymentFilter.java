package com.revolut.feature.subscriptions.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import r6.b;
import zhm.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "Landroid/os/Parcelable;", "<init>", "()V", "ByIdSet", "BySourcePocketIdSet", "BySourcePocketId", "ByCurrency", "BySourceCurrency", "ByReceiverId", "ByNextDateGreaterOrEqualThan", "ByNextDateLessOrEqualThan", "ByNextDateFromNow", "ByPendingRefund", "ByActiveFromNow", "And", "Or", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$And;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByActiveFromNow;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByCurrency;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByIdSet;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByNextDateFromNow;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByNextDateGreaterOrEqualThan;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByNextDateLessOrEqualThan;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByPendingRefund;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByReceiverId;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$BySourceCurrency;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$BySourcePocketId;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$BySourcePocketIdSet;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$Or;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecurringPaymentFilter implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByActiveFromNow;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "<init>", "()V", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ByActiveFromNow extends RecurringPaymentFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ByActiveFromNow f89324a = new ByActiveFromNow();

        @NotNull
        public static final Parcelable.Creator<ByActiveFromNow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ByActiveFromNow.f89324a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByActiveFromNow[i];
            }
        }

        private ByActiveFromNow() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByCurrency;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByCurrency extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<ByCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89325a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByCurrency(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByCurrency[i];
            }
        }

        public ByCurrency(String str) {
            this.f89325a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByCurrency) && Intrinsics.f(this.f89325a, ((ByCurrency) obj2).f89325a);
        }

        public final int hashCode() {
            String str = this.f89325a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89325a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByIdSet;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByIdSet extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<ByIdSet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f89326a;

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
                return new ByIdSet(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByIdSet[i];
            }
        }

        public ByIdSet(LinkedHashSet ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.f89326a = ids;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByIdSet) && this.f89326a.equals(((ByIdSet) obj2).f89326a);
        }

        public final int hashCode() {
            return this.f89326a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            LinkedHashSet linkedHashSet = this.f89326a;
            dest.writeInt(linkedHashSet.size());
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                dest.writeString((String) it8.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByNextDateFromNow;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByNextDateFromNow extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<ByNextDateFromNow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f89327a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByNextDateFromNow(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByNextDateFromNow[i];
            }
        }

        public ByNextDateFromNow(int i) {
            this.f89327a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByNextDateFromNow) && this.f89327a == ((ByNextDateFromNow) obj2).f89327a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f89327a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f89327a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByNextDateGreaterOrEqualThan;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByNextDateGreaterOrEqualThan extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<ByNextDateGreaterOrEqualThan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f89328a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByNextDateGreaterOrEqualThan((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByNextDateGreaterOrEqualThan[i];
            }
        }

        public ByNextDateGreaterOrEqualThan(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f89328a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByNextDateGreaterOrEqualThan) && Intrinsics.f(this.f89328a, ((ByNextDateGreaterOrEqualThan) obj2).f89328a);
        }

        public final int hashCode() {
            return this.f89328a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89328a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByNextDateLessOrEqualThan;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByNextDateLessOrEqualThan extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<ByNextDateLessOrEqualThan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f89329a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByNextDateLessOrEqualThan((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByNextDateLessOrEqualThan[i];
            }
        }

        public ByNextDateLessOrEqualThan(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f89329a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByNextDateLessOrEqualThan) && Intrinsics.f(this.f89329a, ((ByNextDateLessOrEqualThan) obj2).f89329a);
        }

        public final int hashCode() {
            return this.f89329a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89329a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByPendingRefund;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "<init>", "()V", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ByPendingRefund extends RecurringPaymentFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ByPendingRefund f89330a = new ByPendingRefund();

        @NotNull
        public static final Parcelable.Creator<ByPendingRefund> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ByPendingRefund.f89330a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByPendingRefund[i];
            }
        }

        private ByPendingRefund() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$ByReceiverId;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByReceiverId extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<ByReceiverId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f89331a;

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
                return new ByReceiverId(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByReceiverId[i];
            }
        }

        public ByReceiverId(Set ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.f89331a = ids;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByReceiverId) && Intrinsics.f(this.f89331a, ((ByReceiverId) obj2).f89331a);
        }

        public final int hashCode() {
            return this.f89331a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f89331a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$BySourceCurrency;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BySourceCurrency extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<BySourceCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89332a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BySourceCurrency(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BySourceCurrency[i];
            }
        }

        public BySourceCurrency(String str) {
            this.f89332a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BySourceCurrency) && Intrinsics.f(this.f89332a, ((BySourceCurrency) obj2).f89332a);
        }

        public final int hashCode() {
            String str = this.f89332a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89332a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$BySourcePocketId;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BySourcePocketId extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<BySourcePocketId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89333a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BySourcePocketId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BySourcePocketId[i];
            }
        }

        public BySourcePocketId(String str) {
            this.f89333a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BySourcePocketId) && Intrinsics.f(this.f89333a, ((BySourcePocketId) obj2).f89333a);
        }

        public final int hashCode() {
            String str = this.f89333a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89333a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$BySourcePocketIdSet;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BySourcePocketIdSet extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<BySourcePocketIdSet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f89334a;

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
                return new BySourcePocketIdSet(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BySourcePocketIdSet[i];
            }
        }

        public BySourcePocketIdSet(Set ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.f89334a = ids;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BySourcePocketIdSet) && Intrinsics.f(this.f89334a, ((BySourcePocketIdSet) obj2).f89334a);
        }

        public final int hashCode() {
            return this.f89334a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f89334a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    private RecurringPaymentFilter() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$And;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class And extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<And> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f89323a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(And.class, parcel, arrayList, iE, 1);
                }
                return new And(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new And[i];
            }
        }

        public And(List filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f89323a = filters;
            if (filters.isEmpty()) {
                b.D("AND filter should contain at least one filter");
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof And) && Intrinsics.f(this.f89323a, ((And) obj2).f89323a);
        }

        public final int hashCode() {
            return this.f89323a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f89323a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public And(RecurringPaymentFilter... filters) {
            this(p.c(filters));
            Intrinsics.checkNotNullParameter(filters, "filters");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter$Or;", "Lcom/revolut/feature/subscriptions/models/RecurringPaymentFilter;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Or extends RecurringPaymentFilter {

        @NotNull
        public static final Parcelable.Creator<Or> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f89335a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Or.class, parcel, arrayList, iE, 1);
                }
                return new Or(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Or[i];
            }
        }

        public Or(List filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f89335a = filters;
            if (filters.isEmpty()) {
                b.D("OR filter should contain at least one filter");
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Or) && Intrinsics.f(this.f89335a, ((Or) obj2).f89335a);
        }

        public final int hashCode() {
            return this.f89335a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f89335a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Or(RecurringPaymentFilter... filters) {
            this(p.c(filters));
            Intrinsics.checkNotNullParameter(filters, "filters");
        }
    }
}
