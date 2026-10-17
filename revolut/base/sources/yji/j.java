package yji;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.q implements Function1 {
    public j(eim.c cVar) {
        super(1, 1, eim.b.class, cVar, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        aii.r p0 = (aii.r) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Continuation continuation = (Continuation) this.receiver;
        m.Companion companion = yhm.m.INSTANCE;
        continuation.resumeWith(p0);
        return Unit.f186387a;
    }
}
