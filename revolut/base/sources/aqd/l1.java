package aqd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.feature.transfer.models.transfer.RecipientTrustState;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferExtraConfiguration;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerExtraConfiguration$NoBalanceValidation;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class l1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f8360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e f8362y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i, com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f8362y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l1 l1Var = new l1(0, this.f8362y, continuation);
                l1Var.f8360w = flowCollector;
                l1Var.f8361x = obj3;
                return l1Var.invokeSuspend(Unit.f186387a);
            default:
                l1 l1Var2 = new l1(1, this.f8362y, continuation);
                l1Var2.f8360w = flowCollector;
                l1Var2.f8361x = obj3;
                return l1Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        kq2.c cVar;
        kq2.c cVar2;
        int i = this.u;
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = this.f8362y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f8360w;
                    com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d dVar = eVar.f87760p;
                    IncomeSortersDetailsContract$InputData.Mode mode = eVar.o.f87742a;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(mode, "mode");
                    Flow flowI = c6d.b.i(xam.a.h(new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.b(dVar, mode, null), zh9.u0.i(rd0.e.b(dVar.f87757a.K(AccountId.Personal.f51414a)), cj9.c.y(dVar.f87759c.a()), dVar.f.j(w4l.h.f294642c))), new g1(eVar, 0));
                    this.f8360w = null;
                    this.f8361x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowI, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f8360w;
                    m mVar = (m) this.f8361x;
                    dqd.y yVar = eVar.f87764t;
                    io3.d pocket = mVar.k;
                    dj0.d transactionTotal = mVar.f8363a;
                    ArrayList destinations = mVar.d;
                    yVar.getClass();
                    Intrinsics.checkNotNullParameter(pocket, "pocket");
                    Intrinsics.checkNotNullParameter(transactionTotal, "transactionTotal");
                    Intrinsics.checkNotNullParameter(destinations, "destinations");
                    ArrayList<IncomeSorterHomeContract$DestinationValue> arrayListP = pyd.c.p(destinations);
                    ArrayList arrayList = new ArrayList();
                    for (IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue : arrayListP) {
                        IncomeSorterDestinationInfo incomeSorterDestinationInfo = incomeSorterHomeContract$DestinationValue.f87825a;
                        IncomeSorterDestinationInfo.BankTransfer bankTransfer = incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.BankTransfer ? (IncomeSorterDestinationInfo.BankTransfer) incomeSorterDestinationInfo : null;
                        Pair pair = bankTransfer == null ? null : new Pair(incomeSorterHomeContract$DestinationValue, bankTransfer);
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    Map mapT = zhm.r0.t(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue2 : arrayListP) {
                        IncomeSorterDestinationInfo incomeSorterDestinationInfo2 = incomeSorterHomeContract$DestinationValue2.f87825a;
                        IncomeSorterDestinationInfo.PeerToPeerTransfer peerToPeerTransfer = incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer ? (IncomeSorterDestinationInfo.PeerToPeerTransfer) incomeSorterDestinationInfo2 : null;
                        Pair pair2 = peerToPeerTransfer == null ? null : new Pair(incomeSorterHomeContract$DestinationValue2, peerToPeerTransfer);
                        if (pair2 != null) {
                            arrayList2.add(pair2);
                        }
                    }
                    Map mapT2 = zhm.r0.t(arrayList2);
                    AccountId.Personal personal = AccountId.Personal.f51414a;
                    PocketSource pocketSource = new PocketSource(pocket, personal, null);
                    ArrayList arrayList3 = new ArrayList(mapT.size());
                    Iterator it8 = mapT.entrySet().iterator();
                    while (it8.hasNext()) {
                        Map.Entry entry = (Map.Entry) it8.next();
                        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue3 = (IncomeSorterHomeContract$DestinationValue) entry.getKey();
                        IncomeSorterDestinationInfo.BankTransfer bankTransfer2 = (IncomeSorterDestinationInfo.BankTransfer) entry.getValue();
                        f4h.a aVar2 = yVar.f116968a;
                        PocketSource pocketSource2 = pocketSource;
                        dj0.d dVar2 = incomeSorterHomeContract$DestinationValue3.f87826b;
                        Map map = mapT2;
                        long j2 = dVar2.f115082a;
                        xi0.b bVar = dVar2.f115083b;
                        xi0.b bVar2 = transactionTotal.f115083b;
                        String str = bankTransfer2.f87457b;
                        if (str == null) {
                            str = "";
                        }
                        TransferNote.SimpleNote simpleNote = new TransferNote.SimpleNote(str);
                        rtf.a aVar3 = new rtf.a(bankTransfer2.d);
                        m1l.a aVar4 = m1l.a.SCHEDULE_DISABLED;
                        dj0.d dVar3 = transactionTotal;
                        Iterator it9 = it8;
                        TransferScheduleData transferScheduleData = new TransferScheduleData(0L, (jli.c) null, 7);
                        hzi.d dVar4 = bankTransfer2.e;
                        int i5 = dVar4 == null ? -1 : jqd.a.f177698b[dVar4.ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1) {
                                cVar2 = kq2.c.SHARED;
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar2 = kq2.c.DEBTOR;
                            }
                            cVar = cVar2;
                        } else {
                            cVar = null;
                        }
                        AccountId.Personal personal2 = personal;
                        BankTransferData bankTransferData = new BankTransferData(j2, bVar, bVar2, pocketSource2, personal2, simpleNote, aVar3, aVar4, transferScheduleData, null, cVar, null, null, null, null, null, null, null, 1046528);
                        f5j.a aVar5 = bankTransfer2.f87456a;
                        TransferFlowType.Default r92 = TransferFlowType.Default.f92257b;
                        arrayList3.add(rd0.e.d(vkm.q.q(new vkm.y(new dqd.t(yVar, incomeSorterHomeContract$DestinationValue3, null, 0), new ahd.y(aVar2.n(bankTransferData, aVar5, zhm.f0.f322471a, zhm.y0.b(BankTransferExtraConfiguration.NoBalanceValidation.f101938a)), yVar, incomeSorterHomeContract$DestinationValue3, 17))), zhm.h0.f322473a));
                        pocketSource = pocketSource2;
                        personal = personal2;
                        mapT2 = map;
                        transactionTotal = dVar3;
                        it8 = it9;
                    }
                    Map map2 = mapT2;
                    PocketSource pocketSource3 = pocketSource;
                    AccountId.Personal personal3 = personal;
                    int i6 = 2;
                    Flow flowA = dqd.y.a(arrayList3);
                    ArrayList arrayList4 = new ArrayList(map2.size());
                    Iterator it10 = map2.entrySet().iterator();
                    while (it10.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it10.next();
                        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue4 = (IncomeSorterHomeContract$DestinationValue) entry2.getKey();
                        IncomeSorterDestinationInfo.PeerToPeerTransfer peerToPeerTransfer2 = (IncomeSorterDestinationInfo.PeerToPeerTransfer) entry2.getValue();
                        r9k.k kVar = yVar.f116969b;
                        dj0.d dVar5 = incomeSorterHomeContract$DestinationValue4.f87826b;
                        long j3 = dVar5.f115082a;
                        xi0.b bVar3 = dVar5.f115083b;
                        Flow flow = flowA;
                        zm3.l lVar = peerToPeerTransfer2.f87481a;
                        Iterator it11 = it10;
                        zm3.l lVar2 = peerToPeerTransfer2.f87481a;
                        PeerToPeerRecipient peerToPeerRecipient = new PeerToPeerRecipient(lVar);
                        hrf.f fVar = hrf.f.OUTGOING;
                        String str2 = peerToPeerTransfer2.f87482b;
                        PocketSource pocketSource4 = pocketSource3;
                        i6 = 2;
                        PeerToPeerTransferData peerToPeerTransferData = new PeerToPeerTransferData(j3, bVar3, pocketSource3.f92241b, bVar3, pocketSource4, personal3, peerToPeerRecipient, fVar, str2 == null ? "" : str2, null, null, new rtf.a(peerToPeerTransfer2.d), m1l.a.SCHEDULE_DISABLED, new TransferScheduleData(0L, (jli.c) null, 7), new TransferTrustData(true, RecipientTrustState.Trusted.f92301a), new TransferQuoteUserIdentifier.Code(lVar2.getCode()), null, TransferAppSource.DEFAULT.f92298a);
                        TransferFlowType.Default r4 = TransferFlowType.Default.f92257b;
                        arrayList4.add(rd0.e.d(vkm.q.q(new vkm.y(new dqd.t(yVar, incomeSorterHomeContract$DestinationValue4, null, 1), new ahd.y(kVar.b(peerToPeerTransferData, lVar2, fVar, zhm.y0.b(PeerToPeerExtraConfiguration$NoBalanceValidation.f102269a)), yVar, incomeSorterHomeContract$DestinationValue4, 18))), zhm.h0.f322473a));
                        pocketSource3 = pocketSource4;
                        obj3 = obj3;
                        flowA = flow;
                        it10 = it11;
                    }
                    Object obj4 = obj3;
                    Flow flowA2 = dqd.y.a(arrayList4);
                    dqd.w wVar = new dqd.w(3, 0, null);
                    this.f8360w = null;
                    this.f8361x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    w0 w0Var = new w0(flowCollector2, 1);
                    Flow[] flowArr = new Flow[i6];
                    flowArr[0] = flowA;
                    flowArr[1] = flowA2;
                    Object objG = mif.e0.g(this, vkm.s1.f290118a, new vdl.c1((Function3) wVar, (Continuation) null, 15), w0Var, flowArr);
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    Object obj5 = fim.a.COROUTINE_SUSPENDED;
                    if (objG != obj5) {
                        objG = Unit.f186387a;
                    }
                    if (objG != obj5) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
