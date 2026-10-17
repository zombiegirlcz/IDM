package eaf;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f124241w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f124241w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f124241w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            default:
                m mVar2 = new m(this.f124241w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.f124241w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f124246s, new e50.t(data, 24));
                break;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = qVar.f124246s;
                if (!Intrinsics.f(str, ((f) ((j2) yVar.f22677a).getValue()).f124230a)) {
                    qVar.H2(yVar, new e2j.i(str, 4));
                }
                break;
        }
        return Unit.f186387a;
    }
}
