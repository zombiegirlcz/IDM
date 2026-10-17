package rp9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.bills_chooser.api.navigation.CustomBillInputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom.CustomBillScreen;
import com.revolut.feature.payments.groups.api.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        m mVar = this.v;
        if (i == 0) {
            o.b(obj2);
            rik.e eVar = new rik.e(mVar, continuation, 5);
            this.u = 1;
            obj2 = mVar.p2(this, eVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        xi0.b bVar = (xi0.b) obj2;
        kp9.a aVar2 = mVar.f256306t;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_split_bill_create_bill_title, null, null, 14);
        Intrinsics.h(bVar);
        CustomBillInputData inputData = new CustomBillInputData(textLocalisedClause, null, 0L, bVar, com.revolut.feature.payments.bills_chooser.api.common.a.a(((a) mVar.t2()).f256290b) == null, mVar.f256302p.d, 6);
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return yji.l.g2(mVar, new CustomBillScreen(inputData), null, new k(mVar, 1), 1);
    }
}
