package com.revolut.feature.revolutpay.promoted_merchants.models.merchants;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.EarningBadge;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/models/merchants/PromotedMerchant;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "Reward", "ShoppingOffer", "feature_revolut_pay_promoted_merchants_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromotedMerchant implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f84692c;
    public final String d;
    public final Reward e;
    public final ShoppingOffer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EarningBadge f84693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f84694h;

    @NotNull
    public static final Parcelable.Creator<PromotedMerchant> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/models/merchants/PromotedMerchant$Reward;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_promoted_merchants_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reward implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Reward> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f84695a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reward(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reward[i];
            }
        }

        public Reward(double d) {
            this.f84695a = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Reward) && Double.compare(this.f84695a, ((Reward) obj2).f84695a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f84695a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f84695a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/models/merchants/PromotedMerchant$ShoppingOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_promoted_merchants_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShoppingOffer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ShoppingOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84697b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShoppingOffer(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShoppingOffer[i];
            }
        }

        public ShoppingOffer(String brandId, String campaignId) {
            Intrinsics.checkNotNullParameter(brandId, "brandId");
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            this.f84696a = brandId;
            this.f84697b = campaignId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShoppingOffer)) {
                return false;
            }
            ShoppingOffer shoppingOffer = (ShoppingOffer) obj2;
            return Intrinsics.f(this.f84696a, shoppingOffer.f84696a) && Intrinsics.f(this.f84697b, shoppingOffer.f84697b);
        }

        public final int hashCode() {
            return this.f84697b.hashCode() + (this.f84696a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84696a);
            dest.writeString(this.f84697b);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(MerchantCategoryDetails.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PromotedMerchant(string, string2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Reward.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ShoppingOffer.CREATOR.createFromParcel(parcel) : null, (EarningBadge) parcel.readParcelable(PromotedMerchant.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromotedMerchant[i];
        }
    }

    public PromotedMerchant(String name, String logo, ArrayList categories, String str, Reward reward, ShoppingOffer shoppingOffer, EarningBadge earningBadge, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f84690a = name;
        this.f84691b = logo;
        this.f84692c = categories;
        this.d = str;
        this.e = reward;
        this.f = shoppingOffer;
        this.f84693g = earningBadge;
        this.f84694h = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PromotedMerchant)) {
            return false;
        }
        PromotedMerchant promotedMerchant = (PromotedMerchant) obj2;
        return Intrinsics.f(this.f84690a, promotedMerchant.f84690a) && Intrinsics.f(this.f84691b, promotedMerchant.f84691b) && this.f84692c.equals(promotedMerchant.f84692c) && Intrinsics.f(this.d, promotedMerchant.d) && Intrinsics.f(this.e, promotedMerchant.e) && Intrinsics.f(this.f, promotedMerchant.f) && Intrinsics.f(this.f84693g, promotedMerchant.f84693g) && Intrinsics.f(this.f84694h, promotedMerchant.f84694h);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f84692c, p.a.c(this.f84690a.hashCode() * 31, 31, this.f84691b), 31);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Reward reward = this.e;
        int iHashCode2 = (iHashCode + (reward == null ? 0 : Double.hashCode(reward.f84695a))) * 31;
        ShoppingOffer shoppingOffer = this.f;
        int iHashCode3 = (iHashCode2 + (shoppingOffer == null ? 0 : shoppingOffer.hashCode())) * 31;
        EarningBadge earningBadge = this.f84693g;
        int iHashCode4 = (iHashCode3 + (earningBadge == null ? 0 : earningBadge.hashCode())) * 31;
        String str2 = this.f84694h;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84690a);
        dest.writeString(this.f84691b);
        Iterator itY = j6.a.y(this.f84692c, dest);
        while (itY.hasNext()) {
            ((MerchantCategoryDetails) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d);
        Reward reward = this.e;
        if (reward == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reward.writeToParcel(dest, i);
        }
        ShoppingOffer shoppingOffer = this.f;
        if (shoppingOffer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shoppingOffer.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f84693g, i);
        dest.writeString(this.f84694h);
    }
}
