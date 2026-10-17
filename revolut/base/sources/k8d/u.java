package k8d;

import a83.w0;
import android.os.Parcelable;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import jck.y;
import kotlin.jvm.internal.Intrinsics;
import yp0.e0;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f182128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9d.l f182129b;

    public u(p9d.c doneButtonProvider, l8d.b faqListTransactionsMapper, p9d.l searchHintProvider) {
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        Intrinsics.checkNotNullParameter(faqListTransactionsMapper, "faqListTransactionsMapper");
        Intrinsics.checkNotNullParameter(searchHintProvider, "searchHintProvider");
        this.f182128a = doneButtonProvider;
        this.f182129b = searchHintProvider;
    }

    public static List b(ArrayList arrayList, boolean z) {
        if (z) {
            return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("FAQ_LIST_SUB_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.help_center_section_actions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = (Clause) iii.c.f(domainState.f182108a, new k7c.d(22), new s(1), new t(0));
        aim.e eVarB = zhm.u.b();
        eVarB.addAll((List) iii.c.f(domainState.d, new y((Object) this, false, 13), new s(0), new w0((Object) this, false, 6)));
        FaqNodeBase faqNodeBase = (FaqNodeBase) domainState.f182109b.getContent();
        eVarB.addAll((List) iii.c.f(domainState.e, new k7c.d(23), new s(2), new b9d.k(faqNodeBase != null ? faqNodeBase.getF51434a() : null, 7)));
        return new m(zhm.u.a(eVarB), clause, ((p9d.m) this.f182129b).a(), ((p9d.d) this.f182128a).a(domainState.f182111g));
    }
}
