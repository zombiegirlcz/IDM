package n88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CardWidgetLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import com.revolut.feature.card_screen.impl.card_selection.screen.CardSelectionScreen;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.ModalDestination;
import dfj.v;
import dsh.n;
import f28.b0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k25.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lk7.p;
import n87.r;
import vkm.q;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements y68.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n78.c f213288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f213289c;
    public final wif.a d;
    public final mt8.d e;
    public final te8.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f213290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f213291h;

    public k(n78.c interactor, a juniorCardWidgetContentMapper, f73.a cardSelectionScreenProvider, wif.a userFeaturesChecker, mt8.d kycInteractor, te8.e juniorAccountInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(juniorCardWidgetContentMapper, "juniorCardWidgetContentMapper");
        Intrinsics.checkNotNullParameter(cardSelectionScreenProvider, "cardSelectionScreenProvider");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        this.f213288b = interactor;
        this.f213289c = juniorCardWidgetContentMapper;
        this.d = userFeaturesChecker;
        this.e = kycInteractor;
        this.f = juniorAccountInteractor;
        this.f213290g = new AtomicInteger(0);
        this.f213291h = new AtomicReference(null);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "JuniorCardsSmall")) {
            throw new IllegalArgumentException(j6.a.q("Unexpected widget type = ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(rd0.e.b(this.d.d(wog.a.CARDS)), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "JuniorCardsSmall")) {
            return new CardWidgetLoadingDelegate.Model(id10);
        }
        throw new IllegalArgumentException(j6.a.q("Unexpected widget type = ", widgetType));
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        HomeFeedWidgetContext.Junior junior = (HomeFeedWidgetContext.Junior) widgetContext;
        if (Intrinsics.f(str2, "JuniorCardsSmall")) {
            return q.x(i(junior.getJuniorId(), str, eVar), fVar);
        }
        throw new IllegalArgumentException(j6.a.q("Unexpected widget type = ", str2));
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Junior widgetContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return q.Q(rd0.e.b(this.d.d(wog.a.CARDS)), new v((Continuation) null, widgetType, this, widgetContext2, id10, config));
    }

    @Override // csh.e
    public final dsh.j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        HomeFeedWidgetContext.Junior widgetContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (!Intrinsics.f(widgetType, "JuniorCardsSmall")) {
            super.h(widgetContext2, widgetType, inputConfig);
            return null;
        }
        int i = this.f213290g.get();
        String str = (String) this.f213291h.get();
        if (i <= 0 || str == null) {
            super.h(widgetContext2, widgetType, inputConfig);
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.home_feed_widget_cards_select_card, null, null, 14);
        CardSelectionNavigationData$InputData inputData = new CardSelectionNavigationData$InputData(null, b93.d.YOUTH, u.c(str), 43);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new dsh.j(textLocalisedClause, new n(new CardSelectionScreen(inputData), new dsh.q(inputConfig, 3)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final jhi.b i(String juniorId, String str, dsh.e eVar) {
        n78.c cVar = this.f213288b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        return mo3.a.f(u0.i(q.Q(cVar.f213039h, new o(null, cVar, juniorId, 20)), rd0.e.b(this.e.a(false)), this.f.a(juniorId, w4l.h.f294642c)), new b0(this, str, 9), new p(this, 5, str, eVar), new r(1));
    }
}
