package pqg;

import android.view.View;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ View v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddMoneyScreen f238739w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(View view, AddMoneyScreen addMoneyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = view;
        this.f238739w = addMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, this.f238739w, continuation, 0);
            default:
                return new f(this.v, this.f238739w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddMoneyScreen addMoneyScreen = this.f238739w;
        View view = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0m.e.a(view);
                addMoneyScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0m.e.a(view);
                i0 i0Var = (i0) addMoneyScreen.T2();
                i0Var.getClass();
                i0Var.l2(new z(i0Var, null, 2), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
