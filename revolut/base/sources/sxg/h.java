package sxg;

import ael.u0;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$State;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteFee;
import java.util.List;
import java.util.UUID;
import k4l.q0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ss4.a0;
import vrl.s;
import yhm.o;
import zhm.f0;
import zw5.n;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f266489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f266490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f266491y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f266489w = obj2;
        this.f266490x = obj3;
        this.f266491y = obj4;
        this.z = obj5;
        this.A = obj6;
        this.B = obj7;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(0, (vyg.e) this.f266489w, (k) this.f266490x, (iwg.a) this.f266491y, (iwg.c) this.z, (WidgetisedAnalyticsType) this.A, (eel.c) this.B, continuation);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(1, (vrl.e) this.f266489w, (String) this.f266490x, (bfl.g) this.f266491y, (q0) this.z, (String) this.A, (r0) this.B, continuation);
                hVar2.v = obj2;
                return hVar2;
            default:
                h hVar3 = new h(2, (n) this.f266489w, (dj0.d) this.f266490x, (dj0.d) this.f266491y, (List) this.z, (q0i.i) this.A, (String) this.B, continuation);
                hVar3.v = obj2;
                return hVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((CollectionQuote) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowB;
        int i = this.u;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.f266491y;
        Object obj7 = this.f266489w;
        Object obj8 = this.f266490x;
        switch (i) {
            case 0:
                iwg.a aVar = (iwg.a) obj6;
                k kVar = (k) obj8;
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                vyg.e eVar = (vyg.e) obj7;
                int i2 = f.f266488a[eVar.ordinal()];
                if (i2 == 1) {
                    flowB = k.b(kVar, aVar, k.a(kVar, list, aVar, eVar));
                } else if (i2 == 2) {
                    flowB = k.e(kVar, list, (iwg.c) obj5, (WidgetisedAnalyticsType) obj4, (eel.c) obj3);
                } else if (i2 == 3) {
                    List list2 = k.d;
                    switch (b.f266486b[aVar.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                            throw new IllegalStateException(aVar + " not mapped");
                        case 5:
                            flowB = kVar.f(new a0(15), list);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    flowB = k.d(kVar, list);
                }
                return nim.a.v(flowB, new sx2.g(14));
            case 1:
                UUID uuid = (UUID) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar = ((vrl.e) obj7).e;
                String string = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String str = (String) obj8;
                bfl.g gVar = (bfl.g) obj6;
                q0 q0Var = (q0) obj5;
                Boolean bool = Boolean.TRUE;
                if (!oi0.d.B((r0) obj3)) {
                    bool = null;
                }
                return rd0.e.b(sVar.a(string, str, gVar, q0Var, bool, (String) obj4, w4l.h.f294642c));
            default:
                CollectionQuote collectionQuote = (CollectionQuote) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar = (n) obj7;
                xw5.d dVar = nVar.v;
                dj0.d fee2 = collectionQuote.f95267c;
                dj0.d amountAfterFee = collectionQuote.d;
                CollectionQuoteFee collectionQuoteFee = collectionQuote.i;
                List feeBreakdowns = collectionQuoteFee != null ? collectionQuoteFee.f95270a : f0.f322471a;
                dj0.d amount = (dj0.d) obj8;
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar5 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a) dVar;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(amountAfterFee, "amountAfterFee");
                Intrinsics.checkNotNullParameter(fee2, "fee");
                Intrinsics.checkNotNullParameter(feeBreakdowns, "feeBreakdowns");
                CryptoCommodityBuyCollectionFlowContract$State cryptoCommodityBuyCollectionFlowContract$State = (CryptoCommodityBuyCollectionFlowContract$State) aVar5.A2().f98429a;
                CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState sharedDialogState = new CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState(amount, amountAfterFee, fee2, feeBreakdowns);
                cryptoCommodityBuyCollectionFlowContract$State.getClass();
                Intrinsics.checkNotNullParameter(sharedDialogState, "sharedDialogState");
                aVar5.L2(new CryptoCommodityBuyCollectionFlowContract$State(sharedDialogState));
                nVar.x2(new u0(collectionQuote, (dj0.d) obj8, (dj0.d) obj6, (List) obj5, (q0i.i) obj4, (String) obj3, 24));
                return Unit.f186387a;
        }
    }
}
