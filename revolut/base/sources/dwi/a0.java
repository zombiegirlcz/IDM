package dwi;

import hwi.x0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.d0 f120406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hwi.c f120407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f120408c;

    public a0(hwi.d0 disclaimerRepository, hwi.c passDetailsRepository, x0 userCapabilitiesRepository) {
        Intrinsics.checkNotNullParameter(disclaimerRepository, "disclaimerRepository");
        Intrinsics.checkNotNullParameter(passDetailsRepository, "passDetailsRepository");
        Intrinsics.checkNotNullParameter(userCapabilitiesRepository, "userCapabilitiesRepository");
        this.f120406a = disclaimerRepository;
        this.f120407b = passDetailsRepository;
        this.f120408c = userCapabilitiesRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dwi.y
            if (r0 == 0) goto L13
            r0 = r8
            dwi.y r0 = (dwi.y) r0
            int r1 = r0.f120469w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120469w = r1
            goto L18
        L13:
            dwi.y r0 = new dwi.y
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120469w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L6b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L58
        L37:
            yhm.o.b(r8)
            r0.f120469w = r4
            hwi.d0 r8 = r6.f120406a
            r8.getClass()
            hul.f0 r2 = new hul.f0
            r4 = 9
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L53
            goto L55
        L53:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L55:
            if (r7 != r1) goto L58
            goto L6a
        L58:
            r0.f120469w = r3
            dwi.z r7 = new dwi.z
            r7.<init>(r6, r5, r3)
            java.lang.Object r7 = skm.e0.G(r7, r0)
            if (r7 != r1) goto L66
            goto L68
        L66:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L68:
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dwi.a0.a(java.lang.String, gim.c):java.lang.Object");
    }
}
