package kp5;

import com.revolut.feature.crypto.withdraw.impl.ui.addcryptobeneficiary.flow.CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import te0.w;
import up5.a0;
import up5.e;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ym.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up5.b f188175a;

    public d(up5.b presentationModel) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f188175a = presentationModel;
    }

    @Override // ym.c
    public final d0 g3(ym.b loadingData) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        if (!(loadingData.f314823a instanceof CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        boolean z = loadingData.f314824b;
        e eVar = (e) ((a0) this.f188175a).f281852b;
        z zVarD = w.z0(eVar.f281885s.getValue(eVar, e.v[17]), Boolean.valueOf(z)).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
