package s32;

import com.revolut.feature.apm.core.ui.impl.ui.qr.pager.QrFlow;
import e60.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rvc.k;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ QrFlow f259397w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(QrFlow qrFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259397w = qrFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f259397w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f259397w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        QrFlow qrFlow = this.f259397w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE3 = qrFlow.e3();
                Intrinsics.h(id10);
                com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a) dVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                aVar2.H2(aVar2.f62375q, new k(id10, 4));
                break;
            default:
                String id11 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE32 = qrFlow.e3();
                Intrinsics.h(id11);
                com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a aVar4 = (com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a) dVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if (id11.equals("ID_MENU_ITEM_UPLOAD")) {
                    ((s) aVar4.f62374p).T(new e60.i(null, null, null, true, 0, 0, null, null, false, null, null, 16375));
                }
                break;
        }
        return Unit.f186387a;
    }
}
