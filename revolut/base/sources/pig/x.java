package pig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import om4.t3;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f236504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.transfer.a f236505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f236506y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236505x = aVar;
        this.f236506y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f236505x, this.f236506y, continuation, 0);
            default:
                return new x(this.f236505x, this.f236506y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        switch (this.u) {
            case 0:
                com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar = this.f236505x;
                cli.y yVar = aVar.z;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.f236504w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    String str3 = ((j) ((j2) yVar.f22677a).getValue()).i;
                    aVar.H2(yVar, new t3(this.f236506y, 28));
                    this.v = str3;
                    this.f236504w = 1;
                    if (do3.q.J(this) == aVar2) {
                        return aVar2;
                    }
                    str = str3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = this.v;
                    yhm.o.b(obj2);
                }
                aVar.H2(yVar, new t3(str, 29));
                return Unit.f186387a;
            default:
                com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar3 = this.f236505x;
                cli.y yVar2 = aVar3.z;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f236504w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    String str4 = ((j) ((j2) yVar2.f22677a).getValue()).f236484g;
                    aVar3.H2(yVar2, new y(this.f236506y, 0));
                    this.v = str4;
                    this.f236504w = 1;
                    if (do3.q.J(this) == aVar4) {
                        return aVar4;
                    }
                    str2 = str4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = this.v;
                    yhm.o.b(obj2);
                }
                aVar3.H2(yVar2, new y(str2, 1));
                return Unit.f186387a;
        }
    }
}
