package j3b;

import com.revolut.data.model.Data;
import i2l.e0;
import iuj.z;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f171008w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171008w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f171008w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f171008w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j jVar = this.f171008w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jVar.H2(jVar.f171010q, new e0(list, 13));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jVar.H2(jVar.f171010q, new z(data, 29));
                break;
        }
        return Unit.f186387a;
    }
}
