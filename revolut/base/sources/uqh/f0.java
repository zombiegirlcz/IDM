package uqh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f282146b;

    public /* synthetic */ f0(l0 l0Var, int i) {
        this.f282145a = i;
        this.f282146b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f282145a) {
            case 0:
                zel.h it8 = (zel.h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                pqh.g output = (pqh.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                ScreenerSortingOptions screenerSortingOptions = output.f238782a;
                l0 l0Var = this.f282146b;
                l0Var.X2(l0Var.f282162r, new e0(screenerSortingOptions, 1));
                j2 j2Var = l0Var.u;
                ScreenerSelectedSorting screenerSelectedSorting = new ScreenerSelectedSorting(screenerSortingOptions.f105173b, screenerSortingOptions.f105174c);
                j2Var.getClass();
                j2Var.g(null, screenerSelectedSorting);
                break;
            default:
                aqh.j output2 = (aqh.j) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                l0 l0Var2 = this.f282146b;
                t tVar = ((z) ((j2) l0Var2.f282162r.f22677a).getValue()).f282183a;
                if (tVar != null) {
                    l0Var2.c3(1000, output2.f8441a, tVar.f282175a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
