package d84;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f112127l;

    public g(ImmutableSet handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f112127l = handlers;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d84.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r7, s54.b r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof d84.f
            if (r0 == 0) goto L13
            r0 = r9
            d84.f r0 = (d84.f) r0
            int r1 = r0.f112126w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112126w = r1
            goto L18
        L13:
            d84.f r0 = new d84.f
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112126w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L6d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r9)
            java.util.Set r9 = r6.f112127l
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L3a:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r9.next()
            r4 = r2
            d84.a r4 = (d84.a) r4
            t54.b r4 = (t54.b) r4
            r4.getClass()
            java.lang.String r5 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            kotlin.text.Regex r4 = r4.f268041m
            boolean r4 = r4.a(r7)
            if (r4 == 0) goto L3a
            goto L5b
        L5a:
            r2 = 0
        L5b:
            d84.a r2 = (d84.a) r2
            if (r2 != 0) goto L62
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L62:
            r0.f112126w = r3
            t54.b r2 = (t54.b) r2
            java.lang.Object r7 = r2.Z2(r7, r8, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d84.g.Z2(java.lang.String, s54.b, gim.c):java.lang.Object");
    }
}
