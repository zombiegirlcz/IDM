package com.revolut.analytics.tracking.v3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        try {
            f.g(fVar, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new nmm.h(fVar.o.b(), 6), 14);
            return Unit.f186387a;
        } catch (Exception e) {
            Set setW = m72.b.w("service_code_name", gh0.d.GOOGLE.a());
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DiagnosticTracker", "Unable to get mobile service status", e, setW);
            return Unit.f186387a;
        }
    }
}
