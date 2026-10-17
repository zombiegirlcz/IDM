package ued;

import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve0.c f279344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f279345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b90.a f279346c;

    public d(ve0.c storage, e dateProvider, b90.a pushMessageHandler) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(pushMessageHandler, "pushMessageHandler");
        this.f279344a = storage;
        this.f279345b = dateProvider;
        this.f279346c = pushMessageHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ued.b
            if (r0 == 0) goto L13
            r0 = r9
            ued.b r0 = (ued.b) r0
            int r1 = r0.f279342x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279342x = r1
            goto L18
        L13:
            ued.b r0 = new ued.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279342x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.time.LocalDate r0 = r0.u
            yhm.o.b(r9)
            goto L64
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            yhm.o.b(r9)
            b90.a r9 = r8.f279346c
            androidx.appcompat.view.ContextThemeWrapper r9 = r9.f13519a
            androidx.core.app.NotificationManagerCompat r9 = androidx.core.app.NotificationManagerCompat.from(r9)
            boolean r9 = r9.areNotificationsEnabled()
            if (r9 == 0) goto L45
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L45:
            l80.e r9 = r8.f279345b
            l80.f r9 = (l80.f) r9
            java.time.LocalDate r9 = r9.e()
            r0.u = r9
            r0.f279342x = r3
            elm.g r2 = skm.p0.f264002b
            u29.c r4 = new u29.c
            r5 = 0
            r6 = 2
            r4.<init>(r8, r9, r5, r6)
            java.lang.Object r0 = skm.e0.J(r2, r4, r0)
            if (r0 != r1) goto L61
            return r1
        L61:
            r7 = r0
            r0 = r9
            r9 = r7
        L64:
            java.time.LocalDate r9 = (java.time.LocalDate) r9
            int r9 = r9.compareTo(r0)
            if (r9 > 0) goto L6d
            goto L6e
        L6d:
            r3 = 0
        L6e:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ued.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (skm.e0.J(r2, r5, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ued.c
            if (r0 == 0) goto L13
            r0 = r8
            ued.c r0 = (ued.c) r0
            int r1 = r0.f279343w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279343w = r1
            goto L18
        L13:
            ued.c r0 = new ued.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279343w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L67
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)
            goto L53
        L37:
            yhm.o.b(r8)
            l80.e r8 = r7.f279345b
            l80.f r8 = (l80.f) r8
            java.time.LocalDate r8 = r8.e()
            r0.f279343w = r5
            elm.g r2 = skm.p0.f264002b
            u29.c r5 = new u29.c
            r6 = 2
            r5.<init>(r7, r8, r3, r6)
            java.lang.Object r8 = skm.e0.J(r2, r5, r0)
            if (r8 != r1) goto L53
            goto L66
        L53:
            java.time.LocalDate r8 = (java.time.LocalDate) r8
            elm.g r2 = skm.p0.f264002b
            u7k.f0 r5 = new u7k.f0
            r6 = 27
            r5.<init>(r7, r8, r3, r6)
            r0.f279343w = r4
            java.lang.Object r8 = skm.e0.J(r2, r5, r0)
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ued.d.b(gim.c):java.lang.Object");
    }
}
