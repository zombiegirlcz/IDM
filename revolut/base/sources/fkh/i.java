package fkh;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a f135837w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f135837w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(0, this.f135837w, continuation);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(1, this.f135837w, continuation);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar = this.f135837w;
        switch (i) {
            case 0:
                final Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                final int i2 = 0;
                aVar.H2(aVar.v, new Function1() { // from class: fkh.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        boolean zBooleanValue;
                        e0h.a aVar3;
                        boolean zBooleanValue2;
                        switch (i2) {
                            case 0:
                                e eVar = (e) obj3;
                                com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar4 = aVar;
                                Boolean bool = ((e) ((j2) aVar4.v.f22677a).getValue()).d;
                                Data data2 = data;
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    Optional optional = (Optional) data2.getContent();
                                    List list = null;
                                    if (optional != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        list = (List) optional.orElse(null);
                                    }
                                    zBooleanValue = !ue0.e.n(list) && aVar4.o.f95928b == pih.j.UnsettledBuys;
                                }
                                return e.a(eVar, data2, null, null, Boolean.valueOf(zBooleanValue), 6);
                            default:
                                e eVar2 = (e) obj3;
                                com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar5 = aVar;
                                Boolean bool2 = ((e) ((j2) aVar5.v.f22677a).getValue()).f135829c;
                                Data data3 = data;
                                if (bool2 != null) {
                                    zBooleanValue2 = bool2.booleanValue();
                                } else {
                                    Optional optional2 = (Optional) data3.getContent();
                                    if (optional2 != null) {
                                        Intrinsics.checkNotNullParameter(optional2, "<this>");
                                        aVar3 = (e0h.a) optional2.orElse(null);
                                    } else {
                                        aVar3 = null;
                                    }
                                    zBooleanValue2 = !ue0.e.n(aVar3 != null ? aVar3.f121715a : null) && aVar5.o.f95928b == pih.j.UnsettledSells;
                                }
                                return e.a(eVar2, null, data3, Boolean.valueOf(zBooleanValue2), null, 9);
                        }
                    }
                });
                break;
            default:
                final Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                final int i3 = 1;
                aVar.H2(aVar.v, new Function1() { // from class: fkh.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        boolean zBooleanValue;
                        e0h.a aVar32;
                        boolean zBooleanValue2;
                        switch (i3) {
                            case 0:
                                e eVar = (e) obj3;
                                com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar4 = aVar;
                                Boolean bool = ((e) ((j2) aVar4.v.f22677a).getValue()).d;
                                Data data22 = data2;
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    Optional optional = (Optional) data22.getContent();
                                    List list = null;
                                    if (optional != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        list = (List) optional.orElse(null);
                                    }
                                    zBooleanValue = !ue0.e.n(list) && aVar4.o.f95928b == pih.j.UnsettledBuys;
                                }
                                return e.a(eVar, data22, null, null, Boolean.valueOf(zBooleanValue), 6);
                            default:
                                e eVar2 = (e) obj3;
                                com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar5 = aVar;
                                Boolean bool2 = ((e) ((j2) aVar5.v.f22677a).getValue()).f135829c;
                                Data data3 = data2;
                                if (bool2 != null) {
                                    zBooleanValue2 = bool2.booleanValue();
                                } else {
                                    Optional optional2 = (Optional) data3.getContent();
                                    if (optional2 != null) {
                                        Intrinsics.checkNotNullParameter(optional2, "<this>");
                                        aVar32 = (e0h.a) optional2.orElse(null);
                                    } else {
                                        aVar32 = null;
                                    }
                                    zBooleanValue2 = !ue0.e.n(aVar32 != null ? aVar32.f121715a : null) && aVar5.o.f95928b == pih.j.UnsettledSells;
                                }
                                return e.a(eVar2, null, data3, Boolean.valueOf(zBooleanValue2), null, 9);
                        }
                    }
                });
                break;
        }
        return Unit.f186387a;
    }
}
