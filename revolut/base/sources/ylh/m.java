package ylh;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = this.v.d;
        Intrinsics.h(model);
        t tVar = (t) jVar;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52580a;
        Object obj3 = model.P;
        int iHashCode = str.hashCode();
        if (iHashCode != -769741326) {
            if (iHashCode != -400551899) {
                if (iHashCode == 2036880481 && str.equals("CUSTOM_VALUES_FROM_ITEM_ID")) {
                    yVar = obj3 instanceof y ? (y) obj3 : null;
                    if (yVar != null) {
                        tVar.b3(yVar, true);
                    }
                }
            } else if (str.equals("PERIOD_CHOOSER_ITEM_ID")) {
                g state = obj3 instanceof g ? (g) obj3 : null;
                if (state != null && state.f314716b.size() >= 2) {
                    j60.a aVar2 = tVar.f314731p;
                    ((u) tVar.f314728l).getClass();
                    Intrinsics.checkNotNullParameter(state, "state");
                    List listK = zhm.v.k(u.a(w.ALL_TIME, state), u.a(w.MONTH, state), u.a(w.TAX_YEAR, state), u.a(w.CUSTOM, state));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    aVar2.x(new rp0.y(listK, new rp0.t(new TextLocalisedClause(R$string.common_word_period, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
                }
            }
        } else if (str.equals("CUSTOM_VALUES_TO_ITEM_ID")) {
            yVar = obj3 instanceof y ? (y) obj3 : null;
            if (yVar != null) {
                tVar.b3(yVar, false);
            }
        }
        return Unit.f186387a;
    }
}
