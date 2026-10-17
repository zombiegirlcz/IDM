package z1i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f318819b;

    public /* synthetic */ e0(i0 i0Var, int i) {
        this.f318818a = i;
        this.f318819b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PairedImage pairedImage;
        switch (this.f318818a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ue0.e.v(this.f318819b.f318824j.finish());
            case 1:
                b2i.b summary = (b2i.b) obj2;
                Intrinsics.checkNotNullParameter(summary, "summary");
                if (czi.c.A(summary)) {
                    return ((gi5.d) this.f318819b.f318826m).c(summary.d.f115083b);
                }
                sh5.c.Companion.getClass();
                return efm.d0.m(sh5.b.a());
            case 2:
                xpi.g gVar = this.f318819b.f318823h;
                sh5.c cVar = (sh5.c) obj2;
                if (cVar.f263437c) {
                    Clause text = (Clause) cVar.d.getValue();
                    xpi.c cVar2 = (xpi.c) gVar;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(text, "text");
                    NavBarWithToolbar navBarWithToolbar = cVar2.f307974j;
                    if (navBarWithToolbar == null) {
                        Intrinsics.r("navBarWithToolbarView");
                        throw null;
                    }
                    navBarWithToolbar.setHeaderDisclaimerSticky(text);
                } else {
                    NavBarWithToolbar navBarWithToolbar2 = ((xpi.c) gVar).f307974j;
                    if (navBarWithToolbar2 == null) {
                        Intrinsics.r("navBarWithToolbarView");
                        throw null;
                    }
                    navBarWithToolbar2.setHeaderDisclaimerSticky(null);
                }
                return Unit.f186387a;
            case 3:
                ty0.a it8 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) this.f318819b.f318826m).d(it8);
                if (cryptoFcaRisksDestinationD != null) {
                    return u0.f(cryptoFcaRisksDestinationD);
                }
                return null;
            case 4:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return this.f318819b.f318824j.a(command);
            case 5:
                b2i.b summary2 = (b2i.b) obj2;
                Intrinsics.checkNotNullParameter(summary2, "summary");
                wd6.h hVar = summary2.f11942a;
                boolean z = false;
                boolean z3 = hVar == wd6.h.MARKET;
                boolean z4 = hVar == wd6.h.RECURRING;
                boolean z6 = hVar == wd6.h.TAKE_PROFIT_STOP_LOSS;
                wd6.h hVar2 = wd6.h.STOP;
                i0 i0Var = this.f318819b;
                if ((hVar == hVar2 || hVar == wd6.h.LIMIT) && i0Var.f318827n.f96918b) {
                    z = true;
                }
                if (!czi.c.z(summary2) || (!z3 && !z4 && !z6 && !z)) {
                    efm.r map = i0Var.i.d().map(new n(new e0(i0Var, 6), 4));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return map;
                }
                a2i.o oVar = (a2i.o) i0Var.f318825l;
                efm.r map2 = ((g1i.d0) oVar.i).d().map(new a05.a(new a2i.h(oVar, 2), 23));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return map2;
            default:
                b2i.b summary3 = (b2i.b) obj2;
                Intrinsics.checkNotNullParameter(summary3, "summary");
                t2i.j jVar = this.f318819b.k;
                MoneyClause moneyClauseE = jVar.e(summary3);
                TextLocalisedClause textLocalisedClauseD = jVar.d(summary3);
                dj0.d dVar = summary3.d;
                dj0.d dVar2 = summary3.f;
                int i = f0.f318820a[summary3.f11943b.ordinal()];
                if (i == 1) {
                    pairedImage = new PairedImage(new CurrencyImage(dVar2.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pairedImage = new PairedImage(new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(dVar2.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
                }
                return new t2i.a(moneyClauseE, textLocalisedClauseD, pairedImage, null);
        }
    }
}
