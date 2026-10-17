package no8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b f217958w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217958w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f217958w, continuation, 0);
            default:
                return new n(this.f217958w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar = this.f217958w;
                if (i == 0) {
                    o.b(obj2);
                    m mVar = new m(bVar, null, 1);
                    this.v = 1;
                    if (pu7.a.B(bVar.k, "SIGN_OUT_ACTIVE_DEVICES_TASK_ID", mVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar.C2(new j(((f) ((j2) bVar.f77306q.f22677a).getValue()).f217950c));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar2 = this.f217958w;
                if (i2 == 0) {
                    o.b(obj2);
                    m mVar2 = new m(bVar2, null, 3);
                    this.v = 1;
                    if (pu7.a.B(bVar2.k, "SIGN_OUT_ACTIVE_DEVICES_TASK_ID", mVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar2.C2(i.f217953a);
                return Unit.f186387a;
        }
    }
}
