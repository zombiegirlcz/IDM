package htf;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    public t(isf.c selectionMapper) {
        Intrinsics.checkNotNullParameter(selectionMapper, "selectionMapper");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        RowDelegate.Model model;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransferReasonCategory transferReasonCategory = domainState.f155366b;
        Set set = domainState.e;
        aim.e eVarB = u.b();
        eVarB.addAll(isf.c.a(d0.V0(transferReasonCategory.d, 4), set, transferReasonCategory.e));
        if (transferReasonCategory.d.size() > 4) {
            eVarB.add(new LargeActionButtonDelegate.Model("MAIN_REASON_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, transferReasonCategory, null, 744));
        }
        aim.e eVarA = u.a(eVarB);
        String str = transferReasonCategory.f92437c;
        ArrayList arrayListG = yp0.b.g(eVarA, new ListSubheaderDelegate.Model("MAIN_REASON_SUBHEADER_ID", (Image) null, (Clause) (str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        h hVar = domainState.f155367c;
        ArrayList<TransferReasonCategory> arrayList = hVar.f155369b;
        ArrayList arrayList2 = new ArrayList();
        for (TransferReasonCategory transferReasonCategory2 : arrayList) {
            String str2 = transferReasonCategory2.f92437c;
            if (str2 != null) {
                TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String strQ = j6.a.q("OTHER_CATEGORY_ID_", transferReasonCategory2.f92437c);
                yy0.i iVar = yy0.l.Companion;
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                iVar.getClass();
                model = new RowDelegate.Model(strQ, null, textClause, null, 0, null, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, transferReasonCategory2, null, 0, 0, 0, 0, 532675578);
            } else {
                model = null;
            }
            if (model != null) {
                arrayList2.add(model);
            }
        }
        return new p(d0.E0(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("OTHER_CATEGORY_SUBHEADER_ID", (Image) null, (Clause) hVar.f155368a, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayListG), !set.isEmpty(), domainState.f);
    }
}
