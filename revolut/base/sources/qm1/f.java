package qm1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements nm1.c {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wo1.b f247750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f247751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.h f247752c;

    public f(wo1.b billsInteractor, xua.a recurringPaymentInteractor, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f247750a = billsInteractor;
        this.f247751b = recurringPaymentInteractor;
        this.f247752c = serverErrorParser;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
    
        if (nim.a.a(r8, r0) == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [qua.p] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qua.p r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qm1.e
            if (r0 == 0) goto L13
            r0 = r8
            qm1.e r0 = (qm1.e) r0
            int r1 = r0.f247749x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247749x = r1
            goto L18
        L13:
            qm1.e r0 = new qm1.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f247749x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2e:
            java.lang.Throwable r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L35
            goto Laf
        L35:
            r8 = move-exception
            goto Lb4
        L38:
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L3c
            goto L7e
        L3c:
            r7 = move-exception
            goto L8b
        L3e:
            yhm.o.b(r8)
            qua.n r8 = r7.Y
            r2 = 0
            if (r8 == 0) goto L49
            java.lang.String r5 = r8.f249306b
            goto L4a
        L49:
            r5 = r2
        L4a:
            if (r5 == 0) goto L59
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig r8 = new com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig
            r0 = 0
            r1 = 6
            r8.<init>(r5, r0, r2, r1)
            r7.<init>(r8)
            return r7
        L59:
            if (r8 == 0) goto L6f
            java.lang.String r8 = r8.f249307c
            if (r8 == 0) goto L6f
            java.lang.String r8 = jli.g.f(r8)
            if (r8 != 0) goto L66
            goto L6f
        L66:
            ibd.e r7 = r7.f249314a
            java.lang.String r7 = r7.f160150a
            ap1.a r2 = new ap1.a
            r2.<init>(r7, r8)
        L6f:
            if (r2 == 0) goto Lba
            wo1.b r7 = r6.f247750a     // Catch: java.lang.Throwable -> L3c
            r0.f247749x = r4     // Catch: java.lang.Throwable -> L3c
            vp1.c r7 = (vp1.c) r7     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r8 = r7.d(r2, r0)     // Catch: java.lang.Throwable -> L3c
            if (r8 != r1) goto L7e
            goto Lae
        L7e:
            com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult r8 = (com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult) r8     // Catch: java.lang.Throwable -> L3c
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.apm.bills.boleto.api.BoletoFeatureConfig$BoletoPayment r0 = new com.revolut.feature.apm.bills.boleto.api.BoletoFeatureConfig$BoletoPayment
            r0.<init>(r8)
            r7.<init>(r0)
            return r7
        L8b:
            sf0.h r8 = r6.f247752c
            com.revolut.core.error.data.model.ServerError r8 = r8.a(r7)
            if (r8 == 0) goto Lb9
            int r8 = r8.f51362a
            r2 = 57402(0xe03a, float:8.0437E-41)
            if (r8 != r2) goto Lb9
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L35
            xua.a r8 = r6.f247751b     // Catch: java.lang.Throwable -> L35
            yua.q r8 = (yua.q) r8     // Catch: java.lang.Throwable -> L35
            pfm.a r8 = r8.t(r4)     // Catch: java.lang.Throwable -> L35
            r0.u = r7     // Catch: java.lang.Throwable -> L35
            r0.f247749x = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = nim.a.a(r8, r0)     // Catch: java.lang.Throwable -> L35
            if (r8 != r1) goto Laf
        Lae:
            return r1
        Laf:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L35
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L35
            goto Lb9
        Lb4:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.o.a(r8)
        Lb9:
            throw r7
        Lba:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "RecurringPayment does not have bill details"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qm1.f.a(qua.p, gim.c):java.lang.Object");
    }
}
