package com.revolut.feature.crypto_investments.api.widget.investments.sorting;

import android.os.Parcel;
import android.os.Parcelable;
import hb9.b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import tt5.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "TotalValue", "Performance", "MarketCap", "Alphabetical", "a", "Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType$Alphabetical;", "Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType$MarketCap;", "Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType$Performance;", "Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType$TotalValue;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoInvestmentsSortingType implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType$Alphabetical;", "Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Alphabetical extends CryptoInvestmentsSortingType {

        @NotNull
        public static final Parcelable.Creator<Alphabetical> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tt5.a f71407a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Alphabetical(tt5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Alphabetical[i];
            }
        }

        public Alphabetical() {
            this(0);
        }

        @Override // com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final tt5.a getF71410a() {
            return this.f71407a;
        }

        @Override // com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType
        public final CryptoInvestmentsSortingType c() {
            return new Alphabetical(b.H(this.f71407a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Alphabetical) && this.f71407a == ((Alphabetical) obj2).f71407a;
        }

        public final int hashCode() {
            return this.f71407a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71407a.name());
        }

        public Alphabetical(tt5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71407a = ordination;
        }

        public /* synthetic */ Alphabetical(int i) {
            this(tt5.a.ASCENDING);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType$MarketCap;", "Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarketCap extends CryptoInvestmentsSortingType {

        @NotNull
        public static final Parcelable.Creator<MarketCap> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tt5.a f71408a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketCap(tt5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketCap[i];
            }
        }

        public MarketCap() {
            this(0);
        }

        @Override // com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final tt5.a getF71410a() {
            return this.f71408a;
        }

        @Override // com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType
        public final CryptoInvestmentsSortingType c() {
            return new MarketCap(b.H(this.f71408a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarketCap) && this.f71408a == ((MarketCap) obj2).f71408a;
        }

        public final int hashCode() {
            return this.f71408a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71408a.name());
        }

        public MarketCap(tt5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71408a = ordination;
        }

        public /* synthetic */ MarketCap(int i) {
            this(tt5.a.DESCENDING);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType$Performance;", "Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Performance extends CryptoInvestmentsSortingType {

        @NotNull
        public static final Parcelable.Creator<Performance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tt5.a f71409a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Performance(tt5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Performance[i];
            }
        }

        public Performance() {
            this(0);
        }

        @Override // com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final tt5.a getF71410a() {
            return this.f71409a;
        }

        @Override // com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType
        public final CryptoInvestmentsSortingType c() {
            return new Performance(b.H(this.f71409a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Performance) && this.f71409a == ((Performance) obj2).f71409a;
        }

        public final int hashCode() {
            return this.f71409a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71409a.name());
        }

        public Performance(tt5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71409a = ordination;
        }

        public /* synthetic */ Performance(int i) {
            this(tt5.a.DESCENDING);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType$TotalValue;", "Lcom/revolut/feature/crypto_investments/api/widget/investments/sorting/CryptoInvestmentsSortingType;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalValue extends CryptoInvestmentsSortingType {

        @NotNull
        public static final Parcelable.Creator<TotalValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tt5.a f71410a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TotalValue(tt5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalValue[i];
            }
        }

        public TotalValue() {
            this(0);
        }

        @Override // com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final tt5.a getF71410a() {
            return this.f71410a;
        }

        @Override // com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType
        public final CryptoInvestmentsSortingType c() {
            return new TotalValue(b.H(this.f71410a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TotalValue) && this.f71410a == ((TotalValue) obj2).f71410a;
        }

        public final int hashCode() {
            return this.f71410a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71410a.name());
        }

        public TotalValue(tt5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71410a = ordination;
        }

        public /* synthetic */ TotalValue(int i) {
            this(tt5.a.DESCENDING);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private CryptoInvestmentsSortingType() {
    }

    /* JADX INFO: renamed from: a */
    public abstract a getF71410a();

    public final String b() {
        String strM = o0.f186429a.b(getClass()).m();
        String lowerCase = getF71410a().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return strM + "-" + lowerCase;
    }

    public abstract CryptoInvestmentsSortingType c();
}
