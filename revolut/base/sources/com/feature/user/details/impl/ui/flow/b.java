package com.feature.user.details.impl.ui.flow;

import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$Step;
import com.revolut.sso.api.exceptions.UserCancelledSSOExceptionLegacy;
import com.revolut.sso.api.exceptions.UserCancelledSsoException;
import com.revolut.sso.api.exceptions.UserFailedSsoException;
import e94.g;
import fb.f;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import rd0.c;
import rd0.d;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f26234w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f26234w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f26234w, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.f26234w;
        Continuation continuation = null;
        try {
            if (i == 0) {
                o.b(obj2);
                m.Companion companion = m.INSTANCE;
                g gVar = new g(fVar, continuation, 16);
                this.v = null;
                this.u = 1;
                if (fVar.p2(this, gVar) == aVar) {
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
            h.t2(fVar, fVar.u, UserDetailsFlowContract$Step.UserDetailsStep.f26233a, false, null, false, 12);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, thA, h0Var);
            if ((thA instanceof UserCancelledSSOExceptionLegacy) || (thA instanceof UserCancelledSsoException) || (thA instanceof UserFailedSsoException)) {
                h.D2(fVar.u);
            } else {
                fVar.l2(new ewa.d(fVar, continuation, 11), new yi5.b(26));
            }
        }
        return new m(objA);
    }
}
