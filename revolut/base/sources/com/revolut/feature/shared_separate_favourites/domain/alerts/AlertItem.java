package com.revolut.feature.shared_separate_favourites.domain.alerts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import d9.e1;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mgd.d;
import mgd.e;
import mgd.f;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import t61.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/alerts/AlertItem;", "Landroid/os/Parcelable;", "<init>", "()V", "TargetPrice", "Volatility", "Lcom/revolut/feature/shared_separate_favourites/domain/alerts/AlertItem$TargetPrice;", "Lcom/revolut/feature/shared_separate_favourites/domain/alerts/AlertItem$Volatility;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AlertItem implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/alerts/AlertItem$TargetPrice;", "Lcom/revolut/feature/shared_separate_favourites/domain/alerts/AlertItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetPrice extends AlertItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FavouritesAssetDetails f86871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86872c;
        public final BigDecimal d;
        public final DateTime e;
        public final BigDecimal f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f86873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final DateTime f86874h;
        public final mgd.b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f86875j;
        public final f k = f.TARGET_PRICE;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<TargetPrice> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem$TargetPrice$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static TargetPrice a(String id10, FavouritesAssetDetails from, String to6, BigDecimal targetRate, DateTime createdAt, BigDecimal bigDecimal, String note, DateTime dateTime, mgd.b frequency) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(targetRate, "targetRate");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                Intrinsics.checkNotNullParameter(note, "note");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                BigDecimal bigDecimalR = e1.R(targetRate);
                DateTime dateTime2 = createdAt.toDateTime(DateTimeZone.UTC);
                Intrinsics.checkNotNullExpressionValue(dateTime2, "toDateTime(...)");
                return new TargetPrice(id10, from, to6, bigDecimalR, dateTime2, bigDecimal != null ? e1.R(bigDecimal) : null, note, dateTime, frequency, dateTime != null ? d.COMPLETED : d.ACTIVE);
            }

            public static /* synthetic */ TargetPrice b(Companion companion, String str, FavouritesAssetDetails favouritesAssetDetails, String str2, BigDecimal bigDecimal, DateTime dateTime, BigDecimal bigDecimal2, mgd.b bVar) {
                companion.getClass();
                return a(str, favouritesAssetDetails, str2, bigDecimal, dateTime, bigDecimal2, "", null, bVar);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetPrice(parcel.readString(), FavouritesAssetDetails.CREATOR.createFromParcel(parcel), parcel.readString(), (BigDecimal) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (DateTime) parcel.readSerializable(), mgd.b.valueOf(parcel.readString()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetPrice[i];
            }
        }

        public TargetPrice(String str, FavouritesAssetDetails favouritesAssetDetails, String str2, BigDecimal bigDecimal, DateTime dateTime, BigDecimal bigDecimal2, String str3, DateTime dateTime2, mgd.b bVar, d dVar) {
            this.f86870a = str;
            this.f86871b = favouritesAssetDetails;
            this.f86872c = str2;
            this.d = bigDecimal;
            this.e = dateTime;
            this.f = bigDecimal2;
            this.f86873g = str3;
            this.f86874h = dateTime2;
            this.i = bVar;
            this.f86875j = dVar;
        }

        public static TargetPrice T(TargetPrice targetPrice, FavouritesAssetDetails favouritesAssetDetails, BigDecimal bigDecimal, int i) {
            String id10 = targetPrice.f86870a;
            if ((i & 2) != 0) {
                favouritesAssetDetails = targetPrice.f86871b;
            }
            FavouritesAssetDetails from = favouritesAssetDetails;
            String to6 = targetPrice.f86872c;
            BigDecimal targetRate = targetPrice.d;
            DateTime createdAt = targetPrice.e;
            if ((i & 32) != 0) {
                bigDecimal = targetPrice.f;
            }
            String note = targetPrice.f86873g;
            DateTime dateTime = targetPrice.f86874h;
            mgd.b frequency = targetPrice.i;
            d state = targetPrice.f86875j;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            Intrinsics.checkNotNullParameter(targetRate, "targetRate");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(note, "note");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(state, "state");
            return new TargetPrice(id10, from, to6, targetRate, createdAt, bigDecimal, note, dateTime, frequency, state);
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: J, reason: from getter */
        public final f getI() {
            return this.k;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DateTime getF86874h() {
            return this.f86874h;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: b, reason: from getter */
        public final DateTime getE() {
            return this.e;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: c, reason: from getter */
        public final FavouritesAssetDetails getF86877b() {
            return this.f86871b;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF() {
            return this.f86873g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: e, reason: from getter */
        public final d getF86880h() {
            return this.f86875j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TargetPrice)) {
                return false;
            }
            TargetPrice targetPrice = (TargetPrice) obj2;
            return Intrinsics.f(this.f86870a, targetPrice.f86870a) && Intrinsics.f(this.f86871b, targetPrice.f86871b) && Intrinsics.f(this.f86872c, targetPrice.f86872c) && Intrinsics.f(this.d, targetPrice.d) && Intrinsics.f(this.e, targetPrice.e) && Intrinsics.f(this.f, targetPrice.f) && Intrinsics.f(this.f86873g, targetPrice.f86873g) && Intrinsics.f(this.f86874h, targetPrice.f86874h) && this.i == targetPrice.i && this.f86875j == targetPrice.f86875j;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF86876a() {
            return this.f86870a;
        }

        public final int hashCode() {
            int iF = m72.b.f(this.e, a.d(this.d, p.a.c((this.f86871b.hashCode() + (this.f86870a.hashCode() * 31)) * 31, 31, this.f86872c), 31), 31);
            BigDecimal bigDecimal = this.f;
            int iC = p.a.c((iF + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.f86873g);
            DateTime dateTime = this.f86874h;
            return this.f86875j.hashCode() + ((this.i.hashCode() + ((iC + (dateTime != null ? dateTime.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: j, reason: from getter */
        public final BigDecimal getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86870a);
            this.f86871b.writeToParcel(dest, i);
            dest.writeString(this.f86872c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
            dest.writeString(this.f86873g);
            dest.writeSerializable(this.f86874h);
            dest.writeString(this.i.name());
            dest.writeString(this.f86875j.name());
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getF86878c() {
            return this.f86872c;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/alerts/AlertItem$Volatility;", "Lcom/revolut/feature/shared_separate_favourites/domain/alerts/AlertItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Volatility extends AlertItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FavouritesAssetDetails f86877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86878c;
        public final BigDecimal d;
        public final DateTime e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e f86879g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d f86880h = d.ACTIVE;
        public final f i = f.PRICE_CHANGE;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Volatility> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem$Volatility$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Volatility a(String id10, FavouritesAssetDetails from, String to6, BigDecimal percentage, DateTime createdAt, String note, e timeRange) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(percentage, "percentage");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                Intrinsics.checkNotNullParameter(note, "note");
                Intrinsics.checkNotNullParameter(timeRange, "timeRange");
                BigDecimal bigDecimalR = e1.R(percentage);
                DateTime dateTime = createdAt.toDateTime(DateTimeZone.UTC);
                Intrinsics.checkNotNullExpressionValue(dateTime, "toDateTime(...)");
                return new Volatility(id10, from, to6, bigDecimalR, dateTime, note, timeRange);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Volatility(parcel.readString(), FavouritesAssetDetails.CREATOR.createFromParcel(parcel), parcel.readString(), (BigDecimal) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readString(), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Volatility[i];
            }
        }

        public Volatility(String str, FavouritesAssetDetails favouritesAssetDetails, String str2, BigDecimal bigDecimal, DateTime dateTime, String str3, e eVar) {
            this.f86876a = str;
            this.f86877b = favouritesAssetDetails;
            this.f86878c = str2;
            this.d = bigDecimal;
            this.e = dateTime;
            this.f = str3;
            this.f86879g = eVar;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: J, reason: from getter */
        public final f getI() {
            return this.i;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: a */
        public final DateTime getF86874h() {
            return null;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: b, reason: from getter */
        public final DateTime getE() {
            return this.e;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: c, reason: from getter */
        public final FavouritesAssetDetails getF86877b() {
            return this.f86877b;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: e, reason: from getter */
        public final d getF86880h() {
            return this.f86880h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Volatility)) {
                return false;
            }
            Volatility volatility = (Volatility) obj2;
            return Intrinsics.f(this.f86876a, volatility.f86876a) && Intrinsics.f(this.f86877b, volatility.f86877b) && Intrinsics.f(this.f86878c, volatility.f86878c) && Intrinsics.f(this.d, volatility.d) && Intrinsics.f(this.e, volatility.e) && Intrinsics.f(this.f, volatility.f) && this.f86879g == volatility.f86879g;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF86876a() {
            return this.f86876a;
        }

        public final int hashCode() {
            return this.f86879g.hashCode() + p.a.c(m72.b.f(this.e, a.d(this.d, p.a.c((this.f86877b.hashCode() + (this.f86876a.hashCode() * 31)) * 31, 31, this.f86878c), 31), 31), 31, this.f);
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: j, reason: from getter */
        public final BigDecimal getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86876a);
            this.f86877b.writeToParcel(dest, i);
            dest.writeString(this.f86878c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f86879g.name());
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getF86878c() {
            return this.f86878c;
        }
    }

    private AlertItem() {
    }

    /* JADX INFO: renamed from: J */
    public abstract f getI();

    /* JADX INFO: renamed from: a */
    public abstract DateTime getF86874h();

    /* JADX INFO: renamed from: b */
    public abstract DateTime getE();

    /* JADX INFO: renamed from: c */
    public abstract FavouritesAssetDetails getF86877b();

    /* JADX INFO: renamed from: d */
    public abstract String getF();

    /* JADX INFO: renamed from: e */
    public abstract d getF86880h();

    /* JADX INFO: renamed from: getId */
    public abstract String getF86876a();

    /* JADX INFO: renamed from: j */
    public abstract BigDecimal getD();

    /* JADX INFO: renamed from: z */
    public abstract String getF86878c();
}
