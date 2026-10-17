package z63;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import z55.w;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends pri.c {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f319671h;
    public final k3l.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wsg.n f319672j;
    public final ang.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f319673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wg1.b f319674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final li0.a f319675n;
    public final li0.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sri.m f319676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f319677q;

    public k(p tapAndPayView, k3l.b statusView, wsg.n walletInteractor, ang.f userInteractor, f9b.f errorView, wg1.b tapAndPayInteractor, li0.a pushTokenizerRequestBuilderFactory, li0.d userAddressBuilderFactory, sri.m navigator, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tapAndPayView, "tapAndPayView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(tapAndPayInteractor, "tapAndPayInteractor");
        Intrinsics.checkNotNullParameter(pushTokenizerRequestBuilderFactory, "pushTokenizerRequestBuilderFactory");
        Intrinsics.checkNotNullParameter(userAddressBuilderFactory, "userAddressBuilderFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f319671h = tapAndPayView;
        this.i = statusView;
        this.f319672j = walletInteractor;
        this.k = userInteractor;
        this.f319673l = errorView;
        this.f319674m = tapAndPayInteractor;
        this.f319675n = pushTokenizerRequestBuilderFactory;
        this.o = userAddressBuilderFactory;
        this.f319676p = navigator;
        this.f319677q = featureToggleInteractor;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarFilter = ((k3l.d) this.i).f180813j.filter(new z3e.a(new w(3), 19));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = te0.w.D(rVarFilter, new f(this, 3));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new yma.h(2, new j(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new o0(26, function1K), new yzc.p(3, i.f319668a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }
}
