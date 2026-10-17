package e0e;

import a0e.w;
import a0e.x;
import cli.y;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelectorBottomSheetProvider$InputData;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.TaxPeriod;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends oki.h implements dli.b {

    @NotNull
    public static final f Companion = new f();
    public final StatementPeriodSelectorBottomSheetProvider$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zjh.i f121573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bzd.a f121574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f121575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f121576s;

    public h(StatementPeriodSelectorBottomSheetProvider$InputData inputData, zjh.i periodInteractor, bzd.a monthPeriodCalculator, w taxYearPeriodCalculator, l stateMapper) {
        List listA;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(periodInteractor, "periodInteractor");
        Intrinsics.checkNotNullParameter(monthPeriodCalculator, "monthPeriodCalculator");
        Intrinsics.checkNotNullParameter(taxYearPeriodCalculator, "taxYearPeriodCalculator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f121573p = periodInteractor;
        this.f121574q = monthPeriodCalculator;
        this.f121575r = taxYearPeriodCalculator;
        StatementPeriod statementPeriod = inputData.f88219a;
        StatementPeriodSelection statementPeriodSelection = inputData.f88220b;
        xxd.b bVar = new xxd.b(statementPeriod, statementPeriodSelection, statementPeriodSelection);
        Set set = inputData.f88221c;
        StatementPeriod statementPeriod2 = statementPeriodSelection.f88218b;
        TaxPeriod taxPeriod = inputData.d;
        this.f121576s = mra.d.b(this, new e(bVar, set, statementPeriod2, null, (taxPeriod == null || (listA = taxYearPeriodCalculator.a(inputData.f88219a, taxPeriod)) == null) ? f0.f322471a : listA, inputData.d), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        StatementPeriodSelectorBottomSheetProvider$InputData statementPeriodSelectorBottomSheetProvider$InputData = this.o;
        StatementPeriod statementPeriod = statementPeriodSelectorBottomSheetProvider$InputData.f88219a;
        StatementPeriodSelection statementPeriodSelection = statementPeriodSelectorBottomSheetProvider$InputData.f88220b;
        zjh.i iVar = this.f121573p;
        iVar.i(statementPeriodSelection, statementPeriod);
        yji.l.a1(this, new t0((j2) iVar.f322838b, 1), null, null, new e0b.c(this, null, 1), 3);
    }

    public final void I2(StatementPeriod statementPeriod, StatementPeriod statementPeriod2) {
        if (statementPeriod.equals(statementPeriod2)) {
            return;
        }
        H2(this.f121576s, new x(statementPeriod, 2));
        this.f121573p.p(new StatementPeriodSelection(StatementPeriodType.MONTH, statementPeriod));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f121576s;
    }
}
