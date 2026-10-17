package aem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class i1 extends kotlin.jvm.internal.a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objC = ((sem.f) this.receiver).c((Continuation) obj2);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : Unit.f186387a;
    }
}
