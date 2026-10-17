package wo2;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.link_list.BankAccountSwitchingLinkListScreen;
import com.revolut.feature.bank_account_switching.impl.ui.link_list.BankAccountSwitchingLinkListScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wgb.v;
import wli.x;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements h {

    @NotNull
    public static final j Companion = new j();
    public final BankAccountSwitchingRequestStatusScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yo2.c f298873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f298874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f298875r;

    public m(cli.n stateMapper, BankAccountSwitchingRequestStatusScreenContract$InputData inputData, yo2.c requestStatusInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(requestStatusInteractor, "requestStatusInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f298873p = requestStatusInteractor;
        this.f298874q = deeplinkHandler;
        this.f298875r = mra.d.b(this, new g(new Data(null, null, true, 3, null), inputData.f63958a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new w76.a(this, null, 24), new yi5.b(26));
    }

    public final void I2(TextLocalisedClause textLocalisedClause, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Continuation continuation = null;
        if (arrayList.size() == 1) {
            l2(new v(this, arrayList, continuation, 16), new yi5.b(26));
        } else {
            yji.l.j2(this, new BankAccountSwitchingLinkListScreen(new BankAccountSwitchingLinkListScreenContract$InputData(textLocalisedClause, arrayList)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f298875r;
    }
}
