package ts5;

import com.revolut.core.ui_kit.delegates.ExtraSmallLoadingTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ExtraSmallTileGridWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_feed.impl.R$string;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import op0.q;
import org.jetbrains.annotations.NotNull;
import q97.g3;
import vkm.v1;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements csh.e {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yud.g f273977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g09.e f273978c;
    public final ttd.a d;
    public final o5c.a e;
    public final xoj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x8h.k f273979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ld5.b f273980h;
    public final myj.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o76.d f273981j;
    public final k18.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dsh.e f273982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f273983m;

    public n(yud.g stakingInteractor, g09.e learnCoursesInteractor, ttd.a interestRateFormatter, o5c.a cryptoExchangeEligibilityInteractor, xoj.a featuresInteractor, x8h.k displayCurrencyInteractor, ld5.b cryptoCardsAvailabilityInteractor, myj.e learnFeatureStateChecker, o76.d derivativesEnabledStateChecker, k18.c derivativesBalanceInteractor) {
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(learnCoursesInteractor, "learnCoursesInteractor");
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        Intrinsics.checkNotNullParameter(cryptoExchangeEligibilityInteractor, "cryptoExchangeEligibilityInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(cryptoCardsAvailabilityInteractor, "cryptoCardsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(learnFeatureStateChecker, "learnFeatureStateChecker");
        Intrinsics.checkNotNullParameter(derivativesEnabledStateChecker, "derivativesEnabledStateChecker");
        Intrinsics.checkNotNullParameter(derivativesBalanceInteractor, "derivativesBalanceInteractor");
        this.f273977b = stakingInteractor;
        this.f273978c = learnCoursesInteractor;
        this.d = interestRateFormatter;
        this.e = cryptoExchangeEligibilityInteractor;
        this.f = featuresInteractor;
        this.f273979g = displayCurrencyInteractor;
        this.f273980h = cryptoCardsAvailabilityInteractor;
        this.i = learnFeatureStateChecker;
        this.f273981j = derivativesEnabledStateChecker;
        this.k = derivativesBalanceInteractor;
        dsh.e.Companion.getClass();
        this.f273982l = dsh.d.a();
        this.f273983m = v.k(a.Earn, a.Strategies, a.CryptoCard, a.RevolutX, a.Futures, a.Learn);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(ts5.n r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof ts5.f
            if (r0 == 0) goto L13
            r0 = r6
            ts5.f r0 = (ts5.f) r0
            int r1 = r0.f273966w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f273966w = r1
            goto L18
        L13:
            ts5.f r0 = new ts5.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f273966w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            xoj.a r5 = r5.f
            yoj.c r6 = yoj.c.STAKING
            efm.d0 r5 = xoj.a.c(r5, r6)
            tpi.g r6 = new tpi.g
            r2 = 19
            r6.<init>(r2)
            tjf.m0 r2 = new tjf.m0
            r4 = 29
            r2.<init>(r6, r4)
            ufm.i r6 = new ufm.i
            r4 = 1
            r6.<init>(r5, r2, r4)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            r0.f273966w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ts5.n.i(ts5.n, gim.c):java.lang.Object");
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        return this.f273982l;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        ExtraSmallTileGridWidgetDelegate.Model.Companion companion = ExtraSmallTileGridWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause title = new TextLocalisedClause(R$string.crypto_home_widget_features_title, null, null, 14);
        companion.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        q qVar = q.LARGE;
        IntRange intRange = new IntRange(1, 4, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            ExtraSmallLoadingTileDelegate.Model model = new ExtraSmallLoadingTileDelegate.Model(String.valueOf(it8.nextInt()));
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return new ExtraSmallTileGridWidgetDelegate.Model(listId, qVar, title, arrayList);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CryptoWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5, java.lang.String r6, java.lang.String r7, dsh.e r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r8 = r9 instanceof ts5.d
            if (r8 == 0) goto L13
            r8 = r9
            ts5.d r8 = (ts5.d) r8
            int r0 = r8.A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.A = r0
            goto L1a
        L13:
            ts5.d r8 = new ts5.d
            gim.c r9 = (gim.c) r9
            r8.<init>(r4, r9)
        L1a:
            java.lang.Object r9 = r8.f273964y
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.A
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.String r7 = r8.f273963x
            java.lang.String r6 = r8.f273962w
            com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5 = r8.v
            ts5.n r1 = r8.u
            yhm.o.b(r9)
            goto L53
        L40:
            yhm.o.b(r9)
            r8.u = r4
            r8.v = r5
            r8.f273962w = r6
            r8.f273963x = r7
            r8.A = r3
            dsh.e r9 = r4.f273982l
            if (r9 != r0) goto L52
            goto L6a
        L52:
            r1 = r4
        L53:
            dsh.e r9 = (dsh.e) r9
            kotlinx.coroutines.flow.Flow r5 = r1.g(r5, r6, r7, r9)
            r6 = 0
            r8.u = r6
            r8.v = r6
            r8.f273962w = r6
            r8.f273963x = r6
            r8.A = r2
            java.lang.Object r5 = vkm.q.x(r5, r8)
            if (r5 != r0) goto L6b
        L6a:
            return r0
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ts5.n.f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Flow g(CryptoWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Flow gVar;
        Flow flowB;
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        Continuation continuation = null;
        g3 g3Var = new g3(mo3.a.g(this.e.a(), null, null, 3), 21);
        wkm.l lVarQ = vkm.q.Q(new v1(new sma.f(this, continuation, 24)), new tik.b(continuation, this, 5));
        t9l.f fVar = new t9l.f(rd0.e.b(this.f273980h.a()), 23);
        g3 g3Var2 = new g3(mo3.a.g(rd0.e.b(this.i.b()), null, null, 3), 22);
        if (this.f273981j.a()) {
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            k18.c cVar = this.k;
            if (((o76.d) cVar.d).a()) {
                s76.b bVar = (s76.b) cVar.f180140b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowB = bVar.e.b(Unit.f186387a, loadingStrategy);
            } else {
                flowB = new go.g(new Data(null, null, false, 7, null), 2);
            }
            gVar = new tnb.k(flowB, 1);
        } else {
            gVar = new go.g(Boolean.FALSE, 2);
        }
        return rd0.e.e(new t38.e(yh5.b.h(g3Var, lVarQ, fVar, g3Var2, gVar), 7, this, id10), h0.f322473a, new m(this, id10, null));
    }
}
