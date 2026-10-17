package nnb;

import com.revolut.feature.retail.savings.impl.documents.presentation.statements.account_selection.SavingsSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SavingsSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SavingsSelectionScreen savingsSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = savingsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        r2.add(r5.f217497a);
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            com.revolut.feature.retail.savings.impl.documents.presentation.statements.account_selection.SavingsSelectionScreen r1 = r7.v
            switch(r0) {
                case 0: goto L93;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            nnb.h r8 = r1.d()
            nnb.o r8 = (nnb.o) r8
            cli.y r0 = r8.v
            java.lang.Object r1 = r0.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            nnb.f r1 = (nnb.f) r1
            com.revolut.data.model.Data r1 = r1.f217489a
            java.lang.Object r1 = r1.getContent()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L8b
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            nnb.f r0 = (nnb.f) r0
            java.util.Set r0 = r0.f217490b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = zhm.w.t(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L58:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r4.next()
            nnb.j r5 = (nnb.j) r5
            npg.j r6 = r5.f217497a
            java.lang.String r6 = r6.f218215a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r3)
            if (r6 == 0) goto L58
            npg.j r3 = r5.f217497a
            r2.add(r3)
            goto L45
        L74:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r8.<init>(r0)
            throw r8
        L7c:
            java.util.Set r0 = zhm.d0.i1(r2)
            cjb.a r1 = new cjb.a
            r1.<init>(r0)
            r8.C2(r1)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L8b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "DomainState#savingsAccounts should not be null when Cta is clicked"
            r8.<init>(r0)
            throw r8
        L93:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            nnb.h r8 = r1.d()
            nnb.o r8 = (nnb.o) r8
            r8.B2()
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nnb.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
