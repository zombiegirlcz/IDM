package afa;

import com.revolut.data.model.Data;
import com.revolut.feature.pockets.impl.ui.pockets_list.model.CurrencyCountryKey;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.n1;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.ui.pockets_list.c f4003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.pockets.impl.ui.pockets_list.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f4003w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f4003w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(this.f4003w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
            case 2:
                t tVar3 = new t(this.f4003w, continuation, 2);
                tVar3.v = obj2;
                return tVar3;
            case 3:
                t tVar4 = new t(this.f4003w, continuation, 3);
                tVar4.v = obj2;
                return tVar4;
            case 4:
                t tVar5 = new t(this.f4003w, continuation, 4);
                tVar5.v = obj2;
                return tVar5;
            default:
                t tVar6 = new t(this.f4003w, continuation, 5);
                tVar6.v = obj2;
                return tVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        LinkedHashMap linkedHashMap;
        Boolean boolValueOf;
        int i = this.u;
        com.revolut.feature.pockets.impl.ui.pockets_list.c cVar = this.f4003w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    cVar.f80927y.getClass();
                    cVar.C1(rea.p.b());
                }
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data2);
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) content).entrySet()) {
                            xi0.b bVar = (xi0.b) entry.getKey();
                            if (((List) entry.getValue()).size() > 1) {
                                CurrencyCountryKey currencyCountryKey = cVar.o.f80906b;
                                boolValueOf = Boolean.valueOf(Intrinsics.f(currencyCountryKey != null ? currencyCountryKey.f80928a : null, bVar));
                            } else {
                                boolValueOf = null;
                            }
                            if (boolValueOf != null) {
                                linkedHashMap.put(entry.getKey(), boolValueOf);
                            }
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    data = new Data(linkedHashMap, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                Map mapG = (Map) data.getContent();
                if (mapG == null) {
                    mapG = r0.g();
                }
                cVar.H2(cVar.D, new w(data2, mapG, 0));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.D, new af4.t(data3, 1));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.D, new af4.t(data4, 2));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.D, new af4.t(data5, 4));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.D, new af4.t(data6, 5));
                break;
        }
        return Unit.f186387a;
    }
}
