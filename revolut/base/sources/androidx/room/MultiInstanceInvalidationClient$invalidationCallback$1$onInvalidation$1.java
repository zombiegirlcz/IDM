package androidx.room;

import gim.d;
import gim.i;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
@d(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String[] $tables;
    Object L$0;
    int label;
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(String[] strArr, MultiInstanceInvalidationClient multiInstanceInvalidationClient, Continuation<? super MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1> continuation) {
        super(2, continuation);
        this.$tables = strArr;
        this.this$0 = multiInstanceInvalidationClient;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(this.$tables, this.this$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set<String> set;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            String[] strArr = this.$tables;
            Object[] elements = Arrays.copyOf(strArr, strArr.length);
            Intrinsics.checkNotNullParameter(elements, "elements");
            Set<String> setY0 = kotlin.collections.d.y0(elements);
            MutableSharedFlow mutableSharedFlow = this.this$0.invalidatedTables;
            this.L$0 = setY0;
            this.label = 1;
            if (mutableSharedFlow.emit(setY0, this) == aVar) {
                return aVar;
            }
            set = setY0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) this.L$0;
            o.b(obj2);
        }
        this.this$0.getInvalidationTracker().notifyObserversByTableNames$room_runtime_release(set);
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
