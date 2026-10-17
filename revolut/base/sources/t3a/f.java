package t3a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sl3.q;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f267716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f267717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk0.a f267718c;
    public final q d;

    public f(cl3.a contactsInteractor, ang.f userInteractor, mk0.a personalisationStorage, q notifyFriendRepository) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(notifyFriendRepository, "notifyFriendRepository");
        this.f267716a = contactsInteractor;
        this.f267717b = userInteractor;
        this.f267718c = personalisationStorage;
        this.d = notifyFriendRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t3a.c
            if (r0 == 0) goto L13
            r0 = r6
            t3a.c r0 = (t3a.c) r0
            int r1 = r0.f267713w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267713w = r1
            goto L18
        L13:
            t3a.c r0 = new t3a.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267713w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L7c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f267713w = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L42
            goto L7b
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L86
            java.lang.String r6 = "id"
            java.lang.String r2 = "OPTED_IN_FOR_NEWLY_JOINED_NOTIFICATION"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            tk0.b r6 = new tk0.b
            r6.<init>(r2)
            mk0.a r2 = r5.f267718c
            java.lang.Object r6 = r2.a(r6)
            if (r6 != 0) goto L86
            cl3.a r6 = r5.f267716a
            wl3.h r6 = (wl3.h) r6
            fl3.a r6 = r6.f298380a
            sl3.k r6 = (sl3.k) r6
            ihm.b r6 = r6.f264119l
            vkm.d r6 = rd0.e.b(r6)
            t05.c r2 = new t05.c
            r4 = 8
            r2.<init>(r6, r4)
            r0.f267713w = r3
            java.lang.Object r6 = vkm.q.x(r2, r0)
            if (r6 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.jvm.internal.Intrinsics.h(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L87
        L86:
            r6 = 0
        L87:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3a.f.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof t3a.d
            if (r0 == 0) goto L13
            r0 = r7
            t3a.d r0 = (t3a.d) r0
            int r1 = r0.f267714w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267714w = r1
            goto L18
        L13:
            t3a.d r0 = new t3a.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267714w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L55
        L36:
            yhm.o.b(r7)
            r0.f267714w = r4
            s64.a r7 = new s64.a
            r2 = 0
            r4 = 24
            sl3.q r5 = r6.d
            r7.<init>(r5, r2, r4)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r2, r7, r0)
            if (r7 != r1) goto L50
            goto L52
        L50:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L52:
            if (r7 != r1) goto L55
            goto L72
        L55:
            r0.f267714w = r3
            java.lang.String r7 = "id"
            java.lang.String r2 = "OPTED_IN_FOR_NEWLY_JOINED_NOTIFICATION"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            tk0.b r7 = new tk0.b
            r7.<init>(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            mk0.a r3 = r6.f267718c
            java.lang.Object r7 = r3.e(r7, r2, r0)
            if (r7 != r1) goto L6e
            goto L70
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L70:
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t3a.f.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t3a.e
            if (r0 == 0) goto L13
            r0 = r6
            t3a.e r0 = (t3a.e) r0
            int r1 = r0.f267715w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267715w = r1
            goto L18
        L13:
            t3a.e r0 = new t3a.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267715w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L42
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            ang.f r6 = r5.f267717b
            efm.d0 r6 = r6.f(r3)
            r0.f267715w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            do3.n r6 = (do3.n) r6
            java.lang.Long r6 = r6.f116418q
            if (r6 == 0) goto L65
            long r0 = r6.longValue()
            org.joda.time.Instant r6 = org.joda.time.Instant.ofEpochMilli(r0)
            org.joda.time.Instant r0 = org.joda.time.Instant.now()
            org.joda.time.Days r6 = org.joda.time.Days.daysBetween(r6, r0)
            int r6 = r6.getDays()
            r0 = 7
            if (r6 > r0) goto L60
            r3 = r4
        L60:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L65:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3a.f.c(gim.c):java.lang.Object");
    }
}
