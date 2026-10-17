package ob0;

import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f223828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f223829x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f223829x = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f223829x, continuation, 0);
                kVar.f223828w = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f223829x, continuation, 1);
                kVar2.f223828w = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(this.f223829x, continuation, 2);
                kVar3.f223828w = obj2;
                return kVar3;
            case 3:
                return new k(this.f223828w, this.f223829x, continuation, 3);
            default:
                return new k(this.f223828w, this.f223829x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CountrySelectionItem countrySelectionItem;
        List list;
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f223828w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Object obj3 = this.f223829x;
                    c cVar = obj3 instanceof c ? (c) obj3 : null;
                    Data data = (cVar == null || (countrySelectionItem = cVar.f223815a) == null || (list = countrySelectionItem.d) == null) ? new Data(null, new IllegalStateException(v0.a.h(obj3, "Unknown params ", ". Add CountryPickerParams to PickerControllerContract.InputData.params field")), false, 5, null) : zi0.c.P(list, false, null, 3);
                    this.f223828w = null;
                    this.v = 1;
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
            case 1:
                FlowCollector flowCollector2 = (FlowCollector) this.f223828w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Object obj4 = this.f223829x;
                    e eVar = obj4 instanceof e ? (e) obj4 : null;
                    Data dataP = eVar != null ? zi0.c.P(eVar.f223819b, false, null, 3) : new Data(null, new IllegalStateException(v0.a.h(obj4, "Unknown params ", ". Add CurrencyPickerParams to PickerScreenContract.InputData.params field")), false, 5, null);
                    this.f223828w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                oji.i iVar = (oji.i) this.f223828w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    if (iVar != null && !iVar.f225799b.get()) {
                        Object obj5 = iVar.f225798a;
                        this.f223828w = iVar;
                        this.v = 1;
                        if (this.f223829x.invoke(obj5, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                iVar.f225799b.set(true);
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ?? r122 = this.f223828w;
                this.v = 1;
                Object objInvoke = r122.invoke(this.f223829x, this);
                return objInvoke == aVar4 ? aVar4 : objInvoke;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    ?? r123 = this.f223828w;
                    this.v = 1;
                    if (r123.invoke(this.f223829x, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Function2 function2, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f223828w = function2;
        this.f223829x = obj2;
    }
}
