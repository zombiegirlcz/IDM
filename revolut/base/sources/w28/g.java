package w28;

import ael.h0;
import akg.n;
import cfl.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import dsh.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n0c.v;
import n1j.t;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements t28.g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n28.d f293976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zel.f f293977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f293978c;

    public g(n28.d investWidgetAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(investWidgetAvailabilityProvider, "investWidgetAvailabilityProvider");
        this.f293976a = investWidgetAvailabilityProvider;
        this.f293977b = zel.f.ETP;
        this.f293978c = new TextLocalisedClause(R$string.wealth_invest_widget_popular_etfs_error_title, null, null, 14);
    }

    @Override // t28.g
    public final List a(dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        r.a aVar = r.Companion;
        aVar.getClass();
        return u.c(r.a.a(aVar, inputConfig, null, String.valueOf(r.a.b(inputConfig, 2)), 6));
    }

    @Override // t28.g
    public final zel.f c() {
        return this.f293977b;
    }

    @Override // t28.g
    public final Object d(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "PopularETFsDynamic")) {
            return Boolean.FALSE;
        }
        n nVarV = nim.a.v(((h0) this.f293976a.f211454b).b(p.ETF), new t(6));
        zhm.h0 h0Var = zhm.h0.f322473a;
        return q.x(rd0.e.e(mo3.a.g(rd0.e.n(nVarV, h0Var), null, new v(12), 1), h0Var, new n28.b(3, 1, null)), cVar);
    }

    @Override // t28.g
    public final TextLocalisedClause e() {
        return this.f293978c;
    }

    @Override // t28.g
    public final v28.c f(dsh.e eVar) {
        r.Companion.getClass();
        return new v28.b(r.a.b(eVar, 2), new TextLocalisedClause(R$string.wealth_invest_widget_popular_etfs_widget_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_widget_popular_etfs_action_see_all, null, null, 14));
    }
}
