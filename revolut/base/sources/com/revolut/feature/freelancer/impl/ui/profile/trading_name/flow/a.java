package com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r9 == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
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
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 6
            com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b r3 = r8.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r9)
            goto L60
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            yhm.o.b(r9)
            goto L41
        L20:
            yhm.o.b(r9)
            et6.h1 r9 = r3.o
            efm.r r9 = r9.c()
            vkm.d r9 = rd0.e.b(r9)
            wyg.s r1 = new wyg.s
            r7 = 8
            r1.<init>(r7)
            jhi.b r9 = mo3.a.g(r9, r6, r1, r5)
            r8.u = r5
            java.lang.Object r9 = vkm.q.z(r9, r8)
            if (r9 != r0) goto L41
            goto L5f
        L41:
            com.revolut.feature.freelancer.common.models.FreelancerProfileSettings r9 = (com.revolut.feature.freelancer.common.models.FreelancerProfileSettings) r9
            if (r9 == 0) goto L48
            java.lang.String r9 = r9.f73328h
            goto L49
        L48:
            r9 = r6
        L49:
            if (r9 == 0) goto L53
            yki.i r9 = r3.f74070r
            com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.FreelancerTradingNameFlowContract$Step$ReviewPrompt r0 = com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.FreelancerTradingNameFlowContract$Step.ReviewPrompt.f74066a
            oki.h.u2(r3, r9, r0, r6, r2)
            goto L6c
        L53:
            jvh.a r9 = r3.f74069q
            java.lang.Object r1 = com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b.f74067s
            r8.u = r4
            java.lang.Object r9 = r9.b(r1, r8)
            if (r9 != r0) goto L60
        L5f:
            return r0
        L60:
            java.lang.String r9 = (java.lang.String) r9
            yki.i r0 = r3.f74070r
            com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.FreelancerTradingNameFlowContract$Step$ChangeRequest r1 = new com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.FreelancerTradingNameFlowContract$Step$ChangeRequest
            r1.<init>(r9)
            oki.h.u2(r3, r0, r1, r6, r2)
        L6c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
