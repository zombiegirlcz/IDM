package ql6;

import com.revolut.domain.models.openbanking.OpenBankingConsentsFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a f247217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f247217w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f247217w, continuation, 0);
            default:
                return new r(this.f247217w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a aVar2 = this.f247217w;
                    Object objCollect = ((mg6.c) aVar2.o).b(((m) ((j2) aVar2.f72788p.f22677a).getValue()).f247211a.getF60398a(), OpenBankingConsentsFilter.ACTIVE).collect(new p(aVar2), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a aVar4 = this.f247217w;
                    Object objCollect2 = ((mg6.c) aVar4.o).b(((m) ((j2) aVar4.f72788p.f22677a).getValue()).f247211a.getF60398a(), OpenBankingConsentsFilter.INACTIVE).collect(new q(aVar4), this);
                    if (objCollect2 != aVar3) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar3) {
                        return aVar3;
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
