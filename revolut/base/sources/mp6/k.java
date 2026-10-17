package mp6;

import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.TagsFeedback;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mhd.o0;
import mlk.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f207755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f207756x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f207755w = nVar;
        this.f207756x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f207755w, this.f207756x, continuation, 0);
            case 1:
                return new k(this.f207755w, this.f207756x, continuation, 1);
            default:
                return new k(this.f207755w, this.f207756x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                n nVar = this.f207755w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ep6.d dVar = (ep6.d) nVar.u.a();
                    yo6.d dVar2 = dVar.f128085b;
                    String str = dVar.f128084a;
                    int iB = (this.f207756x ? yo6.e.POSITIVE : yo6.e.NEGATIVE).b();
                    this.v = 1;
                    if (nVar.g3(dVar2, str, iB, null, null, null, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nVar.d3(new a0(19));
                nVar.h3();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = this.f207755w;
                    k kVar = new k(nVar2, this.f207756x, null, 0);
                    this.v = 1;
                    if (nVar2.Y2(this, kVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    n nVar3 = this.f207755w;
                    ep6.d dVar3 = (ep6.d) nVar3.u.a();
                    Continuation continuation = null;
                    if (this.f207756x) {
                        o0 o0Var = new o0(nVar3, dVar3, continuation, 8);
                        this.v = 1;
                        if (nVar3.Y2(this, o0Var) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        j60.a aVar4 = nVar3.f207759m;
                        ep6.b bVar = nVar3.o;
                        Data data2 = (Data) nVar3.f207766w.a();
                        try {
                            Object content = data2.getContent();
                            data = new Data(content != null ? ((TagsFeedback) content).f73137c : null, data2.getError(), data2.getLoading());
                        } catch (Throwable th10) {
                            data = new Data(null, th10, data2.getLoading());
                        }
                        aVar4.x(((a) bVar).e(data, (Set) nVar3.f207767x.a(), (CharSequence) nVar3.f207768y.a(), nVar3.f207762q));
                        nVar3.f3(false);
                    }
                    break;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
