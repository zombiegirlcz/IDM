package ln9;

import dj0.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ d A;
    public FlowCollector u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f197132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f197133x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f197134y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, d dVar, Continuation continuation) {
        super(2, continuation);
        this.f197134y = cVar;
        this.z = str;
        this.A = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f197134y, this.z, this.A, continuation);
        bVar.f197133x = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r0.emit(r3, r14) != r1) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f197133x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r14.f197132w
            ln9.c r3 = r14.f197134y
            r4 = 3
            r5 = 2
            r6 = 1
            r11 = 0
            if (r2 == 0) goto L31
            if (r2 == r6) goto L2d
            if (r2 == r5) goto L22
            if (r2 != r4) goto L1a
            yhm.o.b(r15)
            goto L83
        L1a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L22:
            java.lang.String r0 = r14.v
            kotlinx.coroutines.flow.FlowCollector r2 = r14.u
            yhm.o.b(r15)
            r13 = r2
            r2 = r0
            r0 = r13
            goto L6f
        L2d:
            yhm.o.b(r15)
            goto L56
        L31:
            yhm.o.b(r15)
            nn9.a r15 = r3.f197135a
            r14.f197133x = r0
            r14.f197132w = r6
            r8 = r15
            gn9.d r8 = (gn9.d) r8
            r8.getClass()
            g23.q r7 = new g23.q
            r12 = 21
            java.lang.String r9 = r14.z
            dj0.d r10 = r14.A
            r7.<init>(r8, r9, r10, r11, r12)
            skm.p0 r15 = skm.p0.f264001a
            elm.f r15 = elm.f.f127540b
            java.lang.Object r15 = skm.e0.J(r15, r7, r14)
            if (r15 != r1) goto L56
            goto L82
        L56:
            mn9.b r15 = (mn9.b) r15
            java.lang.String r2 = r15.f207490a
            nn9.a r3 = r3.f197135a
            java.lang.String r15 = r15.f207492c
            r14.f197133x = r11
            r14.u = r0
            r14.v = r2
            r14.f197132w = r5
            gn9.d r3 = (gn9.d) r3
            java.lang.Object r15 = r3.a(r15, r14)
            if (r15 != r1) goto L6f
            goto L82
        L6f:
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r15)
            r14.f197133x = r11
            r14.u = r11
            r14.v = r11
            r14.f197132w = r4
            java.lang.Object r15 = r0.emit(r3, r14)
            if (r15 != r1) goto L83
        L82:
            return r1
        L83:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ln9.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
