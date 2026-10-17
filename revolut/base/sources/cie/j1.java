package cie;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends gim.i implements Function2 {
    public final /* synthetic */ ProductAccountDescriptor$Value A;
    public List u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f24494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f24495y;
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(List list, boolean z, com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, Continuation continuation) {
        super(2, continuation);
        this.f24494x = list;
        this.f24495y = z;
        this.z = dVar;
        this.A = productAccountDescriptor$Value;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j1 j1Var = new j1(this.f24494x, this.f24495y, this.z, this.A, continuation);
        j1Var.f24493w = obj2;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        if (r11.collect(r2, r10) == r1) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f24493w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.v
            r3 = 2
            r4 = 1
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r5 = r10.A
            com.revolut.feature.tab.accounts.impl.ui.tab.d r6 = r10.z
            r7 = 0
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L26
            if (r2 != r3) goto L1e
            java.util.List r0 = r10.u
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r11)
            goto Lb3
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            java.util.List r2 = r10.u
            java.util.List r2 = (java.util.List) r2
            yhm.o.b(r11)
            goto L82
        L2e:
            yhm.o.b(r11)
            java.util.List r11 = r10.f24494x
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L5c
            cli.h r11 = r6.i0
            java.lang.Object r11 = r11.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State r11 = (com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State) r11
            com.revolut.data.model.Data r11 = r11.f89686c
            java.lang.Object r11 = r11.getContent()
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L53
            zhm.f0 r11 = zhm.f0.f322471a
        L53:
            com.revolut.feature.tab.accounts.api.model.AccountContent r2 = com.revolut.feature.tab.accounts.impl.ui.tab.d.L2(r11, r5)
            if (r2 == 0) goto L5a
            goto L5c
        L5a:
            zhm.f0 r11 = zhm.f0.f322471a
        L5c:
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            boolean r11 = r10.f24495y
            if (r11 == 0) goto L82
            r11 = r2
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L82
            r11 = 0
            r8 = 3
            com.revolut.data.model.Data r11 = zi0.c.P(r2, r11, r7, r8)
            r10.f24493w = r0
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            r10.u = r8
            r10.v = r4
            java.lang.Object r11 = r0.emit(r11, r10)
            if (r11 != r1) goto L82
            goto Lb2
        L82:
            vge.d r11 = r6.f89711t
            vge.x r11 = (vge.x) r11
            kotlinx.coroutines.flow.Flow r11 = r11.e(r5)
            cie.t0 r4 = new cie.t0
            r8 = 14
            r4.<init>(r8, r6, r7)
            vkm.q0 r8 = new vkm.q0
            r9 = 1
            r8.<init>(r11, r4, r9)
            c7e.i r11 = new c7e.i
            r11.<init>(r2, r6, r5)
            akg.n r11 = nim.a.v(r8, r11)
            cie.i1 r2 = new cie.i1
            r4 = 0
            r2.<init>(r0, r4)
            r10.f24493w = r7
            r10.u = r7
            r10.v = r3
            java.lang.Object r11 = r11.collect(r2, r10)
            if (r11 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cie.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
