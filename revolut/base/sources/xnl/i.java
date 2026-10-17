package xnl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function1 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.passcode.change_flow.a f307522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ znl.c f307523x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.sso.impl.ui.passcode.change_flow.a aVar, znl.c cVar, Continuation continuation) {
        super(1, continuation);
        this.f307522w = aVar;
        this.f307523x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f307522w, this.f307523x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        if (((akl.e1) r2).g(r0, r1, null, r17) == r9) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[PHI: r0 r1 r11
      0x00d4: PHI (r0v26 java.lang.String) = (r0v25 java.lang.String), (r0v32 java.lang.String) binds: [B:37:0x00d1, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r1v10 java.lang.Object) = (r1v9 java.lang.Object), (r1v14 java.lang.Object) binds: [B:37:0x00d1, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r11v5 java.lang.String) = (r11v10 java.lang.String), (r11v9 java.lang.String) binds: [B:37:0x00d1, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xnl.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
