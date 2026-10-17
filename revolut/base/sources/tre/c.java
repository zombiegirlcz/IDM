package tre;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.impl.ui.tnc_list.TnCListScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TnCListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TnCListScreen tnCListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tnCListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.P.getValue();
        Intrinsics.h(model);
        i iVar = (i) fVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof lre.b) {
            lre.b bVar = (lre.b) obj3;
            mre.c cVar = iVar.f273788q;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            String str = bVar.f199503a;
            String str2 = bVar.f199504b;
            String str3 = bVar.f199505c;
            String str4 = bVar.d;
            LocalDate localDate = bVar.e.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
            iVar.C1(new BridgeDestination(((rre.d) cVar).b(new Terms(str, str2, str3, str4, localDate, bVar.f, null, bVar.f199506g, null))));
        } else if (obj3 instanceof lre.d) {
            iVar.A1(new h(iVar, (lre.d) obj3, null), new yi5.b(25));
        }
        return Unit.f186387a;
    }
}
