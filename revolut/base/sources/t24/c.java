package t24;

import com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ CoBorrower v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f267415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f267416x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CoBorrower coBorrower, d dVar, h1 h1Var, Continuation continuation) {
        super(2, continuation);
        this.v = coBorrower;
        this.f267415w = dVar;
        this.f267416x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f267415w, this.f267416x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r1.postExternalCoBorrowerConsent(r3, r4, r9) == r0) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrowerActiveApplicationException {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            r2 = 3
            r3 = 2
            r4 = 1
            t24.d r5 = r9.f267415w
            if (r1 == 0) goto L21
            if (r1 == r4) goto L11
            if (r1 == r3) goto L11
            if (r1 != r2) goto L19
        L11:
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L16
            goto L93
        L16:
            r10 = move-exception
            goto L9c
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            yhm.o.b(r10)
            com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower r10 = r9.v     // Catch: java.lang.Throwable -> L16
            boolean r1 = r10 instanceof com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower.InternalPhone     // Catch: java.lang.Throwable -> L16
            java.lang.String r6 = "phoneNumber"
            r7 = 0
            ft3.h1 r8 = r9.f267416x
            if (r1 == 0) goto L4d
            com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService r1 = r5.f267418b     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r8.f137835a     // Catch: java.lang.Throwable -> L16
            g04.e$a r3 = g04.e.INSTANCE     // Catch: java.lang.Throwable -> L16
            com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower$InternalPhone r10 = (com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower.InternalPhone) r10     // Catch: java.lang.Throwable -> L16
            java.lang.String r10 = r10.f66323c     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r6)     // Catch: java.lang.Throwable -> L16
            g04.e r3 = new g04.e     // Catch: java.lang.Throwable -> L16
            r3.<init>(r10, r7)     // Catch: java.lang.Throwable -> L16
            r9.u = r4     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r1.postInternalCoBorrowerConsent(r2, r3, r9)     // Catch: java.lang.Throwable -> L16
            if (r10 != r0) goto L93
            goto L92
        L4d:
            boolean r1 = r10 instanceof com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower.InternalUsername     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L71
            com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService r1 = r5.f267418b     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r8.f137835a     // Catch: java.lang.Throwable -> L16
            g04.e$a r4 = g04.e.INSTANCE     // Catch: java.lang.Throwable -> L16
            com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower$InternalUsername r10 = (com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower.InternalUsername) r10     // Catch: java.lang.Throwable -> L16
            java.lang.String r10 = r10.f66326c     // Catch: java.lang.Throwable -> L16
            r4.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "username"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r4)     // Catch: java.lang.Throwable -> L16
            g04.e r4 = new g04.e     // Catch: java.lang.Throwable -> L16
            r4.<init>(r7, r10)     // Catch: java.lang.Throwable -> L16
            r9.u = r3     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r1.postInternalCoBorrowerConsent(r2, r4, r9)     // Catch: java.lang.Throwable -> L16
            if (r10 != r0) goto L93
            goto L92
        L71:
            boolean r1 = r10 instanceof com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower.ExternalPhone     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L96
            com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService r1 = r5.f267418b     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r8.f137835a     // Catch: java.lang.Throwable -> L16
            g04.e$a r4 = g04.e.INSTANCE     // Catch: java.lang.Throwable -> L16
            com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower$ExternalPhone r10 = (com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower.ExternalPhone) r10     // Catch: java.lang.Throwable -> L16
            java.lang.String r10 = r10.f66320c     // Catch: java.lang.Throwable -> L16
            r4.getClass()     // Catch: java.lang.Throwable -> L16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r6)     // Catch: java.lang.Throwable -> L16
            g04.e r4 = new g04.e     // Catch: java.lang.Throwable -> L16
            r4.<init>(r10, r7)     // Catch: java.lang.Throwable -> L16
            r9.u = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r1.postExternalCoBorrowerConsent(r3, r4, r9)     // Catch: java.lang.Throwable -> L16
            if (r10 != r0) goto L93
        L92:
            return r0
        L93:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L96:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L16
            r10.<init>()     // Catch: java.lang.Throwable -> L16
            throw r10     // Catch: java.lang.Throwable -> L16
        L9c:
            fn2.c r0 = r5.f267419c
            boolean r1 = r10 instanceof com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException
            if (r1 == 0) goto La8
            r1 = r10
            com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException r1 = (com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException) r1
            java.lang.Throwable r1 = r1.f66910a
            goto La9
        La8:
            r1 = r10
        La9:
            java.lang.Object r0 = r0.f136517b
            sf0.h r0 = (sf0.h) r0
            com.revolut.core.error.data.model.ServerError r0 = r0.a(r1)
            if (r0 == 0) goto Lbc
            int r0 = r0.f51362a
            r1 = 32058(0x7d3a, float:4.4923E-41)
            if (r0 != r1) goto Lbc
            com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrowerActiveApplicationException r10 = com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrowerActiveApplicationException.f66327a
            throw r10
        Lbc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t24.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
