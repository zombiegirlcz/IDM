package com.revolut.feature.crypto.gift.asset.impl.ui.screen.not_eligible;

import ah5.b;
import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.gift.asset.impl.R$string;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import vc.s;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/impl/ui/screen/not_eligible/CryptoGiftAssetNotEligibleScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "<init>", "()V", "feature_crypto_gift_asset_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoGiftAssetNotEligibleScreen extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoGiftAssetNotEligibleScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};
    public final int N = R$layout.screen_recycler_view;
    public final h O = s.t(this, a.f);
    public final PromptMarketingContentDelegate P;
    public final j Q;
    public final ah5.a R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, pji.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return pji.a.a(p0);
        }
    }

    public CryptoGiftAssetNotEligibleScreen() {
        PromptMarketingContentDelegate promptMarketingContentDelegate = new PromptMarketingContentDelegate();
        this.P = promptMarketingContentDelegate;
        this.Q = new j(7, u.c(promptMarketingContentDelegate), false);
        this.R = new ah5.a();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((pji.a) value).f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        j jVar = this.Q;
        y.h(recyclerView, jVar, new LinearLayoutManager(recyclerView.getContext()));
        ResourceImage closeButtonImage = new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        this.R.getClass();
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        jVar.c(u.c(new PromptMarketingContentDelegate.Model("CRYPTO_GIFT_ASSET_NOT_ELIGIBLE", new TextLocalisedClause(R$string.crypto_gifted_assets_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.crypto_gifted_assets_unavailable_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_cross_void, null, null, 6), null), null, null, closeButtonImage, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.P;
        ViewController.P2(this, vkm.q.J(e.b(promptMarketingContentDelegate.f53079c), e.b(promptMarketingContentDelegate.f.f121375b)), new b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }
}
