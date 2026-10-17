package y4h;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.assetdetails.ui.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import wx6.k;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4h.b f310946a;

    public i(u4h.a commonRatingScaleMapper, u4h.b fitchRatingMapper) {
        Intrinsics.checkNotNullParameter(commonRatingScaleMapper, "commonRatingScaleMapper");
        Intrinsics.checkNotNullParameter(fitchRatingMapper, "fitchRatingMapper");
        this.f310946a = fitchRatingMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        List list;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_bonds_ratings_details_header_title_fitch, null, null, 14);
        wdh.a aVar = domainState.f310938a;
        Data data = domainState.f310939b;
        if (data == null || (list = (List) iii.c.f(data, new y4b.b(this, 13), new y13.a(20), new k(aVar, this, 27))) == null) {
            list = f0.f322471a;
        }
        return new f(textLocalisedClause, list);
    }
}
