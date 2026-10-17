package vge;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function2 f288941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m0 f288942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ qfe.h f288943y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Function2 function2, m0 m0Var, qfe.h hVar, Function1 function1, Continuation continuation) {
        super(3, continuation);
        this.f288941w = function2;
        this.f288942x = m0Var;
        this.f288943y = hVar;
        this.z = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        qfe.h hVar = this.f288943y;
        Function1 function1 = this.z;
        l0 l0Var = new l0(this.f288941w, this.f288942x, hVar, function1, (Continuation) obj4);
        l0Var.u = (List) obj2;
        l0Var.v = (Data) obj3;
        return l0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r5 != null) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.util.List r0 = r11.u
            java.util.List r0 = (java.util.List) r0
            com.revolut.data.model.Data r1 = r11.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r12)
            java.lang.Object r12 = r1.getContent()
            java.util.List r12 = (java.util.List) r12
            boolean r1 = ue0.e.n(r12)
            kotlin.jvm.functions.Function2 r2 = r11.f288941w
            if (r1 == 0) goto L22
            zhm.h0 r12 = zhm.h0.f322473a
            java.lang.Object r12 = r2.invoke(r0, r12)
            java.util.List r12 = (java.util.List) r12
            return r12
        L22:
            vge.m0 r1 = r11.f288942x
            ne0.j r1 = r1.f288949b
            kotlin.jvm.functions.Function1 r3 = r11.z
            java.lang.Object r3 = r3.invoke(r0)
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            lim.q r12 = zhm.d0.Q(r12)
            v77.a r4 = new v77.a
            r5 = 2
            r4.<init>(r3, r5)
            nkm.j r12 = nkm.y.t(r12, r4)
            java.util.List r12 = nkm.y.J(r12)
            qfe.h r3 = r11.f288943y
            boolean r4 = r3 instanceof qfe.g
            if (r4 == 0) goto L97
            qfe.g r3 = (qfe.g) r3
            int r3 = r3.f245293a
            java.lang.String r4 = "CACHE_KEY_DISCOVER_ITEMS"
            java.lang.Object r5 = r1.get(r4)
            java.util.Set r5 = (java.util.Set) r5
            if (r5 == 0) goto L81
            r6 = r12
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L5e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r6.next()
            int r9 = r7 + 1
            r10 = 0
            if (r7 < 0) goto L7b
            com.revolut.feature.tab.accounts.models.ProductAccountId r8 = (com.revolut.feature.tab.accounts.models.ProductAccountId) r8
            boolean r8 = r5.contains(r8)
            if (r8 == 0) goto L79
            if (r7 < r3) goto L79
            r5 = r10
            goto L7f
        L79:
            r7 = r9
            goto L5e
        L7b:
            zhm.v.s()
            throw r10
        L7f:
            if (r5 != 0) goto La1
        L81:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r12 = zhm.d0.V0(r12, r3)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Set r5 = zhm.d0.i1(r12)
            int r12 = r5.size()
            if (r12 != r3) goto La1
            r1.f(r4, r5)
            goto La1
        L97:
            boolean r1 = r3 instanceof qfe.e
            if (r1 == 0) goto La8
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Set r5 = zhm.d0.i1(r12)
        La1:
            java.lang.Object r12 = r2.invoke(r0, r5)
            java.util.List r12 = (java.util.List) r12
            return r12
        La8:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
