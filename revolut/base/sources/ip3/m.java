package ip3;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.corporate_events.impl.R$string;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p, f {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.feature_corporate_events_filter_screen_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.feature_corporate_events_filter_apply, null, null, 14);
        boolean z = true;
        boolean z3 = !domainState.f167632b.isEmpty();
        Set set = domainState.f167631a;
        Set set2 = domainState.f167632b;
        Set<iel.e> setH0 = d0.h0(ce9.m.c(), set);
        ArrayList arrayList = new ArrayList(w.t(setH0, 10));
        for (iel.e eVar : setH0) {
            arrayList.add(new InputChecklistDelegate.Model(j6.a.q("CORPORATE_EVENTS_EVENTS_FILTERS_", eVar.name()), new TextLocalisedClause(ce9.m.a(eVar), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), set2.contains(eVar), false, null, iq.CHECK_BUTTON, null, new ResourceImage(R$drawable.uikit_icn_24_line_indicator, (Integer) null, (Integer) null, Integer.valueOf(ce9.m.b(eVar)), (List) null, (ImageTransformations) null, (Clause) null, 246), eVar, null, 0, 0, 0, 523864));
            z = z;
        }
        boolean z4 = z;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.feature_corporate_events_filter_screen_title_event_types, null, null, 14);
        DotDividerClause dotDividerClause = new DotDividerClause((Integer) null);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.feature_corporate_events_filter_screen_title_event_types_count, v.k(Integer.valueOf(set2.size()), Integer.valueOf(set.size())), null, 12);
        TextClause textClause = new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28);
        Clause[] clauseArr = new Clause[5];
        clauseArr[0] = textLocalisedClause3;
        clauseArr[z4 ? 1 : 0] = dotDividerClause;
        clauseArr[2] = textLocalisedClause4;
        clauseArr[3] = textClause;
        clauseArr[4] = imageClause;
        return new k(textLocalisedClause, textLocalisedClause2, yp0.b.g(arrayList, new ListSubheaderDelegate.Model("CORPORATE_EVENTS_EVENTS_FILTERS_HEADER_ID", (Image) null, (Clause) new CompositeClause(v.k(clauseArr), null, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, z4, false, 5), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65466), null, 0, R$attr.uikit_dp48, LDSFile.EF_DG4_TAG), z3);
    }
}
