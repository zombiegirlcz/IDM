package vu5;

import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import mu5.s;
import org.jetbrains.annotations.NotNull;
import rp0.p0;
import vge.z1;
import vmf.k;
import vo8.t;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements b {

    @NotNull
    public static final c Companion = new c();
    public final c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f292260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f292261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f292262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f292263s;

    public h(c0 cryptoTaxInteractor, s cryptoTaxStorageInteractor, p0 promptDialogDisplayer, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(cryptoTaxInteractor, "cryptoTaxInteractor");
        Intrinsics.checkNotNullParameter(cryptoTaxStorageInteractor, "cryptoTaxStorageInteractor");
        Intrinsics.checkNotNullParameter(promptDialogDisplayer, "promptDialogDisplayer");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = cryptoTaxInteractor;
        this.f292260p = cryptoTaxStorageInteractor;
        this.f292261q = promptDialogDisplayer;
        this.f292262r = termsNavigationFactory;
        this.f292263s = d8l.d.a(this, new t(28));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(vu5.h r11, boolean r12, gim.c r13) {
        /*
            yki.i r0 = r11.f292263s
            boolean r1 = r13 instanceof vu5.d
            if (r1 == 0) goto L16
            r1 = r13
            vu5.d r1 = (vu5.d) r1
            int r2 = r1.f292259y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f292259y = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            vu5.d r1 = new vu5.d
            r1.<init>(r11, r13)
            goto L14
        L1c:
            java.lang.Object r13 = r7.f292257w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.f292259y
            r3 = 1
            r9 = 0
            r10 = 2
            if (r2 == 0) goto L41
            if (r2 == r3) goto L3a
            if (r2 != r10) goto L32
            nii.d r12 = r7.v
            yhm.o.b(r13)
            r2 = r11
            goto L96
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            boolean r12 = r7.u
            yhm.o.b(r13)
            r2 = r11
            goto L66
        L41:
            yhm.o.b(r13)
            o9a.v r4 = new o9a.v
            r13 = 15
            r4.<init>(r13)
            up4.h r5 = new up4.h
            r13 = 7
            r5.<init>(r13)
            uk9.h r6 = new uk9.h
            r13 = 20
            r6.<init>(r11, r9, r13)
            r7.u = r12
            r7.f292259y = r3
            r3 = 0
            r8 = 1
            r2 = r11
            java.lang.Object r13 = n14.k.Q(r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r1) goto L66
            goto L94
        L66:
            r11 = r13
            nii.e r11 = (nii.e) r11
            boolean r13 = r11 instanceof nii.d
            if (r13 == 0) goto La7
            oki.h.D2(r0)
            mu5.s r13 = r2.f292260p
            r13.getClass()
            mu5.q r0 = new mu5.q
            r3 = 1
            r0.<init>(r13, r3)
            pfm.n r13 = new pfm.n
            r13.<init>(r0, r3)
            java.lang.String r0 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            r0 = r11
            nii.d r0 = (nii.d) r0
            r7.v = r0
            r7.u = r12
            r7.f292259y = r10
            java.lang.Object r12 = nim.a.a(r13, r7)
            if (r12 != r1) goto L95
        L94:
            return r1
        L95:
            r12 = r11
        L96:
            com.revolut.kompot.common.ExternalDestination$Browser r11 = new com.revolut.kompot.common.ExternalDestination$Browser
            nii.d r12 = (nii.d) r12
            java.lang.Object r12 = r12.f216133a
            it5.b r12 = (it5.b) r12
            java.lang.String r12 = r12.f168343a
            r11.<init>(r12, r9)
            r2.C1(r11)
            goto Lac
        La7:
            if (r12 == 0) goto Lac
            oki.h.D2(r0)
        Lac:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vu5.h.I2(vu5.h, boolean, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        p0 p0Var = this.f292261q;
        l.a1(this, rd0.e.b(p0Var.d()), null, null, new e(this, null), 3);
        l.a1(this, rd0.e.b(p0Var.c()), null, null, new g(this, null), 3);
        l.a1(this, rd0.e.b(p0Var.f256147a.f()), null, null, new z1(this, null, 17), 3);
    }

    @Override // yji.l
    public final void K1() {
        this.f292261q.a();
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 6), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f292263s;
    }
}
