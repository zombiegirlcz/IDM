package ga9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 extends gim.i implements Function1 {
    public boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function2 f142091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f142092y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.feature.onboarding.impl.onboarding.v vVar, Function2 function2, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f142090w = vVar;
        this.f142091x = function2;
        this.f142092y = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l0(this.f142090w, this.f142091x, this.f142092y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x022a, code lost:
    
        if (r10 == r0) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga9.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
