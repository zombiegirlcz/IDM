package cea;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function1 {
    public com.revolut.feature.pockets.impl.details_v2.linked_account_details.a u;
    public com.revolut.feature.pockets.impl.details_v2.linked_account_details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.linked_account_details.a f23462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f23463y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f23462x = aVar;
        this.f23463y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.f23462x, this.f23463y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r12 != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        if (r12 != r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cea.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
