package f33;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function1 {
    public dj0.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f131881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f131882x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d93.b f131883y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, d93.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f131882x = hVar;
        this.f131883y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f131882x, this.f131883y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013d, code lost:
    
        if (r6 == r0) goto L31;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f33.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
