package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsTile;", "Landroid/os/Parcelable;", "<init>", "()V", "Hero", "Logo", "Regular", "DiscoverMore", "Lcom/revolut/feature/store/api/model/StoreDealsTile$DiscoverMore;", "Lcom/revolut/feature/store/api/model/StoreDealsTile$Hero;", "Lcom/revolut/feature/store/api/model/StoreDealsTile$Logo;", "Lcom/revolut/feature/store/api/model/StoreDealsTile$Regular;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoreDealsTile implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsTile$DiscoverMore;", "Lcom/revolut/feature/store/api/model/StoreDealsTile;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DiscoverMore extends StoreDealsTile {

        @NotNull
        public static final Parcelable.Creator<DiscoverMore> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88490c;
        public final String d;
        public final String e;
        public final StoreLogoBadge f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f88491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final StoreDealsOfferContext f88492h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                StoreLogoBadge storeLogoBadgeCreateFromParcel = StoreLogoBadge.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreGenericBadge.CREATOR, parcel, arrayList, iA, 1);
                }
                return new DiscoverMore(string, string2, string3, string4, string5, storeLogoBadgeCreateFromParcel, arrayList, (StoreDealsOfferContext) parcel.readParcelable(DiscoverMore.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DiscoverMore[i];
            }
        }

        public DiscoverMore(String id10, String title, String str, String backgroundImageUrl, String logoUrl, StoreLogoBadge logoBadge, ArrayList badges, StoreDealsOfferContext storeDealsOfferContext) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
            Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
            Intrinsics.checkNotNullParameter(logoBadge, "logoBadge");
            Intrinsics.checkNotNullParameter(badges, "badges");
            this.f88488a = id10;
            this.f88489b = title;
            this.f88490c = str;
            this.d = backgroundImageUrl;
            this.e = logoUrl;
            this.f = logoBadge;
            this.f88491g = badges;
            this.f88492h = storeDealsOfferContext;
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
            return Intrinsics.f(this.f88488a, discoverMore.f88488a) && Intrinsics.f(this.f88489b, discoverMore.f88489b) && Intrinsics.f(this.f88490c, discoverMore.f88490c) && Intrinsics.f(this.d, discoverMore.d) && Intrinsics.f(this.e, discoverMore.e) && Intrinsics.f(this.f, discoverMore.f) && this.f88491g.equals(discoverMore.f88491g) && Intrinsics.f(this.f88492h, discoverMore.f88492h);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f88488a.hashCode() * 31, 31, this.f88489b);
            String str = this.f88490c;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f88491g, (this.f.hashCode() + p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31);
            StoreDealsOfferContext storeDealsOfferContext = this.f88492h;
            return iB + (storeDealsOfferContext != null ? storeDealsOfferContext.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88488a);
            dest.writeString(this.f88489b);
            dest.writeString(this.f88490c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            this.f.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f88491g, dest);
            while (itY.hasNext()) {
                ((StoreGenericBadge) itY.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f88492h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsTile$Hero;", "Lcom/revolut/feature/store/api/model/StoreDealsTile;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Hero extends StoreDealsTile {

        @NotNull
        public static final Parcelable.Creator<Hero> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88495c;
        public final String d;
        public final ArrayList e;
        public final StoreDealsOfferContext f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreGenericBadge.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Hero(string, string2, string3, string4, arrayList, (StoreDealsOfferContext) parcel.readParcelable(Hero.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hero[i];
            }
        }

        public Hero(String id10, String str, String str2, String backgroundImageUrl, ArrayList badges, StoreDealsOfferContext storeDealsOfferContext) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
            Intrinsics.checkNotNullParameter(badges, "badges");
            this.f88493a = id10;
            this.f88494b = str;
            this.f88495c = str2;
            this.d = backgroundImageUrl;
            this.e = badges;
            this.f = storeDealsOfferContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Hero)) {
                return false;
            }
            Hero hero = (Hero) obj2;
            return Intrinsics.f(this.f88493a, hero.f88493a) && Intrinsics.f(this.f88494b, hero.f88494b) && Intrinsics.f(this.f88495c, hero.f88495c) && Intrinsics.f(this.d, hero.d) && this.e.equals(hero.e) && Intrinsics.f(this.f, hero.f);
        }

        public final int hashCode() {
            int iHashCode = this.f88493a.hashCode() * 31;
            String str = this.f88494b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f88495c;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31);
            StoreDealsOfferContext storeDealsOfferContext = this.f;
            return iB + (storeDealsOfferContext != null ? storeDealsOfferContext.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88493a);
            dest.writeString(this.f88494b);
            dest.writeString(this.f88495c);
            dest.writeString(this.d);
            Iterator itY = j6.a.y(this.e, dest);
            while (itY.hasNext()) {
                ((StoreGenericBadge) itY.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsTile$Logo;", "Lcom/revolut/feature/store/api/model/StoreDealsTile;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Logo extends StoreDealsTile {

        @NotNull
        public static final Parcelable.Creator<Logo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88498c;
        public final StoreLogoBadge d;
        public final StoreDealsOfferContext e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Logo(parcel.readString(), parcel.readString(), parcel.readString(), StoreLogoBadge.CREATOR.createFromParcel(parcel), (StoreDealsOfferContext) parcel.readParcelable(Logo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Logo[i];
            }
        }

        public Logo(String id10, String title, String logoUrl, StoreLogoBadge logoBadge, StoreDealsOfferContext storeDealsOfferContext) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
            Intrinsics.checkNotNullParameter(logoBadge, "logoBadge");
            this.f88496a = id10;
            this.f88497b = title;
            this.f88498c = logoUrl;
            this.d = logoBadge;
            this.e = storeDealsOfferContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) obj2;
            return Intrinsics.f(this.f88496a, logo.f88496a) && Intrinsics.f(this.f88497b, logo.f88497b) && Intrinsics.f(this.f88498c, logo.f88498c) && Intrinsics.f(this.d, logo.d) && Intrinsics.f(this.e, logo.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f88496a.hashCode() * 31, 31, this.f88497b), 31, this.f88498c)) * 31;
            StoreDealsOfferContext storeDealsOfferContext = this.e;
            return iHashCode + (storeDealsOfferContext == null ? 0 : storeDealsOfferContext.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88496a);
            dest.writeString(this.f88497b);
            dest.writeString(this.f88498c);
            this.d.writeToParcel(dest, i);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreDealsTile$Regular;", "Lcom/revolut/feature/store/api/model/StoreDealsTile;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular extends StoreDealsTile {

        @NotNull
        public static final Parcelable.Creator<Regular> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88501c;
        public final StoreRichText d;
        public final String e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final StoreDealsOfferContext f88502g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                StoreRichText storeRichTextCreateFromParcel = parcel.readInt() == 0 ? null : StoreRichText.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreGenericBadge.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Regular(string, string2, string3, storeRichTextCreateFromParcel, string4, arrayList, (StoreDealsOfferContext) parcel.readParcelable(Regular.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Regular[i];
            }
        }

        public Regular(String id10, String str, String str2, StoreRichText storeRichText, String backgroundImageUrl, ArrayList badges, StoreDealsOfferContext storeDealsOfferContext) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
            Intrinsics.checkNotNullParameter(badges, "badges");
            this.f88499a = id10;
            this.f88500b = str;
            this.f88501c = str2;
            this.d = storeRichText;
            this.e = backgroundImageUrl;
            this.f = badges;
            this.f88502g = storeDealsOfferContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) obj2;
            return Intrinsics.f(this.f88499a, regular.f88499a) && Intrinsics.f(this.f88500b, regular.f88500b) && Intrinsics.f(this.f88501c, regular.f88501c) && Intrinsics.f(this.d, regular.d) && Intrinsics.f(this.e, regular.e) && this.f.equals(regular.f) && Intrinsics.f(this.f88502g, regular.f88502g);
        }

        public final int hashCode() {
            int iHashCode = this.f88499a.hashCode() * 31;
            String str = this.f88500b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f88501c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            StoreRichText storeRichText = this.d;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, p.a.c((iHashCode3 + (storeRichText == null ? 0 : storeRichText.hashCode())) * 31, 31, this.e), 31);
            StoreDealsOfferContext storeDealsOfferContext = this.f88502g;
            return iB + (storeDealsOfferContext != null ? storeDealsOfferContext.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88499a);
            dest.writeString(this.f88500b);
            dest.writeString(this.f88501c);
            StoreRichText storeRichText = this.d;
            if (storeRichText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeRichText.writeToParcel(dest, i);
            }
            dest.writeString(this.e);
            Iterator itY = j6.a.y(this.f, dest);
            while (itY.hasNext()) {
                ((StoreGenericBadge) itY.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f88502g, i);
        }
    }

    private StoreDealsTile() {
    }
}
