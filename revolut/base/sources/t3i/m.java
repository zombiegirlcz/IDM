package t3i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f267800a;

    public m(d4m.a fourthlineSdk) {
        Intrinsics.checkNotNullParameter(fourthlineSdk, "fourthlineSdk");
        this.f267800a = fourthlineSdk;
    }

    public final j a() {
        Object obj2 = this.f267800a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (j) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t3i.l
            if (r0 == 0) goto L13
            r0 = r7
            t3i.l r0 = (t3i.l) r0
            int r1 = r0.f267799w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267799w = r1
            goto L18
        L13:
            t3i.l r0 = new t3i.l
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267799w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            t3i.j r7 = r4.a()     // Catch: java.lang.Throwable -> L27
            r0.f267799w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.startSession(r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L41
            return r1
        L41:
            t3i.p r7 = (t3i.p) r7     // Catch: java.lang.Throwable -> L27
            return r7
        L44:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r7, r0, r0, r5, r6)
            t3i.n r6 = new t3i.n
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3i.m.b(android.content.Context, java.lang.String, gim.c):java.lang.Object");
    }
}
