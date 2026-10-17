package hu1;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.models.blik.BlikCode;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes20.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f155543w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155543w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f155543w, continuation, 0);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(this.f155543w, continuation, 1);
                xVar2.v = obj2;
                return xVar2;
            case 2:
                x xVar3 = new x(this.f155543w, continuation, 2);
                xVar3.v = obj2;
                return xVar3;
            default:
                x xVar4 = new x(this.f155543w, continuation, 3);
                xVar4.v = obj2;
                return xVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((x) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e0 e0Var = this.f155543w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data);
                e0Var.x2(new hm3.b(data, e0Var, 27));
                BlikCode blikCode = (BlikCode) data.getContent();
                if (blikCode != null) {
                    e0Var.D2(blikCode.d);
                }
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new hea.e0(data2, 24));
                break;
            case 2:
                n1 n1Var = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    e0Var.C1(new ApmAliasClaimNavigation$Destination(new ApmAliasClaimNavigation$InputData(ApmBlik.f61809c, c12.a.LINK)));
                }
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new hea.e0(data3, 25));
                break;
        }
        return Unit.f186387a;
    }
}
