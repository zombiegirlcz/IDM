package bs9;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.chat.a f18085w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18085w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f18085w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f18085w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(this.f18085w, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0(this.f18085w, continuation, 3);
                a0Var4.v = obj2;
                return a0Var4;
            case 4:
                a0 a0Var5 = new a0(this.f18085w, continuation, 4);
                a0Var5.v = obj2;
                return a0Var5;
            case 5:
                a0 a0Var6 = new a0(this.f18085w, continuation, 5);
                a0Var6.v = obj2;
                return a0Var6;
            default:
                a0 a0Var7 = new a0(this.f18085w, continuation, 6);
                a0Var7.v = obj2;
                return a0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((zx0.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a0) create((PaymentGroup) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((es9.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = 10;
        int i2 = 0;
        switch (this.u) {
            case 0:
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar = this.f18085w;
                zx0.j jVar = (zx0.j) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (jVar == zx0.j.HIDDEN && aVar.J2().f18119g == cs9.b.SOFT_KEYBOARD) {
                    aVar.H2(aVar.W, new e(17));
                }
                break;
            case 1:
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar3 = this.f18085w;
                Boolean bool = (Boolean) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (bool.booleanValue()) {
                    zx0.j state = aVar3.C.d.getState();
                    state.getClass();
                    if (state == zx0.j.HIDDEN) {
                        if (aVar3.J2().f18119g == cs9.b.SOFT_KEYBOARD) {
                            aVar3.H2(aVar3.W, new e(18));
                        }
                    }
                }
                break;
            case 2:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                String str = (String) rVar.f314202b;
                st9.a aVar6 = (st9.a) rVar.f314203c;
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar7 = this.f18085w;
                aVar7.H2(aVar7.W, new a09.z(str, zBooleanValue, aVar6, i));
                break;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar9 = this.f18085w;
                aVar9.H2(aVar9.W, new bmj.g(data, 10));
                break;
            case 4:
                PaymentGroup paymentGroup = (PaymentGroup) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar11 = this.f18085w;
                aVar11.H2(aVar11.W, new d0(paymentGroup, i2));
                break;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar13 = this.f18085w;
                aVar13.H2(aVar13.W, new bmj.g(data2, 11));
                if (this.f18085w.R) {
                    this.f18085w.V.onNext(Unit.f186387a);
                    this.f18085w.R = false;
                }
                break;
            default:
                es9.a aVar14 = (es9.a) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar16 = this.f18085w;
                if (!Intrinsics.f(aVar16.M.f79337c, aVar14.f128911a)) {
                    aVar16.C2(new r(aVar14.f128911a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
