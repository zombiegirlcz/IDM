package np8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ dp8.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b f218167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f218168x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dp8.b bVar, com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar2, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f218167w = bVar2;
        this.f218168x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f218167w, this.f218168x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d9, code lost:
    
        if (r2 == r4) goto L64;
     */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np8.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
