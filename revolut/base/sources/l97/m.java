package l97;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ z87.f A;
    public o97.j0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f193082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f193083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f193084y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Function1 function1, n nVar, z87.f fVar, Continuation continuation) {
        super(2, continuation);
        this.f193084y = function1;
        this.z = nVar;
        this.A = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.f193084y, this.z, this.A, continuation);
        mVar.f193083x = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (lg0.b.x1(r0, r1, null, null, r21, 6) == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (nim.a.a(r0, r11) == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:
    
        if (l97.n.J2(r0, r2, r8, r4, r11) == r6) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean, int] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l97.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
