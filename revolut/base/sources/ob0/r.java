package ob0;

import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f223839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f223839w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.f223839w, continuation);
        rVar.v = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        PhoneInputItem phoneInputItem;
        List list;
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.f223839w;
            t tVar = obj3 instanceof t ? (t) obj3 : null;
            if (tVar == null || (phoneInputItem = tVar.f223841a) == null || (list = phoneInputItem.i) == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(v0.a.h(obj3, "Unsupported params ", ". Country list is null"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "FormPhoneCodePickerControllerInteractor", null, illegalArgumentException, h0Var);
                data = new Data(null, illegalArgumentException, false, 5, null);
            } else {
                data = zi0.c.P(list, false, null, 3);
            }
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(data, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
