package zs9;

import aw0.n6;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreen;
import ip0.u00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GroupCustomizationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(GroupCustomizationScreen groupCustomizationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = groupCustomizationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            default:
                return new i(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GroupCustomizationScreen groupCustomizationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                groupCustomizationScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e60.a aVar3 = ((z) groupCustomizationScreen.T2()).u;
                e60.s sVar = (e60.s) aVar3;
                sVar.T(new e60.i(null, null, null, false, 0, 0, zhm.v.k(t80.f.JPEG, t80.f.PNG), null, false, u00.BACK, null, 15807));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) groupCustomizationScreen.T2();
                zVar.getClass();
                zVar.l2(new x(zVar, null, 0), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
