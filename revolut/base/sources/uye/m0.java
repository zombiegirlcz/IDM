package uye;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f284303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f284304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f284305y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, AccountId.Joint joint, dj0.d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f284303w = joint;
        this.f284304x = dVar;
        this.f284305y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m0(this.v, this.f284303w, this.f284304x, this.f284305y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r0.c3(r10, r9) == r2) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.revolut.feature.topup_screen.impl.flows.topup.flow.i r0 = r9.v
            wsg.n r1 = r0.E
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.u
            dj0.d r4 = r9.f284304x
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L22
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L16
            yhm.o.b(r10)
            goto L62
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            yhm.o.b(r10)
            goto L57
        L22:
            yhm.o.b(r10)
            x8k.c r10 = r0.D
            com.revolut.core.model.account.AccountId$Joint r3 = r9.f284303w
            java.lang.String r7 = r3.f51412a
            java.lang.String r8 = r9.f284305y
            rfm.f0 r10 = r10.c(r4, r7, r8)
            pfm.h r7 = new pfm.h
            r8 = 4
            r7.<init>(r10, r8)
            com.revolut.core.model.account.AccountId$Personal r10 = com.revolut.core.model.account.AccountId.Personal.f51414a
            pfm.a r10 = r1.k0(r10)
            pfm.a r10 = r7.e(r10)
            pfm.a r1 = r1.k0(r3)
            pfm.a r10 = r10.e(r1)
            java.lang.String r1 = "andThen(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            r9.u = r6
            java.lang.Object r10 = nim.a.a(r10, r9)
            if (r10 != r2) goto L57
            goto L61
        L57:
            xi0.b r10 = r4.f115083b
            r9.u = r5
            java.lang.Object r10 = r0.c3(r10, r9)
            if (r10 != r2) goto L62
        L61:
            return r2
        L62:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uye.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
