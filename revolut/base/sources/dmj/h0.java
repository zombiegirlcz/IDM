package dmj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f116159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f116160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f116161y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar, String str, String str2, String str3, long j2, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f116159w = str;
        this.f116160x = str2;
        this.f116161y = str3;
        this.z = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h0(this.v, this.f116159w, this.f116160x, this.f116161y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (r1.G1(r2, r17) == r3) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c r1 = r0.v
            unj.j r2 = r1.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.u
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L25
            if (r4 == r6) goto L1f
            if (r4 != r5) goto L17
            yhm.o.b(r18)
            goto La3
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            yhm.o.b(r18)
            r4 = r18
            goto L56
        L25:
            yhm.o.b(r18)
            bej.m r4 = r1.u
            cli.y r7 = r1.z
            java.lang.Object r7 = r7.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            dmj.a0 r7 = (dmj.a0) r7
            java.lang.String r10 = r7.f116135b
            r0.u = r6
            r9 = r4
            dfj.q3 r9 = (dfj.q3) r9
            r9.getClass()
            b6i.h0 r8 = new b6i.h0
            r16 = 0
            java.lang.String r11 = r0.f116160x
            java.lang.String r12 = r0.f116159w
            java.lang.String r13 = r0.f116161y
            long r14 = r0.z
            r8.<init>(r9, r10, r11, r12, r13, r14, r16)
            java.lang.Object r4 = r9.a(r8, r0)
            if (r4 != r3) goto L56
            goto La2
        L56:
            bej.k r4 = (bej.k) r4
            boolean r6 = r4 instanceof bej.j
            if (r6 == 0) goto L7a
            bej.j r4 = (bej.j) r4
            boolean r3 = r4.f14855a
            if (r3 == 0) goto L6e
            r2.getClass()
            nii.y0 r2 = unj.j.c()
            kotlinx.coroutines.flow.Flow r1 = r1.X1(r2)
            return r1
        L6e:
            r2.getClass()
            nii.y0 r2 = unj.j.a()
            kotlinx.coroutines.flow.Flow r1 = r1.X1(r2)
            return r1
        L7a:
            bej.k$a r6 = bej.k.a.f14856a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r4, r6)
            if (r6 == 0) goto L8e
            r2.getClass()
            nii.y0 r2 = unj.j.b()
            kotlinx.coroutines.flow.Flow r1 = r1.X1(r2)
            return r1
        L8e:
            boolean r2 = r4 instanceof bej.l
            if (r2 == 0) goto La6
            bej.l r4 = (bej.l) r4
            java.lang.String r2 = r4.f14857a
            f9i.c r2 = foh.i.a(r2)
            r0.u = r5
            java.lang.Object r1 = r1.G1(r2, r0)
            if (r1 != r3) goto La3
        La2:
            return r3
        La3:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        La6:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dmj.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
