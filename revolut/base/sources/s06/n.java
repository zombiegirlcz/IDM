package s06;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jf0.c f258867w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, jf0.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f258867w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f258867w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 0
            s06.o r3 = r5.v
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L10
            yhm.o.b(r6)
            goto L2c
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            yhm.o.b(r6)
            onh.b r6 = r3.f258871g
            r5.u = r4
            java.lang.Object r6 = r6.f226950b
            mfa.b r6 = (mfa.b) r6
            mfa.a r6 = r6.f204967a
            java.lang.Object r6 = r6.b(r2, r5)
            if (r6 != r0) goto L2c
            return r0
        L2c:
            gfa.a r6 = (gfa.a) r6
            gfa.a$d r0 = gfa.a.d.f143374a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            if (r6 != 0) goto L67
            jf0.c r6 = r5.f258867w
            java.lang.String r0 = r6.e(r4)
            java.lang.String r1 = "chat"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L67
            r3.getClass()
            java.lang.String r0 = r6.e(r4)
            java.lang.String r1 = "kyc"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 == 0) goto L61
            r0 = 2
            java.lang.String r0 = r6.e(r0)
            java.lang.String r1 = "uae_pass"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 == 0) goto L61
            goto L67
        L61:
            boolean r6 = s06.o.c(r6)
            if (r6 == 0) goto L68
        L67:
            r2 = r4
        L68:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s06.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
