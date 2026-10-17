package com.revolut.feature.product_article.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class ProductArticleApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/product_article/api/ProductArticleApi$Toggles$ModalProductArticles;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ModalProductArticles extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ModalProductArticles f81261c = new ModalProductArticles();

        @NotNull
        public static final Parcelable.Creator<ModalProductArticles> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ModalProductArticles.f81261c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ModalProductArticles[i];
            }
        }

        private ModalProductArticles() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("modalProductArticles");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/product_article/api/ProductArticleApi$Toggles$PADisclaimers;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PADisclaimers extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PADisclaimers f81262c = new PADisclaimers();

        @NotNull
        public static final Parcelable.Creator<PADisclaimers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PADisclaimers.f81262c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PADisclaimers[i];
            }
        }

        private PADisclaimers() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("paDisclaimers");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/product_article/api/ProductArticleApi$Toggles$ProductArticlesDeeplinkHandlingMigration;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticlesDeeplinkHandlingMigration extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ProductArticlesDeeplinkHandlingMigration f81263c = new ProductArticlesDeeplinkHandlingMigration();

        @NotNull
        public static final Parcelable.Creator<ProductArticlesDeeplinkHandlingMigration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticlesDeeplinkHandlingMigration.f81263c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticlesDeeplinkHandlingMigration[i];
            }
        }

        private ProductArticlesDeeplinkHandlingMigration() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("productArticlesDeeplinkHandlingMigration");
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

    private ProductArticleApi$Toggles() {
    }

    public static List a() {
        return v.k(ModalProductArticles.f81261c, ProductArticlesDeeplinkHandlingMigration.f81263c, PADisclaimers.f81262c);
    }
}
