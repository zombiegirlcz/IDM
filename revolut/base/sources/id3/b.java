package id3;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f160414w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f160415x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f160414w = cVar;
        this.f160415x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f160414w, this.f160415x, continuation, 0);
            default:
                return new b(this.f160414w, this.f160415x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.u
            switch(r0) {
                case 0: goto L92;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.v
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            id3.c r7 = r10.f160414w
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2e
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            yhm.o.b(r11)
            goto L84
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            yhm.o.b(r11)
            goto L6d
        L2a:
            yhm.o.b(r11)
            goto L56
        L2e:
            yhm.o.b(r11)
            goto L47
        L32:
            yhm.o.b(r11)
            id3.b r11 = new id3.b
            r1 = 0
            r8 = 0
            java.lang.String r9 = r10.f160415x
            r11.<init>(r7, r9, r1, r8)
            r10.v = r6
            java.lang.Object r11 = ue8.c.g0(r7, r11, r10)
            if (r11 != r0) goto L47
            goto L91
        L47:
            bd3.a r11 = r7.f160416l
            efm.b r11 = r11.b()
            r10.v = r5
            java.lang.Object r11 = nim.a.a(r11, r10)
            if (r11 != r0) goto L56
            goto L91
        L56:
            bd3.a r11 = r7.f160416l
            gd3.c r11 = r11.f14523a
            gd3.g r11 = (gd3.g) r11
            w4l.f r11 = r11.f143059j
            kotlin.Unit r1 = kotlin.Unit.f186387a
            efm.b r11 = r11.g(r1, r2)
            r10.v = r4
            java.lang.Object r11 = nim.a.a(r11, r10)
            if (r11 != r0) goto L6d
            goto L91
        L6d:
            bd3.a r11 = r7.f160416l
            gd3.c r11 = r11.f14523a
            gd3.g r11 = (gd3.g) r11
            w4l.f r11 = r11.k
            kotlin.Unit r1 = kotlin.Unit.f186387a
            efm.b r11 = r11.g(r1, r2)
            r10.v = r3
            java.lang.Object r11 = nim.a.a(r11, r10)
            if (r11 != r0) goto L84
            goto L91
        L84:
            od3.a r11 = r7.f160417m
            r11.getClass()
            nii.y0 r11 = od3.a.a()
            kotlinx.coroutines.flow.Flow r0 = r7.L2(r11)
        L91:
            return r0
        L92:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.v
            r2 = 1
            if (r1 == 0) goto La7
            if (r1 != r2) goto L9f
            yhm.o.b(r11)
            goto Lbd
        L9f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        La7:
            yhm.o.b(r11)
            id3.c r11 = r10.f160414w
            bd3.a r11 = r11.f160416l
            java.lang.String r1 = r10.f160415x
            pfm.r r11 = r11.a(r1)
            r10.v = r2
            java.lang.Object r11 = nim.a.a(r11, r10)
            if (r11 != r0) goto Lbd
            goto Lbf
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id3.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
