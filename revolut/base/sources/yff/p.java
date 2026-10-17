package yff;

import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import uv1.c0;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f313353w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313353w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f313353w, continuation, 0);
            case 1:
                return new p(this.f313353w, continuation, 1);
            case 2:
                return new p(this.f313353w, continuation, 2);
            case 3:
                return new p(this.f313353w, continuation, 3);
            default:
                return new p(this.f313353w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar = this.f313353w;
                o oVar = new o(uVar, null, 0);
                this.v = 1;
                Object objY2 = u.y2(uVar, oVar, this);
                return objY2 == aVar ? aVar : objY2;
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
                u uVar2 = this.f313353w;
                o oVar2 = new o(uVar2, null, 1);
                this.v = 1;
                Object objY22 = u.y2(uVar2, oVar2, this);
                return objY22 == aVar2 ? aVar2 : objY22;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    u uVar3 = this.f313353w;
                    if (pu7.a.B(uVar3.k, "DIALOG_ID_ISSUE_ABOUT_THIS_TRANSACTION", new r(uVar3, null), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar4 = this.f313353w;
                TroubleshooterListScreenContract$InputData troubleshooterListScreenContract$InputData = uVar4.f313358p;
                c0 c0Var = new c0(uVar4, troubleshooterListScreenContract$InputData.f91892a, troubleshooterListScreenContract$InputData.f91894c, (Continuation) null, 19);
                this.v = 1;
                Object objP2 = uVar4.p2(this, c0Var);
                return objP2 == aVar4 ? aVar4 : objP2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (u.z2(this.f313353w, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
