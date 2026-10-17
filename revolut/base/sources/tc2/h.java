package tc2;

import android.content.Intent;
import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends i implements Function2 {
    public final /* synthetic */ com.revolut.feature.apm.qvik.impl.ui.pay.a u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.apm.qvik.impl.ui.pay.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        try {
            com.revolut.feature.apm.qvik.impl.ui.pay.a aVar2 = this.u;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.v));
            intent.addFlags(268435456);
            return aVar2.C1(new ExternalDestination.ByIntent(intent, null));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return Unit.f186387a;
        }
    }
}
