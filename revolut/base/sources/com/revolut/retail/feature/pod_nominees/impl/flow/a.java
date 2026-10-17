package com.revolut.retail.feature.pod_nominees.impl.flow;

import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlowContract$Step;
import com.revolut.sso.api.exceptions.UserCancelledSSOExceptionLegacy;
import com.revolut.sso.api.exceptions.UserCancelledSsoException;
import com.revolut.sso.api.exceptions.UserFailedSsoException;
import do3.q;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import pe2.l;
import pek.c;
import rd0.d;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f102613w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f102613w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f102613w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.f102613w;
        Continuation continuation = null;
        int i2 = 1;
        try {
            if (i == 0) {
                o.b(obj2);
                m.Companion companion = m.INSTANCE;
                c cVar = new c(bVar, continuation, i2);
                this.v = null;
                this.u = 1;
                if (q.t(bVar, cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = Unit.f186387a;
            m.Companion companion2 = m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (!(objA instanceof n)) {
            h.t2(bVar, bVar.f102616r, new PodNomineesFlowContract$Step.PodNomineesList(true), false, null, false, 12);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, thA, h0Var);
            if ((thA instanceof UserCancelledSSOExceptionLegacy) || (thA instanceof UserCancelledSsoException) || (thA instanceof UserFailedSsoException)) {
                h.D2(bVar.f102616r);
            } else {
                bVar.l2(new l(bVar, continuation, i2), new yi5.b(26));
            }
        }
        return new m(objA);
    }
}
