package vsf;

import cli.y;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements f {
    public final TransferReasonsDeclarationActionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zxd.c f291782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n0e.b f291783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vyd.a f291784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sf0.h f291785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f291786t;

    public i(l stateMapper, TransferReasonsDeclarationActionsScreenContract$InputData inputData, zxd.c statementsInteractor, n0e.b statementsNaviCommandsFactory, vyd.a dialogModelConfigurationFactory, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = inputData;
        this.f291782p = statementsInteractor;
        this.f291783q = statementsNaviCommandsFactory;
        this.f291784r = dialogModelConfigurationFactory;
        this.f291785s = serverErrorParser;
        this.f291786t = mra.d.b(this, new d(inputData.f92372b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f291786t;
    }
}
