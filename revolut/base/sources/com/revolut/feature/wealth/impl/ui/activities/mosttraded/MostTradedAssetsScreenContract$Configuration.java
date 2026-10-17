package com.revolut.feature.wealth.impl.ui.activities.mosttraded;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import i9h.u;
import i9h.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration", "Landroid/os/Parcelable;", "<init>", "()V", "Stock", "Cfd", "Crypto", "Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration$Cfd;", "Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration$Crypto;", "Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration$Stock;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MostTradedAssetsScreenContract$Configuration implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95528a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration$Cfd;", "Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cfd extends MostTradedAssetsScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Cfd> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f95529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f95530c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cfd(v.valueOf(parcel.readString()), u.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cfd[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cfd(v timeSpan, u section, boolean z) {
            super(0);
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            this.f95529b = timeSpan;
            this.f95530c = section;
            this.d = z;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u getF95534c() {
            return this.f95530c;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final v getF95533b() {
            return this.f95529b;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cfd)) {
                return false;
            }
            Cfd cfd2 = (Cfd) obj2;
            return this.f95529b == cfd2.f95529b && this.f95530c == cfd2.f95530c && this.d == cfd2.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f95530c.hashCode() + (this.f95529b.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95529b.name());
            dest.writeString(this.f95530c.name());
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration$Crypto;", "Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crypto extends MostTradedAssetsScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f95531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f95532c;
        public final boolean d;
        public final AnalyticsProduct e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto(v.valueOf(parcel.readString()), u.valueOf(parcel.readString()), parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(Crypto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crypto(v timeSpan, u section, boolean z, AnalyticsProduct analyticsProduct) {
            super(0);
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f95531b = timeSpan;
            this.f95532c = section;
            this.d = z;
            this.e = analyticsProduct;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.e;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u getF95534c() {
            return this.f95532c;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final v getF95533b() {
            return this.f95531b;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Crypto)) {
                return false;
            }
            Crypto crypto = (Crypto) obj2;
            return this.f95531b == crypto.f95531b && this.f95532c == crypto.f95532c && this.d == crypto.d && Intrinsics.f(this.e, crypto.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + j6.a.c((this.f95532c.hashCode() + (this.f95531b.hashCode() * 31)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95531b.name());
            dest.writeString(this.f95532c.name());
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration$Stock;", "Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stock extends MostTradedAssetsScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Stock> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f95533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f95534c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stock(v.valueOf(parcel.readString()), u.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stock[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stock(v timeSpan, u section, boolean z) {
            super(0);
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            this.f95533b = timeSpan;
            this.f95534c = section;
            this.d = z;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u getF95534c() {
            return this.f95534c;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final v getF95533b() {
            return this.f95533b;
        }

        @Override // com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Stock)) {
                return false;
            }
            Stock stock = (Stock) obj2;
            return this.f95533b == stock.f95533b && this.f95534c == stock.f95534c && this.d == stock.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f95534c.hashCode() + (this.f95533b.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95533b.name());
            dest.writeString(this.f95534c.name());
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    public /* synthetic */ MostTradedAssetsScreenContract$Configuration(int i) {
        this();
    }

    /* JADX INFO: renamed from: P */
    public AnalyticsProduct getE() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract u getF95534c();

    /* JADX INFO: renamed from: b */
    public abstract v getF95533b();

    /* JADX INFO: renamed from: c */
    public abstract boolean getD();

    private MostTradedAssetsScreenContract$Configuration() {
        this.f95528a = "MOST_TRADED";
    }
}
