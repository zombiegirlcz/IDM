package xdi;

import cli.y;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f304469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Continuation continuation, u uVar) {
        super(2, continuation);
        this.u = i;
        this.f304469w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(0, continuation, this.f304469w);
            case 1:
                return new s(1, continuation, this.f304469w);
            case 2:
                return new s(2, continuation, this.f304469w);
            default:
                return new s(3, continuation, this.f304469w);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                u uVar = this.f304469w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = pu7.a.B(uVar.k, "CREATE_REV_POINTS_POCKET_TASK_ID", new p(1, null, uVar), this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                RevPointsPocketInfo revPointsPocketInfo = (RevPointsPocketInfo) obj2;
                if (revPointsPocketInfo != null) {
                    uVar.C2(new j(revPointsPocketInfo));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar2 = this.f304469w;
                p pVar = new p(3, null, uVar2);
                this.v = 1;
                Object objB = pu7.a.B(uVar2.k, "PLAN_TERMS_LOADING_TASK_ID", pVar, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar3 = this.f304469w;
                p pVar2 = new p(4, null, uVar3);
                this.v = 1;
                Object objB2 = pu7.a.B(uVar3.k, "TERMS_LOADING_TASK_ID", pVar2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            default:
                u uVar4 = this.f304469w;
                y yVar = uVar4.f304477y;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = pu7.a.B(uVar4.k, "CREATE_REV_POINTS_POCKET_TASK_ID", new p(1, null, uVar4), this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                RevPointsPocketInfo revPointsPocketInfo2 = (RevPointsPocketInfo) obj2;
                if (revPointsPocketInfo2 != null) {
                    uVar4.C2(new k((RevPointsPocketBenefit) ((List) zi0.c.I(((g) ((j2) yVar.f22677a).getValue()).f304451a)).get(((g) ((j2) yVar.f22677a).getValue()).f304453c), revPointsPocketInfo2));
                }
                return Unit.f186387a;
        }
    }
}
