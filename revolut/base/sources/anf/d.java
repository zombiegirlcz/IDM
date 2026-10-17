package anf;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.xh0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements qhf.a {
    public final SwipeToActionDelegate.SwipeAction a(uhf.c action, a3 transaction) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        switch (c.f7732a[action.ordinal()]) {
            case 1:
                uhf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return new SwipeToActionDelegate.SwipeAction(action.name(), new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_resend, null, null, 14), xh0.PRIMARY, null, null, null, 112);
            case 2:
                uhf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return new SwipeToActionDelegate.SwipeAction(action.name(), new ResourceImage(R$drawable.uikit_icn_24_arrow_split, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_split_bill, null, null, 14), xh0.PRIMARY, null, null, null, 112);
            case 3:
                uhf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return new SwipeToActionDelegate.SwipeAction(action.name(), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), xh0.NEUTRAL, null, null, null, 112);
            case 4:
                uhf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return new SwipeToActionDelegate.SwipeAction(action.name(), new ResourceImage(R$drawable.uikit_icn_24_credit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_loans, null, null, 14), xh0.PRIMARY, null, null, null, 112);
            case 5:
                uhf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return new SwipeToActionDelegate.SwipeAction(action.name(), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_hide, null, null, 14), xh0.NEUTRAL, null, null, null, 112);
            case 6:
                uhf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return new SwipeToActionDelegate.SwipeAction(action.name(), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_unhide, null, null, 14), xh0.NEUTRAL, null, null, null, 112);
            case 7:
                uhf.b bVar = uhf.c.Companion;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                String strName = action.name();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_exclude, null, null, 14);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chart_exclude, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
                xh0 xh0Var = xh0.PRIMARY;
                String str = transaction.f272579a;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return new SwipeToActionDelegate.SwipeAction(strName, resourceImage, textLocalisedClause, xh0Var, com.google.android.gms.internal.mlkit_vision_face.a.o(str, "_", action.name()), null, null, 96);
            case 8:
                uhf.b bVar2 = uhf.c.Companion;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                String strName2 = action.name();
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_action_include, null, null, 14);
                ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
                xh0 xh0Var2 = xh0.PRIMARY;
                String str2 = transaction.f272579a;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return new SwipeToActionDelegate.SwipeAction(strName2, resourceImage2, textLocalisedClause2, xh0Var2, com.google.android.gms.internal.mlkit_vision_face.a.o(str2, "_", action.name()), null, null, 96);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
