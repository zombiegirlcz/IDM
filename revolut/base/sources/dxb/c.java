package dxb;

import a9j.m;
import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.api.widgets.RevPointsGiftcardsWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import dsh.j;
import fxb.h;
import grl.t9;
import ip0.c2;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.v1;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final svb.a f120932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wvb.b f120933c;

    public c(svb.a giftcardsFeatureInteractor, wvb.b giftcardsMediumWidgetItemsProvider) {
        Intrinsics.checkNotNullParameter(giftcardsFeatureInteractor, "giftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(giftcardsMediumWidgetItemsProvider, "giftcardsMediumWidgetItemsProvider");
        this.f120932b = giftcardsFeatureInteractor;
        this.f120933c = giftcardsMediumWidgetItemsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "GiftCardsMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(((jwb.c) this.f120932b).a());
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!Intrinsics.f(widgetType, "GiftCardsMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", widgetType));
        }
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        w0 w0VarB = h.b(t9.LOADING);
        ContactsWidgetDelegate.Model.Companion companion = ContactsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_widget_title, null, null, 14);
        c2 c2Var = c2.CARD;
        zn.b bVar = new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarB));
        AnalyticsContext analyticsContext = new AnalyticsContext(w0VarB);
        companion.getClass();
        return ContactsWidgetDelegate.Model.Companion.a(widgetId, textLocalisedClause, c2Var, analyticsContext, bVar);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        return q.x(i(str, str2, true), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        RevPointsGiftcardsWidgetContext widgetContext2 = (RevPointsGiftcardsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new b(this, widgetType, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((RevPointsGiftcardsWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(String widgetId, String str, boolean z) {
        if (!Intrinsics.f(str, "GiftCardsMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", str));
        }
        h hVar = (h) this.f120933c;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return rd0.e.e(q.Q(mo3.a.g(hVar.f138788a.c(null, w4l.h.f294642c), null, new fv0.c(8), 1), new m((Continuation) null, hVar, widgetId, z, 2)), h0.f322473a, new fxb.c(hVar, widgetId, null));
    }
}
