package mo2;

import cli.n;
import cli.y;
import com.revolut.feature.bank_account_switching.impl.ui.link_list.BankAccountSwitchingLinkListScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wli.x;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends h implements dli.b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f207540p;

    public f(n stateMapper, BankAccountSwitchingLinkListScreenContract$InputData inputData, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        this.f207540p = mra.d.b(this, new d(inputData.f63950b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f207540p;
    }
}
