package com.revolut.feature.wealth_discovery.api.declaration.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wnh.a;
import wnh.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Stocks", "Cfd", "Crypto", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination$Cfd;", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination$Crypto;", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination$Stocks;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MostTradedAssetsDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination$Cfd;", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cfd implements MostTradedAssetsDestination {

        @NotNull
        public static final Parcelable.Creator<Cfd> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wnh.a f96113b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cfd(b.valueOf(parcel.readString()), wnh.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cfd[i];
            }
        }

        public Cfd() {
            this(0);
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination
        /* JADX INFO: renamed from: D, reason: from getter */
        public final wnh.a getF96118b() {
            return this.f96113b;
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination
        /* JADX INFO: renamed from: V0, reason: from getter */
        public final b getF96117a() {
            return this.f96112a;
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
            return this.f96112a == cfd2.f96112a && this.f96113b == cfd2.f96113b;
        }

        public final int hashCode() {
            return this.f96113b.hashCode() + (this.f96112a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96112a.name());
            dest.writeString(this.f96113b.name());
        }

        public Cfd(b timeSpan, wnh.a section) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            this.f96112a = timeSpan;
            this.f96113b = section;
        }

        public /* synthetic */ Cfd(int i) {
            this(b.ONE_DAY, wnh.a.MOST_TRADED);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination$Crypto;", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crypto implements MostTradedAssetsDestination {

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wnh.a f96115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnalyticsProduct f96116c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto(b.valueOf(parcel.readString()), wnh.a.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(Crypto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public Crypto() {
            this((b) null, (wnh.a) null, 7);
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination
        /* JADX INFO: renamed from: D, reason: from getter */
        public final wnh.a getF96118b() {
            return this.f96115b;
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination
        /* JADX INFO: renamed from: V0, reason: from getter */
        public final b getF96117a() {
            return this.f96114a;
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
            return this.f96114a == crypto.f96114a && this.f96115b == crypto.f96115b && Intrinsics.f(this.f96116c, crypto.f96116c);
        }

        public final int hashCode() {
            return this.f96116c.hashCode() + ((this.f96115b.hashCode() + (this.f96114a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96114a.name());
            dest.writeString(this.f96115b.name());
            dest.writeParcelable(this.f96116c, i);
        }

        public Crypto(b timeSpan, wnh.a section, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f96114a = timeSpan;
            this.f96115b = section;
            this.f96116c = analyticsProduct;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Crypto(b bVar, wnh.a aVar, int i) {
            bVar = (i & 1) != 0 ? b.ONE_WEEK : bVar;
            aVar = (i & 2) != 0 ? wnh.a.MOST_TRADED : aVar;
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            this(bVar, aVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination$Stocks;", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/MostTradedAssetsDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stocks implements MostTradedAssetsDestination {

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wnh.a f96118b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stocks(b.valueOf(parcel.readString()), wnh.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stocks[i];
            }
        }

        public Stocks() {
            this(0);
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination
        /* JADX INFO: renamed from: D, reason: from getter */
        public final wnh.a getF96118b() {
            return this.f96118b;
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination
        /* JADX INFO: renamed from: V0, reason: from getter */
        public final b getF96117a() {
            return this.f96117a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Stocks)) {
                return false;
            }
            Stocks stocks = (Stocks) obj2;
            return this.f96117a == stocks.f96117a && this.f96118b == stocks.f96118b;
        }

        public final int hashCode() {
            return this.f96118b.hashCode() + (this.f96117a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96117a.name());
            dest.writeString(this.f96118b.name());
        }

        public Stocks(b timeSpan, wnh.a section) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            this.f96117a = timeSpan;
            this.f96118b = section;
        }

        public /* synthetic */ Stocks(int i) {
            this(b.ONE_WEEK, wnh.a.MOST_TRADED);
        }
    }

    /* JADX INFO: renamed from: D */
    a getF96118b();

    /* JADX INFO: renamed from: V0 */
    b getF96117a();
}
