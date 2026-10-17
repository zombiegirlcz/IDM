package gsd;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.subaccount.api.models.Subaccount;
import gim.i;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import xc8.g;
import yhm.o;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Set f146394w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Data data = (Data) obj2;
        Set set = (Set) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d dVar = new d(3, 0, continuation);
                dVar.v = data;
                dVar.f146394w = set;
                return dVar.invokeSuspend(Unit.f186387a);
            case 1:
                d dVar2 = new d(3, 1, continuation);
                dVar2.v = data;
                dVar2.f146394w = set;
                return dVar2.invokeSuspend(Unit.f186387a);
            case 2:
                d dVar3 = new d(3, 2, continuation);
                dVar3.v = data;
                dVar3.f146394w = set;
                return dVar3.invokeSuspend(Unit.f186387a);
            case 3:
                d dVar4 = new d(3, 3, continuation);
                dVar4.v = data;
                dVar4.f146394w = set;
                return dVar4.invokeSuspend(Unit.f186387a);
            case 4:
                d dVar5 = new d(3, 4, continuation);
                dVar5.v = data;
                dVar5.f146394w = set;
                return dVar5.invokeSuspend(Unit.f186387a);
            default:
                d dVar6 = new d(3, 5, continuation);
                dVar6.v = data;
                dVar6.f146394w = set;
                return dVar6.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i = this.u;
        Data data = this.v;
        switch (i) {
            case 0:
                Set set = this.f146394w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    Object content = data.getContent();
                    if (content != null) {
                        arrayList = new ArrayList();
                        for (Object obj3 : (List) content) {
                            if (!set.contains(((io3.d) obj3).f163145a)) {
                                arrayList.add(obj3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return new Data(arrayList, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 1:
                Set set2 = this.f146394w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    Object content2 = data.getContent();
                    if (content2 != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj4 : (List) content2) {
                            if (!set2.contains(((Subaccount) obj4).getF88959a().f234881a)) {
                                arrayList2.add(obj4);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    return new Data(arrayList2, data.getError(), data.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, data.getLoading());
                }
            case 2:
                Set set3 = this.f146394w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    Object content3 = data.getContent();
                    if (content3 != null) {
                        List<g> list = (List) content3;
                        arrayList3 = new ArrayList(w.t(list, 10));
                        for (g gVarA : list) {
                            Map map = gVarA.f304108b;
                            v6d.a aVar4 = v6d.a.PAYMENT_LINKS;
                            if (!map.containsKey(aVar4)) {
                                xc8.b bVar = xc8.b.GUARDIAN_CONSENT;
                                xc8.a aVar5 = set3.contains(new kd8.b(gVarA.f304107a, aVar4)) ? xc8.a.GIVEN : xc8.a.NOT_GIVEN;
                                LocalDateTime MIN = LocalDateTime.MIN;
                                Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
                                gVarA = g.a(gVarA, r0.q(gVarA.f304108b, new Pair(aVar4, new xc8.c("HARDCODED_CONSENT_ID", aVar4, bVar, aVar5, MIN))));
                            }
                            arrayList3.add(gVarA);
                        }
                    } else {
                        arrayList3 = null;
                    }
                    return new Data(arrayList3, data.getError(), data.getLoading());
                } catch (Throwable th12) {
                    return new Data(null, th12, data.getLoading());
                }
            case 3:
                Set set4 = this.f146394w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    Object content4 = data.getContent();
                    if (content4 != null) {
                        arrayList4 = new ArrayList();
                        for (Object obj5 : (List) content4) {
                            if (!set4.contains(((io3.d) obj5).f163145a)) {
                                arrayList4.add(obj5);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                    return new Data(arrayList4, data.getError(), data.getLoading());
                } catch (Throwable th13) {
                    return new Data(null, th13, data.getLoading());
                }
            case 4:
                Set set5 = this.f146394w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    Object content5 = data.getContent();
                    if (content5 != null) {
                        arrayList5 = new ArrayList();
                        for (Object obj6 : (List) content5) {
                            if (!set5.contains(((Subaccount) obj6).getF88959a().f234881a)) {
                                arrayList5.add(obj6);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                    return new Data(arrayList5, data.getError(), data.getLoading());
                } catch (Throwable th14) {
                    return new Data(null, th14, data.getLoading());
                }
            default:
                Set set6 = this.f146394w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    Object content6 = data.getContent();
                    if (content6 != null) {
                        arrayList6 = new ArrayList();
                        for (Object obj7 : (List) content6) {
                            if (!set6.contains(((SavingsAccountDetails) ((npg.a) obj7).f218206b).f86460a.f234881a)) {
                                arrayList6.add(obj7);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                    return new Data(arrayList6, data.getError(), data.getLoading());
                } catch (Throwable th15) {
                    return new Data(null, th15, data.getLoading());
                }
        }
    }
}
