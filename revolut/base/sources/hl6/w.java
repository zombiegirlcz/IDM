package hl6;

import com.revolut.data.network.models.security.SecuritySettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b f153009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f153010x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b bVar, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f153009w = bVar;
        this.f153010x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f153009w, this.f153010x, continuation, 0);
            default:
                return new w(this.f153009w, this.f153010x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    y21.c cVar = this.f153009w.f72765r;
                    cVar.getClass();
                    pfm.t tVarC = cVar.c(SecuritySettings.JOINT_OBA_DATA_SHARING_NOTIFICATIONS, this.f153010x);
                    this.v = 1;
                    if (nim.a.a(tVarC, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b bVar = this.f153009w;
                    w wVar = new w(bVar, this.f153010x, null, 0);
                    this.v = 1;
                    if (bVar.p2(this, wVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
