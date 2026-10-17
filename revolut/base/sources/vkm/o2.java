package vkm;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes14.dex */
public final class o2 implements SharedFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFlow f290090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gim.i f290091b;

    /* JADX WARN: Multi-variable type inference failed */
    public o2(z1 z1Var, Function2 function2) {
        this.f290090a = z1Var;
        this.f290091b = (gim.i) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vkm.n2
            if (r0 == 0) goto L13
            r0 = r6
            vkm.n2 r0 = (vkm.n2) r0
            int r1 = r0.f290083w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290083w = r1
            goto L18
        L13:
            vkm.n2 r0 = new vkm.n2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290083w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            yhm.o.b(r6)
            goto L44
        L2f:
            yhm.o.b(r6)
            vkm.m2 r6 = new vkm.m2
            gim.i r2 = r4.f290091b
            r6.<init>(r2, r5)
            r0.f290083w = r3
            kotlinx.coroutines.flow.SharedFlow r5 = r4.f290090a
            java.lang.Object r5 = r5.collect(r6, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.o2.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List d() {
        return this.f290090a.d();
    }
}
