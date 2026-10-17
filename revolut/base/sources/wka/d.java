package wka;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f298262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f298262w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f298262w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (((kka.h) r1).h(r14, r13) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (((kka.h) r1).h(r14, r13) == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            wka.h r0 = r13.f298262w
            kka.a r1 = r0.f298268r
            com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData r2 = r0.o
            boolean r3 = r0.f298266p
            java.lang.Object r4 = r13.v
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r13.u
            r7 = 0
            r8 = 0
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            if (r6 == 0) goto L36
            if (r6 == r12) goto L32
            if (r6 == r11) goto L2d
            if (r6 == r10) goto L29
            if (r6 != r9) goto L21
            goto L2d
        L21:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L29:
            yhm.o.b(r14)
            goto L7d
        L2d:
            yhm.o.b(r14)
            goto Lb9
        L32:
            yhm.o.b(r14)
            goto L46
        L36:
            yhm.o.b(r14)
            if (r3 != 0) goto L70
            r13.v = r4
            r13.u = r12
            java.lang.Object r14 = wka.h.J2(r0, r13)
            if (r14 != r5) goto L46
            goto L97
        L46:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L70
            boolean r14 = r2.f
            if (r14 != 0) goto L61
            yja.b r14 = yja.b.NOT_FOUND
            r13.v = r8
            r13.u = r11
            kka.h r1 = (kka.h) r1
            java.lang.Object r14 = r1.h(r14, r13)
            if (r14 != r5) goto Lb9
            goto L97
        L61:
            yja.b r14 = yja.b.NOT_FOUND
            skm.p0 r1 = skm.p0.f264001a
            tkm.e r1 = zkm.o.f323119a
            wka.e r2 = new wka.e
            r2.<init>(r0, r14, r8, r7)
            skm.e0.C(r4, r1, r8, r2, r11)
            goto Lb9
        L70:
            if (r3 != 0) goto La7
            r13.v = r4
            r13.u = r10
            java.lang.Object r14 = wka.h.I2(r0, r13)
            if (r14 != r5) goto L7d
            goto L97
        L7d:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto La7
            boolean r14 = r2.f
            if (r14 != 0) goto L98
            yja.b r14 = yja.b.ALREADY_SHOWN
            r13.v = r8
            r13.u = r9
            kka.h r1 = (kka.h) r1
            java.lang.Object r14 = r1.h(r14, r13)
            if (r14 != r5) goto Lb9
        L97:
            return r5
        L98:
            yja.b r14 = yja.b.ALREADY_SHOWN
            skm.p0 r1 = skm.p0.f264001a
            tkm.e r1 = zkm.o.f323119a
            wka.e r2 = new wka.e
            r2.<init>(r0, r14, r8, r7)
            skm.e0.C(r4, r1, r8, r2, r11)
            goto Lb9
        La7:
            yki.i r14 = r0.f298269s
            boolean r1 = r0.f298267q
            com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$Step$Details r2 = com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$Step.Details.f81267a
            if (r1 == 0) goto Lb5
            com.revolut.kompot.common.ModalDestination$Style$POPUP r0 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.w2(r14, r2, r0)
            goto Lb9
        Lb5:
            r1 = 6
            oki.h.u2(r0, r14, r2, r8, r1)
        Lb9:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: wka.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
