package h8d;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements jki.p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f150016a = new b();

        private b() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        m domainState = (m) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        List list = (List) iii.c.f(domainState.f149998c, new h8b.l(15), new h43.q(15), new gzb.d(this, 9));
        o oVar = domainState.f149996a;
        String str = oVar.f149999a;
        Data faqs = domainState.f149997b;
        boolean z = domainState.d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z ? R$string.help_center_search_section_results_title : R$string.help_center_search_section_articles_title, null, null, 14);
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp0;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_RESULTS", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i, i2, i2, i2, 4090);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        List list2 = (List) iii.c.f(faqs, new g7b.q(this, z, 7), new h43.q(this, 13), new b9d.k(6, str, this));
        s0 s0Var = new s0(2);
        s0Var.a(((Boolean) iii.c.f(faqs, new h8b.l(16), new h43.q(12), new gzb.d(7))).booleanValue() ? model : null);
        s0Var.b(list2.toArray(new koi.j[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        List listM = zhm.v.m(arrayList2.toArray(new koi.j[arrayList2.size()]));
        arrayList.addAll(list);
        arrayList.addAll(listM);
        o oVarA = o.a(oVar, 0, 15);
        Intrinsics.checkNotNullParameter(faqs, "faqs");
        return new p(arrayList, oVarA, (AnalyticsContext) iii.c.f(faqs, new h8b.l(14), new h43.q(14), new gzb.d(8)));
    }
}
