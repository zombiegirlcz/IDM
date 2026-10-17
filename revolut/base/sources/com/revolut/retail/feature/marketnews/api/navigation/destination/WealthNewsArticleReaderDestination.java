package com.revolut.retail.feature.marketnews.api.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/navigation/destination/WealthNewsArticleReaderDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthNewsArticleReaderDestination implements StackDestination {

    @NotNull
    public static final Parcelable.Creator<WealthNewsArticleReaderDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsArticle f101819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f101821c;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthNewsArticleReaderDestination(WealthNewsArticle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (TransitionAnimation) parcel.readParcelable(WealthNewsArticleReaderDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthNewsArticleReaderDestination[i];
        }
    }

    public WealthNewsArticleReaderDestination(WealthNewsArticle article, boolean z, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(article, "article");
        this.f101819a = article;
        this.f101820b = z;
        this.f101821c = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF101821c() {
        return this.f101821c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthNewsArticleReaderDestination)) {
            return false;
        }
        WealthNewsArticleReaderDestination wealthNewsArticleReaderDestination = (WealthNewsArticleReaderDestination) obj2;
        return Intrinsics.f(this.f101819a, wealthNewsArticleReaderDestination.f101819a) && this.f101820b == wealthNewsArticleReaderDestination.f101820b && Intrinsics.f(this.f101821c, wealthNewsArticleReaderDestination.f101821c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f101819a.hashCode() * 31, 31, this.f101820b);
        TransitionAnimation transitionAnimation = this.f101821c;
        return iC + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f101819a.writeToParcel(dest, i);
        dest.writeInt(this.f101820b ? 1 : 0);
        dest.writeParcelable(this.f101821c, i);
    }
}
