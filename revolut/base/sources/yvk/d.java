package yvk;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreenContract$ModalStep;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ EditKeyStatsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditKeyStatsScreen editKeyStatsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = editKeyStatsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar2 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a) this.u.R2();
        List list = (List) ((f) ((j2) aVar2.f104032s.f22677a).getValue()).f317217a.getContent();
        if (list != null) {
            oki.h.v2(aVar2.f104033t, new EditKeyStatsScreenContract$ModalStep.AddStatsItem(d0.i1(list)), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
