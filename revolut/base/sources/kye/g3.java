package kye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class g3 extends gim.i implements Function2 {
    public xi0.b u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f190734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f190735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k3 f190736y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(String str, k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190735x = str;
        this.f190736y = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g3(this.f190735x, this.f190736y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g3) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            kye.k3 r1 = r0.f190736y
            kye.n r2 = r1.f190767s
            kye.q3 r3 = r1.f190766r
            cli.y r4 = r1.f190763d0
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r0.f190734w
            r7 = 0
            r8 = 2
            java.lang.String r9 = r0.f190735x
            r10 = 1
            if (r6 == 0) goto L32
            if (r6 == r10) goto L2a
            if (r6 != r8) goto L22
            dj0.d r2 = r0.v
            yhm.o.b(r19)
            r14 = r2
            r2 = r19
            goto L62
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2a:
            xi0.b r6 = r0.u
            yhm.o.b(r19)
            r11 = r19
            goto L4e
        L32:
            yhm.o.b(r19)
            xi0.a r6 = xi0.b.Companion
            r6.getClass()
            xi0.b r6 = xi0.a.a(r9)
            com.revolut.feature.topup_screen.common.TopUpTarget r11 = r2.f190795a
            r0.u = r6
            r0.f190734w = r10
            r12 = r3
            kye.w3 r12 = (kye.w3) r12
            java.lang.Object r11 = r12.d(r9, r11, r0)
            if (r11 != r5) goto L4e
            goto L60
        L4e:
            dj0.d r11 = (dj0.d) r11
            com.revolut.feature.topup_screen.common.TopUpTarget r2 = r2.f190795a
            r0.u = r7
            r0.v = r11
            r0.f190734w = r8
            kye.w3 r3 = (kye.w3) r3
            java.lang.Object r2 = r3.b(r6, r2, r0)
            if (r2 != r5) goto L61
        L60:
            return r5
        L61:
            r14 = r11
        L62:
            r15 = r2
            kye.p3 r15 = (kye.p3) r15
            java.lang.Object r2 = r4.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            kye.m r2 = (kye.m) r2
            java.lang.String r2 = r2.e
            java.lang.Object r3 = r4.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            kye.m r3 = (kye.m) r3
            dj0.d r3 = r3.d
            if (r3 == 0) goto L85
            eye.b r3 = r1.f190765q
            dj0.d r7 = r3.a(r2, r9)
        L85:
            r13 = r7
            if (r13 == 0) goto L9b
            long r2 = r13.f115082a
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L99
            int r2 = r13.compareTo(r14)
            if (r2 >= 0) goto L99
        L96:
            r16 = r10
            goto La8
        L99:
            r10 = 0
            goto L96
        L9b:
            java.lang.Object r2 = r4.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            kye.m r2 = (kye.m) r2
            boolean r10 = r2.v
            goto L96
        La8:
            ael.s r11 = new ael.s
            r17 = 5
            java.lang.String r12 = r0.f190735x
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.H2(r4, r11)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.g3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
