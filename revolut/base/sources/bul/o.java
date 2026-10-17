package bul;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f18910a;

    public o(ImmutableSet hintMappings, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(hintMappings, "hintMappings");
                this.f18910a = hintMappings;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(hintMappings, "investOrderControllerModelExtensions");
                this.f18910a = hintMappings;
                break;
            default:
                Intrinsics.checkNotNullParameter(hintMappings, "delegates");
                this.f18910a = hintMappings;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005b -> B:20:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof usl.a
            if (r0 == 0) goto L13
            r0 = r7
            usl.a r0 = (usl.a) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            usl.a r0 = new usl.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f282992x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r2 = r0.f282991w
            java.lang.Object r4 = r0.v
            java.util.Iterator r5 = r0.u
            yhm.o.b(r7)
            goto L5e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            yhm.o.b(r7)
            java.util.Set r7 = r6.f18910a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = 0
            r5 = r7
        L42:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L67
            java.lang.Object r4 = r5.next()
            r7 = r4
            jsl.e0 r7 = (jsl.e0) r7
            r0.u = r5
            r0.v = r4
            r0.f282991w = r2
            r0.z = r3
            java.lang.Object r7 = r7.Z2(r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L42
            return r4
        L67:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bul.o.a(gim.c):java.lang.Object");
    }
}
