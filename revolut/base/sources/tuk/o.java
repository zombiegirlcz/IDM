package tuk;

import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import u80.t;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274633a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f274634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f274635c;

    public o(ImmutableMap attributesMappers, ImmutableMap footerMappers) {
        Intrinsics.checkNotNullParameter(attributesMappers, "attributesMappers");
        Intrinsics.checkNotNullParameter(footerMappers, "footerMappers");
        this.f274634b = attributesMappers;
        this.f274635c = footerMappers;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        switch (this.f274633a) {
            case 0:
                f domainState = (f) iVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return new j(new TextLocalisedClause(R$string.trading_bonds_attributes_screen_title, null, null, 14), (List) iii.c.f(domainState.f274626b, new tsk.j(10), new tq0.j(20), new si5.c(domainState, this, 27)));
            default:
                ve1.d domainState2 = (ve1.d) iVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                BigDecimal bigDecimalD = ((t) this.f274635c).d(domainState2.f288104b);
                rd1.b bVar = (rd1.b) this.f274634b;
                String str = domainState2.f288103a;
                rd1.d dVar = (rd1.d) bVar;
                boolean z = false;
                List listK = v.k(dVar.d(str), dVar.c(domainState2.f288104b));
                if (!d0.W(str) && a.a.O(bigDecimalD)) {
                    z = true;
                }
                return new ve1.f(listK, z);
        }
    }

    public o(rd1.b catalogueCommonItemsFactory, t ratesMoneyUtils) {
        Intrinsics.checkNotNullParameter(catalogueCommonItemsFactory, "catalogueCommonItemsFactory");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        this.f274634b = catalogueCommonItemsFactory;
        this.f274635c = ratesMoneyUtils;
    }
}
