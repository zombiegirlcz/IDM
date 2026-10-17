package p0e;

import cli.y;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import i0e.q;
import i0e.v;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends oki.h implements f {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0e.e f231522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zxd.c f231523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0e.b f231524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vyd.a f231525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sf0.h f231526t;
    public final y u;

    public j(k stateMapper, e inputData, i0e.e periodSelector, zxd.c statementsInteractor, n0e.b statementsNaviCommandsFactory, vyd.a dialogModelConfigurationFactory, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(periodSelector, "periodSelector");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = inputData;
        this.f231522p = periodSelector;
        this.f231523q = statementsInteractor;
        this.f231524r = statementsNaviCommandsFactory;
        this.f231525s = dialogModelConfigurationFactory;
        this.f231526t = serverErrorParser;
        this.u = mra.d.b(this, new d(new v(f0.f322471a), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        e eVar = this.o;
        Set setB = y0.b(eVar.f231516c);
        h0 h0Var = h0.f322473a;
        StatementPeriodType statementPeriodType = StatementPeriodType.ALL_TIME;
        StatementPeriodType statementPeriodType2 = StatementPeriodType.MONTH;
        StatementPeriodType statementPeriodType3 = StatementPeriodType.CALENDAR_YEAR;
        StatementPeriodType[] elements = {statementPeriodType, statementPeriodType2, statementPeriodType3, StatementPeriodType.CUSTOM};
        Intrinsics.checkNotNullParameter(elements, "elements");
        i0e.b bVar = new i0e.b(kotlin.collections.d.y0(elements), null, statementPeriodType3, 2);
        String str = eVar.f231515b;
        if (str == null) {
            str = null;
        }
        q qVar = (q) this.f231522p;
        l.a1(this, qVar.c3(setB, bVar, h0Var, str), null, null, new i(this, null, 0), 3);
        l.a1(this, qVar.f157383p, null, null, new i(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
