package tzd;

import cli.y;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.StatementProductType;
import i0e.v;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends oki.h implements f {
    public final i0e.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hk0.a f275940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zxd.c f275941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vyd.a f275942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n0e.b f275943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f275944t;
    public final y u;

    public t(j mapper, i0e.e periodSelector, hk0.a networkFileRepository, zxd.c statementsInteractor, vyd.a dialogModelConfigurationFactory, n0e.b statementsNaviCommandsFactory, e inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(periodSelector, "periodSelector");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = periodSelector;
        this.f275940p = networkFileRepository;
        this.f275941q = statementsInteractor;
        this.f275942r = dialogModelConfigurationFactory;
        this.f275943s = statementsNaviCommandsFactory;
        this.f275944t = inputData;
        this.u = mra.d.b(this, new g(new v(f0.f322471a), null, h.PDF), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Set setB = y0.b(StatementProductType.CRYPTO);
        i0e.a aVar = new i0e.a(StatementPeriodType.MONTH, null);
        i0e.e eVar = this.o;
        yji.l.a1(this, i0e.e.G(eVar, setB, aVar, null, 12), null, null, new r(this, null, 0), 3);
        yji.l.a1(this, ((i0e.q) eVar).f157383p, null, null, new r(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
