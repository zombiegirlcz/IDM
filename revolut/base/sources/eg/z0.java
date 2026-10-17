package eg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements v0 {

    @NotNull
    public static final w0 Companion = new w0();
    public static final double f = Math.random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd.g f125505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.e f125506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ig.k f125507c;
    public final m d;
    public final CoroutineContext e;

    public z0(pd.g firebaseApp, df.e firebaseInstallations, ig.k sessionSettings, m eventGDTLogger, CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f125505a = firebaseApp;
        this.f125506b = firebaseInstallations;
        this.f125507c = sessionSettings;
        this.d = eventGDTLogger;
        this.e = backgroundDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(eg.z0 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof eg.y0
            if (r0 == 0) goto L13
            r0 = r6
            eg.y0 r0 = (eg.y0) r0
            int r1 = r0.f125504x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125504x = r1
            goto L18
        L13:
            eg.y0 r0 = new eg.y0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125504x
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eg.z0 r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            ig.k r6 = r5.f125507c
            r0.u = r5
            r0.f125504x = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            ig.k r6 = r5.f125507c
            ig.p r0 = r6.f161057a
            java.lang.Boolean r0 = r0.c()
            if (r0 == 0) goto L55
            boolean r3 = r0.booleanValue()
            goto L61
        L55:
            ig.p r6 = r6.f161058b
            java.lang.Boolean r6 = r6.c()
            if (r6 == 0) goto L61
            boolean r3 = r6.booleanValue()
        L61:
            if (r3 != 0) goto L69
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L69:
            ig.k r5 = r5.f125507c
            double r5 = r5.a()
            double r0 = eg.z0.f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L78
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L78:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.z0.a(eg.z0, gim.c):java.lang.Object");
    }
}
