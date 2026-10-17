package wkm;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import skm.d0;
import skm.e0;
import ukm.g0;
import ukm.i0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f298306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f298307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ukm.f f298308c;

    public d(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        this.f298306a = coroutineContext;
        this.f298307b = i;
        this.f298308c = fVar;
    }

    public String a() {
        return null;
    }

    public abstract Object b(ProducerScope producerScope, Continuation continuation);

    public abstract d c(CoroutineContext coroutineContext, int i, ukm.f fVar);

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objO = e0.o(new clm.k(flowCollector, this, (Continuation) null, 4), continuation);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    public Flow e() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // wkm.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow f(kotlin.coroutines.CoroutineContext r5, int r6, ukm.f r7) {
        /*
            r4 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.f298306a
            kotlin.coroutines.CoroutineContext r5 = r5.plus(r0)
            ukm.f r1 = ukm.f.SUSPEND
            ukm.f r2 = r4.f298308c
            int r3 = r4.f298307b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            wkm.d r5 = r4.c(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wkm.d.f(kotlin.coroutines.CoroutineContext, int, ukm.f):kotlinx.coroutines.flow.Flow");
    }

    public i0 g(CoroutineScope coroutineScope) {
        int i = this.f298307b;
        if (i == -3) {
            i = -2;
        }
        d0 d0Var = d0.ATOMIC;
        Function2 aVar = new afe.a(this, null, 18);
        g0 g0Var = new g0(skm.x.b(coroutineScope, this.f298306a), vc.s.a(i, this.f298308c, null, 4), true, true);
        g0Var.j0(d0Var, g0Var, aVar);
        return g0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strA = a();
        if (strA != null) {
            arrayList.add(strA);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        CoroutineContext coroutineContext = this.f298306a;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.f298307b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ukm.f fVar = ukm.f.SUSPEND;
        ukm.f fVar2 = this.f298308c;
        if (fVar2 != fVar) {
            arrayList.add("onBufferOverflow=" + fVar2);
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(getClass().getSimpleName());
        sb6.append('[');
        return j6.a.u(sb6, zhm.d0.k0(arrayList, ", ", null, null, 0, null, 62), ']');
    }
}
