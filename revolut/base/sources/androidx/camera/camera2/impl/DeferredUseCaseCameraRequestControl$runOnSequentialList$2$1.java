package androidx.camera.camera2.impl;

import fim.a;
import gim.d;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1", f = "DeferredUseCaseCameraRequestControl.kt", l = {LDSFile.EF_DG12_TAG, LDSFile.EF_DG14_TAG}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1 extends i implements Function2<CoroutineScope, Continuation<Object>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ g0 $submissionJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1(g0 g0Var, int i, Continuation<? super DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1> continuation) {
        super(2, continuation);
        this.$submissionJob = g0Var;
        this.$index = i;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1(this.$submissionJob, this.$index, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            g0 g0Var = this.$submissionJob;
            this.label = 1;
            obj2 = g0Var.i(this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        List list = (List) obj2;
        if (this.$index >= list.size()) {
            return null;
        }
        g0 g0Var2 = (g0) list.get(this.$index);
        this.label = 2;
        Object objI = g0Var2.i(this);
        return objI == aVar ? aVar : objI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
