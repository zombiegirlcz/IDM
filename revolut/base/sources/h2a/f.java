package h2a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f148760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f148761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f148762c;

    static {
        Intrinsics.checkNotNullParameter("PERSONALIZATION_INTRO_SHOW_COUNTER", "id");
    }

    public f(mk0.a personalisationStorage, ue0.c localStorage, l80.e dateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f148760a = personalisationStorage;
        this.f148761b = localStorage;
        this.f148762c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof h2a.e
            if (r0 == 0) goto L13
            r0 = r9
            h2a.e r0 = (h2a.e) r0
            int r1 = r0.f148759w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148759w = r1
            goto L18
        L13:
            h2a.e r0 = new h2a.e
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f148759w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L5f
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            tk0.c r9 = new tk0.c
            java.lang.String r2 = "PERSONALIZATION_INTRO_SHOW_COUNTER"
            r9.<init>(r2)
            mk0.a r4 = r8.f148760a
            java.lang.Object r9 = r4.a(r9)
            java.lang.Double r9 = (java.lang.Double) r9
            if (r9 == 0) goto L49
            double r5 = r9.doubleValue()
            int r9 = (int) r5
            goto L4a
        L49:
            r9 = 0
        L4a:
            tk0.c r5 = new tk0.c
            r5.<init>(r2)
            int r9 = r9 + r3
            double r6 = (double) r9
            java.lang.Double r9 = new java.lang.Double
            r9.<init>(r6)
            r0.f148759w = r3
            java.lang.Object r9 = r4.e(r5, r9, r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r0)
            java.lang.Class r0 = java.lang.Long.TYPE
            ue0.c r1 = r8.f148761b
            java.lang.String r2 = "PERSONALIZATION_INTRO_LAST_SHOWN_AT"
            com.google.android.gms.internal.mlkit_vision_face.a.B(r0, r1, r2, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h2a.f.a(gim.c):java.lang.Object");
    }
}
