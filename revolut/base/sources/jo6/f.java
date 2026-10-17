package jo6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CrossBorderInstitutionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CrossBorderInstitutionsScreen crossBorderInstitutionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = crossBorderInstitutionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "ERROR_STATE_ID");
        CrossBorderInstitutionsScreen crossBorderInstitutionsScreen = this.v;
        if (zF) {
            ((com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) crossBorderInstitutionsScreen.d()).I2();
        } else {
            ((com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) crossBorderInstitutionsScreen.d()).C2(a.C0486a.f73076a);
        }
        return Unit.f186387a;
    }
}
