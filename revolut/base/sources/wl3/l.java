package wl3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gl3.f f298388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.h f298389b;

    public l(gl3.f deviceContacts, ao.h contactsDataStorage) {
        Intrinsics.checkNotNullParameter(deviceContacts, "deviceContacts");
        Intrinsics.checkNotNullParameter(contactsDataStorage, "contactsDataStorage");
        this.f298388a = deviceContacts;
        this.f298389b = contactsDataStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:20:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof wl3.j
            if (r0 == 0) goto L13
            r0 = r7
            wl3.j r0 = (wl3.j) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            wl3.j r0 = new wl3.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f298384x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r2 = r0.v
            int r4 = r0.u
            java.util.Set r5 = r0.f298383w
            java.util.Set r5 = (java.util.Set) r5
            yhm.o.b(r7)
            goto L6a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            yhm.o.b(r7)
            r7 = 100
            r2 = 0
            r4 = r7
        L3e:
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            boolean r7 = skm.e0.x(r7)
            if (r7 == 0) goto L73
            ao.h r7 = r6.f298389b
            java.lang.Object r7 = r7.f7847b
            ml3.a r7 = (ml3.a) r7
            java.util.List r7 = r7.i(r4, r2)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r5 = zhm.d0.i1(r7)
            r7 = r5
            java.util.Set r7 = (java.util.Set) r7
            r0.f298383w = r7
            r0.u = r4
            r0.v = r2
            r0.z = r3
            java.lang.Object r7 = r6.b(r5, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            int r7 = r5.size()
            if (r7 >= r4) goto L71
            goto L73
        L71:
            int r2 = r2 + r4
            goto L3e
        L73:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wl3.l.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c1, code lost:
    
        if (nim.a.a(r2, r3) == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wl3.l.b(java.util.Set, gim.c):java.lang.Object");
    }
}
