package cie;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f24466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ cm2.i f24467x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, boolean z, cm2.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f24466w = z;
        this.f24467x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d1(this.v, this.f24466w, this.f24467x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.tab.accounts.impl.ui.tab.d r0 = r8.v
            cli.h r1 = r0.i0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 3
            r5 = 1
            r6 = r4
            r4 = 0
            if (r3 == 0) goto L1c
            if (r3 != r5) goto L14
            yhm.o.b(r9)
            goto L47
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            yhm.o.b(r9)
            skm.a2 r9 = r0.f89706o0
            if (r9 == 0) goto L26
            r9.f(r4)
        L26:
            r0.f89706o0 = r4
            java.lang.Object r9 = r1.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State r9 = (com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State) r9
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r9 = r9.k
            if (r9 != 0) goto L49
            kotlinx.coroutines.flow.Flow r9 = r0.M2()
            jhi.b r9 = mo3.a.g(r9, r4, r4, r6)
            r8.u = r5
            java.lang.Object r9 = vkm.q.x(r9, r8)
            if (r9 != r2) goto L47
            return r2
        L47:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r9 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value) r9
        L49:
            r2 = r9
            boolean r9 = r8.f24466w
            cm2.i r3 = r8.f24467x
            if (r9 == 0) goto L85
            java.lang.Object r9 = r1.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State r9 = (com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State) r9
            com.revolut.data.model.Data r9 = r9.f89686c
            java.lang.Object r9 = r9.getContent()
            java.util.List r9 = (java.util.List) r9
            com.revolut.feature.tab.accounts.api.model.AccountContent r9 = com.revolut.feature.tab.accounts.impl.ui.tab.d.L2(r9, r2)
            if (r9 == 0) goto L71
            com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem r9 = r9.f89475b
            if (r9 == 0) goto L71
            com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r9 = r9.getF89505g()
            goto L72
        L71:
            r9 = r4
        L72:
            com.revolut.kompot.navigable.vc.modal.a r0 = r0.p0
            if (r9 == 0) goto L7a
            com.revolut.feature.backgroundpicker.models.RetailBackgroundKey r4 = age.b.e(r2, r9)
        L7a:
            com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$ModalStep$BackgroundModification r9 = new com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$ModalStep$BackgroundModification
            r9.<init>(r4, r3)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r1 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r0, r9, r1)
            goto Lc1
        L85:
            cli.h r9 = r0.i0
            cge.g r1 = new cge.g
            r7 = 21
            r1.<init>(r7)
            kotlinx.coroutines.flow.Flow r9 = r9.B(r1)
            jhi.b r9 = mo3.a.g(r9, r4, r4, r6)
            ahd.y r1 = new ahd.y
            r7 = 12
            r1.<init>(r9, r0, r2, r7)
            c9k.k r9 = new c9k.k
            r7 = 2
            r9.<init>(r6, r7, r4)
            zhm.h0 r6 = zhm.h0.f322473a
            vkm.y r9 = rd0.e.e(r1, r6, r9)
            kq.g r9 = vkm.q.P(r9, r5)
            r1 = r0
            a9h.a r0 = new a9h.a
            r5 = 4
            r0.<init>(r1, r2, r3, r4, r5)
            r5 = 3
            r2 = 0
            r3 = 0
            r4 = r0
            r0 = r1
            r1 = r9
            skm.a2 r9 = yji.l.a1(r0, r1, r2, r3, r4, r5)
            r1 = r0
            r1.f89706o0 = r9
        Lc1:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cie.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
