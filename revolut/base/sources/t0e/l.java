package t0e;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import sqd.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends oki.h implements g {
    public final zxd.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vyd.a f267012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n0e.b f267013q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f267014r;

    public l(n stateMapper, TaxFilingScreenContract$InputData inputData, zxd.c statementsInteractor, vyd.a dialogModelConfigurationFactory, n0e.b statementsNaviCommandsFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        this.o = statementsInteractor;
        this.f267012p = dialogModelConfigurationFactory;
        this.f267013q = statementsNaviCommandsFactory;
        this.f267014r = mra.d.b(this, new f(new Data(null, null, true, 3, null), inputData.f88394a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new h0(this, null, 9), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.lang.String r1 = "ID_TAX_YEAR_"
            boolean r0 = kotlin.text.a0.H(r4, r1, r0)
            if (r0 != 0) goto Lf
            goto L44
        Lf:
            java.lang.String r4 = kotlin.text.d0.e0(r4, r1)
            java.lang.Integer r4 = kotlin.text.z.m(r4)
            r0 = 0
            if (r4 == 0) goto L41
            int r4 = r4.intValue()
            cli.y r1 = r3.f267014r
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            t0e.f r1 = (t0e.f) r1
            com.revolut.data.model.Data r1 = r1.f267006b
            java.lang.Object r1 = r1.getContent()
            com.revolut.feature.statements.api.models.TaxFilingData r1 = (com.revolut.feature.statements.api.models.TaxFilingData) r1
            if (r1 == 0) goto L41
            java.util.List r1 = r1.getTaxYears()
            if (r1 == 0) goto L41
            java.lang.Object r4 = zhm.d0.e0(r4, r1)
            com.revolut.feature.statements.api.models.StatementPeriod r4 = (com.revolut.feature.statements.api.models.StatementPeriod) r4
            goto L42
        L41:
            r4 = r0
        L42:
            if (r4 != 0) goto L45
        L44:
            return
        L45:
            sy6.j r1 = new sy6.j
            r2 = 5
            r1.<init>(r3, r4, r0, r2)
            yi5.b r4 = new yi5.b
            r0 = 26
            r4.<init>(r0)
            r3.l2(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0e.l.I2(java.lang.String):void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f267014r;
    }
}
