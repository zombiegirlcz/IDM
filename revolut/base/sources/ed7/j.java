package ed7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsHomeScreenWidgetRedesign;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import efm.r;
import ffk.t;
import ip0.c2;
import ip0.d2;
import ip0.g2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import op0.q;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements csh.e {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gkc.b f124931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gc7.h f124932c;
    public final o7.b d;
    public final t e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p19.a f124933g;

    public j(gkc.b widgetInteractor, gc7.h topOffersWidgetMapper, o7.b trendingRewardsWidgetAvailabilityInteractor, t pricingPlanInteractor, gte.a featureToggleInteractor, p19.a lifestyleContentGatewayInteractor, m19.e lifestyleContentGatewaySlotBrandGridCarouselMapper, a homeScreenWidgetModelMapper) {
        Intrinsics.checkNotNullParameter(widgetInteractor, "widgetInteractor");
        Intrinsics.checkNotNullParameter(topOffersWidgetMapper, "topOffersWidgetMapper");
        Intrinsics.checkNotNullParameter(trendingRewardsWidgetAvailabilityInteractor, "trendingRewardsWidgetAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(lifestyleContentGatewayInteractor, "lifestyleContentGatewayInteractor");
        Intrinsics.checkNotNullParameter(lifestyleContentGatewaySlotBrandGridCarouselMapper, "lifestyleContentGatewaySlotBrandGridCarouselMapper");
        Intrinsics.checkNotNullParameter(homeScreenWidgetModelMapper, "homeScreenWidgetModelMapper");
        this.f124931b = widgetInteractor;
        this.f124932c = topOffersWidgetMapper;
        this.d = trendingRewardsWidgetAvailabilityInteractor;
        this.e = pricingPlanInteractor;
        this.f = featureToggleInteractor;
        this.f124933g = lifestyleContentGatewayInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "CashbackLarge")) {
            throw new IllegalArgumentException();
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof ed7.i
            if (r6 == 0) goto L13
            r6 = r7
            ed7.i r6 = (ed7.i) r6
            int r0 = r6.f124930w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f124930w = r0
            goto L1a
        L13:
            ed7.i r6 = new ed7.i
            gim.c r7 = (gim.c) r7
            r6.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f124930w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r7)
            goto L78
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            o7.b r7 = r5.d
            java.lang.Object r7 = r7.f222639b
            h4g.g r7 = (h4g.g) r7
            efm.r r7 = r7.c()
            ebi.i r1 = new ebi.i
            r3 = 17
            r1.<init>(r3)
            e8h.c r3 = new e8h.c
            r4 = 26
            r3.<init>(r4, r1)
            efm.r r7 = r7.map(r3)
            java.lang.String r1 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            ebi.i r1 = new ebi.i
            r3 = 20
            r1.<init>(r3)
            ed7.e r3 = new ed7.e
            r4 = 3
            r3.<init>(r1, r4)
            efm.r r7 = r7.map(r3)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r1 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r6.f124930w = r2
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r0) goto L78
            return r0
        L78:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ed7.j.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!((jte.d) this.f).c(ShopsApi$Toggles$ShopsHomeScreenWidgetRedesign.f86998c)) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            return TileGridWidgetDelegate.Model.Companion.a(TileGridWidgetDelegate.Model.INSTANCE, listId, new TextLocalisedClause(R$string.home_feed_widget_title_top_offers, null, null, 14));
        }
        TextLocalisedClause title = new TextLocalisedClause(R$string.home_feed_shops_widget_top_brands_title, null, null, 14);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        ContactsWidgetDelegate.Model.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        IntRange intRange = new IntRange(1, 4, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new d2(com.google.android.gms.internal.mlkit_vision_face.a.k(it8.nextInt(), listId, "-loading-"), c2.CIRCLE, g2.MATCH_PARENT));
        }
        return new ContactsWidgetDelegate.Model(listId, q.MEDIUM, title, arrayList, true, true, null, null, 384);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i(str, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        r map = ((h4g.g) this.d.f222639b).c().map(new e8h.c(26, new ebi.i(17)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        int i = 0;
        r rVarFlatMap = map.flatMap(new e(new d(this, id10, i), i));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rd0.e.b(rVarFlatMap);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Personal) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ed7.h
            if (r0 == 0) goto L13
            r0 = r8
            ed7.h r0 = (ed7.h) r0
            int r1 = r0.f124929w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124929w = r1
            goto L1a
        L13:
            ed7.h r0 = new ed7.h
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f124929w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)
            goto L76
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            o7.b r8 = r6.d
            java.lang.Object r8 = r8.f222639b
            h4g.g r8 = (h4g.g) r8
            efm.r r8 = r8.c()
            ebi.i r2 = new ebi.i
            r4 = 17
            r2.<init>(r4)
            e8h.c r4 = new e8h.c
            r5 = 26
            r4.<init>(r5, r2)
            efm.r r8 = r8.map(r4)
            java.lang.String r2 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            ed7.d r2 = new ed7.d
            r4 = 0
            r2.<init>(r6, r7, r4)
            ed7.e r7 = new ed7.e
            r7.<init>(r2, r4)
            efm.r r7 = r8.flatMap(r7)
            java.lang.String r8 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            vkm.d r7 = rd0.e.b(r7)
            r0.f124929w = r3
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            java.lang.String r7 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ed7.j.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
