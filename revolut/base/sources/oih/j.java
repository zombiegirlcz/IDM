package oih;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.core.navigation.DummyCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface j {
    static /* synthetic */ ufm.i a(j jVar, sih.b bVar, WealthAccount.Securities securities, int i) {
        if ((i & 1) != 0) {
            bVar = sih.b.STOCKS;
        }
        if ((i & 2) != 0) {
            securities = null;
        }
        return ((llh.i) jVar).e(bVar, securities);
    }

    static d0 b(j jVar) {
        llh.i iVar = (llh.i) jVar;
        iVar.getClass();
        DummyCommand targetCommandIfOnboardingComplete = DummyCommand.f98635a;
        Intrinsics.checkNotNullParameter(targetCommandIfOnboardingComplete, "targetCommandIfOnboardingComplete");
        return iVar.d(targetCommandIfOnboardingComplete, null);
    }
}
