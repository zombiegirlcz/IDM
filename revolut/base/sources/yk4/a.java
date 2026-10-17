package yk4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import ip0.yt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import yp0.b;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    public static final C1753a Companion = new C1753a();

    /* JADX INFO: renamed from: yk4.a$a, reason: collision with other inner class name */
    public static final class C1753a {
        private C1753a() {
        }
    }

    public static LargeActionButtonDelegate.Model a() {
        return new LargeActionButtonDelegate.Model("ID_BUTTON_CANCEL", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.credit_schedule_payment_set_day_confirmation_cancel_action, null, null, 14), false, null, null, null, null, 1000);
    }

    public static LargeActionButtonDelegate.Model b() {
        return new LargeActionButtonDelegate.Model("ID_BUTTON_CONTINUE", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_schedule_payment_set_day_confirmation_ok_action, null, null, 14), false, null, null, null, null, 744);
    }

    public static ListCellDelegate.Model c(int i, int i2, int i3, String str) {
        return new ListCellDelegate.Model(str, new j8(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), yt.TOP), new TextLocalisedClause(i2, null, null, 14), new TextLocalisedClause(i3, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
    }

    public static y d(a aVar) {
        aVar.getClass();
        t tVar = new t(new TextLocalisedClause(R$string.credit_autopay_set_day_direct_debit_payment_will_be_skipped_message_title, null, null, 14), new TextLocalisedClause(R$string.credit_autopay_set_day_direct_debit_payment_will_be_skipped_message_description, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model modelB = b();
        b.l(modelB, R$attr.uikit_dp24, 0, 0, 0, null, false, 62);
        LargeActionButtonDelegate.Model modelA = a();
        b.l(modelA, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        return new y(v.k(modelB, modelA), tVar, null, null, null, null, "SET_DATE_BOTTOM_DIALOG_DELEGATES_KEY", null, null, null, 3836);
    }

    public static y e(a aVar) {
        aVar.getClass();
        t tVar = new t(new TextLocalisedClause(R$string.credit_autopay_set_day_direct_debit_might_not_be_updated_message_title, null, null, 14), new TextLocalisedClause(R$string.credit_autopay_set_day_direct_debit_might_not_be_updated_message_description, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model modelB = b();
        b.l(modelB, R$attr.uikit_dp24, 0, 0, 0, null, false, 62);
        LargeActionButtonDelegate.Model modelA = a();
        b.l(modelA, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        return new y(v.k(modelB, modelA), tVar, null, null, null, null, "SET_DATE_BOTTOM_DIALOG_DELEGATES_KEY", null, null, null, 3836);
    }
}
