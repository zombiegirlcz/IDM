package bra;

import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f17969y;
    public final /* synthetic */ d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.z = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.z, continuation);
        cVar.f17969y = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((IndexedValue) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r11 != r1) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Exception {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f17969y
            kotlin.collections.IndexedValue r0 = (kotlin.collections.IndexedValue) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.f17968x
            bra.d r3 = r10.z
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L30
            if (r2 == r6) goto L2c
            if (r2 == r5) goto L22
            if (r2 != r4) goto L1a
            yhm.o.b(r11)
            goto L84
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            boolean r0 = r10.f17967w
            int r2 = r10.v
            java.lang.String r5 = r10.u
            yhm.o.b(r11)
            goto L73
        L2c:
            yhm.o.b(r11)
            goto L5b
        L30:
            yhm.o.b(r11)
            int r2 = r0.f186391a
            java.lang.Object r11 = r0.f186392b
            bra.f r11 = (bra.f) r11
            java.lang.String r0 = r11.f17971a
            boolean r11 = r11.f17972b
            int r8 = r0.length()
            r9 = 9
            if (r8 >= r9) goto L48
            ara.l r11 = ara.l.f8607a
            return r11
        L48:
            if (r2 != 0) goto L5e
            r10.f17969y = r7
            r10.u = r7
            r10.v = r2
            r10.f17967w = r11
            r10.f17968x = r6
            java.lang.Object r11 = bra.d.a(r3, r0, r11, r10)
            if (r11 != r1) goto L5b
            goto L83
        L5b:
            ara.m r11 = (ara.m) r11
            return r11
        L5e:
            r10.f17969y = r7
            r10.u = r0
            r10.v = r2
            r10.f17967w = r11
            r10.f17968x = r5
            r5 = 250(0xfa, double:1.235E-321)
            java.lang.Object r5 = skm.k0.b(r5, r10)
            if (r5 != r1) goto L71
            goto L83
        L71:
            r5 = r0
            r0 = r11
        L73:
            r10.f17969y = r7
            r10.u = r7
            r10.v = r2
            r10.f17967w = r0
            r10.f17968x = r4
            java.lang.Object r11 = bra.d.a(r3, r5, r0, r10)
            if (r11 != r1) goto L84
        L83:
            return r1
        L84:
            ara.m r11 = (ara.m) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bra.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
