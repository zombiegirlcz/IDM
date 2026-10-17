package nyd;

import android.net.Uri;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlowContract$Step;
import com.revolut.feature.product.onboarding.domain.models.DeclarationValue;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.ui.auth.n;
import igk.y;
import igk.z;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mod.p;
import o55.w;
import om4.h3;
import om4.k0;
import ood.q0;
import skm.e0;
import skm.g0;
import skm.r;
import yhm.o;
import yki.l;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f220856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f220857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f220858y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f220858y = obj2;
        this.f220857x = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r0.emit(r7, r13) != r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f220856w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.v
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L28
            if (r2 == r5) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            yhm.o.b(r14)
            goto L89
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L20:
            yhm.o.b(r14)
            goto L6a
        L24:
            yhm.o.b(r14)
            goto L46
        L28:
            yhm.o.b(r14)
            com.revolut.data.model.Data r7 = new com.revolut.data.model.Data
            od0.h r14 = od0.i.Companion
            r14.getClass()
            r11 = 2
            r12 = 0
            od0.i r8 = od0.i.f224256b
            r9 = 0
            r10 = 1
            r7.<init>(r8, r9, r10, r11, r12)
            r13.f220856w = r0
            r13.v = r5
            java.lang.Object r14 = r0.emit(r7, r13)
            if (r14 != r1) goto L46
            goto L88
        L46:
            java.lang.Object r14 = r13.f220857x
            om4.l r14 = (om4.l) r14
            dp4.e r14 = r14.f226624a
            java.lang.Object r2 = r13.f220858y
            yw4.p r2 = (yw4.p) r2
            java.lang.String r2 = r2.f317325a
            r13.f220856w = r0
            r13.v = r4
            r14.getClass()
            dp4.d r4 = new dp4.d
            r5 = 0
            r4.<init>(r14, r2, r6, r5)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r14, r4, r13)
            if (r14 != r1) goto L6a
            goto L88
        L6a:
            el4.h r14 = (el4.h) r14
            com.revolut.data.model.Data r7 = new com.revolut.data.model.Data
            od0.h r2 = od0.i.Companion
            r2.getClass()
            od0.i r8 = od0.h.a(r14)
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r13.f220856w = r6
            r13.v = r3
            java.lang.Object r14 = r0.emit(r7, r13)
            if (r14 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nyd.j.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r12 == r7) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f220857x
            r2 = r0
            om4.k0 r2 = (om4.k0) r2
            java.lang.Object r0 = r11.f220856w
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.v
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L25
            if (r1 == r9) goto L21
            if (r1 != r8) goto L19
            yhm.o.b(r12)
            goto L7a
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            yhm.o.b(r12)
            goto L3b
        L25:
            yhm.o.b(r12)
            al4.q r12 = r2.f226614c
            om4.y3 r12 = (om4.y3) r12
            kotlinx.coroutines.flow.Flow r12 = r12.h()
            r11.f220856w = r0
            r11.v = r9
            java.lang.Object r12 = vkm.q.x(r12, r11)
            if (r12 != r7) goto L3b
            goto L79
        L3b:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r1 = r11.f220858y
            r4 = r1
            yw4.f r4 = (yw4.f) r4
            java.util.ArrayList r10 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r12, r1)
            r10.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L51:
            boolean r1 = r12.hasNext()
            r5 = 0
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r12.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            nyd.j r1 = new nyd.j
            r6 = 24
            r1.<init>(r2, r3, r4, r5, r6)
            r3 = 3
            skm.h0 r1 = skm.e0.g(r0, r5, r5, r1, r3)
            r10.add(r1)
            goto L51
        L6f:
            r11.f220856w = r5
            r11.v = r8
            java.lang.Object r12 = skm.e0.h(r10, r11)
            if (r12 != r7) goto L7a
        L79:
            return r7
        L7a:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L8c
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8c
        L8a:
            r9 = r1
            goto La2
        L8c:
            java.util.Iterator r12 = r12.iterator()
        L90:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r12.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L90
        La2:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nyd.j.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (vkm.q.u(r1, r12, r11) == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r1.emit(r5, r11) == r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f220858y
            om4.h3 r0 = (om4.h3) r0
            java.lang.Object r1 = r11.f220856w
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r11.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L28
            if (r3 == r6) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            yhm.o.b(r12)
            goto L7c
        L24:
            yhm.o.b(r12)
            goto L3e
        L28:
            yhm.o.b(r12)
            java.lang.Object r12 = r11.f220857x
            java.lang.String r12 = (java.lang.String) r12
            r11.f220856w = r1
            r11.v = r6
            om4.k0 r3 = r0.f226596b
            yw4.f r6 = yw4.f.MSI_SHOPS_VIEW
            java.lang.Object r12 = r3.b(r12, r6, r11)
            if (r12 != r2) goto L3e
            goto L7b
        L3e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r3 = 0
            if (r12 == 0) goto L66
            dp4.k0 r12 = r0.f226595a
            r12.getClass()
            java.lang.String r0 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            x4l.c r12 = r12.d
            cp4.d0 r0 = cp4.d0.f107789a
            vkm.d r12 = r12.b(r0, r4)
            r11.f220856w = r3
            r11.v = r5
            java.lang.Object r12 = vkm.q.u(r1, r12, r11)
            if (r12 != r2) goto L7c
            goto L7b
        L66:
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            zhm.f0 r6 = zhm.f0.f322471a
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f220856w = r3
            r11.v = r4
            java.lang.Object r12 = r1.emit(r5, r11)
            if (r12 != r2) goto L7c
        L7b:
            return r2
        L7c:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nyd.j.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2) {
        om8.c cVar = (om8.c) this.f220858y;
        CoroutineScope coroutineScope = (CoroutineScope) this.f220856w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        Continuation continuation = null;
        g0[] g0VarArr = {e0.g(coroutineScope, null, null, new nt4.f(cVar, continuation, 28), 3), e0.g(coroutineScope, null, null, new oh4.i(21, cVar, (String) this.f220857x, continuation), 3)};
        this.f220856w = null;
        this.v = 1;
        Object objI = e0.i(g0VarArr, this);
        return objI == aVar ? aVar : objI;
    }

    private final Object p(Object obj2) {
        Trip trip = (Trip) this.f220857x;
        CategorisationFilter categorisationFilter = (CategorisationFilter) this.f220858y;
        q0 q0Var = (q0) this.f220856w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            ol8.e eVar = new ol8.e(q0Var, categorisationFilter, null, 3);
            this.v = 1;
            obj2 = q0Var.p2(this, eVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return q0Var.l1().M0(new p(trip, q0Var.I2(trip.f99263a), categorisationFilter, (List) obj2));
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((k) this.f220856w, (String) this.f220857x, (String) this.f220858y, continuation, 0);
            case 1:
                j jVar = new j((com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) this.f220857x, (o17.j) this.f220858y, continuation, 1);
                jVar.f220856w = obj2;
                return jVar;
            case 2:
                j jVar2 = new j((r) this.f220858y, continuation, 2);
                jVar2.f220857x = obj2;
                return jVar2;
            case 3:
                return new j(3, (o55.b) this.f220858y, (String) this.f220857x, continuation);
            case 4:
                return new j((w) this.f220856w, (String) this.f220857x, (String) this.f220858y, continuation, 4);
            case 5:
                return new j((o6e.b) this.f220856w, (String) this.f220857x, (List) this.f220858y, continuation, 5);
            case 6:
                return new j((String) this.f220857x, (o7e.k) this.f220856w, this.f220858y, continuation);
            case 7:
                return new j((oa4.e) this.f220856w, (m90.a) this.f220857x, (DropOutFormFlowContract$Step) this.f220858y, continuation, 7);
            case 8:
                return new j((com.revolut.feature.onboarding.impl.onboarding.plan_selection.a) this.f220857x, (z) this.f220858y, continuation, 8);
            case 9:
                return new j((com.revolut.feature.onboarding.impl.onboarding.plan_selection.a) this.f220857x, (y) this.f220858y, continuation, 9);
            case 10:
                return new j((com.revolut.feature.onboarding.impl.qes_terms.h) this.f220856w, (FeatureCommand) this.f220857x, (UserOnboardingNavigationProvider$UseCase) this.f220858y, continuation, 10);
            case 11:
                return new j((com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a) this.f220857x, (TermsScope) this.f220858y, continuation, 11);
            case 12:
                return new j((of6.e) this.f220858y, continuation, 12);
            case 13:
                return new j((of6.e) this.f220856w, (String) this.f220857x, (String) this.f220858y, continuation, 13);
            case 14:
                return new j((ohk.g) this.f220856w, (Function1) this.f220857x, (hha.d) this.f220858y, continuation, 14);
            case 15:
                j jVar3 = new j((com.revolut.feature.crypto.onboarding.impl.ui.eligibility.a) this.f220857x, (l) this.f220858y, continuation, 15);
                jVar3.f220856w = obj2;
                return jVar3;
            case 16:
                return new j((oja.a) this.f220856w, (String) this.f220857x, (String) this.f220858y, continuation, 16);
            case 17:
                return new j((oja.a) this.f220856w, (String) this.f220857x, (DeclarationValue) this.f220858y, continuation, 17);
            case 18:
                return new j((ok5.d) this.f220856w, (zm3.l) this.f220857x, (xi0.b) this.f220858y, continuation, 18);
            case 19:
                j jVar4 = new j((n) this.f220857x, (lni.i) this.f220858y, continuation, 19);
                jVar4.f220856w = obj2;
                return jVar4;
            case 20:
                return new j((n) this.f220856w, (Challenge) this.f220858y, (String) this.f220857x, continuation);
            case 21:
                j jVar5 = new j((n) this.f220858y, continuation, 21);
                jVar5.f220857x = obj2;
                return jVar5;
            case 22:
                return new j((oli.g) this.f220857x, (Uri) this.f220858y, continuation, 22);
            case 23:
                j jVar6 = new j((om4.l) this.f220857x, (yw4.p) this.f220858y, continuation, 23);
                jVar6.f220856w = obj2;
                return jVar6;
            case 24:
                return new j((k0) this.f220856w, (String) this.f220857x, (yw4.f) this.f220858y, continuation, 24);
            case 25:
                j jVar7 = new j((k0) this.f220857x, (yw4.f) this.f220858y, continuation, 25);
                jVar7.f220856w = obj2;
                return jVar7;
            case 26:
                j jVar8 = new j(26, (h3) this.f220858y, (String) this.f220857x, continuation);
                jVar8.f220856w = obj2;
                return jVar8;
            case 27:
                j jVar9 = new j(27, (om8.c) this.f220858y, (String) this.f220857x, continuation);
                jVar9.f220856w = obj2;
                return jVar9;
            case 28:
                return new j((q0) this.f220856w, (Trip) this.f220857x, (CategorisationFilter) this.f220858y, continuation, 28);
            default:
                return new j((lal.a) this.f220857x, (wj0.b) this.f220858y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0a28  */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r9v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nyd.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Challenge challenge, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 20;
        this.f220856w = nVar;
        this.f220858y = challenge;
        this.f220857x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220856w = obj2;
        this.f220857x = obj3;
        this.f220858y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220857x = obj2;
        this.f220858y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220858y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, o7e.k kVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f220857x = str;
        this.f220856w = kVar;
        this.f220858y = obj2;
    }
}
