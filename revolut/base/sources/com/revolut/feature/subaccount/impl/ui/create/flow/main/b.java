package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r9 == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (com.revolut.feature.subaccount.impl.ui.create.flow.main.c.J2(r0, (com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.Config) r9, r1, r3, r8) != r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a A[PHI: r9
      0x008a: PHI (r9v20 java.lang.Object) = (r9v14 java.lang.Object), (r9v0 java.lang.Object) binds: [B:37:0x0087, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.subaccount.impl.ui.create.flow.main.c r0 = r8.v
            com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L2a
            if (r3 == r6) goto L26
            if (r3 == r5) goto L21
            if (r3 != r4) goto L19
            yhm.o.b(r9)
            goto La2
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            yhm.o.b(r9)
            goto L8a
        L26:
            yhm.o.b(r9)
            goto L48
        L2a:
            yhm.o.b(r9)
            java.util.Set r9 = r1.f89015a
            if (r9 == 0) goto L3a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = zhm.d0.c0(r9)
            com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType r9 = (com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType) r9
            goto L3b
        L3a:
            r9 = r7
        L3b:
            boolean r9 = r9 instanceof com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType.Joint
            if (r9 == 0) goto L5a
            r8.u = r6
            java.lang.Object r9 = com.revolut.feature.subaccount.impl.ui.create.flow.main.c.I2(r0, r8)
            if (r9 != r2) goto L48
            goto La1
        L48:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L5a
            yki.i r9 = r0.f89043y
            com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$Step$PendingJointAccount r0 = com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$Step.PendingJointAccount.f89026a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r9, r0, r1)
            goto La2
        L5a:
            t7e.k r9 = r0.v
            com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig r3 = r1.f89016b
            java.util.Set r1 = r1.f89015a
            r8.u = r5
            r9.getClass()
            boolean r5 = r3 instanceof com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.StartWithArticle
            if (r5 == 0) goto L6e
            com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$StartWithArticle r3 = (com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.StartWithArticle) r3
            com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$Config r9 = r3.f88932a
            goto L87
        L6e:
            boolean r5 = r3 instanceof com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.ResolveBySubaccountType
            if (r5 == 0) goto L79
            com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$ResolveBySubaccountType r3 = (com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.ResolveBySubaccountType) r3
            java.lang.Object r9 = r9.a(r3, r1, r8)
            goto L87
        L79:
            boolean r9 = r3 instanceof com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.ShowArticlePerSubaccount
            if (r9 != 0) goto L86
            if (r3 != 0) goto L80
            goto L86
        L80:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L86:
            r9 = r7
        L87:
            if (r9 != r2) goto L8a
            goto La1
        L8a:
            com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$Config r9 = (com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.Config) r9
            t7e.c r1 = new t7e.c
            r3 = 4
            r1.<init>(r0, r3)
            sii.a r3 = new sii.a
            r5 = 22
            r3.<init>(r0, r5)
            r8.u = r4
            java.lang.Object r9 = com.revolut.feature.subaccount.impl.ui.create.flow.main.c.J2(r0, r9, r1, r3, r8)
            if (r9 != r2) goto La2
        La1:
            return r2
        La2:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.create.flow.main.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
