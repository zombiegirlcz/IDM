package kae;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (nim.a.b(r2, r23) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        if (nim.a.a(r3, r23) == r5) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            kae.i r1 = r0.v
            xua.a r2 = r1.f182477p
            cli.y r3 = r1.f182478q
            com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreenContract$InputData r4 = r1.o
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r0.u
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L28
            if (r6 == r8) goto L23
            if (r6 != r7) goto L1b
            yhm.o.b(r24)
            goto Lb4
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            yhm.o.b(r24)
            goto Lb6
        L28:
            yhm.o.b(r24)
            qua.p r6 = r4.f89206a
            ibd.e r6 = r6.f249314a
            ibd.h r6 = r6.f160152c
            boolean r6 = r6.c()
            if (r6 == 0) goto L6e
            qua.p r9 = r4.f89206a
            java.lang.Object r3 = r3.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            kae.e r3 = (kae.e) r3
            java.lang.String r3 = r3.f182471b
            r21 = -4097(0xffffffffffffefff, float:NaN)
            r22 = 33554431(0x1ffffff, float:9.403954E-38)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r3
            qua.p r3 = qua.p.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            yua.q r2 = (yua.q) r2
            ufm.i r2 = r2.y(r3, r4, r4, r4)
            r0.u = r8
            java.lang.Object r2 = nim.a.b(r2, r0)
            if (r2 != r5) goto Lb6
            goto Lb3
        L6e:
            qua.p r4 = r4.f89206a
            java.lang.Object r3 = r3.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            kae.e r3 = (kae.e) r3
            java.lang.String r3 = r3.f182471b
            yua.q r2 = (yua.q) r2
            r2.getClass()
            java.lang.String r6 = "recurringPayment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            if (r3 == 0) goto L90
            boolean r6 = kotlin.text.d0.W(r3)
            if (r6 == 0) goto L8f
            goto L90
        L8f:
            r8 = 0
        L90:
            ufm.b r6 = r2.m()
            yua.d r9 = new yua.d
            r9.<init>(r4, r8, r2, r3)
            yta.c r2 = new yta.c
            r3 = 27
            r2.<init>(r3, r9)
            pfm.a r3 = new pfm.a
            r4 = 4
            r3.<init>(r6, r2, r4)
            java.lang.String r2 = "flatMapCompletable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            r0.u = r7
            java.lang.Object r2 = nim.a.a(r3, r0)
            if (r2 != r5) goto Lb4
        Lb3:
            return r5
        Lb4:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        Lb6:
            kae.f$a r2 = kae.f.a.f182473a
            r1.C2(r2)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kae.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
