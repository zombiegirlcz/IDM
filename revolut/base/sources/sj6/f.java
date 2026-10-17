package sj6;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.BrazilInstitutionInfoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sbb.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements d {
    public final BrazilInstitutionInfoScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final os2.g f263683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f263684q;

    public f(n stateMapper, BrazilInstitutionInfoScreenContract$InputData inputData, os2.g brazilInboundOpenBankingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(brazilInboundOpenBankingInteractor, "brazilInboundOpenBankingInteractor");
        this.o = inputData;
        this.f263683p = brazilInboundOpenBankingInteractor;
        this.f263684q = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new w(this, null, 13), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f263684q;
    }
}
