package o3b;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f221742w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(n0 n0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f221742w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(this.f221742w, continuation, 0);
                l0Var.v = obj2;
                return l0Var;
            default:
                l0 l0Var2 = new l0(this.f221742w, continuation, 1);
                l0Var2.v = obj2;
                return l0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l0) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l0) create((nel.a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        b bVar;
        ej0.b bVar2;
        ej0.b bVar3;
        switch (this.u) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!bool.booleanValue()) {
                    n0 n0Var = this.f221742w;
                    n0Var.H2(n0Var.getState(), new nya.b0(n0Var, 29));
                }
                return Unit.f186387a;
            default:
                nel.a0 a0Var = (nel.a0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final n0 n0Var2 = this.f221742w;
                y yVar = n0Var2.v;
                InstrumentTicker instrumentTicker = a0Var.f214561b;
                if (instrumentTicker == null || (bVar3 = instrumentTicker.u) == null || (bigDecimal = bVar3.f126703a) == null) {
                    bigDecimal = yVar.f221780c;
                }
                BigDecimal bigDecimal5 = bigDecimal;
                if (instrumentTicker == null || (bVar2 = instrumentTicker.f105124t) == null || (bigDecimal2 = bVar2.f126703a) == null) {
                    bigDecimal2 = yVar.f221780c;
                }
                BigDecimal bigDecimal6 = bigDecimal2;
                int i = j0.f221739b[yVar.e.ordinal()];
                final int i2 = 1;
                if (i == 1) {
                    bigDecimal3 = bigDecimal5;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimal3 = bigDecimal6;
                }
                r2b.c cVar = yVar.f;
                if (cVar instanceof r2b.a) {
                    bigDecimal4 = yVar.d;
                } else {
                    if (!Intrinsics.f(cVar, r2b.b.f251091a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimal4 = bigDecimal3;
                }
                n0Var2.H2(n0Var2.getState(), new n68.w(bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, 15));
                b bVar4 = n0Var2.f221747q;
                s sVar = ((t) ((j2) n0Var2.getState().f22677a).getValue()).i;
                if (sVar == null || !sVar.d) {
                    bVar = bVar4;
                } else {
                    bVar = bVar4;
                    n0.N2(n0Var2, k4l.n0.TAKE_PROFIT, bVar4.d(yVar.e, ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221765b, ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221766c, yVar.f221779b.i, ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221767g), null, Boolean.TRUE, null, null, 52);
                }
                s sVar2 = ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221769j;
                if (sVar2 != null && sVar2.d) {
                    n0.N2(n0Var2, k4l.n0.STOP_LOSS, bVar.c(yVar.e, ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221765b, ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221766c, yVar.f221779b.i, ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221767g), null, Boolean.TRUE, null, null, 52);
                }
                final s sVar3 = ((t) ((j2) n0Var2.getState().f22677a).getValue()).i;
                if (sVar3 != null) {
                    final int i3 = 0;
                    n0Var2.H2(n0Var2.getState(), new Function1() { // from class: o3b.i0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i3) {
                                case 0:
                                    t update = (t) obj3;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    k4l.n0 n0Var3 = k4l.n0.TAKE_PROFIT;
                                    s sVar4 = sVar3;
                                    return t.a(update, null, null, null, null, s.b(sVar4, n0.P2(n0Var2, n0Var3, sVar4.f221762b, sVar4.e, update.d, update.e, 72), 59), null, 7935);
                                default:
                                    t update2 = (t) obj3;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    k4l.n0 n0Var4 = k4l.n0.STOP_LOSS;
                                    s sVar5 = sVar3;
                                    return t.a(update2, null, null, null, null, null, s.b(sVar5, n0.P2(n0Var2, n0Var4, sVar5.f221762b, sVar5.e, update2.d, update2.e, 72), 59), 7679);
                            }
                        }
                    });
                }
                final s sVar4 = ((t) ((j2) n0Var2.getState().f22677a).getValue()).f221769j;
                if (sVar4 != null) {
                    n0Var2.H2(n0Var2.getState(), new Function1() { // from class: o3b.i0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i2) {
                                case 0:
                                    t update = (t) obj3;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    k4l.n0 n0Var3 = k4l.n0.TAKE_PROFIT;
                                    s sVar42 = sVar4;
                                    return t.a(update, null, null, null, null, s.b(sVar42, n0.P2(n0Var2, n0Var3, sVar42.f221762b, sVar42.e, update.d, update.e, 72), 59), null, 7935);
                                default:
                                    t update2 = (t) obj3;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    k4l.n0 n0Var4 = k4l.n0.STOP_LOSS;
                                    s sVar5 = sVar4;
                                    return t.a(update2, null, null, null, null, null, s.b(sVar5, n0.P2(n0Var2, n0Var4, sVar5.f221762b, sVar5.e, update2.d, update2.e, 72), 59), 7679);
                            }
                        }
                    });
                }
                return Unit.f186387a;
        }
    }
}
