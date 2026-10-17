package p9g;

import efm.d0;
import i9g.v;
import kotlin.jvm.internal.Intrinsics;
import nyb.j;
import org.jetbrains.annotations.NotNull;
import p5a.m;
import ufm.i;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f234315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qka.c f234316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f234317c;
    public final f01.c d;

    public g(p8g.c travelHotelsFeatureInteractor, qka.c productArticleNavigationProvider, j revPointsEarningRatesInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f234315a = travelHotelsFeatureInteractor;
        this.f234316b = productArticleNavigationProvider;
        this.f234317c = revPointsEarningRatesInteractor;
        this.d = uiKitResources;
    }

    public final i a() {
        d0 d0VarM;
        if (((v) this.f234315a).b()) {
            d0 d0VarFirstOrError = uj3.b.s(this.f234317c).firstOrError();
            p8k.b bVar = new p8k.b(8, new a(this, 1));
            d0VarFirstOrError.getClass();
            i iVar = new i(d0VarFirstOrError, bVar, 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            d0VarM = ue0.e.I(iVar, h0.f322473a, new m(19));
        } else {
            d0VarM = d0.m(c.f234312a);
        }
        i iVar2 = new i(d0VarM, new p8k.b(7, new m(18)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        i iVar3 = new i(iVar2, new p8k.b(6, new a(this, 0)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        return iVar3;
    }
}
