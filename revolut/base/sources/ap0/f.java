package ap0;

import android.content.Context;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import b9.w2;
import com.google.android.material.snackbar.Snackbar;
import com.onfido.android.sdk.capture.databinding.OnfidoHostedWebModuleFragmentLayoutBinding;
import com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionAdapter;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.nfc.NfcFailedScreen;
import com.onfido.android.sdk.capture.ui.nfc.NfcScanFailFragment;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.hosted.web.module.HostedWebModuleFragment;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionButtonDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsReceiptDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.DraggableRowDelegate;
import com.revolut.core.ui_kit.delegates.EmojiImageDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.i7;
import com.revolut.core.ui_kit.delegates.ii;
import com.revolut.core.ui_kit.delegates.oi;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesPageDelegate;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesPageDelegate;
import com.revolut.feature.call_security_info.dependencies.impl.configuration.RetailCallSecurityProductArticleKey;
import com.revolut.feature.in_app_calls.CallActivity;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import ip0.b8;
import ip0.bf;
import ip0.dg;
import ip0.e8;
import ip0.h2;
import ip0.t6;
import ip0.w7;
import ip0.y7;
import ip0.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.w4;
import or0.u;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8028c;

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f8026a = i;
        this.f8027b = obj2;
        this.f8028c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f8026a;
        Object[] objArr = 0;
        Object obj2 = this.f8028c;
        Object obj3 = this.f8027b;
        switch (i) {
            case 0:
                ((an4.f) obj3).invoke((ChatPromptSuggestion) obj2);
                return;
            case 1:
                ((ConstraintHeaderLayout) obj3).f57250p.onNext((TagViewData) obj2);
                return;
            case 2:
                ((azl.i) obj3).f11485a.invoke((View) obj2, null);
                return;
            case 3:
                SwitcherButtonView switcherButtonView = (SwitcherButtonView) obj3;
                View.OnClickListener onClickListener = (View.OnClickListener) obj2;
                SwitcherButtonView.Companion aVar = SwitcherButtonView.INSTANCE;
                py0.f fVarN0 = u.k(switcherButtonView).n0();
                bv0.d dVar = switcherButtonView.f57625c;
                Clause leftText$ui_kit_components_release = dVar.getLeftText$ui_kit_components_release();
                if (leftText$ui_kit_components_release == null) {
                    leftText$ui_kit_components_release = dVar.getRightText$ui_kit_components_release();
                }
                fVarN0.a(switcherButtonView, switcherButtonView, leftText$ui_kit_components_release != null ? new py0.c(leftText$ui_kit_components_release) : null);
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                switcherButtonView.e.onNext(w4.f210071a);
                return;
            case 4:
                ((MetadataStoriesPageDelegate) obj3).f.invoke((MetadataStoriesModel) obj2);
                return;
            case 5:
                ((StickerStoriesPageDelegate) obj3).f.invoke((StickerStoriesModel) obj2);
                return;
            case 6:
                ((Snackbar) obj3).lambda$setAction$0((View.OnClickListener) obj2, view);
                return;
            case 7:
                CountrySelectionAdapter.displayCountryOnView$lambda$2$lambda$1((CountrySelectionAdapter) obj3, (CountryCode) obj2, view);
                return;
            case 8:
                LivenessConfirmationFragment.onViewCreated$lambda$1$lambda$0((LivenessConfirmationFragment) obj3, (LivenessPerformedChallenges) obj2, view);
                return;
            case 9:
                NfcScanFailFragment.onViewCreated$lambda$3$lambda$0((NfcFailedScreen.Actions.Primary) obj3, (NfcScanFailFragment) obj2, view);
                return;
            case 10:
                NfcScanFailFragment.onViewCreated$lambda$3$lambda$1((NfcFailedScreen.Actions.Secondary) obj3, (NfcScanFailFragment) obj2, view);
                return;
            case 11:
                HostedWebModuleFragment.onViewCreated$lambda$1$lambda$0((HostedWebModuleFragment) obj3, (OnfidoHostedWebModuleFragmentLayoutBinding) obj2, view);
                return;
            case 12:
                du2.j jVar = (du2.j) obj2;
                int i2 = du2.i.f117540a[((du2.g) obj3).ordinal()];
                if (i2 == 1) {
                    Context context = ((com.revolut.feature.in_app_calls.a) jVar.f117544c.f117536a).f74790a.getContext();
                    CallActivity.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    context.startActivity(CallActivity.Companion.a(2, context));
                    return;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sri.m mVar = jVar.f117543b.f117537a;
                ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(RetailCallSecurityProductArticleKey.REPORT));
                k9 k9Var = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                mVar.c(new FeatureCommand(new KompotOverlayFeatureConfig((ParcelableDestination) new ProductArticleDestination(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, (ProductArticleCommandInterceptor) null, (ProductArticleDestinationInterceptor) null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (AnalyticsContext) null, (TransitionAnimation) null, Constants.TAG_OS_VERSION), yhi.b.SOLID, (Integer) (objArr == true ? 1 : 0), 12)));
                return;
            case 13:
                ((hqi.f) obj3).f154710j.onNext(Integer.valueOf(((MenuItem) obj2).getItemId()));
                return;
            case 14:
                hw0.q limitType = (hw0.q) obj2;
                TrendView trendView = (TrendView) ((w2) obj3).f13500c;
                Intrinsics.checkNotNullParameter(limitType, "limitType");
                hw0.m mVar2 = trendView.draggableLimitsListener;
                if (mVar2 != null) {
                    oi oiVar = (oi) mVar2;
                    Intrinsics.checkNotNullParameter(limitType, "limitType");
                    oiVar.f54563a.e.onNext(new ii(oiVar.f54564b, limitType));
                    return;
                }
                return;
            case 15:
                ((ihm.f) ((ActionsDelegate) obj3).f.getValue()).onNext(((z) obj2).f167368a);
                return;
            case 16:
                ((BackgroundSelectionButtonDelegate) obj3).f51691c.onNext((h2) obj2);
                return;
            case 17:
                ((CellDetailsBarRatingDelegate) obj3).f51820c.onNext((t6) obj2);
                return;
            case 18:
                ((CellDetailsPhotoDelegate) obj3).f51886c.onNext((w7) obj2);
                return;
            case 19:
                ((CellDetailsPriceDelegate) obj3).f51887c.onNext((y7) obj2);
                return;
            case 20:
                ((CellDetailsReceiptDelegate) obj3).d.onNext((b8) obj2);
                return;
            case 21:
                ((CellDetailsRevPointsDelegate) obj3).f51889c.onNext((e8) obj2);
                return;
            case 22:
                ((DraggableRowDelegate) obj3).d.onNext((bf) obj2);
                return;
            case 23:
                ((EmojiImageDelegate) obj3).f52221c.onNext(((EmojiImageDelegate.Model) obj2).f52223b.f59914a);
                return;
            case 24:
                ((ErrorDelegate) obj3).f52226c.onNext((dg) obj2);
                return;
            case 25:
                ((EsimDelegate) obj3).e.onNext((EsimDelegate.Model) obj2);
                return;
            case 26:
                ((ExtraSmallCardDelegate) obj3).e.onNext((ExtraSmallCardDelegate.Model) obj2);
                return;
            case 27:
                ((FullScreenStateDelegate) obj3).e.onNext((FullScreenStateDelegate.Model) obj2);
                return;
            case 28:
                ((HeaderDelegate) obj3).i.onNext((HeaderDelegate.Model) obj2);
                return;
            default:
                i7 i7Var = (i7) obj3;
                InputChecklistDelegate inputChecklistDelegate = (InputChecklistDelegate) obj2;
                InputChecklistDelegate.Model model = i7Var.f;
                if (model != null) {
                    py0.c cVar = new py0.c(model.f52520b);
                    Intrinsics.h(view);
                    u.k(view).n0().a(view, model, cVar);
                    if (model.e instanceof InputChecklistDelegate.a.b) {
                        View itemView = i7Var.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        kli.c.c(itemView, true);
                    }
                    inputChecklistDelegate.f52518c.onNext(model);
                    return;
                }
                return;
        }
    }
}
