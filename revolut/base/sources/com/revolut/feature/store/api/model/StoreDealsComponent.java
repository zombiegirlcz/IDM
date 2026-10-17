package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsComponent;", "Landroid/os/Parcelable;", "<init>", "()V", "HeroCarousel", "LogosGrid", "RegularCarousel", "DiscoverMore", "RewardsNearby", "Lcom/revolut/feature/store/api/model/StoreDealsComponent$DiscoverMore;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent$HeroCarousel;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent$LogosGrid;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent$RegularCarousel;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent$RewardsNearby;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoreDealsComponent implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsComponent$DiscoverMore;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DiscoverMore extends StoreDealsComponent {

        @NotNull
        public static final Parcelable.Creator<DiscoverMore> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f88473c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(DiscoverMore.class, parcel, arrayList, iE, 1);
                }
                return new DiscoverMore(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DiscoverMore[i];
            }
        }

        public DiscoverMore(String id10, String title, ArrayList tiles) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tiles, "tiles");
            this.f88471a = id10;
            this.f88472b = title;
            this.f88473c = tiles;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DiscoverMore)) {
                return false;
            }
            DiscoverMore discoverMore = (DiscoverMore) obj2;
            return Intrinsics.f(this.f88471a, discoverMore.f88471a) && Intrinsics.f(this.f88472b, discoverMore.f88472b) && this.f88473c.equals(discoverMore.f88473c);
        }

        public final int hashCode() {
            return this.f88473c.hashCode() + p.a.c(this.f88471a.hashCode() * 31, 31, this.f88472b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88471a);
            dest.writeString(this.f88472b);
            Iterator itY = j6.a.y(this.f88473c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsComponent$HeroCarousel;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HeroCarousel extends StoreDealsComponent {

        @NotNull
        public static final Parcelable.Creator<HeroCarousel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f88475b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(HeroCarousel.class, parcel, arrayList, iE, 1);
                }
                return new HeroCarousel(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HeroCarousel[i];
            }
        }

        public HeroCarousel(String id10, ArrayList tiles) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(tiles, "tiles");
            this.f88474a = id10;
            this.f88475b = tiles;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HeroCarousel)) {
                return false;
            }
            HeroCarousel heroCarousel = (HeroCarousel) obj2;
            return Intrinsics.f(this.f88474a, heroCarousel.f88474a) && this.f88475b.equals(heroCarousel.f88475b);
        }

        public final int hashCode() {
            return this.f88475b.hashCode() + (this.f88474a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88474a);
            Iterator itY = j6.a.y(this.f88475b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsComponent$LogosGrid;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LogosGrid extends StoreDealsComponent {

        @NotNull
        public static final Parcelable.Creator<LogosGrid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f88478c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(LogosGrid.class, parcel, arrayList, iE, 1);
                }
                return new LogosGrid(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LogosGrid[i];
            }
        }

        public LogosGrid(String id10, String title, ArrayList tiles) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tiles, "tiles");
            this.f88476a = id10;
            this.f88477b = title;
            this.f88478c = tiles;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LogosGrid)) {
                return false;
            }
            LogosGrid logosGrid = (LogosGrid) obj2;
            return Intrinsics.f(this.f88476a, logosGrid.f88476a) && Intrinsics.f(this.f88477b, logosGrid.f88477b) && this.f88478c.equals(logosGrid.f88478c);
        }

        public final int hashCode() {
            return this.f88478c.hashCode() + p.a.c(this.f88476a.hashCode() * 31, 31, this.f88477b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88476a);
            dest.writeString(this.f88477b);
            Iterator itY = j6.a.y(this.f88478c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsComponent$RegularCarousel;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegularCarousel extends StoreDealsComponent {

        @NotNull
        public static final Parcelable.Creator<RegularCarousel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f88481c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(RegularCarousel.class, parcel, arrayList, iE, 1);
                }
                return new RegularCarousel(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegularCarousel[i];
            }
        }

        public RegularCarousel(String id10, String title, ArrayList tiles) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tiles, "tiles");
            this.f88479a = id10;
            this.f88480b = title;
            this.f88481c = tiles;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RegularCarousel)) {
                return false;
            }
            RegularCarousel regularCarousel = (RegularCarousel) obj2;
            return Intrinsics.f(this.f88479a, regularCarousel.f88479a) && Intrinsics.f(this.f88480b, regularCarousel.f88480b) && this.f88481c.equals(regularCarousel.f88481c);
        }

        public final int hashCode() {
            return this.f88481c.hashCode() + p.a.c(this.f88479a.hashCode() * 31, 31, this.f88480b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88479a);
            dest.writeString(this.f88480b);
            Iterator itY = j6.a.y(this.f88481c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsComponent$RewardsNearby;", "Lcom/revolut/feature/store/api/model/StoreDealsComponent;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardsNearby extends StoreDealsComponent {

        @NotNull
        public static final Parcelable.Creator<RewardsNearby> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StoreMapBox f88484c;
        public final ArrayList d;
        public final ArrayList e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                StoreMapBox storeMapBoxCreateFromParcel = StoreMapBox.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(StoreOutlet.CREATOR, parcel, arrayList, iA2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreCampaignOffer.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new RewardsNearby(string, string2, storeMapBoxCreateFromParcel, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardsNearby[i];
            }
        }

        public RewardsNearby(String id10, String title, StoreMapBox mapBox, ArrayList outlets, ArrayList campaignOffers) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(mapBox, "mapBox");
            Intrinsics.checkNotNullParameter(outlets, "outlets");
            Intrinsics.checkNotNullParameter(campaignOffers, "campaignOffers");
            this.f88482a = id10;
            this.f88483b = title;
            this.f88484c = mapBox;
            this.d = outlets;
            this.e = campaignOffers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RewardsNearby)) {
                return false;
            }
            RewardsNearby rewardsNearby = (RewardsNearby) obj2;
            return Intrinsics.f(this.f88482a, rewardsNearby.f88482a) && Intrinsics.f(this.f88483b, rewardsNearby.f88483b) && Intrinsics.f(this.f88484c, rewardsNearby.f88484c) && this.d.equals(rewardsNearby.d) && this.e.equals(rewardsNearby.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f88484c.hashCode() + p.a.c(this.f88482a.hashCode() * 31, 31, this.f88483b)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88482a);
            dest.writeString(this.f88483b);
            this.f88484c.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                ((StoreOutlet) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.e, dest);
            while (itY2.hasNext()) {
                ((StoreCampaignOffer) itY2.next()).writeToParcel(dest, i);
            }
        }
    }

    private StoreDealsComponent() {
    }
}
