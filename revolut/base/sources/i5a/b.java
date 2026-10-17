package i5a;

import aq4.i;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import efm.r;
import i52.j;
import itb.c;
import jeg.h;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jn2.b f158793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f158794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f158795c;

    public b(jn2.b badgeManager, c headerUiProvider, kbb.c headerUiParamsProvider) {
        Intrinsics.checkNotNullParameter(badgeManager, "badgeManager");
        Intrinsics.checkNotNullParameter(headerUiProvider, "headerUiProvider");
        Intrinsics.checkNotNullParameter(headerUiParamsProvider, "headerUiParamsProvider");
        this.f158793a = badgeManager;
        this.f158794b = headerUiProvider;
        this.f158795c = headerUiParamsProvider;
    }

    public final r a(TextLocalisedClause titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        r rVarC = e.c(this.f158795c.P(), g.f186406a);
        itb.b.Companion.getClass();
        itb.b bVar = itb.b.d;
        r rVarStartWith = rVarC.startWith(bVar);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        r map = ue0.e.E(rVarStartWith, bVar).distinctUntilChanged().map(new j(2, new i30.a(this, 16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r map2 = this.f158793a.f176650a.k(false).map(new h(new jn2.a(0), 26));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r map3 = w.l(map, ue0.e.E(map2, Boolean.FALSE)).map(new j(1, new i(4, titleText)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        return map3;
    }
}
