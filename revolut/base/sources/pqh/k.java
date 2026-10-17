package pqh;

import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.ng;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreenContract$Input;
import com.revolut.retail.wealth.resources.R$string;
import grl.b4;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerSortingPickerScreenContract$Input f238786a;

    public k(ScreenerSortingPickerScreenContract$Input inputData, hph.j screenerMetricsResourceMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(screenerMetricsResourceMapper, "screenerMetricsResourceMapper");
        this.f238786a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f fVar;
        char c2;
        SingleChoiceDelegate.b aVar;
        int i;
        int i2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<zel.g> list = this.f238786a.f96274a.f105172a;
        char c3 = '\n';
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (zel.g gVar : list) {
            zel.g gVar2 = domainState.f238780a;
            zel.i iVar = domainState.f238781b;
            boolean z = gVar == gVar2;
            String strQ = j6.a.q("sorting_metric_", gVar.name());
            TextLocalisedClause textLocalisedClauseB = hph.j.b(gVar);
            if (z) {
                int[] iArr = j.f238785a;
                int i3 = iArr[iVar.ordinal()];
                if (i3 == 1) {
                    i = R$string.wealth_trading_assets_sorting_direction_asc;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_trading_assets_sorting_direction_desc;
                }
                fVar = domainState;
                c2 = '\n';
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
                int i5 = iArr[iVar.ordinal()];
                if (i5 == 1) {
                    i2 = R$drawable.uikit_icn_24_arrow_thin_up;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$drawable.uikit_icn_24_arrow_thin_down;
                }
                aVar = new ng(textLocalisedClause, i2);
            } else {
                fVar = domainState;
                c2 = c3;
                aVar = new SingleChoiceDelegate.b.a(0);
            }
            arrayList.add(new SingleChoiceDelegate.Model(strQ, textLocalisedClauseB, z, aVar, new h(gVar), b4.EXPIRED_OR_INVALID_KEY_VALUE));
            c3 = c2;
            domainState = fVar;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("sorting-picker-apply-button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.screener_results_sorting_submit, null, null, 14), false, null, null, e.f238779a, null, 744);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new i(d0.F0(model, arrayList));
    }
}
