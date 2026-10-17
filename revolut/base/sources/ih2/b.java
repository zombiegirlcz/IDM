package ih2;

import com.revolut.feature.apm.wero.impl.data.WeroPayService;
import dj0.d;
import gim.i;
import jh2.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f161286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f161287x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f161286w = dVar;
        this.f161287x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f161286w, this.f161287x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            WeroPayService weroPayService = this.v.f161288a;
            jo3.a aVarP = mo3.a.p(this.f161286w);
            String str = null;
            String str2 = this.f161287x;
            if (str2 != null && !d0.W(str2)) {
                str = str2;
            }
            jh2.o oVar = new jh2.o(aVarP, str);
            wj0.b bVar = new wj0.b("payments_wero_request_link");
            this.u = 1;
            obj2 = weroPayService.createMoneyRequest(oVar, bVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        p pVar = (p) obj2;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new jh2.a(pVar.getMoneyRequestId());
    }
}
