package bzg;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a f20014w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20014w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f20014w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(this.f20014w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q(this.f20014w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q(this.f20014w, continuation, 3);
                qVar4.v = obj2;
                return qVar4;
            case 4:
                q qVar5 = new q(this.f20014w, continuation, 4);
                qVar5.v = obj2;
                return qVar5;
            case 5:
                q qVar6 = new q(this.f20014w, continuation, 5);
                qVar6.v = obj2;
                return qVar6;
            case 6:
                q qVar7 = new q(this.f20014w, continuation, 6);
                qVar7.v = obj2;
                return qVar7;
            case 7:
                q qVar8 = new q(this.f20014w, continuation, 7);
                qVar8.v = obj2;
                return qVar8;
            default:
                q qVar9 = new q(this.f20014w, continuation, 8);
                qVar9.v = obj2;
                return qVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((DisclaimerParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((q) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fzg.g gVarN;
        int i = this.u;
        int i2 = 0;
        com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar = this.f20014w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95123w, new byi.i(data, 7));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95123w, new byi.i(data2, 8));
                return Unit.f186387a;
            case 2:
                DisclaimerParams disclaimerParams = (DisclaimerParams) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95123w, new r(disclaimerParams, 0));
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95123w, new byi.i(data3, 9));
                return Unit.f186387a;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95123w, new byi.i(data4, 10));
                return Unit.f186387a;
            case 5:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data5 = (Data) hVar.f288433a;
                Data data6 = (Data) hVar.f288434b;
                vyg.f fVar = (vyg.f) hVar.f288435c;
                fzg.f fVar2 = (fzg.f) hVar.d;
                if (fVar2 != null) {
                    com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar8 = this.f20014w;
                    aVar8.H2(aVar8.f95123w, new a5b.a(aVar8, data5, data6, fVar, fVar2, 5));
                }
                return Unit.f186387a;
            case 6:
                cli.y yVar = aVar.f95123w;
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object e = popupMenuItem.getF55191g();
                if (e instanceof vyg.f) {
                    aVar.H2(yVar, new t((vyg.f) e, i2));
                } else if (e instanceof fzg.f) {
                    aVar.H2(yVar, new t((fzg.f) e, 1));
                }
                return Unit.f186387a;
            case 7:
                Data data7 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95123w, new byi.i(data7, 11));
                return Unit.f186387a;
            default:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data8 = (Data) rVar.f314201a;
                fzg.e eVar = (fzg.e) rVar.f314202b;
                Pair pair = (Pair) rVar.f314203c;
                try {
                    Object content = data8.getContent();
                    if (content != null) {
                        aVar.o.getClass();
                        gVarN = ou5.b.n(ou5.b.o((List) content, eVar, pair));
                    } else {
                        gVarN = null;
                    }
                    return new Data(gVarN, data8.getError(), data8.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data8.getLoading());
                }
        }
    }
}
