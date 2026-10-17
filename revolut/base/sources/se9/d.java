package se9;

import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f262163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f262164b;

    public d(ue0.c storage, e dateProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f262163a = storage;
        this.f262164b = q.b(0, 7, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r6.f262164b.emit(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof se9.b
            if (r0 == 0) goto L13
            r0 = r7
            se9.b r0 = (se9.b) r0
            int r1 = r0.f262162w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f262162w = r1
            goto L18
        L13:
            se9.b r0 = new se9.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f262162w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L4d
        L36:
            yhm.o.b(r7)
            se9.c r7 = new se9.c
            r2 = 0
            r5 = 0
            r7.<init>(r6, r5, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.f262162w = r4
            java.lang.Object r7 = skm.e0.J(r2, r7, r0)
            if (r7 != r1) goto L4d
            goto L59
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            r0.f262162w = r3
            vkm.z1 r2 = r6.f262164b
            java.lang.Object r7 = r2.emit(r7, r0)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: se9.d.a(gim.c):java.lang.Object");
    }
}
