package com.revolut.feature.freelancer.api.article;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/api/article/FreelancerOnboardingArticleConfig;", "Landroid/os/Parcelable;", "ShowArticle", "DoNotShowArticle", "Lcom/revolut/feature/freelancer/api/article/FreelancerOnboardingArticleConfig$DoNotShowArticle;", "Lcom/revolut/feature/freelancer/api/article/FreelancerOnboardingArticleConfig$ShowArticle;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerOnboardingArticleConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/article/FreelancerOnboardingArticleConfig$DoNotShowArticle;", "Lcom/revolut/feature/freelancer/api/article/FreelancerOnboardingArticleConfig;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DoNotShowArticle implements FreelancerOnboardingArticleConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DoNotShowArticle f73172a = new DoNotShowArticle();

        @NotNull
        public static final Parcelable.Creator<DoNotShowArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DoNotShowArticle.f73172a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DoNotShowArticle[i];
            }
        }

        private DoNotShowArticle() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/article/FreelancerOnboardingArticleConfig$ShowArticle;", "Lcom/revolut/feature/freelancer/api/article/FreelancerOnboardingArticleConfig;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowArticle implements FreelancerOnboardingArticleConfig {

        @NotNull
        public static final Parcelable.Creator<ShowArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dr6.a f73173a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowArticle(dr6.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowArticle[i];
            }
        }

        public ShowArticle(dr6.a context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f73173a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowArticle) && this.f73173a == ((ShowArticle) obj2).f73173a;
        }

        public final int hashCode() {
            return this.f73173a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73173a.name());
        }
    }
}
