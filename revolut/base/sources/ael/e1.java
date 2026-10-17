package ael;

import com.revolut.data.model.Data;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nel.n f3609b;

    public /* synthetic */ e1(nel.n nVar, int i) {
        this.f3608a = i;
        this.f3609b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        nel.w0 w0Var;
        int i = this.f3608a;
        Object obj3 = null;
        nel.n nVar = this.f3609b;
        switch (i) {
            case 0:
                Map it8 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = (List) it8.get(nVar.f214596b);
                return (list == null || (w0Var = (nel.w0) zhm.d0.d0(list)) == null) ? new nel.r0(nVar) : w0Var;
            case 1:
                Optional holdingOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(holdingOptional, "holdingOptional");
                Object objM = gj7.b.m(holdingOptional);
                kel.n nVar2 = objM instanceof kel.n ? (kel.n) objM : null;
                return nVar2 != null ? zhm.q0.c(new Pair(nVar, new nel.y0(nVar2))) : zhm.r0.g();
            case 2:
                return Optional.ofNullable(((Map) obj2).get(nVar.f214596b));
            case 3:
                return hp3.m.a((hp3.m) obj2, null, null, null, false, null, null, null, null, false, false, new Data(this.f3609b, null, false, 6, null), null, 28671);
            case 4:
                List allInstruments = (List) obj2;
                Intrinsics.checkNotNullParameter(allInstruments, "allInstruments");
                Iterator it9 = allInstruments.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        nel.n nVar3 = (nel.n) next;
                        if (io3.h.j(nVar3.f214597c)) {
                            xi0.b bVar = nVar3.f214605q;
                            if (Intrinsics.f(bVar != null ? bVar.f306286a : null, nVar.f214596b)) {
                                obj3 = next;
                            }
                        }
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((nel.n) obj3);
            case 5:
                d1b.b it10 = (d1b.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.h hVar = od0.i.Companion;
                ej0.b bVar2 = new ej0.b(new BigDecimal(String.valueOf(it10.getOpen())), nVar.i);
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(it10.getClose()));
                xi0.b bVar3 = nVar.i;
                ej0.b bVar4 = new ej0.b(bigDecimal, bVar3);
                ej0.b bVar5 = new ej0.b(new BigDecimal(String.valueOf(it10.getLow())), bVar3);
                ej0.b bVar6 = new ej0.b(new BigDecimal(String.valueOf(it10.getHigh())), bVar3);
                Double volume = it10.getVolume();
                long jLongValue = volume != null ? new BigDecimal(String.valueOf(volume.doubleValue())).longValue() : 0L;
                long time = it10.getTime();
                long time2 = it10.getTime();
                b.Companion companion = kotlin.time.b.INSTANCE;
                eel.b bVar7 = new eel.b(bVar2, bVar4, bVar6, bVar5, jLongValue, time, kotlin.time.b.f(kotlin.time.c.g(10, pkm.e.MINUTES)) + time2, new ej0.b(new BigDecimal(String.valueOf(it10.getOpen())), bVar3), new ej0.b(new BigDecimal(String.valueOf(it10.getClose())), bVar3), null);
                hVar.getClass();
                return od0.h.a(bVar7);
            case 6:
                return e3h.c.a((e3h.c) obj2, null, null, null, this.f3609b, null, null, null, null, null, null, null, null, null, 4194295);
            case 7:
                return kvk.k.a((kvk.k) obj2, nVar.e, null, null, null, 14);
            case 8:
                return mwk.i.f((mwk.i) obj2, this.f3609b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554430);
            case 9:
                return nvk.k.a((nvk.k) obj2, nVar.e, null, null, null, null, null, null, null, 254);
            case 10:
                return Optional.ofNullable(((Map) obj2).get(nVar.f214596b));
            case 11:
                nel.n it11 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(Intrinsics.f(it11.f214600j, nVar.f214600j) && it11.f.d && !Intrinsics.f(it11.f214596b, nVar.f214596b));
            default:
                return z0k.k.a((z0k.k) obj2, null, nVar.e, null, 5);
        }
    }
}
