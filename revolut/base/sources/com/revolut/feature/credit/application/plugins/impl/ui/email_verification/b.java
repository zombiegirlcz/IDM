package com.revolut.feature.credit.application.plugins.impl.ui.email_verification;

import com.revolut.feature.credit.application.models.plugins.EntryPointParams;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step;
import ft3.j1;
import gim.i;
import gt3.f;
import it3.d;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oma.r;
import pfm.h;
import xq3.k;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f67629w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f67629w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f67629w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f67629w;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            pfm.a aVarE = cVar.f67632r.l(str).e(new h(new r(cVar, 4), 2));
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            this.u = 1;
            if (nim.a.a(aVarE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = cVar.f67630p.f67623b;
        Intrinsics.checkNotNullParameter(creditApplicationPluginFlowContract$Configuration, "<this>");
        String str2 = creditApplicationPluginFlowContract$Configuration.f66892b;
        j1 j1Var = creditApplicationPluginFlowContract$Configuration.d;
        f fVar = creditApplicationPluginFlowContract$Configuration.e;
        boolean z = creditApplicationPluginFlowContract$Configuration.i;
        ks3.b bVar = creditApplicationPluginFlowContract$Configuration.f66894g;
        ks3.c cVar2 = creditApplicationPluginFlowContract$Configuration.f66895h;
        Integer num = creditApplicationPluginFlowContract$Configuration.f66900p;
        ss3.b state = new ss3.b(new PluginPayload(new d(str2, true, bVar, cVar2, null, null, true, z, it3.f.UNKNOWN, j1Var, fVar, num != null ? num.intValue() : 0, null, null, false, null, creditApplicationPluginFlowContract$Configuration.f66897l, creditApplicationPluginFlowContract$Configuration.f66898m), creditApplicationPluginFlowContract$Configuration.f, new EntryPointParams(creditApplicationPluginFlowContract$Configuration.f66899n, creditApplicationPluginFlowContract$Configuration.f66893c), creditApplicationPluginFlowContract$Configuration.f66896j, null), null);
        k kVar = cVar.f67634t;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        ReentrantLock reentrantLock = kVar.f308081b;
        reentrantLock.lock();
        try {
            kVar.f308080a = state;
            Unit unit = Unit.f186387a;
            reentrantLock.unlock();
            oki.h.t2(cVar, cVar.A, new EmailVerificationFlowContract$Step.CheckEmailInbox(str), true, null, false, 12);
            return Unit.f186387a;
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }
}
