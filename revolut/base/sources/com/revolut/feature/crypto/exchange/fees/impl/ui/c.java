package com.revolut.feature.crypto.exchange.fees.impl.ui;

import cli.n;
import cli.y;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.impl.declaration.CryptoExchangeFeesArticleKey;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$ModalStep;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem;
import com.revolut.feature.crypto.exchange.fees.impl.ui.details.CryptoExchangeFeesDetailsController;
import com.revolut.feature.crypto.exchange.fees.impl.ui.learnmore.CryptoExchangeFeesLearnMoreBottomSheet;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import ffk.t;
import hx7.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import md6.s;
import oki.h;
import w4l.j;
import yji.l;
import zf5.f;
import zf5.g;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements f {
    public final lf5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoExchangeFeesMode f70841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vf5.d f70842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f70843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f70844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sh5.d f70845t;
    public final sd5.c u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ali.b f70846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70847x;

    public c(n stateMapper, lf5.b source, CryptoExchangeFeesMode mode, vf5.d cryptoExchangeFeesInteractor, zja.a productArticleInteractor, t pricingPlanInteractor, sh5.d cryptoFcaDisclaimerWidget, sd5.c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesInteractor, "cryptoExchangeFeesInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.o = source;
        this.f70841p = mode;
        this.f70842q = cryptoExchangeFeesInteractor;
        this.f70843r = productArticleInteractor;
        this.f70844s = pricingPlanInteractor;
        this.f70845t = cryptoFcaDisclaimerWidget;
        this.u = cryptoConfigInteractor;
        List listC = u.c(CryptoExchangeFeesControllerContract$PagerItem.Initial.f70839a);
        m70.a.c(t0.f186434a);
        final int i = 0;
        this.v = mra.d.b(this, new g(null, listC, null, null, mode, "", null), stateMapper, null, false, 12);
        this.f70846w = s.b(this, new Function2(this) { // from class: zf5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.crypto.exchange.fees.impl.ui.c f321877b;

            {
                this.f321877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        CryptoExchangeFeesControllerContract$PagerItem pagerItem = (CryptoExchangeFeesControllerContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
                        boolean zF = Intrinsics.f(pagerItem, CryptoExchangeFeesControllerContract$PagerItem.Initial.f70839a);
                        com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar = this.f321877b;
                        if (zF) {
                            return new CryptoExchangeFeesDetailsController(null, cVar.f70841p);
                        }
                        if (pagerItem instanceof CryptoExchangeFeesControllerContract$PagerItem.Details) {
                            return new CryptoExchangeFeesDetailsController(((CryptoExchangeFeesControllerContract$PagerItem.Details) pagerItem).f70837a, cVar.f70841p);
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        CryptoExchangeFeesControllerContract$ModalStep it8 = (CryptoExchangeFeesControllerContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (Intrinsics.f(it8, CryptoExchangeFeesControllerContract$ModalStep.ProductArticle.f70836a)) {
                            return this.f321877b.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(CryptoExchangeFeesArticleKey.f70823a)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                        }
                        if (it8 instanceof CryptoExchangeFeesControllerContract$ModalStep.LearnMoreBottomSheet) {
                            return new CryptoExchangeFeesLearnMoreBottomSheet(((CryptoExchangeFeesControllerContract$ModalStep.LearnMoreBottomSheet) it8).f70835a);
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
        final int i2 = 1;
        this.f70847x = e.a(this, new Function2(this) { // from class: zf5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.crypto.exchange.fees.impl.ui.c f321877b;

            {
                this.f321877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        CryptoExchangeFeesControllerContract$PagerItem pagerItem = (CryptoExchangeFeesControllerContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
                        boolean zF = Intrinsics.f(pagerItem, CryptoExchangeFeesControllerContract$PagerItem.Initial.f70839a);
                        com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar = this.f321877b;
                        if (zF) {
                            return new CryptoExchangeFeesDetailsController(null, cVar.f70841p);
                        }
                        if (pagerItem instanceof CryptoExchangeFeesControllerContract$PagerItem.Details) {
                            return new CryptoExchangeFeesDetailsController(((CryptoExchangeFeesControllerContract$PagerItem.Details) pagerItem).f70837a, cVar.f70841p);
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        CryptoExchangeFeesControllerContract$ModalStep it8 = (CryptoExchangeFeesControllerContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (Intrinsics.f(it8, CryptoExchangeFeesControllerContract$ModalStep.ProductArticle.f70836a)) {
                            return this.f321877b.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(CryptoExchangeFeesArticleKey.f70823a)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                        }
                        if (it8 instanceof CryptoExchangeFeesControllerContract$ModalStep.LearnMoreBottomSheet) {
                            return new CryptoExchangeFeesLearnMoreBottomSheet(((CryptoExchangeFeesControllerContract$ModalStep.LearnMoreBottomSheet) it8).f70835a);
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f70846w;
    }

    @Override // yji.l
    public final void I1() {
        l2(new a(this, null), new yi5.b(26));
        l.a1(this, rd0.e.b(m70.a.g(this.f70844s.q(), null, null, 3)), null, null, new zf5.l(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70847x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, this.f70842q.b(j.f294644c), null, new b(this, null), 3);
        l.b1(this, rd0.e.b(m70.a.g(this.u.a(false), null, null, 3)), null, new zf5.l(this, continuation, 1), 3);
        n2(new yzb.c(this, continuation, 11), new whi.b(6));
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.v;
    }
}
