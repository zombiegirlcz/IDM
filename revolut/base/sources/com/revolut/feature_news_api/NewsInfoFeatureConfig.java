package com.revolut.feature_news_api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.common.ui.model.NewsUiItem;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_news_api/NewsInfoFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewsInfoFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<NewsInfoFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewsUiItem f97427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97428b;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewsInfoFeatureConfig((NewsUiItem) parcel.readParcelable(NewsInfoFeatureConfig.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsInfoFeatureConfig[i];
        }
    }

    public NewsInfoFeatureConfig(NewsUiItem newsUiItem, String str) {
        this.f97427a = newsUiItem;
        this.f97428b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NewsInfoFeatureConfig)) {
            return false;
        }
        NewsInfoFeatureConfig newsInfoFeatureConfig = (NewsInfoFeatureConfig) obj2;
        return Intrinsics.f(this.f97427a, newsInfoFeatureConfig.f97427a) && Intrinsics.f(this.f97428b, newsInfoFeatureConfig.f97428b);
    }

    public final int hashCode() {
        NewsUiItem newsUiItem = this.f97427a;
        int iHashCode = (newsUiItem == null ? 0 : newsUiItem.hashCode()) * 31;
        String str = this.f97428b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97427a, i);
        dest.writeString(this.f97428b);
    }
}
