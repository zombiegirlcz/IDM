package hfh;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.private_companies.impl.R$string;
import i7d.j;
import i7d.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends oki.h implements dli.b {

    @NotNull
    private static final f Companion = new f();
    public final d1h.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f151916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f151917q;

    public h(d1h.e disclaimersModelExtension, o helpWidgetControllerModelExtension, i stateMapper) {
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = disclaimersModelExtension;
        this.f151916p = helpWidgetControllerModelExtension;
        this.f151917q = mra.d.b(this, new d(new d1h.g(null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ((gah.e) this.o).Z2(u.c(rdh.b.PRIVATE_COMPANY_ASSET_DETAILS)), null, null, new g(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.f151916p.Z2(new j("private-companies-asset-details-financials", new TextLocalisedClause(R$string.wealth_private_companies_asset_details_get_help, null, null, 14), new i7d.c("topic.trading"))), null, new g(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f151917q;
    }
}
