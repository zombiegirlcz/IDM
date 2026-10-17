package c1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0g.c f20493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hlm.c f20494b;

    public k(k0g.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f20493a = repository;
        this.f20494b = hlm.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r3.b(r13, r0) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection r12, gim.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof c1g.i
            if (r0 == 0) goto L13
            r0 = r13
            c1g.i r0 = (c1g.i) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            c1g.i r0 = new c1g.i
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f20489y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            k0g.c r3 = r11.f20493a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L5e
            if (r2 == r7) goto L51
            if (r2 == r6) goto L3f
            if (r2 != r5) goto L37
            hlm.a r12 = r0.v
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L34
            goto L9f
        L34:
            r13 = move-exception
            goto Lab
        L37:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3f:
            int r4 = r0.f20488x
            int r12 = r0.f20487w
            hlm.a r2 = r0.v
            com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection r6 = r0.u
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L4e
            r10 = r2
            r2 = r12
            r12 = r10
            goto L88
        L4e:
            r13 = move-exception
            r12 = r2
            goto Lab
        L51:
            int r12 = r0.f20487w
            hlm.a r2 = r0.v
            com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection r9 = r0.u
            yhm.o.b(r13)
            r13 = r2
            r2 = r12
            r12 = r9
            goto L73
        L5e:
            yhm.o.b(r13)
            r0.u = r12
            hlm.c r13 = r11.f20494b
            r0.v = r13
            r0.f20487w = r4
            r0.A = r7
            java.lang.Object r2 = r13.lock(r8, r0)
            if (r2 != r1) goto L72
            goto L9e
        L72:
            r2 = r4
        L73:
            r0.u = r12     // Catch: java.lang.Throwable -> La7
            r0.v = r13     // Catch: java.lang.Throwable -> La7
            r0.f20487w = r2     // Catch: java.lang.Throwable -> La7
            r0.f20488x = r4     // Catch: java.lang.Throwable -> La7
            r0.A = r6     // Catch: java.lang.Throwable -> La7
            java.lang.Object r6 = r3.a(r0)     // Catch: java.lang.Throwable -> La7
            if (r6 != r1) goto L84
            goto L9e
        L84:
            r10 = r6
            r6 = r12
            r12 = r13
            r13 = r10
        L88:
            kyf.a r13 = (kyf.a) r13     // Catch: java.lang.Throwable -> L34
            kyf.a r13 = kyf.a.a(r13, r8, r6, r7)     // Catch: java.lang.Throwable -> L34
            r0.u = r8     // Catch: java.lang.Throwable -> L34
            r0.v = r12     // Catch: java.lang.Throwable -> L34
            r0.f20487w = r2     // Catch: java.lang.Throwable -> L34
            r0.f20488x = r4     // Catch: java.lang.Throwable -> L34
            r0.A = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r13 = r3.b(r13, r0)     // Catch: java.lang.Throwable -> L34
            if (r13 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r13 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34
            r12.unlock(r8)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        La7:
            r12 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        Lab:
            r12.unlock(r8)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c1g.k.a(com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r3.b(r12, r0) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof c1g.j
            if (r0 == 0) goto L13
            r0 = r12
            c1g.j r0 = (c1g.j) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            c1g.j r0 = new c1g.j
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f20492y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            k0g.c r3 = r10.f20493a
            r4 = 0
            r5 = 3
            r6 = 1
            r7 = 2
            r8 = 0
            if (r2 == 0) goto L5e
            if (r2 == r6) goto L51
            if (r2 == r7) goto L3f
            if (r2 != r5) goto L37
            hlm.a r11 = r0.v
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L34
            goto L9f
        L34:
            r12 = move-exception
            goto Lab
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            int r4 = r0.f20491x
            int r11 = r0.f20490w
            hlm.a r2 = r0.v
            com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation r6 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L4e
            r9 = r2
            r2 = r11
            r11 = r9
            goto L88
        L4e:
            r12 = move-exception
            r11 = r2
            goto Lab
        L51:
            int r11 = r0.f20490w
            hlm.a r2 = r0.v
            com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation r6 = r0.u
            yhm.o.b(r12)
            r12 = r2
            r2 = r11
            r11 = r6
            goto L73
        L5e:
            yhm.o.b(r12)
            r0.u = r11
            hlm.c r12 = r10.f20494b
            r0.v = r12
            r0.f20490w = r4
            r0.A = r6
            java.lang.Object r2 = r12.lock(r8, r0)
            if (r2 != r1) goto L72
            goto L9e
        L72:
            r2 = r4
        L73:
            r0.u = r11     // Catch: java.lang.Throwable -> La7
            r0.v = r12     // Catch: java.lang.Throwable -> La7
            r0.f20490w = r2     // Catch: java.lang.Throwable -> La7
            r0.f20491x = r4     // Catch: java.lang.Throwable -> La7
            r0.A = r7     // Catch: java.lang.Throwable -> La7
            java.lang.Object r6 = r3.a(r0)     // Catch: java.lang.Throwable -> La7
            if (r6 != r1) goto L84
            goto L9e
        L84:
            r9 = r6
            r6 = r11
            r11 = r12
            r12 = r9
        L88:
            kyf.a r12 = (kyf.a) r12     // Catch: java.lang.Throwable -> L34
            kyf.a r12 = kyf.a.a(r12, r6, r8, r7)     // Catch: java.lang.Throwable -> L34
            r0.u = r8     // Catch: java.lang.Throwable -> L34
            r0.v = r11     // Catch: java.lang.Throwable -> L34
            r0.f20490w = r2     // Catch: java.lang.Throwable -> L34
            r0.f20491x = r4     // Catch: java.lang.Throwable -> L34
            r0.A = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r12 = r3.b(r12, r0)     // Catch: java.lang.Throwable -> L34
            if (r12 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34
            r11.unlock(r8)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        La7:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        Lab:
            r11.unlock(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c1g.k.b(com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation, gim.c):java.lang.Object");
    }
}
