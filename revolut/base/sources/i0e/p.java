package i0e;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.transactions.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import tof.a3;
import tof.f5;
import tof.g5;
import tof.n1;
import tof.p1;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f157377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f157378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f157379y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f157378x = obj2;
        this.f157379y = obj3;
        this.z = obj4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                p pVar = new p((q) this.f157378x, (Set) this.f157379y, (io3.h) this.z, (Continuation) obj4, 0);
                pVar.f157377w = (n) obj2;
                pVar.v = (Data) obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            case 1:
                p pVar2 = new p((k8j.c) this.f157378x, (xi0.b) this.f157379y, this.z, (Continuation) obj4, 1);
                pVar2.v = (Data) obj2;
                pVar2.f157377w = (List) obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
            case 2:
                p pVar3 = new p((com.revolut.feature.staking.impl.stake.v2.b) this.f157378x, (io3.d) this.f157379y, (xi0.b) this.z, (Continuation) obj4, 2);
                pVar3.f157377w = (dj0.d) obj2;
                pVar3.v = (List) obj3;
                return pVar3.invokeSuspend(Unit.f186387a);
            default:
                p pVar4 = new p((xkf.s) this.f157378x, (a3) this.f157379y, (do3.n) this.z, (Continuation) obj4, 3);
                pVar4.f157377w = (List) obj2;
                pVar4.v = (mr8.b) obj3;
                return pVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        StatementPeriodType statementPeriodType;
        Object next;
        Object availability;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Object next2;
        xkf.j hVar;
        mr8.c cVar;
        mr8.d dVar2;
        dj0.d dVar3;
        mr8.d dVar4;
        int i = this.u;
        Object obj3 = this.z;
        Object obj4 = this.f157379y;
        Object obj5 = this.f157378x;
        switch (i) {
            case 0:
                n nVar = (n) this.f157377w;
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) obj5;
                Set set = (Set) obj4;
                io3.h hVar2 = (io3.h) obj3;
                try {
                    Object content = data.getContent();
                    if (content != null) {
                        ProductStatementPeriods productStatementPeriods = (ProductStatementPeriods) content;
                        h hVar3 = qVar.f157382n;
                        StatementPeriod statementPeriodF = nVar.f157375b;
                        if (statementPeriodF == null && (statementPeriodF = (StatementPeriod) qVar.f157383p.getValue()) == null) {
                            statementPeriodF = hVar2.f();
                        }
                        LinkedHashMap linkedHashMapA = ((g0) hVar3).a(productStatementPeriods, set, hVar2, statementPeriodF);
                        if (hVar2 instanceof a) {
                            statementPeriodType = ((a) hVar2).f157351a;
                        } else {
                            if (!(hVar2 instanceof b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            statementPeriodType = ((b) hVar2).f157357c;
                        }
                        StatementPeriodType statementPeriodType2 = nVar.f157374a;
                        if (statementPeriodType2 != null) {
                            statementPeriodType = statementPeriodType2;
                        } else if (statementPeriodType == null || linkedHashMapA.get(statementPeriodType) == null) {
                            statementPeriodType = (StatementPeriodType) zhm.d0.a0(linkedHashMapA.keySet());
                        }
                        dVar = new d(statementPeriodType, linkedHashMapA);
                    } else {
                        dVar = null;
                    }
                    return new Data(dVar, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 1:
                Data data2 = (Data) this.v;
                List list = (List) this.f157377w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k8j.c cVar2 = (k8j.c) obj5;
                return iii.c.f(data2, new k5e.k(cVar2, 13), new k8d.s(5), new ccg.b(cVar2, (xi0.b) obj4, this.z, list, 5));
            case 2:
                com.revolut.feature.staking.impl.stake.v2.b bVar = (com.revolut.feature.staking.impl.stake.v2.b) obj5;
                dj0.d dVar5 = (dj0.d) this.f157377w;
                List list2 = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(list2);
                xi0.b bVar2 = (xi0.b) obj3;
                Iterator it8 = list2.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((n9l.a) next).f213661a, bVar2)) {
                        }
                    } else {
                        next = null;
                    }
                }
                n9l.a aVar4 = (n9l.a) next;
                Intrinsics.h(dVar5);
                qwd.k kVar = Intrinsics.f(dVar5.f115083b, bVar.o.f88138a.d) ? new qwd.k(aVar4 != null ? pyd.c.K(dVar5, aVar4.f213663c, aVar4.f213662b) : null, dVar5) : new qwd.k(dVar5, aVar4 != null ? pyd.c.K(dVar5, 1.0d / aVar4.f213663c, aVar4.f213661a) : null);
                dj0.d dVar6 = kVar.f249859b;
                return qwd.m.a((qwd.m) ((j2) bVar.K.f22677a).getValue(), dVar5.f115082a, dVar5.f115083b, new Data(kVar, null, false, 6, null), false, null, null, com.revolut.feature.staking.impl.stake.v2.b.J2(bVar, pyd.c.M(dVar6), pyd.c.M(dVar6), z92.f.j((io3.d) obj4)), null, 756);
            default:
                List coparents = (List) this.f157377w;
                mr8.b bVar3 = (mr8.b) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xkf.q qVar2 = ((xkf.s) obj5).d;
                a3 transaction = (a3) obj4;
                do3.n user = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(coparents, "coparents");
                f5 f5Var = transaction.y0;
                n1 n1Var = f5Var != null ? f5Var.f272751c : null;
                g5 g5Var = f5Var != null ? f5Var.f272750b : null;
                g5 g5Var2 = g5.P2P_TRANSFER;
                xkf.i iVar = xkf.i.f306714a;
                if (g5Var != g5Var2 || n1Var == null || n1Var.f272941b != p1.ACTIVE) {
                    availability = xkf.n.f306735a;
                } else if (coparents.isEmpty()) {
                    availability = new xkf.k(transaction);
                } else {
                    String str = n1Var.f272942c.f272960a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : coparents) {
                        if (((vd8.a) obj6).f == vd8.d.GUARDIAN) {
                            arrayList.add(obj6);
                        }
                    }
                    Iterator it9 = arrayList.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            if (Intrinsics.f(((vd8.a) next2).d, user.f)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    if (((vd8.a) next2) != null) {
                        hVar = iVar;
                    } else {
                        vd8.a aVar6 = (vd8.a) zhm.d0.d0(arrayList);
                        hVar = aVar6 != null ? new xkf.h(ngm.n.n(aVar6)) : null;
                    }
                    if (hVar == null) {
                        availability = new xkf.k(transaction);
                    } else {
                        if (bVar3 == null || (dVar4 = bVar3.f208079l) == null || (cVar = dVar4.f208080a) == null) {
                            cVar = mr8.c.FIRST_TRANSFER_BETWEEN;
                        }
                        int i2 = xkf.o.f306740a[cVar.ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            availability = new xkf.m(transaction, str, hVar);
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (bVar3 == null || (dVar2 = bVar3.f208079l) == null || (dVar3 = dVar2.f208081b) == null) {
                                IllegalStateException illegalStateException = new IllegalStateException("P2PTransferRequest::limit cannot be null with P2PTransferRequestReason.AMOUNT_OVER_LIMIT");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                availability = new xkf.k(transaction);
                            } else {
                                availability = new xkf.l(transaction, str, hVar, dVar3);
                            }
                        }
                    }
                }
                vlf.b bVar4 = qVar2.f306749a;
                Intrinsics.checkNotNullParameter(availability, "availability");
                if (availability instanceof xkf.n) {
                    return zhm.f0.f322471a;
                }
                if (availability instanceof xkf.k) {
                    qv0.i iVarD = bVar4.d(((xkf.k) availability).f306719a, null);
                    yp0.b.l(iVarD, 0, 0, 0, 0, null, false, 63);
                    return zhm.u.c(iVarD);
                }
                if (availability instanceof xkf.m) {
                    xkf.m mVar = (xkf.m) availability;
                    String str2 = mVar.f306730b;
                    xkf.j jVar = mVar.f306731c;
                    if (jVar instanceof xkf.h) {
                        textLocalisedClause2 = new TextLocalisedClause(R$string.transactionUI_transaction_rev_u18_p2p_transfer_coparent_approval_disclaimer, zhm.v.k(str2, ((xkf.h) jVar).f306712a), new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), 8);
                    } else {
                        if (!jVar.equals(iVar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause2 = new TextLocalisedClause(R$string.transactionUI_transaction_rev_u18_p2p_transfer_parent_approval_disclaimer, zhm.u.c(str2), new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), 8);
                    }
                    PlainTextDelegate.Model model = new PlainTextDelegate.Model("ID_JUNIOR_TRANSFER_PARENT_APPROVAL_DISCLAIMER", (Clause) null, (Clause) textLocalisedClause2, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    qv0.i iVarD2 = bVar4.d(mVar.f306729a, null);
                    yp0.b.l(iVarD2, 0, 0, 0, 0, null, false, 63);
                    return zhm.v.k(model, iVarD2);
                }
                if (!(availability instanceof xkf.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                xkf.l lVar = (xkf.l) availability;
                String str3 = lVar.f306725b;
                xkf.j jVar2 = lVar.f306726c;
                if (jVar2 instanceof xkf.h) {
                    textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_rev_u18_p2p_transfer_coparent_approval_over_limit, zhm.v.k(str3, new MoneyClause(lVar.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), ((xkf.h) jVar2).f306712a), new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), 8);
                } else {
                    if (!jVar2.equals(iVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_rev_u18_p2p_transfer_parent_approval_over_limit, zhm.v.k(str3, new MoneyClause(lVar.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), 8);
                }
                PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("ID_JUNIOR_TRANSFER_PARENT_APPROVAL_DISCLAIMER", (Clause) null, (Clause) textLocalisedClause, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                qv0.i iVarD3 = bVar4.d(lVar.f306724a, null);
                yp0.b.l(iVarD3, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(model2, iVarD3);
        }
    }
}
