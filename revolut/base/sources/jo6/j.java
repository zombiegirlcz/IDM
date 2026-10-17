package jo6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ CrossBorderInstitutionsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CrossBorderInstitutionsScreen crossBorderInstitutionsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = crossBorderInstitutionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) this.u.d()).C2(a.C0486a.f73076a);
        return Unit.f186387a;
    }
}
