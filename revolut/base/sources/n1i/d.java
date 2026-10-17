package n1i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$ExchangeKeyboardSuggestions;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import efm.r;
import g1i.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ly7.g;
import m1i.k;
import m1i.n;
import mzj.j;
import n0c.p;
import ofm.h;
import pri.f;
import q1i.e;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends pri.c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f211367h;
    public final spi.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f211368j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f211369l;

    public d(gte.a featureToggleInteractor, spi.a keyboardSuggestionsView, e keyboardSuggestionsMapper, k presentationModel) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsView, "keyboardSuggestionsView");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsMapper, "keyboardSuggestionsMapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f211367h = featureToggleInteractor;
        this.i = keyboardSuggestionsView;
        this.f211368j = keyboardSuggestionsMapper;
        this.k = presentationModel;
        this.f211369l = v0.a.d("create(...)");
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        n view = (n) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        if (((jte.d) this.f211367h).c(ExchangeApi$Toggles$ExchangeKeyboardSuggestions.f96818c)) {
            r map = o70.a.f(((d0) this.k).F3()).map(new j(new a(this, 0), 20));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            a aVar2 = new a(this, 1);
            Function1 function1K = K();
            Function0 function0J = J();
            r rVarOnErrorResumeNext = map.onErrorResumeNext(new g(5, new p(new BreadcrumbException(), 1)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new b(0, aVar2), new b(0, function1K), new j7a.j(15, function0J));
            ifm.b bVar = this.f239031a;
            w.j0(bVar, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
            KeyboardSuggestionsDelegate keyboardSuggestionsDelegate = (KeyboardSuggestionsDelegate) this.i;
            efm.b bVarFlatMapCompletable = keyboardSuggestionsDelegate.s().flatMapCompletable(new j(new a(this, 2), 21));
            Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
            Function1 function1K2 = K();
            g gVar = new g(5, new p(new BreadcrumbException(), 2));
            bVarFlatMapCompletable.getClass();
            pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, gVar, 2);
            Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
            h hVarW = aVar3.w(new b(0, function1K2), new j7a.j(15, c.f211366a));
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            w.j0(bVar, hVarW);
            keyboardSuggestionsDelegate.N();
        }
    }
}
