package com.revolut.feature.shared.savings.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/OnboardingConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "DiscoverItems", "ReviewDetailsScreenConfig", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductGroup.TextWithExplanation f86513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f86514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DiscoverItems f86515c;
    public final ReviewDetailsScreenConfig d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/OnboardingConfig$DiscoverItems;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Protection", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DiscoverItems implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DiscoverItems> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Protection f86516a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/OnboardingConfig$DiscoverItems$Protection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Protection implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Protection> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86518b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Protection(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Protection[i];
                }
            }

            public Protection(String title, String description) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.f86517a = title;
                this.f86518b = description;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Protection)) {
                    return false;
                }
                Protection protection = (Protection) obj2;
                return Intrinsics.f(this.f86517a, protection.f86517a) && Intrinsics.f(this.f86518b, protection.f86518b);
            }

            public final int hashCode() {
                return this.f86518b.hashCode() + (this.f86517a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86517a);
                dest.writeString(this.f86518b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DiscoverItems(parcel.readInt() == 0 ? null : Protection.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DiscoverItems[i];
            }
        }

        public DiscoverItems(Protection protection) {
            this.f86516a = protection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DiscoverItems) && Intrinsics.f(this.f86516a, ((DiscoverItems) obj2).f86516a);
        }

        public final int hashCode() {
            Protection protection = this.f86516a;
            if (protection == null) {
                return 0;
            }
            return protection.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Protection protection = this.f86516a;
            if (protection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                protection.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/OnboardingConfig$ReviewDetailsScreenConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Header", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewDetailsScreenConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ReviewDetailsScreenConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Header f86519a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/OnboardingConfig$ReviewDetailsScreenConfig$Header;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Header implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Header> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f86520a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Header(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Header[i];
                }
            }

            public Header(boolean z) {
                this.f86520a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Header) && this.f86520a == ((Header) obj2).f86520a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f86520a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f86520a ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewDetailsScreenConfig(parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewDetailsScreenConfig[i];
            }
        }

        public ReviewDetailsScreenConfig(Header header) {
            this.f86519a = header;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewDetailsScreenConfig) && Intrinsics.f(this.f86519a, ((ReviewDetailsScreenConfig) obj2).f86519a);
        }

        public final int hashCode() {
            Header header = this.f86519a;
            if (header == null) {
                return 0;
            }
            return Boolean.hashCode(header.f86520a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Header header = this.f86519a;
            if (header == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                header.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ProductGroup.TextWithExplanation textWithExplanationCreateFromParcel = parcel.readInt() == 0 ? null : ProductGroup.TextWithExplanation.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OnboardingConfig(textWithExplanationCreateFromParcel, boolValueOf, parcel.readInt() == 0 ? null : DiscoverItems.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ReviewDetailsScreenConfig.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingConfig[i];
        }
    }

    public OnboardingConfig(ProductGroup.TextWithExplanation textWithExplanation, Boolean bool, DiscoverItems discoverItems, ReviewDetailsScreenConfig reviewDetailsScreenConfig) {
        this.f86513a = textWithExplanation;
        this.f86514b = bool;
        this.f86515c = discoverItems;
        this.d = reviewDetailsScreenConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingConfig)) {
            return false;
        }
        OnboardingConfig onboardingConfig = (OnboardingConfig) obj2;
        return Intrinsics.f(this.f86513a, onboardingConfig.f86513a) && Intrinsics.f(this.f86514b, onboardingConfig.f86514b) && Intrinsics.f(this.f86515c, onboardingConfig.f86515c) && Intrinsics.f(this.d, onboardingConfig.d);
    }

    public final int hashCode() {
        ProductGroup.TextWithExplanation textWithExplanation = this.f86513a;
        int iHashCode = (textWithExplanation == null ? 0 : textWithExplanation.hashCode()) * 31;
        Boolean bool = this.f86514b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DiscoverItems discoverItems = this.f86515c;
        int iHashCode3 = (iHashCode2 + (discoverItems == null ? 0 : discoverItems.hashCode())) * 31;
        ReviewDetailsScreenConfig reviewDetailsScreenConfig = this.d;
        return iHashCode3 + (reviewDetailsScreenConfig != null ? reviewDetailsScreenConfig.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ProductGroup.TextWithExplanation textWithExplanation = this.f86513a;
        if (textWithExplanation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textWithExplanation.writeToParcel(dest, i);
        }
        Boolean bool = this.f86514b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        DiscoverItems discoverItems = this.f86515c;
        if (discoverItems == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            discoverItems.writeToParcel(dest, i);
        }
        ReviewDetailsScreenConfig reviewDetailsScreenConfig = this.d;
        if (reviewDetailsScreenConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reviewDetailsScreenConfig.writeToParcel(dest, i);
        }
    }
}
