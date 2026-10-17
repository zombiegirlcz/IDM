package qmd;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qc0.e1;
import vkm.q0;
import vkm.y;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f247817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f247818b;

    public j(ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f247817a = storage;
        this.f247818b = memoryCache;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(qmd.a r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qmd.h
            if (r0 == 0) goto L13
            r0 = r7
            qmd.h r0 = (qmd.h) r0
            int r1 = r0.f247815x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247815x = r1
            goto L18
        L13:
            qmd.h r0 = new qmd.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f247815x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qmd.a r6 = r0.u
            yhm.o.b(r7)
            goto L59
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            ne0.j r7 = r5.f247818b
            java.lang.String r2 = r6.b()
            java.lang.Object r7 = r7.get(r2)
            yld.c r7 = (yld.c) r7
            if (r7 != 0) goto L62
            qc3.c r7 = new qc3.c
            r2 = 26
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.u = r6
            r0.f247815x = r3
            java.lang.Object r7 = skm.e0.J(r2, r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            yld.c r7 = (yld.c) r7
            if (r7 != 0) goto L62
            yld.c r6 = r6.a()
            return r6
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qmd.j.a(qmd.a, gim.c):java.lang.Enum");
    }

    public final y b(a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        yld.c cVar = (yld.c) this.f247818b.get(key.b());
        Continuation continuation = null;
        return new y(new e1(cVar, continuation, 16), t1.E(new q0(new pkg.e(this.f247817a.C0(key.b(), kmd.a.class), key, 29), new o4a.b(this, key, continuation, 25), 1)));
    }
}
