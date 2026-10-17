package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "StoreEarn", "StoreRedeem", "StoreMsi", "StoreDiscount", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreMegaOffer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreMegaOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88549c;
    public final String d;
    public final StoreLogoBadge e;
    public final StoreEarn f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StoreRedeem f88550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StoreMsi f88551h;
    public final StoreDiscount i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f88552j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaOffer$StoreDiscount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoreDiscount implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StoreDiscount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreShopsOffer f88553a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoreDiscount(parcel.readInt() == 0 ? null : StoreShopsOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoreDiscount[i];
            }
        }

        public StoreDiscount(StoreShopsOffer storeShopsOffer) {
            this.f88553a = storeShopsOffer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StoreDiscount) && Intrinsics.f(this.f88553a, ((StoreDiscount) obj2).f88553a);
        }

        public final int hashCode() {
            StoreShopsOffer storeShopsOffer = this.f88553a;
            if (storeShopsOffer == null) {
                return 0;
            }
            return storeShopsOffer.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StoreShopsOffer storeShopsOffer = this.f88553a;
            if (storeShopsOffer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeShopsOffer.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaOffer$StoreEarn;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoreEarn implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StoreEarn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreShopsOffer f88554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StoreShopsOffer f88555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StoreShopsOffer f88556c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoreEarn(parcel.readInt() == 0 ? null : StoreShopsOffer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StoreShopsOffer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StoreShopsOffer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoreEarn[i];
            }
        }

        public StoreEarn(StoreShopsOffer storeShopsOffer, StoreShopsOffer storeShopsOffer2, StoreShopsOffer storeShopsOffer3) {
            this.f88554a = storeShopsOffer;
            this.f88555b = storeShopsOffer2;
            this.f88556c = storeShopsOffer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StoreEarn)) {
                return false;
            }
            StoreEarn storeEarn = (StoreEarn) obj2;
            return Intrinsics.f(this.f88554a, storeEarn.f88554a) && Intrinsics.f(this.f88555b, storeEarn.f88555b) && Intrinsics.f(this.f88556c, storeEarn.f88556c);
        }

        public final int hashCode() {
            StoreShopsOffer storeShopsOffer = this.f88554a;
            int iHashCode = (storeShopsOffer == null ? 0 : storeShopsOffer.hashCode()) * 31;
            StoreShopsOffer storeShopsOffer2 = this.f88555b;
            int iHashCode2 = (iHashCode + (storeShopsOffer2 == null ? 0 : storeShopsOffer2.hashCode())) * 31;
            StoreShopsOffer storeShopsOffer3 = this.f88556c;
            return iHashCode2 + (storeShopsOffer3 != null ? storeShopsOffer3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StoreShopsOffer storeShopsOffer = this.f88554a;
            if (storeShopsOffer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeShopsOffer.writeToParcel(dest, i);
            }
            StoreShopsOffer storeShopsOffer2 = this.f88555b;
            if (storeShopsOffer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeShopsOffer2.writeToParcel(dest, i);
            }
            StoreShopsOffer storeShopsOffer3 = this.f88556c;
            if (storeShopsOffer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeShopsOffer3.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaOffer$StoreMsi;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoreMsi implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StoreMsi> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreShopsOffer f88557a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoreMsi(parcel.readInt() == 0 ? null : StoreShopsOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoreMsi[i];
            }
        }

        public StoreMsi(StoreShopsOffer storeShopsOffer) {
            this.f88557a = storeShopsOffer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StoreMsi) && Intrinsics.f(this.f88557a, ((StoreMsi) obj2).f88557a);
        }

        public final int hashCode() {
            StoreShopsOffer storeShopsOffer = this.f88557a;
            if (storeShopsOffer == null) {
                return 0;
            }
            return storeShopsOffer.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StoreShopsOffer storeShopsOffer = this.f88557a;
            if (storeShopsOffer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeShopsOffer.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaOffer$StoreRedeem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoreRedeem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StoreRedeem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreGiftcardsOffer f88558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StoreExclusivesOffer f88559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StoreShopsOffer f88560c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoreRedeem(parcel.readInt() == 0 ? null : StoreGiftcardsOffer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StoreExclusivesOffer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StoreShopsOffer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoreRedeem[i];
            }
        }

        public StoreRedeem(StoreGiftcardsOffer storeGiftcardsOffer, StoreExclusivesOffer storeExclusivesOffer, StoreShopsOffer storeShopsOffer) {
            this.f88558a = storeGiftcardsOffer;
            this.f88559b = storeExclusivesOffer;
            this.f88560c = storeShopsOffer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StoreRedeem)) {
                return false;
            }
            StoreRedeem storeRedeem = (StoreRedeem) obj2;
            return Intrinsics.f(this.f88558a, storeRedeem.f88558a) && Intrinsics.f(this.f88559b, storeRedeem.f88559b) && Intrinsics.f(this.f88560c, storeRedeem.f88560c);
        }

        public final int hashCode() {
            StoreGiftcardsOffer storeGiftcardsOffer = this.f88558a;
            int iHashCode = (storeGiftcardsOffer == null ? 0 : storeGiftcardsOffer.f88527a.hashCode()) * 31;
            StoreExclusivesOffer storeExclusivesOffer = this.f88559b;
            int iHashCode2 = (iHashCode + (storeExclusivesOffer == null ? 0 : storeExclusivesOffer.f88511a.hashCode())) * 31;
            StoreShopsOffer storeShopsOffer = this.f88560c;
            return iHashCode2 + (storeShopsOffer != null ? storeShopsOffer.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StoreGiftcardsOffer storeGiftcardsOffer = this.f88558a;
            if (storeGiftcardsOffer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeGiftcardsOffer.writeToParcel(dest, i);
            }
            StoreExclusivesOffer storeExclusivesOffer = this.f88559b;
            if (storeExclusivesOffer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeExclusivesOffer.writeToParcel(dest, i);
            }
            StoreShopsOffer storeShopsOffer = this.f88560c;
            if (storeShopsOffer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storeShopsOffer.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreMegaOffer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StoreLogoBadge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StoreEarn.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StoreRedeem.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StoreMsi.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StoreDiscount.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreMegaOffer[i];
        }
    }

    public StoreMegaOffer(String id10, String brandName, String str, String brandLogoUrl, StoreLogoBadge storeLogoBadge, StoreEarn storeEarn, StoreRedeem storeRedeem, StoreMsi storeMsi, StoreDiscount storeDiscount, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(brandLogoUrl, "brandLogoUrl");
        this.f88547a = id10;
        this.f88548b = brandName;
        this.f88549c = str;
        this.d = brandLogoUrl;
        this.e = storeLogoBadge;
        this.f = storeEarn;
        this.f88550g = storeRedeem;
        this.f88551h = storeMsi;
        this.i = storeDiscount;
        this.f88552j = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreMegaOffer)) {
            return false;
        }
        StoreMegaOffer storeMegaOffer = (StoreMegaOffer) obj2;
        return Intrinsics.f(this.f88547a, storeMegaOffer.f88547a) && Intrinsics.f(this.f88548b, storeMegaOffer.f88548b) && Intrinsics.f(this.f88549c, storeMegaOffer.f88549c) && Intrinsics.f(this.d, storeMegaOffer.d) && Intrinsics.f(this.e, storeMegaOffer.e) && Intrinsics.f(this.f, storeMegaOffer.f) && Intrinsics.f(this.f88550g, storeMegaOffer.f88550g) && Intrinsics.f(this.f88551h, storeMegaOffer.f88551h) && Intrinsics.f(this.i, storeMegaOffer.i) && Intrinsics.f(this.f88552j, storeMegaOffer.f88552j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f88547a.hashCode() * 31, 31, this.f88548b);
        String str = this.f88549c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        StoreLogoBadge storeLogoBadge = this.e;
        int iHashCode = (iC2 + (storeLogoBadge == null ? 0 : storeLogoBadge.hashCode())) * 31;
        StoreEarn storeEarn = this.f;
        int iHashCode2 = (iHashCode + (storeEarn == null ? 0 : storeEarn.hashCode())) * 31;
        StoreRedeem storeRedeem = this.f88550g;
        int iHashCode3 = (iHashCode2 + (storeRedeem == null ? 0 : storeRedeem.hashCode())) * 31;
        StoreMsi storeMsi = this.f88551h;
        int iHashCode4 = (iHashCode3 + (storeMsi == null ? 0 : storeMsi.hashCode())) * 31;
        StoreDiscount storeDiscount = this.i;
        int iHashCode5 = (iHashCode4 + (storeDiscount == null ? 0 : storeDiscount.hashCode())) * 31;
        String str2 = this.f88552j;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88547a);
        dest.writeString(this.f88548b);
        dest.writeString(this.f88549c);
        dest.writeString(this.d);
        StoreLogoBadge storeLogoBadge = this.e;
        if (storeLogoBadge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeLogoBadge.writeToParcel(dest, i);
        }
        StoreEarn storeEarn = this.f;
        if (storeEarn == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeEarn.writeToParcel(dest, i);
        }
        StoreRedeem storeRedeem = this.f88550g;
        if (storeRedeem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeRedeem.writeToParcel(dest, i);
        }
        StoreMsi storeMsi = this.f88551h;
        if (storeMsi == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeMsi.writeToParcel(dest, i);
        }
        StoreDiscount storeDiscount = this.i;
        if (storeDiscount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeDiscount.writeToParcel(dest, i);
        }
        dest.writeString(this.f88552j);
    }
}
