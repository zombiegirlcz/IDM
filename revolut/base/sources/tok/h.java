package tok;

import cli.n;
import cli.y;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.bottomsheet.WaitlistInvitationBottomsheetScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends oki.h implements dli.b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f273240p;

    public h(n stateMapper, WaitlistInvitationBottomsheetScreenContract$InputData inputData, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        this.f273240p = mra.d.b(this, new f(inputData.f103695a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f273240p;
    }
}
