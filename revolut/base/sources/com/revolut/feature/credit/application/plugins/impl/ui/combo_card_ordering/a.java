package com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering;

import c84.j;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import ft3.h1;
import ft3.j1;
import gim.i;
import hs3.q;
import hs3.v;
import hz3.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u64.d;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f67243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f67243w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f67243w, continuation, 0);
            default:
                return new a(this.f67243w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        String str;
        switch (this.u) {
            case 0:
                d dVar = this.f67243w;
                ComboCardOrderingFlowContract$InputData comboCardOrderingFlowContract$InputData = dVar.f277475p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    nw3.d dVar2 = dVar.f277476q;
                    h1 h1VarA9 = comboCardOrderingFlowContract$InputData.a9();
                    this.v = 1;
                    if (dVar2.e(h1VarA9, true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                PluginPayload pluginPayload = comboCardOrderingFlowContract$InputData.f67240b;
                it3.d dVar3 = pluginPayload.f66247a;
                j1 j1Var = dVar3.f168328j;
                v vVar = dVar3.e;
                if (!(vVar instanceof q)) {
                    List list = dVar3.f;
                    obj3 = null;
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                if (next instanceof q) {
                                    obj3 = next;
                                }
                            }
                        }
                        obj3 = (v) obj3;
                    }
                } else {
                    if (vVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
                    }
                    obj3 = (q) vVar;
                }
                q qVar = (q) obj3;
                if ((qVar == null || (str = qVar.e) == null) && (str = pluginPayload.f66247a.f168330m) == null) {
                    throw new IllegalStateException("Facility id can't be null with Combo Card ordering plugin");
                }
                j outputData = new j(j1Var, str);
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (dVar.L2()) {
                    dVar.C2(new j(j1Var, str));
                } else {
                    dVar.C1(new BridgeDestination(((c) dVar.o.e).a(j1Var, str)));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d dVar4 = this.f67243w;
                b bVar = new b(dVar4, null);
                this.v = 1;
                Object objB = pu7.a.B(dVar4.k, "comboCardOrderingJob", bVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
