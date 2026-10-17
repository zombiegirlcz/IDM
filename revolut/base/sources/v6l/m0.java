package v6l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b1 f286466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f286467x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b93.d f286468y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(b1 b1Var, String str, b93.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f286466w = b1Var;
        this.f286467x = str;
        this.f286468y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f286466w, this.f286467x, this.f286468y, continuation, 0);
            default:
                return new m0(this.f286466w, this.f286467x, this.f286468y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b93.d dVar = this.f286468y;
        int i2 = 23;
        String str = this.f286467x;
        b1 b1Var = this.f286466w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                f0 f0Var = b1.Companion;
                List listJ = nkm.y.J(nkm.y.x(nkm.y.n(zhm.d0.Q(b1Var.g()), new uo7.k(str, 26)), new v6e.d(i2)));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listJ) {
                    h93.f0 f0Var2 = (h93.f0) obj3;
                    if (!f0Var2.f150112c && f0Var2.f == h93.r.ACTIVE) {
                        arrayList.add(obj3);
                    }
                }
                this.v = 1;
                Object objA = b1.a(b1Var, arrayList, dVar, this);
                return objA == aVar ? aVar : objA;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    f0 f0Var3 = b1.Companion;
                    List listJ2 = nkm.y.J(nkm.y.x(nkm.y.n(zhm.d0.Q(b1Var.g()), new uo7.k(str, 26)), new v6e.d(i2)));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : listJ2) {
                        h93.f0 f0Var4 = (h93.f0) obj4;
                        if (!f0Var4.f150112c && b1Var.f286431m.contains(f0Var4.f)) {
                            arrayList2.add(obj4);
                        }
                    }
                    this.v = 1;
                    obj2 = b1.a(b1Var, arrayList2, dVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return new Integer(((List) obj2).size());
        }
    }
}
