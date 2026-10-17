package com.revolut.feature.wealth.asset.selection.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y1h.f;
import y1h.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory;", "Landroid/os/Parcelable;", "Companion", "Cash", "Stock", "Etp", "Bond", "Cfd", "a", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Bond;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Cash;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Cfd;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Etp;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Stock;", "feature_wealth_asset_selection_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AssetSelectionCategory extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f95382a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Bond;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory;", "", "Ly1h/g;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bond implements AssetSelectionCategory, g {

        @NotNull
        public static final Parcelable.Creator<Bond> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f95372c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bond(parcel.readString(), parcel.readInt() != 0, f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bond[i];
            }
        }

        public Bond(String str, boolean z, f filterStrategy) {
            Intrinsics.checkNotNullParameter(filterStrategy, "filterStrategy");
            this.f95370a = str;
            this.f95371b = z;
            this.f95372c = filterStrategy;
        }

        @Override // y1h.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getF95381b() {
            return this.f95372c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Bond)) {
                return false;
            }
            Bond bond = (Bond) obj2;
            return Intrinsics.f(this.f95370a, bond.f95370a) && this.f95371b == bond.f95371b && this.f95372c == bond.f95372c;
        }

        @Override // com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95380a() {
            return this.f95370a;
        }

        public final int hashCode() {
            String str = this.f95370a;
            return this.f95372c.hashCode() + j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f95371b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95370a);
            dest.writeInt(this.f95371b ? 1 : 0);
            dest.writeString(this.f95372c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Cash;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cash implements AssetSelectionCategory {

        @NotNull
        public static final Parcelable.Creator<Cash> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccountType f95373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95374b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cash((TradingAccountType) parcel.readParcelable(Cash.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cash[i];
            }
        }

        public Cash(TradingAccountType tradingAccountType, String str) {
            Intrinsics.checkNotNullParameter(tradingAccountType, "tradingAccountType");
            this.f95373a = tradingAccountType;
            this.f95374b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cash)) {
                return false;
            }
            Cash cash = (Cash) obj2;
            return Intrinsics.f(this.f95373a, cash.f95373a) && Intrinsics.f(this.f95374b, cash.f95374b);
        }

        @Override // com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95380a() {
            return this.f95374b;
        }

        public final int hashCode() {
            int iHashCode = this.f95373a.hashCode() * 31;
            String str = this.f95374b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95373a, i);
            dest.writeString(this.f95374b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Cfd;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory;", "Ly1h/g;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cfd implements AssetSelectionCategory, g {

        @NotNull
        public static final Parcelable.Creator<Cfd> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f95376b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cfd(parcel.readString(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cfd[i];
            }
        }

        public Cfd(String str, f filterStrategy) {
            Intrinsics.checkNotNullParameter(filterStrategy, "filterStrategy");
            this.f95375a = str;
            this.f95376b = filterStrategy;
        }

        @Override // y1h.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getF95381b() {
            return this.f95376b;
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
            return Intrinsics.f(this.f95375a, cfd2.f95375a) && this.f95376b == cfd2.f95376b;
        }

        @Override // com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95380a() {
            return this.f95375a;
        }

        public final int hashCode() {
            String str = this.f95375a;
            return this.f95376b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95375a);
            dest.writeString(this.f95376b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Etp;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory;", "", "Ly1h/g;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Etp implements AssetSelectionCategory, g {

        @NotNull
        public static final Parcelable.Creator<Etp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f95379c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Etp(parcel.readString(), parcel.readInt() != 0, f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Etp[i];
            }
        }

        public Etp(String str, boolean z, f filterStrategy) {
            Intrinsics.checkNotNullParameter(filterStrategy, "filterStrategy");
            this.f95377a = str;
            this.f95378b = z;
            this.f95379c = filterStrategy;
        }

        @Override // y1h.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getF95381b() {
            return this.f95379c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Etp)) {
                return false;
            }
            Etp etp = (Etp) obj2;
            return Intrinsics.f(this.f95377a, etp.f95377a) && this.f95378b == etp.f95378b && this.f95379c == etp.f95379c;
        }

        @Override // com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95380a() {
            return this.f95377a;
        }

        public final int hashCode() {
            String str = this.f95377a;
            return this.f95379c.hashCode() + j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f95378b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95377a);
            dest.writeInt(this.f95378b ? 1 : 0);
            dest.writeString(this.f95379c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory$Stock;", "Lcom/revolut/feature/wealth/asset/selection/api/model/AssetSelectionCategory;", "Ly1h/g;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stock implements AssetSelectionCategory, g {

        @NotNull
        public static final Parcelable.Creator<Stock> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f95381b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stock(parcel.readString(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stock[i];
            }
        }

        public Stock(String str, f filterStrategy) {
            Intrinsics.checkNotNullParameter(filterStrategy, "filterStrategy");
            this.f95380a = str;
            this.f95381b = filterStrategy;
        }

        @Override // y1h.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getF95381b() {
            return this.f95381b;
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
            return Intrinsics.f(this.f95380a, stock.f95380a) && this.f95381b == stock.f95381b;
        }

        @Override // com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95380a() {
            return this.f95380a;
        }

        public final int hashCode() {
            String str = this.f95380a;
            return this.f95381b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95380a);
            dest.writeString(this.f95381b.name());
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f95382a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: g */
    String getF95380a();
}
