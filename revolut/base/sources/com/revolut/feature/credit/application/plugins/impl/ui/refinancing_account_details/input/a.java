package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input;

import a31.w;
import ai4.g;
import ai4.h;
import aii.q;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$Step;
import dx4.n4;
import elm.f;
import ft3.h1;
import gim.i;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import qki.d;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f68272w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f68273x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, h hVar, int i, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f68272w = hVar;
        this.f68273x = i;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f68272w, this.f68273x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        b bVar = this.v;
        d dVar = bVar.f68277s;
        RefinancingAccountDetailsInputFlowContract$InputData refinancingAccountDetailsInputFlowContract$InputData = bVar.f68274p;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            ay3.a aVar2 = bVar.f68276r;
            h1 h1VarF = w0.F(refinancingAccountDetailsInputFlowContract$InputData.f68262c);
            String str = refinancingAccountDetailsInputFlowContract$InputData.f68260a;
            String str2 = ((g) this.f68272w).f5186a.f68377a;
            this.u = 1;
            e44.b bVar2 = aVar2.f11057a;
            bVar2.getClass();
            w wVar = new w(str, str2, bVar2, h1VarF, (Continuation) null);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, wVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        for (n4 n4Var : ((lv3.a) obj2).e) {
            if (Intrinsics.f(n4Var.f120689a, refinancingAccountDetailsInputFlowContract$InputData.f68260a)) {
                bVar.H2(dVar, new do2.o(n4Var.f120690b, 24));
                int i2 = this.f68273x + 1;
                if (((RefinancingAccountDetailsInputFlowContract$State) ((j2) dVar.f22677a).getValue()).f68263a.size() > i2) {
                    oki.h.t2(bVar, bVar.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(i2), true, null, false, 12);
                } else {
                    bVar.C2(q.f5292a);
                }
                return Unit.f186387a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
