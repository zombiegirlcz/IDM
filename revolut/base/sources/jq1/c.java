package jq1;

import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.pay_bills_taxes.api.navigation.FormFlowInputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import xo1.g;
import yhm.o;
import zjh.j;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f177405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function0 f177406x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f177405w = str;
        this.f177406x = function0;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f177405w, this.f177406x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            j jVar = eVar.f177407l;
            this.u = 1;
            obj2 = ((vp1.c) ((wo1.b) jVar.f322839a)).a(this.f177405w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        yp1.b bVar = eVar.f177408m;
        String str = ((Bill) obj2).e;
        bVar.getClass();
        ViewController viewControllerO2 = eVar.o2(new ef9.e(new FormFlowInputData(g.F24, str)));
        jp3.b block = new jp3.b(eVar, this.f177406x, 5);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        return eVar.A2(new com.revolut.kompot.common.b(viewControllerO2, (ModalDestination.Style) null, 6));
    }
}
