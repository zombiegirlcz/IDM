package b35;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.tracking.v3.OpenCreditEntryPointContext;
import dx4.a1;
import ft3.d1;
import ft3.g1;
import g25.l;
import grl.r2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mp3.h;
import mx0.pc;
import qf1.k;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements pf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f12001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gz3.a f12002b;

    public a(l creditApplicationAccountIconProvider, gz3.a startCreditApplicationNavigationDestinationProvider) {
        Intrinsics.checkNotNullParameter(creditApplicationAccountIconProvider, "creditApplicationAccountIconProvider");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f12001a = creditApplicationAccountIconProvider;
        this.f12002b = startCreditApplicationNavigationDestinationProvider;
    }

    @Override // pf1.a
    public final /* bridge */ List b(qf1.d dVar) {
        return super.b((h) dVar);
    }

    @Override // pf1.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final k a(h item) {
        Intrinsics.checkNotNullParameter(item, "item");
        fs3.a aVar = fs3.b.Companion;
        d1 d1VarJ = l9.l.J(aVar, item.a());
        fs3.g gVarH = l9.l.h(aVar, item.a());
        int iB = this.f12001a.b(item.a());
        Integer numD = item.d();
        if (numD != null) {
            iB = numD.intValue();
        }
        int i = iB;
        int i2 = R$string.credit_add_new_item_title;
        Object title = item.getTitle();
        if (title == null) {
            title = new TextLocalisedClause(gVarH.f137583a, gVarH.f137584b, null, 12);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, u.c(title), null, 12);
        int i3 = R$string.credit_add_new_item_subtitle;
        Object objC = item.c();
        if (objC == null) {
            objC = new TextLocalisedClause(gVarH.f137585c, gVarH.d, null, 12);
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i3, u.c(objC), null, 12);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        OpenCreditEntryPointContext.a aVarNewBuilder = OpenCreditEntryPointContext.newBuilder();
        aVarNewBuilder.h(r2.ADD_NEW_PRODUCT);
        aVarNewBuilder.i(jb3.l.w(d1VarJ));
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        AnalyticsContext analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        List<mp3.k> listP = item.p();
        ArrayList arrayList = new ArrayList(w.t(listP, 10));
        for (mp3.k kVar : listP) {
            String strQ = j6.a.q("entry_point_tag_", kVar.f207738b);
            TagViewData.Companion companion2 = TagViewData.INSTANCE;
            String str = kVar.f207738b;
            a1 a1Var = kVar.f207737a;
            Integer numValueOf = a1Var != null ? Integer.valueOf(a1Var.c()) : null;
            int i5 = R$attr.uikit_colorPopoverBackground;
            int i6 = R$attr.uikit_colorForeground;
            companion2.getClass();
            arrayList.add(new pc(strQ, TagViewData.Companion.c(str, i5, i6, numValueOf), null));
        }
        return new k(i, textLocalisedClause, textLocalisedClause2, null, analyticsContext, arrayList, 8);
    }

    @Override // pf1.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final qf1.h c(h item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new qf1.h(this.f12002b.c(g1.d(l9.l.J(fs3.b.Companion, item.a()), null, null, 3), new ft3.a1(r2.ADD_NEW_PRODUCT, null, null, null, null, 30), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.DEFAULT, (1916 & 16) != 0 ? null : item.b(), (1916 & 32) != 0 ? yp3.f.SHOW_ALL : null, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, yp3.b.DEFAULT, (1916 & 512) != 0 ? null : null, null));
    }
}
