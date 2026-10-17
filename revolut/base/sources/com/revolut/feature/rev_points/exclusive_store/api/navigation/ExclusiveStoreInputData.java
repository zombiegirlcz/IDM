package com.revolut.feature.rev_points.exclusive_store.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Onboarding", "Checkout", "SoldOut", "ComingSoon", "ArticleReference", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$Checkout;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ComingSoon;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$Onboarding;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$SoldOut;", "feature_rev_points_exclusive_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExclusiveStoreInputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ArticleReference;", "Landroid/os/Parcelable;", "<init>", "()V", "ReferenceKey", "ReferenceId", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ArticleReference$ReferenceId;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ArticleReference$ReferenceKey;", "feature_rev_points_exclusive_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ArticleReference implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ArticleReference$ReferenceId;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ArticleReference;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReferenceId extends ArticleReference {

            @NotNull
            public static final Parcelable.Creator<ReferenceId> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f83569a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ReferenceId(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ReferenceId[i];
                }
            }

            public ReferenceId(String productArticleId) {
                Intrinsics.checkNotNullParameter(productArticleId, "productArticleId");
                this.f83569a = productArticleId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ReferenceId) && Intrinsics.f(this.f83569a, ((ReferenceId) obj2).f83569a);
            }

            public final int hashCode() {
                return this.f83569a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83569a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ArticleReference$ReferenceKey;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ArticleReference;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReferenceKey extends ArticleReference {

            @NotNull
            public static final Parcelable.Creator<ReferenceKey> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f83570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f83571b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ReferenceKey(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ReferenceKey[i];
                }
            }

            public ReferenceKey(String productName, String storyName) {
                Intrinsics.checkNotNullParameter(productName, "productName");
                Intrinsics.checkNotNullParameter(storyName, "storyName");
                this.f83570a = productName;
                this.f83571b = storyName;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ReferenceKey)) {
                    return false;
                }
                ReferenceKey referenceKey = (ReferenceKey) obj2;
                return Intrinsics.f(this.f83570a, referenceKey.f83570a) && Intrinsics.f(this.f83571b, referenceKey.f83571b);
            }

            public final int hashCode() {
                return this.f83571b.hashCode() + (this.f83570a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83570a);
                dest.writeString(this.f83571b);
            }
        }

        private ArticleReference() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$Checkout;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements ExclusiveStoreInputData {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83572a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83572a = productId;
        }

        @Override // com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData
        /* JADX INFO: renamed from: T5, reason: from getter */
        public final String getF83576a() {
            return this.f83572a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checkout) && Intrinsics.f(this.f83572a, ((Checkout) obj2).f83572a);
        }

        public final int hashCode() {
            return this.f83572a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83572a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$ComingSoon;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ComingSoon implements ExclusiveStoreInputData {

        @NotNull
        public static final Parcelable.Creator<ComingSoon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83573a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComingSoon(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComingSoon[i];
            }
        }

        public ComingSoon(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83573a = productId;
        }

        @Override // com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData
        /* JADX INFO: renamed from: T5, reason: from getter */
        public final String getF83576a() {
            return this.f83573a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ComingSoon) && Intrinsics.f(this.f83573a, ((ComingSoon) obj2).f83573a);
        }

        public final int hashCode() {
            return this.f83573a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83573a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$Onboarding;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarding implements ExclusiveStoreInputData {

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArticleReference f83575b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onboarding(parcel.readString(), (ArticleReference) parcel.readParcelable(Onboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        public Onboarding(String productId, ArticleReference articleReference) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(articleReference, "articleReference");
            this.f83574a = productId;
            this.f83575b = articleReference;
        }

        @Override // com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData
        /* JADX INFO: renamed from: T5, reason: from getter */
        public final String getF83576a() {
            return this.f83574a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) obj2;
            return Intrinsics.f(this.f83574a, onboarding.f83574a) && Intrinsics.f(this.f83575b, onboarding.f83575b);
        }

        public final int hashCode() {
            return this.f83575b.hashCode() + (this.f83574a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83574a);
            dest.writeParcelable(this.f83575b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData$SoldOut;", "Lcom/revolut/feature/rev_points/exclusive_store/api/navigation/ExclusiveStoreInputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SoldOut implements ExclusiveStoreInputData {

        @NotNull
        public static final Parcelable.Creator<SoldOut> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83576a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SoldOut(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SoldOut[i];
            }
        }

        public SoldOut(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83576a = productId;
        }

        @Override // com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData
        /* JADX INFO: renamed from: T5, reason: from getter */
        public final String getF83576a() {
            return this.f83576a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SoldOut) && Intrinsics.f(this.f83576a, ((SoldOut) obj2).f83576a);
        }

        public final int hashCode() {
            return this.f83576a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83576a);
        }
    }

    /* JADX INFO: renamed from: T5 */
    String getF83576a();
}
