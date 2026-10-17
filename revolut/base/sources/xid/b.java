package xid;

import cli.y;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsItemsBidScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShopsItemsBidScreen shopsItemsBidScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsItemsBidScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        double dJ;
        double dDoubleValue;
        RevPoints revPoints;
        SuggestionsBarDelegate.Suggestion model = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.T.getValue();
        Intrinsics.h(model);
        l lVar = (l) hVar;
        y yVar = lVar.f306340s;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53492a, "OTHER_SUGGESTION_ID") && ((c) ((j2) yVar.f22677a).getValue()).f306322a) {
            c cVar = (c) ((j2) yVar.f22677a).getValue();
            fvb.a aVar2 = (fvb.a) cVar.f306323b.getContent();
            if (aVar2 == null || (revPoints = aVar2.f138408g) == null) {
                dJ = 0.0d;
                dDoubleValue = 0.0d;
            } else {
                dJ = revPoints.J();
                dDoubleValue = 0.0d;
            }
            List list = cVar.e;
            Double d = cVar.d;
            double dDoubleValue2 = d != null ? d.doubleValue() : dDoubleValue;
            Double d5 = (Double) cVar.f306324c.getContent();
            if (d5 != null) {
                dDoubleValue = d5.doubleValue();
            }
            lVar.C2(new g(dJ, list, dDoubleValue2, dDoubleValue));
        } else {
            Object obj3 = model.f53496h;
            Double d6 = obj3 instanceof Double ? (Double) obj3 : null;
            if (d6 != null) {
                lVar.H2(yVar, new j96.j(d6.doubleValue(), 2));
            }
        }
        return Unit.f186387a;
    }
}
