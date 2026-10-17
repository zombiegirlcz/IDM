package aqd;

import aw0.n6;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models.IncomeSorterDetailsDiff;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IncomeSortersDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(IncomeSortersDetailsController incomeSortersDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = incomeSortersDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x0(this.v, continuation, 0);
            case 1:
                return new x0(this.v, continuation, 1);
            default:
                return new x0(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((x0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        IncomeSorterReviewContract$ReviewMode update;
        String str2;
        int i = this.u;
        boolean z = true;
        IncomeSortersDetailsController incomeSortersDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d();
                m mVar = (m) ((t) ((j2) eVar.f87766x.f22677a).getValue()).f8402a.getContent();
                if (mVar != null) {
                    s sVar = mVar.f8365c;
                    if (sVar instanceof p) {
                        r6.b.D("There is no secondary button on creation flow");
                    } else {
                        if (!(sVar instanceof r)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r rVar = (r) sVar;
                        int i2 = i1.f8351c[rVar.f.ordinal()];
                        if (i2 == 1) {
                            r6.b.D("There is no secondary button on update flow");
                        } else if (i2 == 2) {
                            String str3 = rVar.f8390a;
                            IncomeSorterExecution incomeSorterExecution = rVar.d;
                            if (incomeSorterExecution != null && (str = incomeSorterExecution.f99238a) != null) {
                                eVar.n2(new akl.s1(4, eVar, str, str3, (Continuation) null), new whi.b(6));
                            }
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eVar.J2();
                        }
                    }
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d();
                m mVar2 = (m) ((t) ((j2) eVar2.f87766x.f22677a).getValue()).f8402a.getContent();
                if (mVar2 != null) {
                    ArrayList arrayList = mVar2.d;
                    s sVar2 = mVar2.f8365c;
                    IncomeSorterDetailsDiff.Companion companion = IncomeSorterDetailsDiff.INSTANCE;
                    ArrayList arrayList2 = mVar2.e;
                    RemainingBalanceDestination remainingBalanceDestination = mVar2.f8366g;
                    RemainingBalanceDestination remainingBalanceDestination2 = mVar2.f;
                    i0 i0Var = mVar2.f8367h;
                    i0 i0Var2 = mVar2.i;
                    companion.getClass();
                    IncomeSorterDetailsDiff incomeSorterDetailsDiffA = IncomeSorterDetailsDiff.Companion.a(arrayList, arrayList2, remainingBalanceDestination, remainingBalanceDestination2, i0Var, i0Var2);
                    if (sVar2 instanceof p) {
                        p pVar = (p) sVar2;
                        int i3 = i1.f8350b[pVar.f8385c.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                z = false;
                            } else if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        boolean z3 = z;
                        String str4 = pVar.f8383a;
                        String str5 = pVar.f8384b.f272581b;
                        ArrayList arrayListH = pyd.c.h(arrayList);
                        IncomeSorterDestinationId f87836b = mVar2.f8366g.getF87836b();
                        if (f87836b == null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "IncomeSorter", "Trying to create a sorter with null remainingDestination id", null, h0Var);
                        } else {
                            update = new IncomeSorterReviewContract$ReviewMode.Create(str4, str5, arrayListH, f87836b, mVar2.f8367h, z3);
                            eVar2.l1().M0(new kqd.n(mVar2.f8371n, pyd.c.p(arrayList), mVar2.f8366g, sVar2.getTransaction(), mVar2.f8370m, mVar2.f8367h, update));
                        }
                    } else {
                        if (!(sVar2 instanceof r)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r rVar2 = (r) sVar2;
                        String str6 = rVar2.f8392c.f99160a;
                        String str7 = rVar2.f8390a;
                        int i5 = i1.f8351c[rVar2.f.ordinal()];
                        if (i5 == 1) {
                            update = new IncomeSorterReviewContract$ReviewMode.Update(str7, str6, incomeSorterDetailsDiffA);
                        } else if (i5 == 2) {
                            IncomeSorterExecution incomeSorterExecution2 = rVar2.d;
                            if (incomeSorterExecution2 != null && (str2 = incomeSorterExecution2.f99238a) != null) {
                                update = new IncomeSorterReviewContract$ReviewMode.ManualExecution(str7, str6, str2, incomeSorterDetailsDiffA);
                            }
                        } else {
                            if (i5 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            update = new IncomeSorterReviewContract$ReviewMode.Activate(str7, str6, incomeSorterDetailsDiffA);
                        }
                        eVar2.l1().M0(new kqd.n(mVar2.f8371n, pyd.c.p(arrayList), mVar2.f8366g, sVar2.getTransaction(), mVar2.f8370m, mVar2.f8367h, update));
                    }
                }
                return Unit.f186387a;
        }
    }
}
