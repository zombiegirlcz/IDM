package ul9;

import com.revolut.feature.pay_with_smile.api.declaration.PayWithSmileApi$Toggles$PayWithSmileRetailSettings;
import jla.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();
    public static final long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql9.d f280917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f280918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f280919c;
    public final CoroutineScope d;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        e = kotlin.time.b.f(kotlin.time.c.g(5, pkm.e.MINUTES));
    }

    public g(ql9.d settingsRepository, gte.a featureToggleInteractor, h productCatalogueInteractor, CoroutineScope appScope) {
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        this.f280917a = settingsRepository;
        this.f280918b = featureToggleInteractor;
        this.f280919c = productCatalogueInteractor;
        this.d = appScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[PHI: r8
      0x003a: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v3 java.lang.String) binds: [B:16:0x0037, B:40:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[PHI: r8 r9
      0x0054: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:18:0x0051, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:18:0x0051, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0091 -> B:17:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ul9.g r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof ul9.f
            if (r0 == 0) goto L13
            r0 = r9
            ul9.f r0 = (ul9.f) r0
            int r1 = r0.f280916x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280916x = r1
            goto L18
        L13:
            ul9.f r0 = new ul9.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280916x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L37
            if (r2 == r3) goto L31
            if (r2 != r4) goto L29
            java.lang.String r8 = r0.u
            goto L37
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L54
        L37:
            yhm.o.b(r9)
        L3a:
            ql9.d r9 = r7.f280917a
            r0.u = r8
            r0.f280916x = r3
            r9.getClass()
            ql9.b r2 = new ql9.b
            r5 = 0
            r2.<init>(r9, r8, r5, r3)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L54
            goto L93
        L54:
            vl9.f r9 = (vl9.f) r9
            boolean r2 = r9 instanceof vl9.b
            if (r2 != 0) goto L81
            boolean r2 = r9 instanceof vl9.e
            if (r2 == 0) goto L5f
            goto L81
        L5f:
            boolean r7 = r9 instanceof vl9.d
            if (r7 == 0) goto L66
            nl9.d r7 = nl9.d.f217101a
            return r7
        L66:
            boolean r7 = r9 instanceof vl9.a
            if (r7 == 0) goto L6d
            nl9.b r7 = nl9.b.f217099a
            return r7
        L6d:
            boolean r7 = r9 instanceof vl9.c
            if (r7 == 0) goto L7b
            nl9.c r7 = new nl9.c
            vl9.c r9 = (vl9.c) r9
            com.revolut.feature.pay_with_smile.api.domain.model.PaymentConfirmationChallenge r8 = r9.f290304a
            r7.<init>(r8)
            return r7
        L7b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L81:
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE
            pkm.e r9 = pkm.e.SECONDS
            long r5 = kotlin.time.c.g(r4, r9)
            r0.u = r8
            r0.f280916x = r4
            java.lang.Object r9 = skm.k0.c(r5, r0)
            if (r9 != r1) goto L3a
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ul9.g.b(ul9.g, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ul9.c
            if (r0 == 0) goto L13
            r0 = r8
            ul9.c r0 = (ul9.c) r0
            int r1 = r0.f280910x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280910x = r1
            goto L18
        L13:
            ul9.c r0 = new ul9.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280910x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L5b
        L39:
            yhm.o.b(r8)
            r0.u = r7
            r0.f280910x = r5
            ql9.d r8 = r6.f280917a
            r8.getClass()
            ql9.b r2 = new ql9.b
            r5 = 3
            r2.<init>(r8, r7, r3, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L56
            goto L58
        L56:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L58:
            if (r8 != r1) goto L5b
            goto L6d
        L5b:
            ul9.d r8 = new ul9.d
            r2 = 0
            r8.<init>(r6, r7, r3, r2)
            r0.u = r3
            r0.f280910x = r4
            long r2 = ul9.g.e
            java.lang.Object r7 = skm.h2.b(r2, r8, r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ul9.g.a(java.lang.String, gim.c):java.lang.Object");
    }

    public final nl9.f c() {
        if (!((jte.d) this.f280918b).c(PayWithSmileApi$Toggles$PayWithSmileRetailSettings.f78949c)) {
            return nl9.f.NOT_AVAILABLE;
        }
        int i = b.f280908a[this.f280919c.d("REVOLUT_PAY.pay_with_smile", null).ordinal()];
        if (i == 1) {
            return nl9.f.ENABLED;
        }
        if (i == 2) {
            return nl9.f.INACTIVE;
        }
        if (i == 3 || i == 4) {
            return nl9.f.NOT_AVAILABLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ul9.e
            if (r0 == 0) goto L13
            r0 = r10
            ul9.e r0 = (ul9.e) r0
            int r1 = r0.f280914x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280914x = r1
            goto L18
        L13:
            ul9.e r0 = new ul9.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280914x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            goto L6c
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            goto L5a
        L39:
            yhm.o.b(r10)
            ql9.d r10 = r8.f280917a     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            r0.u = r9     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            r0.f280914x = r4     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            r10.getClass()     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            ql9.b r2 = new ql9.b     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            r2.<init>(r10, r9, r5, r3)     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            skm.p0 r10 = skm.p0.f264001a     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            elm.f r10 = elm.f.f127540b     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            java.lang.Object r10 = skm.e0.J(r10, r2, r0)     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            if (r10 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
        L57:
            if (r10 != r1) goto L5a
            goto L6b
        L5a:
            long r6 = ul9.g.e     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            ul9.d r10 = new ul9.d     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            r10.<init>(r8, r9, r5, r4)     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            r0.u = r5     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            r0.f280914x = r3     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            java.lang.Object r10 = skm.h2.b(r6, r10, r0)     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            if (r10 != r1) goto L6c
        L6b:
            return r1
        L6c:
            nl9.e r10 = (nl9.e) r10     // Catch: com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException -> L6f
            return r10
        L6f:
            nl9.d r9 = nl9.d.f217101a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ul9.g.d(java.lang.String, gim.c):java.lang.Object");
    }
}
