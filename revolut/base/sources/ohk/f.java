package ohk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f225389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hha.d f225390x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Function1 function1, hha.d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f225389w = function1;
        this.f225390x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f225389w, this.f225390x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r11 == r0) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            bgk.b$b r2 = bgk.b.C0097b.f15210a
            ohk.g r3 = r10.v
            r4 = 2
            r5 = 1
            kotlin.jvm.functions.Function1 r6 = r10.f225389w
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            yhm.o.b(r11)
            goto L5b
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            yhm.o.b(r11)
            goto L30
        L22:
            yhm.o.b(r11)
            ffk.w r11 = r3.f225392m
            r10.u = r5
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r0) goto L30
            goto L5a
        L30:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L3e
            r6.invoke(r2)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L3e:
            ffk.w r11 = r3.f225392m
            r10.u = r4
            pfk.g0 r11 = r11.f134853a
            r11.getClass()
            pdi.j r1 = new pdi.j
            r7 = 0
            r8 = 6
            hha.d r9 = r10.f225390x
            r1.<init>(r11, r9, r7, r8)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r1, r10)
            if (r11 != r0) goto L5b
        L5a:
            return r0
        L5b:
            rha.a r11 = (rha.a) r11
            java.lang.String r0 = r11.f254390a
            if (r0 != 0) goto L67
            r6.invoke(r2)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L67:
            rha.c r11 = r11.f254391b
            int[] r1 = ohk.e.f225388a
            int r11 = r11.ordinal()
            r11 = r1[r11]
            if (r11 == r5) goto L86
            if (r11 == r4) goto L82
            r0 = 3
            if (r11 == r0) goto L82
            r0 = 4
            if (r11 != r0) goto L7c
            goto L82
        L7c:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L82:
            r6.invoke(r2)
            goto L90
        L86:
            ofa.n r11 = new ofa.n
            r1 = 18
            r11.<init>(r1)
            r3.c3(r0, r11, r6)
        L90:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ohk.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
