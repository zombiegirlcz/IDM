package w8l;

import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ j u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, String str, Continuation continuation) {
        super(1, continuation);
        this.u = jVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return this.u.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse(this.v), 0, null, 494));
    }
}
