package com.revolut.feature_exchange.impl.ui.order_details_kompot;

import aw0.o9;
import b9.w2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ffk.t;
import gim.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mha.k;
import mha.n;
import mha.p;
import mha.s;
import oki.h;
import rd0.e;
import vkm.q;
import yhm.o;
import zi0.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Clause textClause;
        b bVar = this.v;
        b3i.a aVar = bVar.f96975s;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            w2 w2Var = bVar.f96972p;
            a3i.i iVar = new a3i.i(c.w(e.b(((t) w2Var.d).t(true))), w2Var, 0);
            this.u = 1;
            obj2 = q.x(iVar, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        s sVar = (s) obj2;
        p value = sVar != null ? sVar.f205467h : null;
        k kVar = sVar != null ? sVar.f205466g : null;
        if (value == null || kVar == null) {
            hx7.e.h(new IllegalStateException());
            return Unit.f186387a;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof n) {
            textClause = new MoneyClause(((n) value).f205461a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        } else {
            if (!(value instanceof mha.o)) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = new TextClause(String.valueOf(((mha.o) value).f205462a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        aVar.getClass();
        h.v2(bVar.u, new OrderDetailsScreenContract$ModalStep.FeeAlert(textClause, b3i.a.a(kVar)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
