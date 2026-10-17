package aj6;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.AccountsSelectionAuScreen;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ AccountsSelectionAuScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AccountsSelectionAuScreen accountsSelectionAuScreen, Continuation continuation) {
        super(2, continuation);
        this.u = accountsSelectionAuScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = (x) this.u.R2();
        cli.y yVar = xVar.u;
        ei6.d dVar = ((i) ((j2) yVar.f22677a).getValue()).f5406a;
        String str = dVar != null ? dVar.f126446a : null;
        x61.a aVar2 = ((i) ((j2) yVar.f22677a).getValue()).f;
        ArrayList arrayList = aVar2 != null ? aVar2.f303009c : null;
        if (str != null && !ue0.e.n(arrayList)) {
            xVar.C2(new o(str, arrayList));
        }
        return Unit.f186387a;
    }
}
