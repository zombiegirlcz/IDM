package pjf;

import kotlin.jvm.internal.Intrinsics;
import mhf.j;
import thf.m;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements eo0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nhf.a f236750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f236751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f236752c;
    public final thf.c d;
    public final qd0.b e;
    public final gpk.c f;

    public f(nhf.a unitedWalletInteractor, j transactionsSearchIndexInteractor, m transactionTextResourcesMapper, thf.c transactionCategoryResourcesMapper, qd0.b languageProvider, gpk.c appVersionNameProvider) {
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(appVersionNameProvider, "appVersionNameProvider");
        this.f236750a = unitedWalletInteractor;
        this.f236751b = transactionsSearchIndexInteractor;
        this.f236752c = transactionTextResourcesMapper;
        this.d = transactionCategoryResourcesMapper;
        this.e = languageProvider;
        this.f = appVersionNameProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (((mjf.k0) r3).f(r6, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // eo0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof pjf.e
            if (r0 == 0) goto L13
            r0 = r11
            pjf.e r0 = (pjf.e) r0
            int r1 = r0.f236749w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236749w = r1
            goto L1a
        L13:
            pjf.e r0 = new pjf.e
            gim.c r11 = (gim.c) r11
            r0.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236749w
            mhf.j r3 = r10.f236751b
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            yhm.o.b(r11)
            goto L98
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            yhm.o.b(r11)
            goto L83
        L3d:
            yhm.o.b(r11)
            goto L72
        L41:
            yhm.o.b(r11)
            r11 = r3
            mjf.k0 r11 = (mjf.k0) r11
            java.lang.String r2 = "unitedWalletInteractor"
            nhf.a r7 = r10.f236750a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "transactionTextResourcesMapper"
            thf.m r8 = r10.f236752c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "transactionCategoryResourcesMapper"
            thf.c r9 = r10.d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            r11.f206016j = r7
            r11.k = r8
            r11.f206017l = r9
            skm.r r11 = r11.f206014g
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r11.U(r2)
            r0.f236749w = r6
            java.lang.Object r11 = r10.d(r0)
            if (r11 != r1) goto L72
            goto L97
        L72:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L8d
            r0.f236749w = r5
            java.lang.Object r11 = r10.b(r0)
            if (r11 != r1) goto L83
            goto L97
        L83:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8c
            goto L8d
        L8c:
            r6 = 0
        L8d:
            r0.f236749w = r4
            mjf.k0 r3 = (mjf.k0) r3
            java.lang.Object r11 = r3.f(r6, r0)
            if (r11 != r1) goto L98
        L97:
            return r1
        L98:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pjf.f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof pjf.c
            if (r0 == 0) goto L13
            r0 = r9
            pjf.c r0 = (pjf.c) r0
            int r1 = r0.f236746x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236746x = r1
            goto L18
        L13:
            pjf.c r0 = new pjf.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236746x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r0 = r0.u
            yhm.o.b(r9)
            goto L57
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            yhm.o.b(r9)
            gpk.c r9 = r8.f
            java.lang.String r9 = r9.f()
            r0.u = r9
            r0.f236746x = r3
            mhf.j r2 = r8.f236751b
            mjf.k0 r2 = (mjf.k0) r2
            mjf.i0 r4 = new mjf.i0
            r5 = 0
            r6 = 0
            r4.<init>(r2, r5, r6)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r2, r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r7 = r0
            r0 = r9
            r9 = r7
        L57:
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r0, r9)
            r9 = r9 ^ r3
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pjf.f.b(gim.c):java.lang.Object");
    }

    @Override // eo0.b
    public final /* bridge */ /* synthetic */ eo0.a c() {
        return eo0.a.f127858a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof pjf.d
            if (r0 == 0) goto L13
            r0 = r8
            pjf.d r0 = (pjf.d) r0
            int r1 = r0.f236748x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236748x = r1
            goto L18
        L13:
            pjf.d r0 = new pjf.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236748x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r0 = r0.u
            yhm.o.b(r8)
            goto L5c
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            yhm.o.b(r8)
            qd0.b r8 = r7.e
            s80.b r8 = (s80.b) r8
            java.util.Locale r8 = r8.b()
            java.lang.String r8 = r8.toLanguageTag()
            r0.u = r8
            r0.f236748x = r3
            mhf.j r2 = r7.f236751b
            mjf.k0 r2 = (mjf.k0) r2
            mjf.i0 r4 = new mjf.i0
            r5 = 0
            r4.<init>(r2, r5, r3)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r2, r4, r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r6 = r0
            r0 = r8
            r8 = r6
        L5c:
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r0, r8)
            r8 = r8 ^ r3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pjf.f.d(gim.c):java.lang.Object");
    }
}
