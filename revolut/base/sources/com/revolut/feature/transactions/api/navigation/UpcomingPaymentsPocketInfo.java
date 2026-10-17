package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "AllPockets", "ConcretePocket", "ListOfPockets", "Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo$AllPockets;", "Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo$ConcretePocket;", "Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo$ListOfPockets;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UpcomingPaymentsPocketInfo implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo$AllPockets;", "Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo;", "<init>", "()V", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllPockets extends UpcomingPaymentsPocketInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllPockets f92022a = new AllPockets();

        @NotNull
        public static final Parcelable.Creator<AllPockets> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllPockets.f92022a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllPockets[i];
            }
        }

        private AllPockets() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo$ConcretePocket;", "Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConcretePocket extends UpcomingPaymentsPocketInfo {

        @NotNull
        public static final Parcelable.Creator<ConcretePocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92023a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConcretePocket(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConcretePocket[i];
            }
        }

        public ConcretePocket(String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f92023a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConcretePocket) && Intrinsics.f(this.f92023a, ((ConcretePocket) obj2).f92023a);
        }

        public final int hashCode() {
            return this.f92023a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92023a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo$ListOfPockets;", "Lcom/revolut/feature/transactions/api/navigation/UpcomingPaymentsPocketInfo;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ListOfPockets extends UpcomingPaymentsPocketInfo {

        @NotNull
        public static final Parcelable.Creator<ListOfPockets> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f92024a;

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
                return new ListOfPockets(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ListOfPockets[i];
            }
        }

        public ListOfPockets(Set currencies) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f92024a = currencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ListOfPockets) && Intrinsics.f(this.f92024a, ((ListOfPockets) obj2).f92024a);
        }

        public final int hashCode() {
            return this.f92024a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f92024a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    private UpcomingPaymentsPocketInfo() {
    }
}
