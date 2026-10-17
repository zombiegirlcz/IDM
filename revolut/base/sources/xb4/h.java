package xb4;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends i implements Function1 {
    public final /* synthetic */ i A;
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f303987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ sy3.h f303988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f303989y;
    public final /* synthetic */ Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar, int i, sy3.h hVar, int i2, Integer num, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f303987w = i;
        this.f303988x = hVar;
        this.f303989y = i2;
        this.z = num;
        this.A = (i) function1;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f303987w, this.f303988x, this.f303989y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r2.p2(r11, r1) == r0) goto L17;
     */
    /* JADX WARN: Type inference failed for: r12v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c r2 = r11.v
            r9 = 2
            r3 = 1
            r10 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1c
            if (r1 != r9) goto L14
            yhm.o.b(r12)
            r7 = r11
            goto L5e
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            yhm.o.b(r12)
            r7 = r11
            goto L47
        L21:
            yhm.o.b(r12)
            xb4.f r5 = new xb4.f
            int r12 = r11.f303987w
            sy3.h r1 = r11.f303988x
            int r4 = r11.f303989y
            java.lang.Integer r6 = r11.z
            r5.<init>()
            boe.k r6 = new boe.k
            gim.i r12 = r11.A
            r1 = 25
            r6.<init>(r1, r10, r12)
            r11.u = r3
            r3 = 0
            r4 = 0
            r8 = 3
            r7 = r11
            java.lang.Object r12 = n14.k.V(r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L47
            goto L5d
        L47:
            nii.h r12 = (nii.h) r12
            boolean r1 = r12 instanceof nii.g
            if (r1 == 0) goto L5e
            xb4.g r1 = new xb4.g
            nii.g r12 = (nii.g) r12
            r3 = 0
            r1.<init>(r2, r12, r10, r3)
            r7.u = r9
            java.lang.Object r12 = r2.p2(r11, r1)
            if (r12 != r0) goto L5e
        L5d:
            return r0
        L5e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xb4.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
