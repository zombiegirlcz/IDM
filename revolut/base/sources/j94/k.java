package j94;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$InputData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a f172286w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f172286w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f172286w, continuation, 0);
            default:
                return new k(this.f172286w, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        Object objJ2;
        Object objP2;
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar = this.f172286w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 == 1) {
                        o.b(obj2);
                        objJ2 = obj2;
                        return (my3.f) objJ2;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objJ = obj2;
                    return (my3.f) objJ;
                }
                o.b(obj2);
                y yVar = aVar.f67509t;
                yw3.a aVar3 = aVar.f67506q;
                DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData = aVar.o;
                String str = debtDetailsControllerContract$InputData.f67502b;
                if (str != null) {
                    String str2 = debtDetailsControllerContract$InputData.f67501a;
                    ArrayList arrayList = ((f) ((j2) yVar.f22677a).getValue()).f172280a;
                    this.v = 2;
                    e34.c cVar = aVar3.f317314a;
                    cVar.getClass();
                    e34.a aVar4 = new e34.a(arrayList, cVar, str2, str, (Continuation) null);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, aVar4, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                    return (my3.f) objJ;
                }
                String str3 = debtDetailsControllerContract$InputData.f67501a;
                String str4 = debtDetailsControllerContract$InputData.f67503c.f210338a;
                ArrayList arrayList2 = ((f) ((j2) yVar.f22677a).getValue()).f172280a;
                this.v = 1;
                e34.c cVar2 = aVar3.f317314a;
                cVar2.getClass();
                e34.a aVar5 = new e34.a(str4, arrayList2, cVar2, str3, (Continuation) null);
                p0 p0Var2 = p0.f264001a;
                objJ2 = e0.J(elm.f.f127540b, aVar5, this);
                if (objJ2 == aVar2) {
                    return aVar2;
                }
                return (my3.f) objJ2;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    k kVar = new k(aVar, null, 0);
                    this.v = 1;
                    objP2 = aVar.p2(this, kVar);
                    if (objP2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objP2 = obj2;
                }
                aVar.C2(new h((my3.f) objP2));
                return Unit.f186387a;
        }
    }
}
