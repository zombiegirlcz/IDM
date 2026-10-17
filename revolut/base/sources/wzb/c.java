package wzb;

import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreen;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import vkm.j2;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsExpiryHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsExpiryHomeScreen revPointsExpiryHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsExpiryHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.points_expiry.home.a aVar2 = (com.revolut.feature.rev_points.impl.ui.points_expiry.home.a) gVarE3;
        y yVar = aVar2.f83834r;
        Intrinsics.checkNotNullParameter(model, "model");
        if (a0.H(model.f52613a, "LARGE_ACTION_BUTTON_ITEM_ID_PREFIX", false)) {
            LinkedHashMap linkedHashMapZ = r0.z(((f) ((j2) yVar.f22677a).getValue()).f301400c);
            Object obj3 = model.i;
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
            Integer num = (Integer) obj3;
            if (((Boolean) linkedHashMapZ.get(num)) != null) {
                linkedHashMapZ.put(num, Boolean.valueOf(!r3.booleanValue()));
                aVar2.H2(yVar, new awk.j(linkedHashMapZ, 24));
            }
        }
        return Unit.f186387a;
    }
}
