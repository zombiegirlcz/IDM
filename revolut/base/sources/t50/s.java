package t50;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import t50.i;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z30.e f268027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f268028x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, z30.e eVar, int i, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
        this.f268027w = eVar;
        this.f268028x = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, this.f268027w, this.f268028x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u uVar = this.v;
        h hVar = uVar.o;
        s50.e eVar = uVar.f268030q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        z30.e eVar2 = this.f268027w;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            Object objP2 = uVar.p2(this, new sb4.i(uVar, uVar.J2(eVar2), null, 14));
            if (objP2 != aVar) {
                objP2 = Unit.f186387a;
            }
            if (objP2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        int i2 = r.f268026a[eVar2.b().ordinal()];
        if (i2 != 1) {
            i.a aVar2 = i.a.f268019a;
            int i3 = this.f268028x;
            if (i2 == 2) {
                eVar.a(i3, hVar.f268016a);
                uVar.C2(aVar2);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.b(i3, hVar.f268016a);
                uVar.C2(aVar2);
            }
        } else {
            uVar.H2(uVar.f268032s, new sx8.a(eVar2, 29));
        }
        return Unit.f186387a;
    }
}
