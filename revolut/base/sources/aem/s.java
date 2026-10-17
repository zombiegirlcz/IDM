package aem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ vdm.b A;
    public Object u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f3771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3772x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3773y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(vdm.b bVar, Continuation continuation) {
        super(3, continuation);
        this.A = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        s sVar = new s(this.A, (Continuation) obj4);
        sVar.f3773y = (sem.f) obj2;
        sVar.z = (hem.d) obj3;
        return sVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0375, code lost:
    
        if (r2 == r3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03ca, code lost:
    
        if (r2 != r3) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fb, code lost:
    
        if (r2 == r3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0151, code lost:
    
        if (r2 != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01da, code lost:
    
        if (r2 != r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023d, code lost:
    
        if (r2 == r3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026e, code lost:
    
        if (r2 == r3) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aem.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
