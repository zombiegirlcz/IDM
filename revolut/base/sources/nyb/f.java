package nyb;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements eub.e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f220784c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f220785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.i f220786b;

    static {
        wi0.b.Companion.getClass();
        f220784c = y0.b(wi0.b.M0);
    }

    public f(l61.a userCompanyInteractor, eub.i revPointsOptInInteractor) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        this.f220785a = userCompanyInteractor;
        this.f220786b = revPointsOptInInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nyb.e
            if (r0 == 0) goto L13
            r0 = r6
            nyb.e r0 = (nyb.e) r0
            int r1 = r0.f220780w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220780w = r1
            goto L18
        L13:
            nyb.e r0 = new nyb.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220780w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L2a
            goto L6f
        L2a:
            r6 = move-exception
            goto L82
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L2a
            goto L4c
        L38:
            yhm.o.b(r6)
            l61.a r6 = r5.f220785a     // Catch: java.lang.Exception -> L2a
            ang.b r6 = (ang.b) r6     // Catch: java.lang.Exception -> L2a
            efm.d0 r6 = r6.a()     // Catch: java.lang.Exception -> L2a
            r0.f220780w = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = nim.a.b(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L4c
            goto L6e
        L4c:
            l71.d r6 = (l71.d) r6     // Catch: java.lang.Exception -> L2a
            com.revolut.domain.models.user.UserCompanyRegion r6 = r6.a()     // Catch: java.lang.Exception -> L2a
            wi0.b r6 = l71.f.j(r6)     // Catch: java.lang.Exception -> L2a
            java.util.Set r2 = nyb.f.f220784c     // Catch: java.lang.Exception -> L2a
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Exception -> L2a
            boolean r6 = zhm.d0.T(r2, r6)     // Catch: java.lang.Exception -> L2a
            if (r6 == 0) goto L7f
            eub.i r6 = r5.f220786b     // Catch: java.lang.Exception -> L2a
            efm.d0 r6 = eub.i.b(r6)     // Catch: java.lang.Exception -> L2a
            r0.f220780w = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = nim.a.b(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            m1c.r0 r6 = (m1c.r0) r6     // Catch: java.lang.Exception -> L2a
            m1c.x0 r6 = r6.f201447a     // Catch: java.lang.Exception -> L2a
            m1c.x0 r0 = m1c.x0.OPTED_IN     // Catch: java.lang.Exception -> L2a
            if (r6 != r0) goto L78
            goto L79
        L78:
            r4 = 0
        L79:
            eub.c r6 = new eub.c     // Catch: java.lang.Exception -> L2a
            r6.<init>(r4)     // Catch: java.lang.Exception -> L2a
            return r6
        L7f:
            eub.d$a r6 = eub.d.a.f129541a     // Catch: java.lang.Exception -> L2a
            return r6
        L82:
            eub.b r0 = new eub.b
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nyb.f.a(gim.c):java.lang.Object");
    }
}
