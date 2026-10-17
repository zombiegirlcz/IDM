package mib;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f205641w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205641w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f205641w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f205641w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f205641w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.f205641w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var instanceof l1) {
                    k.J2(kVar);
                }
                break;
            case 1:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var2 instanceof l1) {
                    String str = ((c) ((j2) kVar.f205647s.f22677a).getValue()).f205637b;
                    if (str != null) {
                        kVar.K2(str);
                    } else {
                        k.J2(kVar);
                    }
                }
                break;
            default:
                String str2 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.K2(str2);
                break;
        }
        return Unit.f186387a;
    }
}
