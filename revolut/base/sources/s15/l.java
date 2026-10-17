package s15;

import cli.y;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesControllerContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends oki.h implements e {

    @NotNull
    public static final h Companion = new h();
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FinancialDifficultiesControllerContract$InputData f259093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k15.d f259094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f259095r;

    public l(x deeplinkHandler, FinancialDifficultiesControllerContract$InputData inputData, k15.d financialDifficultiesInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(financialDifficultiesInteractor, "financialDifficultiesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = deeplinkHandler;
        this.f259093p = inputData;
        this.f259094q = financialDifficultiesInteractor;
        this.f259095r = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2() {
        C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, new TicketCreationContext((String) null, (List) null, (List) null, (NewTicketContext) null, 31), (String) null, 11), true));
    }

    public final void J2() {
        ux4.k creditFacility = this.f259093p.f70010a;
        k15.d dVar = this.f259094q;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(creditFacility, "creditFacility");
        yji.l.b1(this, ngm.n.K(new k15.c(dVar, creditFacility, null)), null, new k(this, null), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        J2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f259095r;
    }
}
