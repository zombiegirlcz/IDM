package j2i;

import a08.g0;
import a08.o0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import efm.r;
import g1i.d0;
import i2i.g;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l2i.i;
import m1i.k;
import ofm.h;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends pri.c implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final spi.a f170902h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f170903j;
    public final l4i.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnalyticsContext f170904l;

    public d(spi.a keyboardSuggestionsView, i keyboardSuggestionsMapper, k presentationModel, l4i.a converter) {
        Intrinsics.checkNotNullParameter(keyboardSuggestionsView, "keyboardSuggestionsView");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsMapper, "keyboardSuggestionsMapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f170902h = keyboardSuggestionsView;
        this.i = keyboardSuggestionsMapper;
        this.f170903j = presentationModel;
        this.k = converter;
    }

    public static Amount O(f8l.d dVar, xi0.b bVar) {
        Amount f104747b;
        Asset asset;
        if (Intrinsics.f((dVar == null || (f104747b = dVar.getF104747b()) == null || (asset = f104747b.f104718b) == null) ? null : asset.f104720b, bVar.f306286a)) {
            return dVar.getF104747b();
        }
        if (dVar != null) {
            return dVar.getF104748c();
        }
        return null;
    }

    public final Amount N(Amount amount, BigDecimal bigDecimal, xi0.b bVar) {
        if (bigDecimal == null || amount == null || Intrinsics.f(amount.f104718b.f104720b, bVar.f306286a)) {
            return amount;
        }
        this.k.getClass();
        return l4i.a.e(pyd.c.L(l4i.a.b(amount), bigDecimal, bVar));
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        i2i.k view = (i2i.k) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        AnalyticsContext analyticsContext = this.f170904l;
        KeyboardSuggestionsDelegate keyboardSuggestionsDelegate = (KeyboardSuggestionsDelegate) this.f170902h;
        keyboardSuggestionsDelegate.i = analyticsContext;
        r map = o70.a.f(((d0) this.f170903j).F3()).map(new ivb.i(new a(this, 0), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        a aVar2 = new a(this, 1);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = map.onErrorResumeNext(new o0(26, new i2i.d0(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(23, aVar2), new g0(23, function1K), new ea9.c(29, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.b bVarFlatMapCompletable = keyboardSuggestionsDelegate.s().flatMapCompletable(new ivb.i(new a(this, 2), 22));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K2 = K();
        o0 o0Var = new o0(26, new c(new BreadcrumbException(), 0));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        h hVarW = aVar3.w(new g0(23, function1K2), new ea9.c(29, b.f170899a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        keyboardSuggestionsDelegate.N();
    }
}
