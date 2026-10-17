package w28;

import ael.h0;
import cfl.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import dsh.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vge.f1;
import vkm.q;
import ybl.i;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements t28.g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f293969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zel.f f293970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f293971c;

    public b(i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        this.f293969a = productGroupAvailabilityInteractor;
        this.f293970b = zel.f.BOND;
        this.f293971c = new TextLocalisedClause(R$string.wealth_invest_widget_popular_bonds_error_title, null, null, 14);
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
        return this.f293970b;
    }

    @Override // t28.g
    public final Object d(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "PopularBondsDynamic")) {
            return Boolean.FALSE;
        }
        return q.x(rd0.e.e(mo3.a.g(nim.a.v(((h0) this.f293969a).b(p.BONDS), new w2.c(27)), null, new w2.d(3), 1), zhm.h0.f322473a, new f1(3, 14, null)), cVar);
    }

    @Override // t28.g
    public final TextLocalisedClause e() {
        return this.f293971c;
    }

    @Override // t28.g
    public final v28.c f(dsh.e eVar) {
        r.Companion.getClass();
        return new v28.b(r.a.b(eVar, 2), new TextLocalisedClause(R$string.wealth_invest_widget_popular_bonds_widget_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_widget_popular_bonds_action_see_all, null, null, 14));
    }
}
