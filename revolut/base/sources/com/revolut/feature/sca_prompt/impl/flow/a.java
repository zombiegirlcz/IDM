package com.revolut.feature.sca_prompt.impl.flow;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.sca_prompt.impl.flow.ScaPromptFlowContract$Step;
import efm.d0;
import gim.i;
import isc.j;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l71.d;
import vrc.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ScaPromptFlowContract$Step.ScaPrompt scaPrompt;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            bVar.f85346r.getClass();
            int i2 = j.f168182a[h.HIDDEN.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scaPrompt = new ScaPromptFlowContract$Step.ScaPrompt(null);
                oki.h.u2(bVar, bVar.f85348t, scaPrompt, null, 6);
                return Unit.f186387a;
            }
            d0 d0VarA = ((ang.b) bVar.f85347s).a();
            this.u = 1;
            obj2 = nim.a.b(d0VarA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        scaPrompt = new ScaPromptFlowContract$Step.ScaPrompt(new TextClause(((d) obj2).f192498a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        oki.h.u2(bVar, bVar.f85348t, scaPrompt, null, 6);
        return Unit.f186387a;
    }
}
