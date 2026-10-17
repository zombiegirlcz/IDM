package gq2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements j {
    public final pre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hk0.a f145539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f145540q;

    public n(cli.n stateMapper, TermsAndConditionsScreenContract$InputData inputData, pre.c termsInteractor, hk0.a networkFileRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        this.o = termsInteractor;
        this.f145539p = networkFileRepository;
        this.f145540q = mra.d.b(this, new h(0, 0, inputData.f64075a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new ge7.f(this, null, 23), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof gq2.m
            if (r0 == 0) goto L13
            r0 = r7
            gq2.m r0 = (gq2.m) r0
            int r1 = r0.f145538x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145538x = r1
            goto L18
        L13:
            gq2.m r0 = new gq2.m
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f145538x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            hk0.a r7 = r4.f145539p
            com.revolut.core.model.FileExtension$Pdf r2 = com.revolut.core.model.FileExtension.Pdf.f51406b
            ufm.n r6 = r7.b(r6, r3, r2)
            r0.u = r5
            r0.f145538x = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            java.io.File r7 = (java.io.File) r7
            gq2.f r6 = new gq2.f
            r6.<init>(r7, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.n.I2(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f145540q;
    }
}
