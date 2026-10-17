package com.revolut.feature.wealth.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mzg.b;
import mzg.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Trading", "Cfd", "Crypto", "mzg/c", "mzg/b", "Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig$Cfd;", "Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig$Crypto;", "Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig$Trading;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MostTradedAssetsFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig$Cfd;", "Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cfd extends MostTradedAssetsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Cfd> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f95203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f95204b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cfd(c.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cfd[i];
            }
        }

        public Cfd() {
            this(0);
        }

        @Override // com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF95209b() {
            return this.f95204b;
        }

        @Override // com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF95208a() {
            return this.f95203a;
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
            return this.f95203a == cfd2.f95203a && this.f95204b == cfd2.f95204b;
        }

        public final int hashCode() {
            return this.f95204b.hashCode() + (this.f95203a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95203a.name());
            dest.writeString(this.f95204b.name());
        }

        public Cfd(c timeSpan, b section) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            this.f95203a = timeSpan;
            this.f95204b = section;
        }

        public /* synthetic */ Cfd(int i) {
            this(c.ONE_DAY, b.MOST_TRADED);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig$Crypto;", "Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crypto extends MostTradedAssetsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f95205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f95206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnalyticsProduct f95207c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto(c.valueOf(parcel.readString()), b.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(Crypto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public Crypto() {
            this((c) null, (b) null, 7);
        }

        @Override // com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF95209b() {
            return this.f95206b;
        }

        @Override // com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF95208a() {
            return this.f95205a;
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
            return this.f95205a == crypto.f95205a && this.f95206b == crypto.f95206b && Intrinsics.f(this.f95207c, crypto.f95207c);
        }

        public final int hashCode() {
            return this.f95207c.hashCode() + ((this.f95206b.hashCode() + (this.f95205a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95205a.name());
            dest.writeString(this.f95206b.name());
            dest.writeParcelable(this.f95207c, i);
        }

        public Crypto(c timeSpan, b section, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f95205a = timeSpan;
            this.f95206b = section;
            this.f95207c = analyticsProduct;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Crypto(c cVar, b bVar, int i) {
            cVar = (i & 1) != 0 ? c.ONE_WEEK : cVar;
            bVar = (i & 2) != 0 ? b.MOST_TRADED : bVar;
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            this(cVar, bVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig$Trading;", "Lcom/revolut/feature/wealth/api/declaration/MostTradedAssetsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Trading extends MostTradedAssetsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Trading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f95208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f95209b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Trading(c.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Trading[i];
            }
        }

        public Trading() {
            this(0);
        }

        @Override // com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF95209b() {
            return this.f95209b;
        }

        @Override // com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF95208a() {
            return this.f95208a;
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
            return this.f95208a == trading.f95208a && this.f95209b == trading.f95209b;
        }

        public final int hashCode() {
            return this.f95209b.hashCode() + (this.f95208a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95208a.name());
            dest.writeString(this.f95209b.name());
        }

        public Trading(c timeSpan, b section) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(section, "section");
            this.f95208a = timeSpan;
            this.f95209b = section;
        }

        public /* synthetic */ Trading(int i) {
            this(c.ONE_WEEK, b.MOST_TRADED);
        }
    }

    private MostTradedAssetsFeatureConfig() {
    }

    /* JADX INFO: renamed from: a */
    public abstract b getF95209b();

    /* JADX INFO: renamed from: b */
    public abstract c getF95208a();
}
