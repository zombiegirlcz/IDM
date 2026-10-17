package xuc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab.CommonLinkedWalletsTabScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends oki.h implements dli.b {
    public final y o;

    public k(cli.n stateMapper, CommonLinkedWalletsTabScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        vuc.m mVar = inputData.f85623a;
        Throwable th10 = inputData.f85625c;
        List list = inputData.f85624b;
        this.o = mra.d.b(this, new f(mVar, new Data(list, th10, list == null && th10 == null)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
