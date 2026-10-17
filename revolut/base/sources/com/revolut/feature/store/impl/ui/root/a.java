package com.revolut.feature.store.impl.ui.root;

import com.revolut.feature.store.impl.ui.root.StoreFlowContract$Step;
import efm.d0;
import gim.i;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import m1c.r0;
import m1c.x0;
import oki.h;
import p3e.d;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ CoroutineScope v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f88731w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CoroutineScope coroutineScope, b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = coroutineScope;
        this.f88731w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f88731w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.f88731w;
        try {
            if (i == 0) {
                o.b(obj2);
                m.Companion companion = m.INSTANCE;
                d0 d0VarE = ((nyb.o) bVar.f88732p).e(false);
                this.u = 1;
                obj2 = nim.a.b(d0VarE, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = (r0) obj2;
            m.Companion companion2 = m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        r0 r0Var = (r0) objA;
        x0 x0Var = r0Var != null ? r0Var.f201447a : null;
        if ((x0Var == null ? -1 : d.f232746a[x0Var.ordinal()]) == 1) {
            h.t2(bVar, bVar.f88733q, bVar.o.f88722a, false, null, false, 14);
        } else {
            h.t2(bVar, bVar.f88733q, StoreFlowContract$Step.OptIn.f88730a, false, null, false, 14);
        }
        return Unit.f186387a;
    }
}
