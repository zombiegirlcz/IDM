package od3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f224274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f224275x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(s0 s0Var, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f224274w = s0Var;
        this.f224275x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k0(this.f224274w, this.f224275x, continuation, 0);
            default:
                return new k0(this.f224274w, this.f224275x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.u
            switch(r0) {
                case 0: goto L8e;
                default: goto L5;
            }
        L5:
            od3.s0 r0 = r11.f224274w
            bd3.a r1 = r0.f224299q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r11.v
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L34
            if (r3 == r8) goto L30
            if (r3 == r7) goto L2c
            if (r3 == r6) goto L28
            if (r3 != r5) goto L20
            yhm.o.b(r12)
            goto L80
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            yhm.o.b(r12)
            goto L6b
        L2c:
            yhm.o.b(r12)
            goto L56
        L30:
            yhm.o.b(r12)
            goto L49
        L34:
            yhm.o.b(r12)
            od3.k0 r12 = new od3.k0
            r3 = 0
            r9 = 0
            java.lang.String r10 = r11.f224275x
            r12.<init>(r0, r10, r3, r9)
            r11.v = r8
            java.lang.Object r12 = ue8.c.f0(r0, r12, r11)
            if (r12 != r2) goto L49
            goto L8d
        L49:
            efm.b r12 = r1.b()
            r11.v = r7
            java.lang.Object r12 = nim.a.a(r12, r11)
            if (r12 != r2) goto L56
            goto L8d
        L56:
            gd3.c r12 = r1.f14523a
            gd3.g r12 = (gd3.g) r12
            w4l.f r12 = r12.f143059j
            kotlin.Unit r3 = kotlin.Unit.f186387a
            efm.b r12 = r12.g(r3, r4)
            r11.v = r6
            java.lang.Object r12 = nim.a.a(r12, r11)
            if (r12 != r2) goto L6b
            goto L8d
        L6b:
            gd3.c r12 = r1.f14523a
            gd3.g r12 = (gd3.g) r12
            w4l.f r12 = r12.k
            kotlin.Unit r1 = kotlin.Unit.f186387a
            efm.b r12 = r12.g(r1, r4)
            r11.v = r5
            java.lang.Object r12 = nim.a.a(r12, r11)
            if (r12 != r2) goto L80
            goto L8d
        L80:
            od3.a r12 = r0.f224300r
            r12.getClass()
            nii.y0 r12 = od3.a.a()
            kotlinx.coroutines.flow.Flow r2 = r0.X1(r12)
        L8d:
            return r2
        L8e:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.v
            r2 = 1
            if (r1 == 0) goto La3
            if (r1 != r2) goto L9b
            yhm.o.b(r12)
            goto Lb9
        L9b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        La3:
            yhm.o.b(r12)
            od3.s0 r12 = r11.f224274w
            bd3.a r12 = r12.f224299q
            java.lang.String r1 = r11.f224275x
            pfm.r r12 = r12.a(r1)
            r11.v = r2
            java.lang.Object r12 = nim.a.a(r12, r11)
            if (r12 != r0) goto Lb9
            goto Lbb
        Lb9:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        Lbb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od3.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
