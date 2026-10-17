package j12;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import eii.l;
import grl.k9;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends n implements v02.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v02.c f170112l;

    public b(v02.c dialogProvider) {
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.f170112l = dialogProvider;
    }

    public final void Z2(Alias alias, Function1 onConfirmed) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(onConfirmed, "onConfirmed");
        d dVar = (d) this.f170112l;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(alias, "alias");
        a aVar = (a) dVar.f170113a;
        TextClause textClauseD = aVar.d(alias);
        int i = R$string.apm_placeholder_separator_dot;
        Clause[] elements = {aVar.c(alias.f61878a), aVar.b(alias)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        lw0.a aVar2 = new lw0.a(textClauseD, new TextLocalisedClause(i, kotlin.collections.d.L(elements), null, 12), null, null, false, 28);
        Clause clause = null;
        boolean z = true;
        boolean z3 = false;
        List listC = u.c(new l(new TextLocalisedClause(R$string.apm_alias_actions_delete_title_generic, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), clause, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_delete, R$attr.uikit_colorStatusDanger, R$attr.uikit_colorStatusDanger_10), null, null, false, null, false, 60), z, z3, (RowDelegate.Model.c) null, alias, 232));
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        N2(new RowActionsBottomSheetController(new eii.c(aVar2, null, listC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new hsa.l(this, 29, alias, onConfirmed));
    }
}
