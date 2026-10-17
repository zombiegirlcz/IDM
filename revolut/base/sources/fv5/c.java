package fv5;

import android.content.Intent;
import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pu5.f;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f138348w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f138348w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f138348w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = dVar.o;
            this.u = 1;
            fVar.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("revolut-revolutx://app/orders-history/" + this.f138348w));
            intent.addFlags(268435456);
            lt5.b bVar = new lt5.b(new ExternalDestination.ByIntent(intent, null));
            if (bVar == aVar) {
                return aVar;
            }
            obj2 = bVar;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        lt5.b bVar2 = (lt5.b) obj2;
        if (!(bVar2 instanceof lt5.b)) {
            throw new NoWhenBranchMatchedException();
        }
        dVar.A2(bVar2.f199797a);
        return Unit.f186387a;
    }
}
