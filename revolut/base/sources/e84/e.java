package e84;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import cmf.p;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import elf.b2;
import elf.j0;
import ish.a0;
import java.util.Map;
import kkf.i0;
import kkf.p1;
import kkf.r1;
import klf.h0;
import klf.m1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import q90.c3;
import q90.d0;
import q90.i4;
import q90.m4;
import q90.o3;
import q90.p3;
import q90.q1;
import q90.s1;
import q90.s3;
import q90.z0;
import ro0.s;
import uh7.j;
import uh7.l;
import uh7.m;
import uh7.o;
import vkm.q;
import ybl.k;
import zhm.f0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f123569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f123570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f123571c;
    public Object d;
    public Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f123572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f123573h;
    public final Object i;

    public e(twg.c instrumentsTrendCollectionsInteractor, b7h.a tabbedWidgetInteractor, ImmutableMap widgetContentMappers, yh7.b recommendedBuysCollectionFeedWidgetContentMapper, o widgetFiltersProvider, a0 widgetsUiInteractor, k tradingAccountsInteractor, gte.a featureToggleInteractor, zh7.c onboardingNavigationProvider) {
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionsInteractor, "instrumentsTrendCollectionsInteractor");
        Intrinsics.checkNotNullParameter(tabbedWidgetInteractor, "tabbedWidgetInteractor");
        Intrinsics.checkNotNullParameter(widgetContentMappers, "widgetContentMappers");
        Intrinsics.checkNotNullParameter(recommendedBuysCollectionFeedWidgetContentMapper, "recommendedBuysCollectionFeedWidgetContentMapper");
        Intrinsics.checkNotNullParameter(widgetFiltersProvider, "widgetFiltersProvider");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(onboardingNavigationProvider, "onboardingNavigationProvider");
        this.f123569a = instrumentsTrendCollectionsInteractor;
        this.f123570b = tabbedWidgetInteractor;
        this.f123571c = widgetContentMappers;
        this.e = recommendedBuysCollectionFeedWidgetContentMapper;
        this.f = widgetFiltersProvider;
        this.f123572g = widgetsUiInteractor;
        this.f123573h = tradingAccountsInteractor;
        this.d = featureToggleInteractor;
        this.i = onboardingNavigationProvider;
    }

    public uh7.c a(nh7.d widget, e38.f widgetAvailabilityProvider) {
        o oVar = (o) this.f;
        twg.c cVar = (twg.c) this.f123569a;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        int i = m.f280123a[widget.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new j(cVar, (b7h.a) this.f123570b, widget, widgetAvailabilityProvider, (uh7.e) r0.h(widget, (Map) this.f123571c), oVar);
        }
        if (i == 4) {
            return new yh7.j((k) this.f123573h, (gte.a) this.d, (yh7.b) this.e, cVar, oVar, widgetAvailabilityProvider);
        }
        throw new NoWhenBranchMatchedException();
    }

    public l b(nh7.d widget, ln.a navigationCommandsDispatcher, a38.a swipeActionEventHandler) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(swipeActionEventHandler, "swipeActionEventHandler");
        return new l(navigationCommandsDispatcher, (b7h.a) this.f123570b, widget, (a0) this.f123572g, swipeActionEventHandler, (zh7.c) this.i);
    }

    public p c(boolean z) {
        wkm.l lVarQ = q.Q(((cw9.d) this.f123571c).c(), new jy6.l((Continuation) null, this, 18));
        h0 h0Var = (h0) this.f123569a;
        return new p(ta6.a.g(lVarQ, h0Var.j(), h0Var.d(), ((m1) this.f123570b).a(), new p1(this, z, null)), new i0(8), v.k((j0) this.f123572g, (b2) this.f123573h), "GroupBill");
    }

    public v90.a d(BackendScreen screen) {
        v90.a aVar;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (screen instanceof StatusDialogScreen) {
            aVar = (v90.h) this.f123569a;
        } else if (screen instanceof HtmlPromptScreen) {
            aVar = (v90.e) this.f123570b;
        } else if (screen instanceof StoriesScreen) {
            aVar = (v90.e) this.f123571c;
        } else if (screen instanceof DeeplinkScreen) {
            aVar = (v90.c) this.d;
        } else if (screen instanceof TutorialScreen) {
            aVar = (v90.e) this.e;
        } else if (screen instanceof FormScreen) {
            aVar = (v90.d) this.f;
        } else if (screen instanceof SummaryScreen) {
            aVar = (v90.i) this.f123572g;
        } else if (screen instanceof PromptScreen) {
            aVar = (v90.g) this.f123573h;
        } else {
            if (!(screen instanceof BottomPromptScreen)) {
                throw new IllegalArgumentException("Unsupported screen " + screen);
            }
            aVar = (v90.b) this.i;
        }
        Intrinsics.i(aVar, "null cannot be cast to non-null type com.revolut.core.backend_flow.data.network.mappers.screens.BackendScreenMapper<S of com.revolut.core.backend_flow.data.network.mappers.screens.ScreensMappersProvider.provide, *>");
        return aVar;
    }

    public v90.a e(m4 screen) {
        v90.a aVar;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (screen instanceof o3) {
            aVar = (v90.h) this.f123569a;
        } else if (screen instanceof s1) {
            aVar = (v90.e) this.f123570b;
        } else if (screen instanceof p3) {
            aVar = (v90.e) this.f123571c;
        } else if (screen instanceof z0) {
            aVar = (v90.c) this.d;
        } else if (screen instanceof i4) {
            aVar = (v90.e) this.e;
        } else if (screen instanceof q1) {
            aVar = (v90.d) this.f;
        } else if (screen instanceof s3) {
            aVar = (v90.i) this.f123572g;
        } else if (screen instanceof c3) {
            aVar = (v90.g) this.f123573h;
        } else {
            if (!(screen instanceof d0)) {
                throw new IllegalArgumentException("Unsupported screen " + screen);
            }
            aVar = (v90.b) this.i;
        }
        Intrinsics.i(aVar, "null cannot be cast to non-null type com.revolut.core.backend_flow.data.network.mappers.screens.BackendScreenMapper<*, V of com.revolut.core.backend_flow.data.network.mappers.screens.ScreensMappersProvider.provide>");
        return aVar;
    }

    public e(v90.h statusDialogScreenMapper, v90.e htmlPromptScreenMapper, v90.e storiesScreenMapper, v90.c deeplinkScreenMapper, v90.e tutorialScreenMapper, v90.d formScreenMapper, v90.i summaryScreenMapper, v90.g promptScreenMapper, v90.b bottomPromptScreenMapper) {
        Intrinsics.checkNotNullParameter(statusDialogScreenMapper, "statusDialogScreenMapper");
        Intrinsics.checkNotNullParameter(htmlPromptScreenMapper, "htmlPromptScreenMapper");
        Intrinsics.checkNotNullParameter(storiesScreenMapper, "storiesScreenMapper");
        Intrinsics.checkNotNullParameter(deeplinkScreenMapper, "deeplinkScreenMapper");
        Intrinsics.checkNotNullParameter(tutorialScreenMapper, "tutorialScreenMapper");
        Intrinsics.checkNotNullParameter(formScreenMapper, "formScreenMapper");
        Intrinsics.checkNotNullParameter(summaryScreenMapper, "summaryScreenMapper");
        Intrinsics.checkNotNullParameter(promptScreenMapper, "promptScreenMapper");
        Intrinsics.checkNotNullParameter(bottomPromptScreenMapper, "bottomPromptScreenMapper");
        this.f123569a = statusDialogScreenMapper;
        this.f123570b = htmlPromptScreenMapper;
        this.f123571c = storiesScreenMapper;
        this.d = deeplinkScreenMapper;
        this.e = tutorialScreenMapper;
        this.f = formScreenMapper;
        this.f123572g = summaryScreenMapper;
        this.f123573h = promptScreenMapper;
        this.i = bottomPromptScreenMapper;
    }

    public e(h0 commonDataSource, m1 juniorDataSource, cw9.d paymentsProductFeatureChecker, k71.i transactionDescriptor, c61.a groupsDataProvider, vlf.b commonUiMapper, j0 groupBillClickHandler, b2 splitBillItemizationClickHandler, r1 groupBillItemizedItemsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(groupsDataProvider, "groupsDataProvider");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(groupBillClickHandler, "groupBillClickHandler");
        Intrinsics.checkNotNullParameter(splitBillItemizationClickHandler, "splitBillItemizationClickHandler");
        Intrinsics.checkNotNullParameter(groupBillItemizedItemsProvider, "groupBillItemizedItemsProvider");
        this.f123569a = commonDataSource;
        this.f123570b = juniorDataSource;
        this.f123571c = paymentsProductFeatureChecker;
        this.d = transactionDescriptor;
        this.e = groupsDataProvider;
        this.f = commonUiMapper;
        this.f123572g = groupBillClickHandler;
        this.f123573h = splitBillItemizationClickHandler;
        this.i = groupBillItemizedItemsProvider;
    }

    public e(mka.a bulletsItemMapper, mka.b cardItemMapper, mka.c cardV2ItemMapper, mka.d disclaimerItemMapper, mka.e heroItemMapper, mka.g subHeaderItemMapper, mka.h textItemMapper, mka.i textV2ItemMapper, mka.j unknownItemMapper) {
        Intrinsics.checkNotNullParameter(bulletsItemMapper, "bulletsItemMapper");
        Intrinsics.checkNotNullParameter(cardItemMapper, "cardItemMapper");
        Intrinsics.checkNotNullParameter(cardV2ItemMapper, "cardV2ItemMapper");
        Intrinsics.checkNotNullParameter(disclaimerItemMapper, "disclaimerItemMapper");
        Intrinsics.checkNotNullParameter(heroItemMapper, "heroItemMapper");
        Intrinsics.checkNotNullParameter(subHeaderItemMapper, "subHeaderItemMapper");
        Intrinsics.checkNotNullParameter(textItemMapper, "textItemMapper");
        Intrinsics.checkNotNullParameter(textV2ItemMapper, "textV2ItemMapper");
        Intrinsics.checkNotNullParameter(unknownItemMapper, "unknownItemMapper");
        this.f123569a = bulletsItemMapper;
        this.f123570b = cardItemMapper;
        this.f123571c = cardV2ItemMapper;
        this.d = disclaimerItemMapper;
        this.e = heroItemMapper;
        this.f = subHeaderItemMapper;
        this.f123572g = textItemMapper;
        this.f123573h = textV2ItemMapper;
        this.i = unknownItemMapper;
    }

    public e(PluginFlowContract$Input inputData, c84.g pluginControllerModelExtension, xa4.a creditApplicationErrorHandlerExtension, gte.a featureToggleInteractor, hz3.c creditApplicationCommandsFactory, xq3.j creditAcknowledgementInteractor, w revolutJobInteractor, hy3.j otherCreditProductsAvailabilityInteractor, vie.i tabCreditPreferencesInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerModelExtension, "pluginControllerModelExtension");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerExtension, "creditApplicationErrorHandlerExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(creditAcknowledgementInteractor, "creditAcknowledgementInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(otherCreditProductsAvailabilityInteractor, "otherCreditProductsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tabCreditPreferencesInteractor, "tabCreditPreferencesInteractor");
        this.f123569a = inputData;
        this.f123570b = pluginControllerModelExtension;
        this.f123571c = creditApplicationErrorHandlerExtension;
        this.d = featureToggleInteractor;
        this.e = creditApplicationCommandsFactory;
        this.f = creditAcknowledgementInteractor;
        this.f123572g = revolutJobInteractor;
        this.f123573h = otherCreditProductsAvailabilityInteractor;
        this.i = tabCreditPreferencesInteractor;
    }

    public e(kjl.c cVar, yml.a aVar) {
        this.f123569a = cVar;
        int i = 23;
        this.f123570b = e4m.b.b(new jqa.h(cVar, this, 1, i));
        this.f123571c = e4m.b.b(new jqa.h(cVar, this, 0, i));
        this.d = e4m.b.b(new jqa.h(cVar, this, 2, i));
        this.e = e4m.b.b(new jqa.h(cVar, this, 3, i));
        this.f = e4m.b.b(new jqa.h(cVar, this, 4, i));
        this.f123572g = e4m.b.b(new jqa.h(cVar, this, 5, i));
        this.f123573h = e4m.b.b(new jqa.h(cVar, this, 6, i));
        this.i = e4m.b.b(new jqa.h(cVar, this, 7, i));
    }

    public e(Function0 roundRectClipProvider, ix0.h0 h0Var) {
        Intrinsics.checkNotNullParameter(roundRectClipProvider, "roundRectClipProvider");
        this.f123569a = roundRectClipProvider;
        this.f123570b = h0Var;
        s.Companion.getClass();
        this.f123571c = s.e;
        this.e = f0.f322471a;
        this.f = new Path();
        this.f123572g = new Path();
        this.f123573h = new RectF();
        this.i = new Rect();
    }
}
