package ht1;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.bizum.impl.ui.settings.BizumSettingsScreen;
import is2.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.d0;
import rp0.d2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ BizumSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BizumSettingsScreen bizumSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bizumSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) ((b) this.u.Z.getValue());
        j60.a aVar2 = kVar.f155215r;
        it1.a aVar3 = kVar.f155214q;
        aVar3.getClass();
        aVar2.x(d0.d(new TextLocalisedClause(R$string.bizum_settings_deregister_dialog_title, null, null, 14), null, new d2("ID_DEREGISTER_ACTION_CONTINUE", new TextLocalisedClause(R$string.bizum_settings_deregister_dialog_action_continue, null, null, 14), null, 60), new d2("ID_DEREGISTER_ACTION_BACK", new TextLocalisedClause(R$string.bizum_settings_deregister_dialog_action_back, null, null, 14), null, 60), new t(aVar3, 10), 50));
        return Unit.f186387a;
    }
}
