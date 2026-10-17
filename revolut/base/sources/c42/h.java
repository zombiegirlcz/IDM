package c42;

import c12.y;
import c12.z;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.list.ApmRecipientListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmRecipientListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ApmRecipientListScreen apmRecipientListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = apmRecipientListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVarE3 = this.v.d();
        Intrinsics.h(model);
        l lVar = (l) dVarE3;
        ApmRecipientListInputData apmRecipientListInputData = lVar.o;
        z zVar = lVar.f20988p;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "ID_NEW_CONTACT_ACTION")) {
            zVar.X(new y(lVar.o.f62262a, ((a) ((j2) lVar.f20992t.f22677a).getValue()).f20977b));
        } else {
            Object obj3 = model.u;
            if (obj3 instanceof ApmRecipient) {
                zVar.e1((ApmRecipient) obj3, apmRecipientListInputData.f62262a);
            } else if (obj3 instanceof zm3.f) {
                zVar.y0(apmRecipientListInputData.f62262a, (zm3.f) obj3);
            } else {
                zVar.K(apmRecipientListInputData.f62262a, str);
            }
        }
        return Unit.f186387a;
    }
}
