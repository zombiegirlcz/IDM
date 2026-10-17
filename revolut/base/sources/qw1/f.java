package qw1;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function1 {
    public Alias u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f249738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f249739x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.f249738w = gVar;
        this.f249739x = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f249738w, this.f249739x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r8 == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ed, code lost:
    
        if (skm.e0.h(r4, r28) != r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf A[LOOP:0: B:27:0x00c9->B:29:0x00cf, LOOP_END] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
