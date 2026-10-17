package dp4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f116603w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116603w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f116603w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f116603w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f116603w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            default:
                c cVar4 = new c(this.f116603w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((cp4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((cp4.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((cp4.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((cp4.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        el4.c cVar;
        xo4.c cVar2;
        el4.d dVar;
        dj0.d dVar2;
        int i = this.u;
        e eVar = this.f116603w;
        switch (i) {
            case 0:
                cp4.b bVar = (cp4.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xo4.a aVar2 = (xo4.a) eVar.f116635c.a(bVar);
                if (aVar2 != null) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    xi0.a aVar3 = xi0.b.Companion;
                    String currency = aVar2.getCurrency();
                    aVar3.getClass();
                    xi0.b bVarA = xi0.a.a(currency);
                    dj0.d dVar3 = new dj0.d(aVar2.getAmountAvailable(), bVarA);
                    dj0.d dVar4 = new dj0.d(aVar2.getAmountSpent(), bVarA);
                    dj0.d dVar5 = new dj0.d(aVar2.getMonthlySpendingLimit(), bVarA);
                    Long singlePurchaseLimitAmount = aVar2.getSinglePurchaseLimitAmount();
                }
                break;
            case 1:
                cp4.c cVar3 = (cp4.c) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) eVar.f116635c.a(cVar3);
                if (list != null) {
                    List<xo4.b> list2 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    for (xo4.b bVar2 : list2) {
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        arrayList.add(new el4.b(bVar2.getCardId(), bVar2.getTitle(), bVar2.getSubtitle(), new b93.j(new b93.b(bVar2.getDesign()), bVar2.getBrand())));
                    }
                }
                break;
            case 2:
                cp4.e eVar2 = (cp4.e) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xo4.d dVar6 = (xo4.d) eVar.f116635c.a(eVar2);
                if (dVar6 != null) {
                    Intrinsics.checkNotNullParameter(dVar6, "<this>");
                    xi0.a aVar6 = xi0.b.Companion;
                    String currency2 = dVar6.getCurrency();
                    aVar6.getClass();
                    xi0.b bVarA2 = xi0.a.a(currency2);
                }
                break;
            default:
                cp4.d dVar7 = (cp4.d) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xo4.e eVar3 = (xo4.e) eVar.f116635c.a(dVar7);
                if (eVar3 != null) {
                    Intrinsics.checkNotNullParameter(eVar3, "<this>");
                    int invitationsLeft = eVar3.getInvitationsLeft();
                    List cardholders = eVar3.getCardholders();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(cardholders, 10));
                    Iterator it8 = cardholders.iterator();
                    while (it8.hasNext()) {
                        xo4.c cVar4 = (xo4.c) it8.next();
                        Intrinsics.checkNotNullParameter(cVar4, "<this>");
                        xi0.a aVar8 = xi0.b.Companion;
                        String currency3 = cVar4.getCurrency();
                        aVar8.getClass();
                        xi0.b bVarA3 = xi0.a.a(currency3);
                        String userId = cVar4.getUserId();
                        String firstName = cVar4.getFirstName();
                        String lastName = cVar4.getLastName();
                        String state = cVar4.getState();
                        el4.c[] cVarArrValues = el4.c.values();
                        int length = cVarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                cVar = cVarArrValues[i2];
                                if (!kotlin.text.a0.z(cVar.name(), state, true)) {
                                    i2++;
                                }
                            } else {
                                cVar = null;
                            }
                        }
                        if (cVar == null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "CardholderListItemEntityMapper", p.a.p("Can't support state=", cVar4.getState(), " for CardholderListItemEntity"), null, h0Var);
                            cVar = el4.c.UNKNOWN;
                        }
                        el4.c cVar5 = cVar;
                        String type = cVar4.getType();
                        el4.d[] dVarArrValues = el4.d.values();
                        int length2 = dVarArrValues.length;
                        Iterator it9 = it8;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                el4.d dVar8 = dVarArrValues[i3];
                                int i5 = i3;
                                cVar2 = cVar4;
                                if (kotlin.text.a0.z(dVar8.name(), type, true)) {
                                    dVar = dVar8;
                                } else {
                                    i3 = i5 + 1;
                                    cVar4 = cVar2;
                                }
                            } else {
                                cVar2 = cVar4;
                                dVar = null;
                            }
                        }
                        if (dVar == null) {
                            zhm.h0 h0Var2 = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            dVar2 = null;
                            rd0.d.a(rd0.c.ERROR, "CardholderListItemEntityMapper", p.a.p("Can't support type=", cVar2.getType(), " for CardholderListItemEntity"), null, h0Var2);
                            dVar = el4.d.UNKNOWN;
                        } else {
                            dVar2 = null;
                        }
                        el4.d dVar9 = dVar;
                        Long spentAmount = cVar2.getSpentAmount();
                        dj0.d dVar10 = spentAmount != null ? new dj0.d(spentAmount.longValue(), bVarA3) : dVar2;
                        Long availableAmount = cVar2.getAvailableAmount();
                        arrayList2.add(new el4.e(userId, firstName, lastName, cVar5, dVar9, dVar10, availableAmount != null ? new dj0.d(availableAmount.longValue(), bVarA3) : dVar2, cVar2.getSpendingProgress(), bVarA3));
                        it8 = it9;
                    }
                }
                break;
        }
        return null;
    }
}
