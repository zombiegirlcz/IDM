package cn6;

import afa.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e f25361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f25362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f25363y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar, String str, String str2, String str3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25361w = eVar;
        this.f25362x = str;
        this.f25363y = str2;
        this.z = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f25361w, this.f25362x, this.f25363y, this.z, continuation, 0);
            default:
                return new e(this.f25361w, this.f25362x, this.f25363y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    String str = this.z;
                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar = this.f25361w;
                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.b bVar = new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.b(eVar, this.f25362x, this.f25363y, str, null);
                    this.v = 1;
                    if (eVar.p2(this, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar2 = this.f25361w;
                u uVar = new u(eVar2, this.f25363y, this.z, this.f25362x, (Continuation) null, 9);
                this.v = 1;
                Object objP2 = eVar2.p2(this, uVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
