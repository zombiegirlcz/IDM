package qlf;

import aw0.o9;
import cmf.g;
import cmf.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$plurals;
import gim.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rnf.q;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function3 {
    public /* synthetic */ g u;
    public /* synthetic */ q v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a(3, (Continuation) obj4);
        aVar.u = (g) obj2;
        aVar.v = (q) obj3;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar = this.u;
        q qVar = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        rnf.o oVar = qVar instanceof rnf.o ? (rnf.o) qVar : null;
        if (!(gVar instanceof h)) {
            if (gVar instanceof g.b) {
                return gVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (oVar == null) {
            return (h) gVar;
        }
        h hVar = (h) gVar;
        Clause[] elements = {hVar.f25233c, new TextLocalisedQuantityClause(R$plurals.credit_card_instalment_instalments, new Integer(oVar.f255684a.d), (List) null, new Custom(new Integer(R$attr.uikit_colorForeground_80), false, null, false, null, 254), 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        m70.a.a(t0.f186434a);
        return h.a(hVar, null, null, new CompositeClause(listL, new TextClause(" · ", (Style) new Custom(new Integer(R$attr.uikit_colorForeground_80), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, null, 12), null, null, false, false, null, null, null, 2043);
    }
}
