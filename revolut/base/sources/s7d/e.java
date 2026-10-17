package s7d;

import be7.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import e40.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m30.g;
import n30.n;
import org.joda.time.Instant;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f260673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e40.g f260674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f260675c;
    public final k d;
    public final w e;

    public e(g callSupportInteractor, e40.g chatAndCallRequestPendingActionsDelegate, n chatInteractor, l80.e dateProvider, k inAppCallsInteractor, w ticketTilesFactory) {
        Intrinsics.checkNotNullParameter(callSupportInteractor, "callSupportInteractor");
        Intrinsics.checkNotNullParameter(chatAndCallRequestPendingActionsDelegate, "chatAndCallRequestPendingActionsDelegate");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(ticketTilesFactory, "ticketTilesFactory");
        this.f260673a = callSupportInteractor;
        this.f260674b = chatAndCallRequestPendingActionsDelegate;
        this.f260675c = chatInteractor;
        this.d = inAppCallsInteractor;
        this.e = ticketTilesFactory;
    }

    public static final List a(e eVar, RowDelegate.Model model) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        List listC = u.c(new f7d.a(instantOfEpochMilli, model, true));
        return listC == null ? f0.f322471a : listC;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(r40.k r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s7d.a
            if (r0 == 0) goto L13
            r0 = r6
            s7d.a r0 = (s7d.a) r0
            int r1 = r0.f260668w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260668w = r1
            goto L18
        L13:
            s7d.a r0 = new s7d.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260668w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f260668w = r3
            e40.g r6 = r4.f260674b
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$b r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.b.f51608a
            java.lang.Object r6 = r6.i(r5, r2, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            j49.h r6 = (j49.h) r6
            j49.c r5 = j49.c.f171322a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 != 0) goto L61
            boolean r5 = r6 instanceof j49.b
            if (r5 == 0) goto L57
            f7d.c r5 = new f7d.c
            j49.b r6 = (j49.b) r6
            aii.u r6 = r6.f171321a
            r5.<init>(r6)
            return r5
        L57:
            boolean r5 = r6 instanceof j49.a
            if (r5 == 0) goto L5e
            f7d.b$a r5 = f7d.b.a.f132592a
            return r5
        L5e:
            f7d.b$b r5 = f7d.b.C0776b.f132593a
            return r5
        L61:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s7d.e.b(r40.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.core.ui_kit.delegates.t r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s7d.b
            if (r0 == 0) goto L13
            r0 = r6
            s7d.b r0 = (s7d.b) r0
            int r1 = r0.f260670x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260670x = r1
            goto L18
        L13:
            s7d.b r0 = new s7d.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260670x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            s7d.e r5 = r0.u
            yhm.o.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r4
            r0.f260670x = r3
            e40.g r6 = r4.f260674b
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            j49.h r6 = (j49.h) r6
            r5.getClass()
            boolean r5 = r6 instanceof j49.b
            if (r5 == 0) goto L55
            f7d.c r5 = new f7d.c
            j49.b r6 = (j49.b) r6
            aii.u r6 = r6.f171321a
            r5.<init>(r6)
            return r5
        L55:
            boolean r5 = r6 instanceof j49.a
            if (r5 == 0) goto L5c
            f7d.b$a r5 = f7d.b.a.f132592a
            return r5
        L5c:
            f7d.b$b r5 = f7d.b.C0776b.f132593a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s7d.e.c(com.revolut.core.ui_kit.delegates.t, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Object r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s7d.c
            if (r0 == 0) goto L13
            r0 = r6
            s7d.c r0 = (s7d.c) r0
            int r1 = r0.f260671w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260671w = r1
            goto L18
        L13:
            s7d.c r0 = new s7d.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260671w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            boolean r6 = r5 instanceof r40.k
            if (r6 == 0) goto L39
            r40.k r5 = (r40.k) r5
            goto L3a
        L39:
            r5 = 0
        L3a:
            if (r5 == 0) goto L4a
            r0.f260671w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            f7d.b r6 = (f7d.b) r6
            if (r6 == 0) goto L4a
            return r6
        L4a:
            f7d.b$b r5 = f7d.b.C0776b.f132593a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s7d.e.d(java.lang.Object, gim.c):java.lang.Object");
    }
}
