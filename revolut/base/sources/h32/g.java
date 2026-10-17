package h32;

import ack.n;
import blj.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import do3.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import nii.z;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f149009w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f149009w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f149009w, continuation, 0);
            case 1:
                return new g(this.f149009w, continuation, 1);
            case 2:
                return new g(this.f149009w, continuation, 2);
            case 3:
                return new g(this.f149009w, continuation, 3);
            default:
                return new g(this.f149009w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        k kVar;
        Object objQ;
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        k kVar2 = this.f149009w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    oz1.c cVar = kVar2.f149013p;
                    String str = kVar2.o.f62313a;
                    this.v = 1;
                    if (cVar.a(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    g gVar = new g(kVar2, continuation, i2);
                    this.v = 1;
                    if (q.t(kVar2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                oz1.c cVar2 = kVar2.f149013p;
                String str2 = kVar2.o.f62313a;
                this.v = 1;
                iz1.b bVar = cVar2.f231102a;
                bVar.getClass();
                iz1.a aVar4 = new iz1.a(bVar, str2, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, aVar4, this);
                return objJ == aVar3 ? aVar3 : objJ;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    oz1.c cVar3 = kVar2.f149013p;
                    String str3 = kVar2.o.f62313a;
                    this.v = 1;
                    if (cVar3.c(str3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                k kVar3 = this.f149009w;
                if (i22 == 0) {
                    o.b(obj2);
                    n nVar = new n(19);
                    g gVar2 = new g(kVar3, continuation, 3);
                    this.v = 1;
                    kVar = kVar3;
                    objQ = n14.k.Q(kVar, null, null, nVar, gVar2, this, 2);
                    if (objQ == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    kVar = kVar3;
                    objQ = obj2;
                }
                nii.e eVar = (nii.e) objQ;
                if (!(eVar instanceof nii.c)) {
                    if (!(eVar instanceof nii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Flow flowX1 = kVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.apm_payment_confirmation_status_title_rejected, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                    t tVar = new t(kVar, 6);
                    this.v = 2;
                    if (((rv6.e) flowX1).collect(tVar, this) == aVar6) {
                        return aVar6;
                    }
                }
                return Unit.f186387a;
        }
    }
}
