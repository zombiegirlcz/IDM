package com.revolut.feature.wealth_discovery.api.declaration.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wnh.d;
import wnh.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/collection/TopMoversDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Trading", "Crypto", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/TopMoversDestination$Crypto;", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/TopMoversDestination$Trading;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopMoversDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/collection/TopMoversDestination$Crypto;", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/TopMoversDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crypto implements TopMoversDestination {

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f96120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f96121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnalyticsProduct f96122c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto(e.valueOf(parcel.readString()), d.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(Crypto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public Crypto() {
            this((e) null, (d) null, 7);
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination
        /* JADX INFO: renamed from: V0, reason: from getter */
        public final e getF96123a() {
            return this.f96120a;
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
            return this.f96120a == crypto.f96120a && this.f96121b == crypto.f96121b && Intrinsics.f(this.f96122c, crypto.f96122c);
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination
        /* JADX INFO: renamed from: getFilter, reason: from getter */
        public final d getF96124b() {
            return this.f96121b;
        }

        public final int hashCode() {
            return this.f96122c.hashCode() + ((this.f96121b.hashCode() + (this.f96120a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96120a.name());
            dest.writeString(this.f96121b.name());
            dest.writeParcelable(this.f96122c, i);
        }

        public Crypto(e timeSpan, d filter, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f96120a = timeSpan;
            this.f96121b = filter;
            this.f96122c = analyticsProduct;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Crypto(e eVar, d dVar, int i) {
            eVar = (i & 1) != 0 ? e.ONE_DAY : eVar;
            dVar = (i & 2) != 0 ? d.ALL : dVar;
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            this(eVar, dVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        }
    }

    /* JADX INFO: renamed from: V0 */
    e getF96123a();

    /* JADX INFO: renamed from: getFilter */
    d getF96124b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/collection/TopMoversDestination$Trading;", "Lcom/revolut/feature/wealth_discovery/api/declaration/collection/TopMoversDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Trading implements TopMoversDestination {

        @NotNull
        public static final Parcelable.Creator<Trading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f96123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f96124b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Trading(e.valueOf(parcel.readString()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Trading[i];
            }
        }

        public Trading(e timeSpan, d filter) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f96123a = timeSpan;
            this.f96124b = filter;
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination
        /* JADX INFO: renamed from: V0, reason: from getter */
        public final e getF96123a() {
            return this.f96123a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Trading)) {
                return false;
            }
            Trading trading = (Trading) obj2;
            return this.f96123a == trading.f96123a && this.f96124b == trading.f96124b;
        }

        @Override // com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination
        /* JADX INFO: renamed from: getFilter, reason: from getter */
        public final d getF96124b() {
            return this.f96124b;
        }

        public final int hashCode() {
            return this.f96124b.hashCode() + (this.f96123a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96123a.name());
            dest.writeString(this.f96124b.name());
        }

        public Trading() {
            this(e.ONE_DAY, d.ALL);
        }
    }
}
