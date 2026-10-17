package com.revolut.feature.product_article.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Period;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour;", "Landroid/os/Parcelable;", "AlwaysShow", "SkipIfWasAlreadyShown", "SkipIfWasShownWithinPeriod", "Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour$AlwaysShow;", "Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour$SkipIfWasAlreadyShown;", "Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour$SkipIfWasShownWithinPeriod;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SkipShownArticleBehaviour extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour$AlwaysShow;", "Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour;", "<init>", "()V", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AlwaysShow implements SkipShownArticleBehaviour {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AlwaysShow f81285a = new AlwaysShow();

        @NotNull
        public static final Parcelable.Creator<AlwaysShow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AlwaysShow.f81285a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AlwaysShow[i];
            }
        }

        private AlwaysShow() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour$SkipIfWasAlreadyShown;", "Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour;", "<init>", "()V", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SkipIfWasAlreadyShown implements SkipShownArticleBehaviour {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SkipIfWasAlreadyShown f81286a = new SkipIfWasAlreadyShown();

        @NotNull
        public static final Parcelable.Creator<SkipIfWasAlreadyShown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SkipIfWasAlreadyShown.f81286a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SkipIfWasAlreadyShown[i];
            }
        }

        private SkipIfWasAlreadyShown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour$SkipIfWasShownWithinPeriod;", "Lcom/revolut/feature/product_article/api/navigation/SkipShownArticleBehaviour;", "", "toString", "()Ljava/lang/String;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SkipIfWasShownWithinPeriod implements SkipShownArticleBehaviour {

        @NotNull
        public static final Parcelable.Creator<SkipIfWasShownWithinPeriod> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Period f81287a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SkipIfWasShownWithinPeriod((Period) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SkipIfWasShownWithinPeriod[i];
            }
        }

        public SkipIfWasShownWithinPeriod(Period period) {
            Intrinsics.checkNotNullParameter(period, "period");
            this.f81287a = period;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SkipIfWasShownWithinPeriod) && Intrinsics.f(this.f81287a, ((SkipIfWasShownWithinPeriod) obj2).f81287a);
        }

        public final int hashCode() {
            return this.f81287a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81287a);
        }
    }
}
