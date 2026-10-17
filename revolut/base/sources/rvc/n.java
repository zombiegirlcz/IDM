package rvc;

import cli.y;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wtc.g0;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends oki.h implements dli.b {
    public final NameLocationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f01.c f257753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f257754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f257755r;

    public n(cli.n stateMapper, NameLocationScreenContract$InputData inputData, f01.c uiKitResources, g0 streetModeInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        this.o = inputData;
        this.f257753p = uiKitResources;
        this.f257754q = streetModeInteractor;
        this.f257755r = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(rvc.n r11, gim.c r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof rvc.l
            if (r0 == 0) goto L13
            r0 = r12
            rvc.l r0 = (rvc.l) r0
            int r1 = r0.f257751w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257751w = r1
            goto L18
        L13:
            rvc.l r0 = new rvc.l
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257751w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L6b
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            wtc.g0 r12 = r11.f257754q
            cli.y r2 = r11.f257755r
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            rvc.f r2 = (rvc.f) r2
            java.lang.String r6 = r2.f257743a
            com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreenContract$InputData r2 = r11.o
            com.revolut.feature.location.api.domain.models.location.LocationDomain r7 = r2.f85673b
            int r8 = r2.f85674c
            r0.f257751w = r3
            cuc.e0 r5 = r12.f299869a
            r5.getClass()
            cuc.c0 r4 = new cuc.c0
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L61
            goto L63
        L61:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L63:
            if (r12 != r1) goto L66
            goto L68
        L66:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L68:
            if (r12 != r1) goto L6b
            return r1
        L6b:
            rvc.h r12 = rvc.h.f257746a
            r11.C2(r12)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rvc.n.I2(rvc.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(rvc.n r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof rvc.m
            if (r0 == 0) goto L14
            r0 = r9
            rvc.m r0 = (rvc.m) r0
            int r1 = r0.f257752w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f257752w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            rvc.m r0 = new rvc.m
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f257752w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r9)
            goto L54
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r9)
            wtc.g0 r1 = r7.f257754q
            cli.y r9 = r7.f257755r
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            rvc.f r9 = (rvc.f) r9
            java.lang.String r3 = r9.f257743a
            com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreenContract$InputData r9 = r7.o
            com.revolut.feature.location.api.domain.models.location.LocationDomain r4 = r9.f85673b
            int r5 = r9.f85674c
            r6.f257752w = r2
            r2 = r8
            java.lang.Object r8 = r1.i(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L54
            return r0
        L54:
            rvc.g r8 = rvc.g.f257745a
            r7.C2(r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rvc.n.J2(rvc.n, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f257755r;
    }
}
