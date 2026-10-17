package com.revolut.feature.user_declarations.shared.flows.tracking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.shared.feature.user_declarations.api.R$string;
import java.util.List;
import js7.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class AnalyticsEventTrackingConsentControllerProvider {

    @NotNull
    public static final Companion Companion = new Companion();

    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/tracking/AnalyticsEventTrackingConsentControllerProvider$Companion$AnalyticsEventTrackingConsentProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "<init>", "()V", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AnalyticsEventTrackingConsentProductArticleKey implements ProductArticleKey {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AnalyticsEventTrackingConsentProductArticleKey f94682a = new AnalyticsEventTrackingConsentProductArticleKey();

            @NotNull
            public static final Parcelable.Creator<AnalyticsEventTrackingConsentProductArticleKey> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AnalyticsEventTrackingConsentProductArticleKey.f94682a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AnalyticsEventTrackingConsentProductArticleKey[i];
                }
            }

            private AnalyticsEventTrackingConsentProductArticleKey() {
            }

            @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
            /* JADX INFO: renamed from: U5 */
            public final String getArticleName() {
                return "learn-more";
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
            public final String getProductName() {
                return "idfa";
            }

            @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
            /* JADX INFO: renamed from: h1 */
            public final String getArticleVariant() {
                return "permissions";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        private Companion() {
        }

        public static ProductArticleDescriptor a() {
            return new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(AnalyticsEventTrackingConsentProductArticleKey.f94682a)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, AnalyticsProduct.Shared.Onboarding.f, null, false, 52);
        }
    }

    public static PromptMarketingScreen a(Function1 callback, boolean z) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.analytics_events_tracking_consent_prompt_title, null, null, 14), new TextLocalisedClause(R$string.analytics_events_tracking_consent_prompt_subtitle, null, null, 14), b.c("3D238", null, null, null, 30), null, null, z ? new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.tracking_opt_in_prompt_agree, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "TRACKING_PRIMARY_BUTTON_LOADING_TAG", 30), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.tracking_opt_in_prompt_disagree, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "TRACKING_SECONDARY_BUTTON_LOADING_TAG", 30), null, null, null, AnalyticsProduct.Shared.Onboarding.f, new TextLocalisedClause(R$string.tracking_opt_in_prompt_link, null, null, 14), 52824));
        c block = new c(21, callback);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }
}
