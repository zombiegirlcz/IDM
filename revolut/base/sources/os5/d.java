package os5;

import ahe.y0;
import b93.k;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CardsWidgetAnimatedEmptyStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.t;
import com.revolut.core.ui_kit.delegates.widgets.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import com.revolut.feature.card_screen.impl.card_selection.screen.CardSelectionScreen;
import com.revolut.feature.crypto_feed.impl.R$string;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.ModalDestination;
import dsh.j;
import dsh.n;
import ha3.x;
import ia3.r;
import ip0.c2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l93.f;
import m93.g;
import or4.h;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f229230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f229231c;
    public final g d;
    public final mt8.d e;
    public final ld5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f229232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f229233h;
    public final LinkedHashMap i;

    public d(f revolutCardsInteractor, r cardsContentMapper, g cardsSimplifiedItemMapper, f73.a cardSelectionScreenProvider, mt8.d kycInteractor, ld5.b cryptoCardsAvailabilityInteractor, a cardsEmptyStateDesignsProvider) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        Intrinsics.checkNotNullParameter(cardSelectionScreenProvider, "cardSelectionScreenProvider");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(cryptoCardsAvailabilityInteractor, "cryptoCardsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(cardsEmptyStateDesignsProvider, "cardsEmptyStateDesignsProvider");
        this.f229230b = revolutCardsInteractor;
        this.f229231c = cardsContentMapper;
        this.d = cardsSimplifiedItemMapper;
        this.e = kycInteractor;
        this.f = cryptoCardsAvailabilityInteractor;
        this.f229232g = cardsEmptyStateDesignsProvider;
        this.f229233h = new AtomicInteger(0);
        this.i = new LinkedHashMap();
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "CardsMedium") && !Intrinsics.f(str, "CardsSmall")) {
            throw new IllegalArgumentException(j6.a.q("Invalid widgetType: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(new o9a.e(rd0.e.b(this.f.a()), 20), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "CardsMedium")) {
            return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.crypto_home_feed_widget_cards_header_title, null, null, 14), c2.CARD);
        }
        if (Intrinsics.f(widgetType, "CardsSmall")) {
            return new QuickActionWidgetLoadingDelegate.Model(id10);
        }
        throw new IllegalArgumentException(j6.a.q("Invalid widgetType: ", widgetType));
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(rd0.e.e(j(str, str2, eVar, true), h0.f322473a, new c(this, str, null)), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return q.Q(new o9a.e(rd0.e.b(this.f.a()), 20), new y0(19, this, id10, widgetType, config, (Continuation) null));
    }

    @Override // csh.e
    public final j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (!Intrinsics.f(widgetType, "CardsSmall")) {
            super.h(widgetContext2, widgetType, inputConfig);
            return null;
        }
        if (this.f229233h.get() <= 0) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_home_feed_widget_cards_config_select_card, null, null, 14);
        CardSelectionNavigationData$InputData inputData = new CardSelectionNavigationData$InputData(inputConfig.a("cardId"), b93.d.ALL, null, 75);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new j(textLocalisedClause, new n(new CardSelectionScreen(inputData), new dsh.q(inputConfig, 5)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final CardsWidgetAnimatedEmptyStateDelegate.Model i(String str, op0.q qVar, List list, boolean z) {
        u uVar;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_home_feed_widget_cards_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_home_feed_widget_cards_get_card, null, null, 14);
        if (z) {
            uVar = t.f55509a;
        } else {
            LinkedHashMap linkedHashMap = this.i;
            Object rVar = linkedHashMap.get(str);
            if (rVar == null) {
                rVar = new com.revolut.core.ui_kit.delegates.widgets.r(0);
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                linkedHashMap.put(str, rVar);
            }
            uVar = (com.revolut.core.ui_kit.delegates.widgets.r) rVar;
        }
        return new CardsWidgetAnimatedEmptyStateDelegate.Model(str, textLocalisedClause, textLocalisedClause2, list, uVar, qVar, null, null, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }

    public final vkm.d j(String str, String str2, dsh.e eVar, boolean z) {
        boolean zF = Intrinsics.f(str2, "CardsMedium");
        f fVar = this.f229230b;
        mt8.d dVar = this.e;
        if (zF) {
            efm.r rVarDoOnNext = ((x) fVar).z(k.CREATED_DATE).doOnNext(new or2.e(new oqk.c(this, 5), 13));
            Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
            efm.r map = kli.a.h(rVarDoOnNext, dVar.a(false)).filter(new or2.e(new h(18), 11)).distinctUntilChanged().map(new n1i.b(6, new l1.e(str, this, z, 26)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            return rd0.e.b(map);
        }
        if (!Intrinsics.f(str2, "CardsSmall")) {
            throw new IllegalArgumentException(j6.a.q("Invalid widgetType: ", str2));
        }
        String strA = eVar != null ? eVar.a("cardId") : null;
        efm.r rVarDoOnNext2 = ((x) fVar).z(k.CREATED_DATE).doOnNext(new or2.e(new oqk.c(this, 5), 13));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
        efm.r rVarFilter = rVarDoOnNext2.filter(new or2.e(new h(20), 12));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        efm.r map2 = kli.a.h(rVarFilter, dVar.a(false)).map(new n1i.b(6, new ard.t(str, this, z, strA, 21)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return rd0.e.b(map2);
    }
}
