package z3a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a f319234w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f319234w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f319234w, continuation, 0);
            default:
                return new k(this.f319234w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.u
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.v
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L36
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            wm3.j r7 = new wm3.j
            r1 = 25
            com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a r3 = r6.f319234w
            r4 = 0
            r7.<init>(r3, r4, r1)
            r6.v = r2
            tji.f r1 = r3.X()
            java.lang.String r2 = "PRIMARY_BUTTON_TAG"
            java.lang.Object r7 = zh9.u0.b0(r1, r2, r7, r6)
            if (r7 != r0) goto L36
            goto L38
        L36:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L38:
            return r0
        L39:
            com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a r0 = r6.f319234w
            cl3.a r1 = r0.f80115p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L59
            if (r3 == r5) goto L55
            if (r3 != r4) goto L4d
            yhm.o.b(r7)
            goto L86
        L4d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L55:
            yhm.o.b(r7)
            goto L77
        L59:
            yhm.o.b(r7)
            r7 = r1
            wl3.h r7 = (wl3.h) r7
            fl3.a r7 = r7.f298380a
            sl3.k r7 = (sl3.k) r7
            efm.r r7 = r7.f264121n
            efm.b r7 = r7.ignoreElements()
            java.lang.String r3 = "ignoreElements(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
            r6.v = r5
            java.lang.Object r7 = nim.a.a(r7, r6)
            if (r7 != r2) goto L77
            goto Laa
        L77:
            wl3.h r1 = (wl3.h) r1
            ufm.i r7 = r1.e()
            r6.v = r4
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r2) goto L86
            goto Laa
        L86:
            java.util.Set r7 = (java.util.Set) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            java.lang.String r1 = "PRIMARY_BUTTON_TAG"
            if (r7 != 0) goto La0
            z3a.f r7 = new z3a.f
            java.lang.String r2 = "buttonTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r7.<init>()
            goto La5
        La0:
            z3a.g r7 = new z3a.g
            r7.<init>(r1)
        La5:
            r0.C2(r7)
            kotlin.Unit r2 = kotlin.Unit.f186387a
        Laa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z3a.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
