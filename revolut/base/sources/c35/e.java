package c35;

import cm4.h;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.tracking.v3.OpenCreditEntryPointContext;
import ft3.a1;
import ft3.d1;
import ft3.g1;
import g25.l;
import grl.r2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.j;
import qf1.k;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements pf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f20888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gz3.a f20889c;

    public e(h creditCardProductMapper, b35.a baseCreditAccountAddNewProductCategoryItemMapper, l creditApplicationAccountIconProvider, b35.g creditSearchKeywordsMapper, gz3.a startCreditApplicationNavigationDestinationProvider) {
        Intrinsics.checkNotNullParameter(creditCardProductMapper, "creditCardProductMapper");
        Intrinsics.checkNotNullParameter(baseCreditAccountAddNewProductCategoryItemMapper, "baseCreditAccountAddNewProductCategoryItemMapper");
        Intrinsics.checkNotNullParameter(creditApplicationAccountIconProvider, "creditApplicationAccountIconProvider");
        Intrinsics.checkNotNullParameter(creditSearchKeywordsMapper, "creditSearchKeywordsMapper");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f20887a = creditCardProductMapper;
        this.f20888b = creditApplicationAccountIconProvider;
        this.f20889c = startCreditApplicationNavigationDestinationProvider;
    }

    @Override // pf1.a
    public final k a(qf1.d dVar) {
        mp3.d item = (mp3.d) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        fs3.a aVar = fs3.b.Companion;
        d1 d1VarJ = l9.l.J(aVar, item.f207724b);
        fs3.b bVar = item.f207724b;
        fs3.g gVarH = l9.l.h(aVar, bVar);
        Object textLocalisedClause = new TextLocalisedClause(gVarH.f137583a, gVarH.f137584b, null, 12);
        int iB = this.f20888b.b(bVar);
        int i = R$string.credit_add_new_item_title;
        String str = item.f207725c;
        if (str != null) {
            textLocalisedClause = str;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(textLocalisedClause), null, 12);
        int i2 = R$string.credit_add_new_item_subtitle;
        Object objB = item.d;
        if (objB == null) {
            dj0.d dVarO = mo3.a.o(item.e);
            String str2 = item.f;
            objB = ((vt4.g) this.f20887a).b(dVarO, str2 != null ? new cl4.c(str2) : cl4.b.f24931a, item.f207726g, ll4.k.GET_CREDIT, null);
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i2, u.c(objB), null, 12);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        OpenCreditEntryPointContext.a aVarNewBuilder = OpenCreditEntryPointContext.newBuilder();
        aVarNewBuilder.h(r2.ADD_NEW_PRODUCT);
        aVarNewBuilder.i(jb3.l.w(d1VarJ));
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new k(iB, textLocalisedClause2, textLocalisedClause3, null, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), null, 40);
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) {
        mp3.d item = (mp3.d) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return b35.g.c(item.f207724b);
    }

    @Override // pf1.a
    public final j c(qf1.d dVar) {
        mp3.d item = (mp3.d) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new qf1.h(this.f20889c.c(g1.d(l9.l.J(fs3.b.Companion, item.f207724b), null, null, 3), new a1(r2.ADD_NEW_PRODUCT, null, null, null, null, 30), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.DEFAULT, (1916 & 16) != 0 ? null : item.i, (1916 & 32) != 0 ? yp3.f.SHOW_ALL : yp3.f.SKIP_ALL, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, yp3.b.DEFAULT, (1916 & 512) != 0 ? null : null, null));
    }
}
