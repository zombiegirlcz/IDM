package zj5;

import aii.g;
import aii.u;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceDestination$CommonRemittanceFieldDialog;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.CommonRemittanceFieldDialogFlow;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.CommonRemittanceFieldDialogFlowContract$InputData;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoController;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tk5.j;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a {
    @Override // nhi.f
    public final g c(aii.e descriptor) {
        j jVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof rj5.b)) {
            if (!(descriptor instanceof rj5.a)) {
                return null;
            }
            rj5.a aVar = (rj5.a) descriptor;
            return aVar.a(new CommonRemittanceFieldDialogFlow(new CommonRemittanceFieldDialogFlowContract$InputData(aVar.b())));
        }
        rj5.b bVar = (rj5.b) descriptor;
        int i = b.f322742a[bVar.b().ordinal()];
        if (i == 1) {
            jVar = j.ASSETS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = j.ADDRESS_TYPE;
        }
        return bVar.a(new CryptoMultichainInfoController(new CryptoMultichainInfoControllerContract$InputData(jVar)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        j jVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CryptoRemittanceKompotFeatureConfig.MultichainInfoDestination)) {
            if (destination instanceof CryptoRemittanceDestination$CommonRemittanceFieldDialog) {
                return new CommonRemittanceFieldDialogFlow(new CommonRemittanceFieldDialogFlowContract$InputData(((CryptoRemittanceDestination$CommonRemittanceFieldDialog) destination).getF70935a()));
            }
            return null;
        }
        int i = b.f322742a[((CryptoRemittanceKompotFeatureConfig.MultichainInfoDestination) destination).getF70951a().ordinal()];
        if (i == 1) {
            jVar = j.ASSETS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = j.ADDRESS_TYPE;
        }
        return new CryptoMultichainInfoController(new CryptoMultichainInfoControllerContract$InputData(jVar));
    }
}
