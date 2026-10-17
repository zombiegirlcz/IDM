package vu1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f292198w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f292198w = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f292198w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            vu1.h r0 = r10.v
            com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.TermsScreenContract$InputData r1 = r0.f292199p
            cli.y r2 = r0.f292200q
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r10.u
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L1c
            if (r4 != r6) goto L14
            yhm.o.b(r11)
            goto L6a
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            yhm.o.b(r11)
            java.lang.Object r11 = r2.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            vu1.d r11 = (vu1.d) r11
            com.revolut.data.model.Data r11 = r11.f292191a
            java.lang.Object r11 = r11.getContent()
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L6c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r4 = new java.util.ArrayList
            r7 = 10
            int r7 = zhm.w.t(r11, r7)
            r4.<init>(r7)
            java.util.Iterator r11 = r11.iterator()
        L44:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L61
            java.lang.Object r7 = r11.next()
            com.revolut.feature.terms.api.model.Terms r7 = (com.revolut.feature.terms.api.model.Terms) r7
            vnl.o r8 = new vnl.o
            r9 = 6
            r8.<init>(r0, r7, r5, r9)
            r7 = 3
            kotlinx.coroutines.CoroutineScope r9 = r10.f292198w
            skm.h0 r7 = skm.e0.g(r9, r5, r5, r8, r7)
            r4.add(r7)
            goto L44
        L61:
            r10.u = r6
            java.lang.Object r11 = skm.e0.h(r4, r10)
            if (r11 != r3) goto L6a
            return r3
        L6a:
            java.util.List r11 = (java.util.List) r11
        L6c:
            java.lang.Object r11 = r2.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            vu1.d r11 = (vu1.d) r11
            int r11 = r11.f292192b
            java.util.ArrayList r3 = r1.f61695a
            int r3 = zhm.v.j(r3)
            if (r11 != r3) goto L86
            vu1.e$a r11 = vu1.e.a.f292194a
            r0.C2(r11)
            goto Lb5
        L86:
            java.lang.Object r11 = r2.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            vu1.d r11 = (vu1.d) r11
            int r11 = r11.f292192b
            int r11 = r11 + r6
            abf.n r3 = new abf.n
            r4 = 29
            r3.<init>(r11, r0, r4)
            r0.H2(r2, r3)
            java.util.ArrayList r1 = r1.f61695a
            java.lang.Object r11 = r1.get(r11)
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms r11 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms) r11
            vnl.o r1 = new vnl.o
            r2 = 5
            r1.<init>(r0, r11, r5, r2)
            yi5.b r11 = new yi5.b
            r2 = 26
            r11.<init>(r2)
            r0.l2(r1, r11)
        Lb5:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vu1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
