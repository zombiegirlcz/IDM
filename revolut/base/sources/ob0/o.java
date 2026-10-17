package ob0;

import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f223834w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f223834w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.f223834w, continuation);
        oVar.v = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DropDownItem dropDownItem;
        List list;
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.f223834w;
            f fVar = obj3 instanceof f ? (f) obj3 : null;
            Data data = (fVar == null || (dropDownItem = fVar.f223820a) == null || (list = dropDownItem.e) == null) ? new Data(null, new IllegalArgumentException(v0.a.h(obj3, "Unknown params ", ". Add DropDownOptionPickerParams to PickerControllerContract.InputData.params field")), false, 5, null) : zi0.c.P(list, false, null, 3);
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
