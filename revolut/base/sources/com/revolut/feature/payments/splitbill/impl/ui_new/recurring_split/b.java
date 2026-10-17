package com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split;

import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$Step;
import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f79907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RecurringSplitFlowContract$LaunchMode f79908x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ArrayList arrayList, RecurringSplitFlowContract$LaunchMode recurringSplitFlowContract$LaunchMode, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f79907w = arrayList;
        this.f79908x = recurringSplitFlowContract$LaunchMode;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f79907w, this.f79908x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        RecurringSplitFlowContract$LaunchMode recurringSplitFlowContract$LaunchMode = this.f79908x;
        if (i == 0) {
            o.b(obj2);
            e eVar = dVar.f79911r;
            this.u = 1;
            obj2 = eVar.a(this.f79907w, recurringSplitFlowContract$LaunchMode, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(dVar, dVar.f79912s, new RecurringSplitFlowContract$Step.SplitSummary((SplitMembersType) obj2, recurringSplitFlowContract$LaunchMode), true, null, false, 12);
        return Unit.f186387a;
    }
}
