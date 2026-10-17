package com.revolut.feature.shared_separate_favourites.converter.ui.flow;

import com.revolut.feature.shared_separate_favourites.converter.ui.flow.SharedConverterFlowContract$Step;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
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
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            Flow flowA = bVar.v.a(bVar.f86848t.f86792a.f86788a);
            this.u = 1;
            obj2 = q.x(flowA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Set availableAssetTypeKeys = (Set) obj2;
        ((SharedConverterFlowContract$State) bVar.A2().f98429a).getClass();
        Intrinsics.checkNotNullParameter(availableAssetTypeKeys, "availableAssetTypeKeys");
        bVar.L2(new SharedConverterFlowContract$State(availableAssetTypeKeys));
        bVar.E2(SharedConverterFlowContract$Step.Converter.f86844a, false, null, false);
        return Unit.f186387a;
    }
}
