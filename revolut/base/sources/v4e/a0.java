package v4e;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import d9.e1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.e2;
import jel.v2;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import s7a.m0;
import vkm.j2;
import vkm.t0;
import zhm.z0;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ f0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.v = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        v2 v2Var;
        String str;
        Object next;
        String str2;
        BigDecimal bigDecimalJ;
        Pair pair;
        f0 f0Var = this.v;
        vki.a aVar = f0Var.f286048r;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            t0 t0Var = new t0(aVar.B(new v2g.i(22)), 1);
            this.u = 1;
            obj2 = vkm.q.x(t0Var, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        yhm.r rVar = (yhm.r) obj2;
        nel.d0 d0Var = (nel.d0) rVar.f314201a;
        w2 w2Var = (w2) rVar.f314202b;
        List<r> list = (List) rVar.f314203c;
        if (((p) ((j2) aVar.f22677a).getValue()).d == null) {
            e2 e2VarW = a.a.w(w2Var, d0Var);
            ArrayList arrayList = w2Var.k;
            int i2 = e2VarW == null ? -1 : z.f286070a[e2VarW.ordinal()];
            Object iVar = null;
            if (i2 == -1) {
                v2Var = (v2) zhm.d0.d0(arrayList);
                if (v2Var != null && (str = v2Var.f173579a) != null) {
                    iVar = new i(str);
                }
                f0Var.X2(aVar, new m0(10, z0.h(iVar)));
            } else {
                if (i2 == 1) {
                    iVar = new j(o.AVERAGE);
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v2Var = (v2) zhm.d0.d0(arrayList);
                    if (v2Var != null) {
                        iVar = new i(str);
                    }
                } else {
                    v2 v2Var2 = (v2) zhm.d0.d0(arrayList);
                    String str3 = v2Var2 != null ? v2Var2.f173579a : null;
                    ArrayList arrayList2 = new ArrayList();
                    for (r rVar2 : list) {
                        InstrumentTicker instrumentTicker = rVar2.e;
                        BigDecimal bigDecimal = rVar2.f286063c.f126703a;
                        if (!e1.D(bigDecimal)) {
                            bigDecimal = null;
                        }
                        if (bigDecimal == null) {
                            pair = null;
                        } else {
                            String str4 = rVar2.f286062b.f173579a;
                            ej0.b bVar = instrumentTicker.f;
                            if (bVar == null || (bigDecimalJ = bVar.f126703a) == null) {
                                bigDecimalJ = pyd.c.j(instrumentTicker.e);
                            }
                            pair = new Pair(str4, jb3.l.t(bigDecimalJ, bigDecimal));
                        }
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    Iterator it8 = arrayList2.iterator();
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (it8.hasNext()) {
                            BigDecimal bigDecimal2 = (BigDecimal) ((Pair) next).f186386b;
                            do {
                                Object next2 = it8.next();
                                BigDecimal bigDecimal3 = (BigDecimal) ((Pair) next2).f186386b;
                                if (bigDecimal2.compareTo(bigDecimal3) > 0) {
                                    next = next2;
                                    bigDecimal2 = bigDecimal3;
                                }
                            } while (it8.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Pair pair2 = (Pair) next;
                    if (pair2 != null && (str2 = (String) pair2.f186385a) != null) {
                        str3 = str2;
                    }
                    if (str3 != null) {
                        iVar = new i(str3);
                    }
                }
                f0Var.X2(aVar, new m0(10, z0.h(iVar)));
            }
        }
        return Unit.f186387a;
    }
}
