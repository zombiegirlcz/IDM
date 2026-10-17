package ovk;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreenContract$GlossaryTerm;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVar = domainState.f230245a;
        g gVar = new g(eVar.f230244b, eVar.f230243a);
        ArrayList arrayList = domainState.f230246b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            GlossaryScreenContract$GlossaryTerm glossaryScreenContract$GlossaryTerm = (GlossaryScreenContract$GlossaryTerm) obj2;
            PlainTextDelegate.Model model = new PlainTextDelegate.Model(a0.d.n("TERM_SECTION_", i), (UrlImage) null, glossaryScreenContract$GlossaryTerm.f103999a, glossaryScreenContract$GlossaryTerm.f104000b, (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
            i = i2;
        }
        return new h(gVar, arrayList2);
    }
}
