package ok5;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        ((MutableSharedFlow) this.receiver).k(bool);
        return Unit.f186387a;
    }
}
