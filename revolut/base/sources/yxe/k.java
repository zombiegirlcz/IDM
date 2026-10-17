package yxe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (yxe.m.I2(r0, r10) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r11 == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            yxe.m r0 = r10.v
            com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1d
            if (r3 == r5) goto L10
            if (r3 != r4) goto L15
        L10:
            yhm.o.b(r11)
            goto L94
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            yhm.o.b(r11)
            ste.d r11 = r1.e
            int[] r3 = yxe.j.f317672a
            int r11 = r11.ordinal()
            r11 = r3[r11]
            if (r11 == r5) goto L3d
            if (r11 != r4) goto L37
            r10.u = r4
            java.lang.Object r11 = yxe.m.I2(r0, r10)
            if (r11 != r2) goto L94
            goto L93
        L37:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L3d:
            r10.u = r5
            u51.a r11 = r0.f317674p
            java.lang.String r6 = r1.f90490a
            cli.y r3 = r0.f317676r
            java.lang.Object r3 = r3.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            yxe.f r3 = (yxe.f) r3
            java.lang.String r7 = r3.f317669c
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r8 = r1.d
            if (r8 != 0) goto L69
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Top-up methods context should present while edit label if BE driven methods enabled"
            r11.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            r4 = 0
            rd0.d.a(r3, r4, r4, r11, r1)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            goto L91
        L69:
            e0f.r1 r11 = (e0f.r1) r11
            hve.b r11 = r11.f121679a
            r5 = r11
            hve.o r5 = (hve.o) r5
            r5.getClass()
            fc0.e r3 = new fc0.e
            r9 = 0
            r4 = 6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r3, r10)
            if (r11 != r2) goto L85
            goto L87
        L85:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L87:
            if (r11 != r2) goto L8a
            goto L8c
        L8a:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L8c:
            if (r11 != r2) goto L8f
            goto L91
        L8f:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L91:
            if (r11 != r2) goto L94
        L93:
            return r2
        L94:
            ste.e$b r11 = ste.e.b.f265560a
            r0.C2(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yxe.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
