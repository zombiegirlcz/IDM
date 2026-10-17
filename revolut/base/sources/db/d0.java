package db;

import com.revolut.data.model.Data;
import com.revolut.sso.api.phone.change.RevolutSsoChangePhoneFlowDestination;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes16.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f112604w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(i0 i0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112604w = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f112604w, continuation, 0);
                d0Var.v = obj2;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(this.f112604w, continuation, 1);
                d0Var2.v = obj2;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(this.f112604w, continuation, 2);
                d0Var3.v = obj2;
                return d0Var3;
            case 3:
                d0 d0Var4 = new d0(this.f112604w, continuation, 3);
                d0Var4.v = obj2;
                return d0Var4;
            case 4:
                d0 d0Var5 = new d0(this.f112604w, continuation, 4);
                d0Var5.v = obj2;
                return d0Var5;
            default:
                d0 d0Var6 = new d0(this.f112604w, continuation, 5);
                d0Var6.v = obj2;
                return d0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((d0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 2:
                ((d0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
        }
        return ((d0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objI1;
        int i = this.u;
        i0 i0Var = this.f112604w;
        switch (i) {
            case 0:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.B, new ab4.q(th10, 7));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.B, new czc.b0(data, 23));
                break;
            case 2:
                Throwable th11 = (Throwable) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.B, new ab4.q(th11, 8));
                break;
            case 3:
                cli.y yVar = i0Var.B;
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = !data2.getLoading() ? null : ((l) ((j2) yVar.f22677a).getValue()).e;
                ta.j jVar = (ta.j) data2.getContent();
                if (jVar != null) {
                    ta.d dVar = jVar.f269078g;
                    ArrayList arrayList = dVar != null ? dVar.f269066a : null;
                    Set set = ((l) ((j2) yVar.f22677a).getValue()).f;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : set) {
                        ta.c cVar = (ta.c) obj3;
                        if (arrayList != null && arrayList.contains(cVar)) {
                            arrayList2.add(obj3);
                        }
                    }
                    objI1 = zhm.d0.i1(arrayList2);
                } else {
                    objI1 = zhm.h0.f322473a;
                }
                i0Var.H2(yVar, new d27.g0(data2, 11, str, objI1));
                break;
            case 4:
                n1 n1Var = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    i0Var.C1(tla.d.a(i0Var.u));
                }
                break;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    ((jma.i) i0Var.u).getClass();
                    i0Var.C1(new RevolutSsoChangePhoneFlowDestination(0));
                }
                break;
        }
        return Unit.f186387a;
    }
}
