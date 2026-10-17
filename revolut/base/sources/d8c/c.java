package d8c;

import a09.r;
import efm.d0;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import q06.d;
import te0.w;
import xo9.h;
import xo9.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f112209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xcc.b f112210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j6c.b f112211c;
    public final gte.a d;

    public c(d deeplinkParser, xcc.b orderParametersParser, j6c.b orderSummaryProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(orderParametersParser, "orderParametersParser");
        Intrinsics.checkNotNullParameter(orderSummaryProvider, "orderSummaryProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f112209a = deeplinkParser;
        this.f112210b = orderParametersParser;
        this.f112211c = orderSummaryProvider;
        this.d = featureToggleInteractor;
    }

    @Override // xo9.i
    public final d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        return w.o0(g.f186406a, new b(parsingResult, this, null));
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ufm.c cVar = new ufm.c(new r(this, code, 22), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
