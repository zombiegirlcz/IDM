package rv7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreen;
import gu7.c2;
import gu7.f2;
import gu7.h2;
import gu7.w1;
import gu7.z1;
import java.net.URL;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.m;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsuranceDocumentsLayoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insuranceDocumentsLayoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.R.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof h2) {
            h2 h2Var = (h2) obj3;
            w1 w1Var = h2Var.d;
            if (w1Var instanceof z1) {
                jVar.n2(new rm6.c(jVar, ((z1) w1Var).f146873b, null, 21), new whi.b(6));
                Unit unit = Unit.f186387a;
            } else if (w1Var instanceof c2) {
                String str = ((c2) w1Var).f146722b;
                jVar.A1(new m(jVar, str, Intrinsics.f(new URL(str).getHost(), new URL(jVar.f257730q.getBaseUrl()).getHost()), (Continuation) null, 17), new yi5.b(25));
            } else {
                if (!(w1Var instanceof f2)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.C2(new g(new TextClause(h2Var.f146757b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((f2) w1Var).f146747b));
                Unit unit2 = Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }
}
