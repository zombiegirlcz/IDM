package pjc;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f236728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f236729x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Set set, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f236728w = jVar;
        this.f236729x = set;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f236728w, this.f236729x, continuation, 0);
            default:
                return new i(this.f236728w, this.f236729x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Set set = this.f236729x;
                j jVar = this.f236728w;
                if (i == 0) {
                    o.b(obj2);
                    bgc.d dVar = jVar.o;
                    List listD1 = d0.d1(set);
                    this.v = 1;
                    if (((vgc.e) dVar).c(listD1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                jVar.C2(new e(set.size()));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Set set2 = this.f236729x;
                j jVar2 = this.f236728w;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        i iVar = new i(jVar2, set2, null, 0);
                        this.v = 1;
                        if (u0.b0(jVar2.X(), "UNLINK_BUTTON_LOADING_TAG", iVar, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    break;
                } catch (Exception unused) {
                    jVar2.C2(new f(set2.size()));
                }
                return Unit.f186387a;
        }
    }
}
