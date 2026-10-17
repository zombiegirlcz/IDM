package ltf;

import cli.n;
import cli.y;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements i {
    public final TransferReasonsReuseDeclarationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zxd.c f199872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n0e.b f199873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vyd.a f199874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sf0.h f199875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f199876t;

    public l(n stateMapper, TransferReasonsReuseDeclarationScreenContract$InputData inputData, zxd.c statementsInteractor, n0e.b statementsNaviCommandsFactory, vyd.a dialogModelConfigurationFactory, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = inputData;
        this.f199872p = statementsInteractor;
        this.f199873q = statementsNaviCommandsFactory;
        this.f199874r = dialogModelConfigurationFactory;
        this.f199875s = serverErrorParser;
        this.f199876t = mra.d.b(this, new e(inputData.f92393a.f92442b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f199876t;
    }
}
