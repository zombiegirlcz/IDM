package ttl;

import com.revolut.trading.orders.ui.invest.placement.expiry.ExpiryDateSelectorScreen;
import ip0.vd;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExpiryDateSelectorScreen f274444w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ExpiryDateSelectorScreen expiryDateSelectorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274444w = expiryDateSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f274444w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f274444w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((nvl.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ExpiryDateSelectorScreen expiryDateSelectorScreen = this.f274444w;
        switch (i) {
            case 0:
                nvl.f fVar = (nvl.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (fVar instanceof nvl.d) {
                    x xVarE3 = expiryDateSelectorScreen.e3();
                    k4l.k type = ((nvl.d) fVar).f219746a;
                    xVarE3.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    xVarE3.H2(xVarE3.getState(), new tpl.o(type, 13));
                } else if (fVar instanceof nvl.e) {
                    x xVarE32 = expiryDateSelectorScreen.e3();
                    LocalDate date = ((nvl.e) fVar).f219747a;
                    xVarE32.getClass();
                    Intrinsics.checkNotNullParameter(date, "date");
                    j60.a.v(xVarE32.f274478q, false, null, 3);
                    xVarE32.H2(xVarE32.getState(), new t5g.h(2, date));
                } else {
                    if (!(fVar instanceof nvl.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x xVarE33 = expiryDateSelectorScreen.e3();
                    LocalDate date2 = ((nvl.c) fVar).f219745a;
                    xVarE33.getClass();
                    Intrinsics.checkNotNullParameter(date2, "date");
                    xVarE33.n2(new w(xVarE33, date2, null, 1), new whi.b(6));
                }
                return Unit.f186387a;
            default:
                vd vdVar = (vd) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE34 = expiryDateSelectorScreen.e3();
                LocalDate date3 = vdVar.f166807b;
                xVarE34.getClass();
                Intrinsics.checkNotNullParameter(date3, "date");
                xVarE34.n2(new w(xVarE34, date3, null, 0), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
