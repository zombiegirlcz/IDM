package unc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f281413w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(b0 b0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f281413w = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f281413w, continuation, 0);
            case 1:
                return new w(this.f281413w, continuation, 1);
            case 2:
                return new w(this.f281413w, continuation, 2);
            case 3:
                return new w(this.f281413w, continuation, 3);
            case 4:
                return new w(this.f281413w, continuation, 4);
            default:
                return new w(this.f281413w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b0 b0Var = this.f281413w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Integer num = ((PortfolioSpareChangeScreenContract$DomainState) ((j2) b0Var.v.f22677a).getValue()).f85204b;
                    if (num == null) {
                        return Unit.f186387a;
                    }
                    int iIntValue = num.intValue();
                    xvh.c cVar = b0Var.f281393t;
                    String str = b0Var.o.f85206a;
                    this.v = 1;
                    if (((b6d.r) cVar).d(str, iIntValue, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                b0.I2(b0Var, new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_success_update_toast_title, null, null, 14));
                b0Var.K2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    vnc.b bVar = vnc.b.CREATE;
                    b0 b0Var2 = this.f281413w;
                    w wVar = new w(b0Var2, null, 0);
                    this.v = 1;
                    if (b0.J2(b0Var2, bVar, wVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                b0 b0Var3 = this.f281413w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    xvh.c cVar2 = b0Var3.f281393t;
                    String str2 = b0Var3.o.f85206a;
                    this.v = 1;
                    if (((b6d.r) cVar2).e(str2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                b0.I2(b0Var3, new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_success_remove_toast_title, null, null, 14));
                b0Var3.K2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    vnc.b bVar2 = vnc.b.REMOVE;
                    b0 b0Var4 = this.f281413w;
                    w wVar2 = new w(b0Var4, null, 2);
                    this.v = 1;
                    if (b0.J2(b0Var4, bVar2, wVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                b0 b0Var5 = this.f281413w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    Integer num2 = ((PortfolioSpareChangeScreenContract$DomainState) ((j2) b0Var5.v.f22677a).getValue()).f85204b;
                    if (num2 == null) {
                        return Unit.f186387a;
                    }
                    int iIntValue2 = num2.intValue();
                    xvh.c cVar3 = b0Var5.f281393t;
                    String str3 = b0Var5.o.f85206a;
                    this.v = 1;
                    if (((b6d.r) cVar3).n(str3, iIntValue2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                b0.I2(b0Var5, new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_success_update_toast_title, null, null, 14));
                b0Var5.K2();
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    vnc.b bVar3 = vnc.b.UPDATE;
                    b0 b0Var6 = this.f281413w;
                    w wVar3 = new w(b0Var6, null, 4);
                    this.v = 1;
                    if (b0.J2(b0Var6, bVar3, wVar3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
