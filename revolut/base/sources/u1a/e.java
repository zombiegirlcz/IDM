package u1a;

import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.SplitBillQrScreen;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SplitBillQrScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SplitBillQrScreen splitBillQrScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = splitBillQrScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SplitBillQrScreen splitBillQrScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                splitBillQrScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((j) splitBillQrScreen.P.getValue());
                SplitBillQrState splitBillQrState = (SplitBillQrState) ((f) ((j2) lVar.f276378r.f22677a).getValue()).f276369a.getContent();
                if (splitBillQrState instanceof SplitBillQrState.Expired) {
                    lVar.C2(h.f276372a);
                } else if (splitBillQrState instanceof SplitBillQrState.Shareable) {
                    String str = ((SplitBillQrState.Shareable) splitBillQrState).f79952a.f79940b;
                    nd.o oVar = lVar.f276376p;
                    String strO = a10.b.o(R.string.common_share, null, null, 14, lVar.f276377q);
                    oVar.getClass();
                    lVar.C1(u0.b(nd.o.i(strO, str)));
                } else {
                    if (splitBillQrState != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hx7.e.h(new IllegalArgumentException("onActionClick should not be called without loaded qrState"));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) ((j) splitBillQrScreen.P.getValue())).f276380t.a();
                return Unit.f186387a;
        }
    }
}
