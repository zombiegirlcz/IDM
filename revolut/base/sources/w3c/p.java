package w3c;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopAccount;
import d3c.b0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vo8.i0;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolut_shop.ui.screen.checkout.a f294290w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f294290w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f294290w, continuation);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(1, this.f294290w, continuation);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(2, this.f294290w, continuation);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        Data data2;
        RevolutShopAccount revolutShopAccountL;
        int i = this.u;
        com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar = this.f294290w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data3 = (Data) pair.f186385a;
                Data data4 = (Data) pair.f186386b;
                try {
                    Object content = data3.getContent();
                    data = new Data(content != null ? ebm.a.d((b0) content) : null, data3.getError(), data3.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                String str = (String) aVar.f84228r.f211979b.f180658a.get("SELECTED_ACCOUNT_ID_KEY");
                Data dataT = t1.t(data4, data);
                try {
                    Object content2 = dataT.getContent();
                    if (content2 != null) {
                        Pair pair2 = (Pair) content2;
                        revolutShopAccountL = ebm.a.l((dj0.d) pair2.f186386b, str, (List) pair2.f186385a);
                    } else {
                        revolutShopAccountL = null;
                    }
                    data2 = new Data(revolutShopAccountL, dataT.getError(), dataT.getLoading());
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, dataT.getLoading());
                }
                aVar.H2(aVar.f84231w, new afg.h(15, data3, data4, data2));
                break;
            case 1:
                Data data5 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f84231w, new i0(data5, 24));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f84231w, new i0(data6, 25));
                break;
        }
        return Unit.f186387a;
    }
}
