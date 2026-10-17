package eg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends gim.i implements Function2 {
    public int A;
    public final /* synthetic */ z0 B;
    public final /* synthetic */ r0 C;
    public d0 u;
    public z0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t0 f125500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public pd.g f125501x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0 f125502y;
    public ig.k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, r0 r0Var, Continuation continuation) {
        super(2, continuation);
        this.B = z0Var;
        this.C = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x0(this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
