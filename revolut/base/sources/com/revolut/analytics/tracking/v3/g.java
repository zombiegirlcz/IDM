package com.revolut.analytics.tracking.v3;

import android.content.Intent;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.IntentContext;
import grl.m5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import no.m1;
import yhm.o;

/* JADX INFO: loaded from: classes.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ m5 u;
    public final /* synthetic */ Intent v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m1 f50326w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Intent intent, m5 m5Var, Continuation continuation, m1 m1Var) {
        super(2, continuation);
        this.u = m5Var;
        this.v = intent;
        this.f50326w = m1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.u, continuation, this.f50326w);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m5 m5Var = m5.incoming;
        Intent intent = this.v;
        m5 m5Var2 = this.u;
        if (m5Var2 == m5Var) {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            if (a0.H(action, "android.intent.action.", false)) {
                return null;
            }
        }
        m1 m1Var = this.f50326w;
        Object objC = m1Var.f217817a.c();
        String strB = objC != null ? m1Var.d.e(objC).b() : null;
        AnalyticsProduct analyticsProductE = ((uo.o) m1Var.f217819c).e(objC, AnalyticsProduct.Shared.Environment.f);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IntentContext.a aVarNewBuilder = IntentContext.newBuilder();
        String action2 = intent.getAction();
        if (action2 != null) {
            aVarNewBuilder.h(action2);
        }
        aVarNewBuilder.i(m5Var2);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new ho.e(strB, analyticsProductE, AnalyticsContext.Companion.a(w0VarA));
    }
}
