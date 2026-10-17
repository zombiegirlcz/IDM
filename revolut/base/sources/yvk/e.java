package yvk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditKeyStatsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(EditKeyStatsScreen editKeyStatsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editKeyStatsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditKeyStatsScreen editKeyStatsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a) editKeyStatsScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar3 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a) editKeyStatsScreen.R2();
                List list = (List) ((f) ((j2) aVar3.f104032s.f22677a).getValue()).f317217a.getContent();
                if (list != null) {
                    aVar3.l2(new yv1.k(aVar3, list, null, 2), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
