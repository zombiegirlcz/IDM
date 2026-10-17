package com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/revolut_x_promo/impl/ui/revolut_x_launcher/RevolutXLauncherFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Article", "Lcom/revolut/feature/revolut_x_promo/impl/ui/revolut_x_launcher/RevolutXLauncherFlowContract$Step$Article;", "feature_revolut_x_promo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevolutXLauncherFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_x_promo/impl/ui/revolut_x_launcher/RevolutXLauncherFlowContract$Step$Article;", "Lcom/revolut/feature/revolut_x_promo/impl/ui/revolut_x_launcher/RevolutXLauncherFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_revolut_x_promo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Article extends RevolutXLauncherFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Article> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleKey f84269a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Article((ProductArticleKey) parcel.readParcelable(Article.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Article[i];
            }
        }

        public Article(ProductArticleKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f84269a = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Article) && Intrinsics.f(this.f84269a, ((Article) obj2).f84269a);
        }

        public final int hashCode() {
            return this.f84269a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84269a, i);
        }
    }

    private RevolutXLauncherFlowContract$Step() {
    }
}
