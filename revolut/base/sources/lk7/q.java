package lk7;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import koe.y;
import kotlin.jvm.internal.Intrinsics;
import ljl.n1;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f196295a;

    public q(r limitSectionItemsProvider, b coverageIconMapper, t productSummaryProvider) {
        Intrinsics.checkNotNullParameter(limitSectionItemsProvider, "limitSectionItemsProvider");
        Intrinsics.checkNotNullParameter(coverageIconMapper, "coverageIconMapper");
        Intrinsics.checkNotNullParameter(productSummaryProvider, "productSummaryProvider");
        this.f196295a = limitSectionItemsProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f196275a, new n1(15), new m(0), new n(domainState, this));
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_ITEM_SUBHEADER_COVERAGE", (Image) null, (Clause) new TextLocalisedClause(R$string.cfac_policy_details_coverage, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        Data data = domainState.f196275a;
        ArrayList arrayListE0 = d0.E0((List) iii.c.f(data, new o(model, 1), new m(3), new y(domainState, model, this)), list);
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_ITEM_SUBHEADER_LIMITS", (Image) null, (Clause) new TextLocalisedClause(R$string.cfac_policy_details_limits, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        ArrayList arrayListE02 = d0.E0((List) iii.c.f(data, new n1(13), new m(2), new ldj.g(2)), d0.E0((List) iii.c.f(data, new n1(this, 14), new m(4), new y(this, domainState, 18)), d0.E0((List) iii.c.f(data, new o(this, model2), new m(1), new p(this, 0, domainState, model2)), arrayListE0)));
        CdnImage cdnImageA = domainState.f196276b.f115711a == dl7.a.TRIP_CANCELLATION ? cl7.b.a(cl7.a.TripCancellation) : cl7.b.a(cl7.a.TicketCancellation);
        return new k(arrayListE02, (h) iii.c.f(data, new l9k.v(domainState, cdnImageA, 23), new lcc.c(cdnImageA, 19), new y(domainState, cdnImageA, 16)), data.getContent() != null);
    }
}
