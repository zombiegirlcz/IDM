package azd;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.StatementProductType;
import i0e.q;
import i0e.v;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends oki.h implements f {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0e.e f11451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zxd.c f11452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0e.b f11453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vyd.a f11454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sf0.h f11455t;
    public final y u;

    public k(l stateMapper, e inputData, i0e.e periodSelector, zxd.c statementsInteractor, n0e.b statementsNaviCommandsFactory, vyd.a dialogModelConfigurationFactory, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(periodSelector, "periodSelector");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = inputData;
        this.f11451p = periodSelector;
        this.f11452q = statementsInteractor;
        this.f11453r = statementsNaviCommandsFactory;
        this.f11454s = dialogModelConfigurationFactory;
        this.f11455t = serverErrorParser;
        this.u = mra.d.b(this, new d(new v(f0.f322471a), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        StatementProductType statementProductType;
        AccountId accountId = this.o.f11443a;
        if (accountId instanceof AccountId.Joint) {
            statementProductType = StatementProductType.JOINT_CURRENT_ANNUAL_FEE;
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            statementProductType = StatementProductType.PERSONAL_CURRENT_ANNUAL_FEE;
        }
        Set setB = y0.b(statementProductType);
        h0 h0Var = h0.f322473a;
        StatementPeriodType statementPeriodType = StatementPeriodType.LAST_FULL_YEAR;
        i0e.b bVar = new i0e.b(y0.b(statementPeriodType), null, statementPeriodType, 2);
        i0e.e eVar = this.f11451p;
        yji.l.a1(this, i0e.e.G(eVar, setB, bVar, h0Var, 8), null, null, new j(this, null, 0), 3);
        yji.l.a1(this, ((q) eVar).f157383p, null, null, new j(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
