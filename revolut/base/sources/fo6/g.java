package fo6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.CrossBorderBranchesScreen;
import fo6.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CrossBorderBranchesScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CrossBorderBranchesScreen crossBorderBranchesScreen, Continuation continuation) {
        super(2, continuation);
        this.u = crossBorderBranchesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((p) this.u.d()).C2(k.a.f136831a);
        return Unit.f186387a;
    }
}
