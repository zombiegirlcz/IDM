package r0e;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements dli.b {
    public final zxd.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vyd.a f250780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n0e.b f250781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f250782r;

    public m(cli.n stateMapper, zxd.c statementsInteractor, vyd.a dialogModelConfigurationFactory, n0e.b statementsNaviCommandsFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        this.o = statementsInteractor;
        this.f250780p = dialogModelConfigurationFactory;
        this.f250781q = statementsNaviCommandsFactory;
        this.f250782r = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new qc8.b(this, null, 20), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
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
            java.lang.String r1 = "ID_TAX_PERIOD_"
            boolean r0 = kotlin.text.a0.H(r4, r1, r0)
            if (r0 != 0) goto Lf
            goto L3e
        Lf:
            java.lang.String r4 = kotlin.text.d0.e0(r4, r1)
            java.lang.Integer r4 = kotlin.text.z.m(r4)
            r0 = 0
            if (r4 == 0) goto L3b
            int r4 = r4.intValue()
            cli.y r1 = r3.f250782r
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            r0e.g r1 = (r0e.g) r1
            com.revolut.data.model.Data r1 = r1.f250773a
            java.lang.Object r1 = r1.getContent()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L3b
            java.lang.Object r4 = zhm.d0.e0(r4, r1)
            com.revolut.feature.statements.api.models.StatementPeriod r4 = (com.revolut.feature.statements.api.models.StatementPeriod) r4
            goto L3c
        L3b:
            r4 = r0
        L3c:
            if (r4 != 0) goto L3f
        L3e:
            return
        L3f:
            qp7.g r1 = new qp7.g
            r2 = 18
            r1.<init>(r3, r4, r0, r2)
            yi5.b r4 = new yi5.b
            r0 = 26
            r4.<init>(r0)
            r3.l2(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0e.m.I2(java.lang.String):void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f250782r;
    }
}
