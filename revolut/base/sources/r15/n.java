package r15;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.data.model.Data;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends jki.g implements i {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f250910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k15.d f250911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f250912r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x deeplinkHandler, k15.d financialDifficultiesInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(financialDifficultiesInteractor, "financialDifficultiesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f250910p = deeplinkHandler;
        this.f250911q = financialDifficultiesInteractor;
        this.f250912r = new h(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        z2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f250912r;
    }

    public final void y2() {
        C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, new TicketCreationContext((String) null, (List) null, (List) null, (NewTicketContext) null, 31), (String) null, 11), true));
    }

    public final void z2() {
        k15.d dVar = this.f250911q;
        yji.l.b1(this, xam.a.h(new k15.b(dVar, null), nim.a.v(dVar.f180102c.j(w4l.h.f294642c), k15.a.f)), null, new m(this, null), 3);
    }
}
