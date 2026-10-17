package pyb;

import aw0.o9;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.gf;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.api.R$plurals;
import com.revolut.feature.rev_points.api.R$string;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import m1c.l0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Float, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.revolut.core.ui_kit.delegates.gf] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r19v5, types: [com.revolut.core.ui_kit.delegates.gf] */
    public final RowDelegate.Model a(l0 challenge) {
        boolean z;
        int i;
        RowDelegate.Model.c aVar;
        int i2;
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Integer num = challenge.f201391m;
        boolean z3 = challenge.f201393p;
        String str = challenge.f201384a;
        String strQ = j6.a.q("ACTIVE_ITEM_ID_", str);
        ?? gfVar = 0;
        gfVar = 0;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_challenge_v3_home_list_item, u.c(new TextClause(challenge.f201385b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextClause textClause = new TextClause(challenge.f201386c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(challenge.f, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) gfVar, (Integer) gfVar, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 60);
        boolean z4 = challenge.f201394q;
        if (z4) {
            String str2 = challenge.f201388h;
            aVar = new pf(str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.rev_points_challenge_v3_widget_start, null, null, 14), null, null, false, null, challenge.f201384a, OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED);
            z = z3;
            i = 0;
        } else if (z3) {
            z = z3;
            i = 0;
            aVar = new pf(new TextLocalisedClause(R$string.rev_points_challenge_v3_home_list_item_claim, null, null, 14), null, null, false, null, challenge.f201384a, OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED);
        } else if (num != null) {
            z = z3;
            i = 0;
            aVar = new RowDelegate.Model.c.a(new TagViewData(null, new TextLocalisedQuantityClause(R$plurals.rev_points_challenges_days_short, num, u.c(num), (Style) null, 24), new Color.Solid(R$attr.uikit_colorForeground_20), R$attr.uikit_colorTransparent, null, 1000), null, false, 6);
        } else {
            z = z3;
            i = 0;
            aVar = null;
        }
        if (!z && !z4) {
            int i3 = challenge.e.f201374c;
            if (i3 > 0) {
                i2 = (int) ((r2.f201373b / i3) * 100);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Total steps cannot be 0. Challenge id: ", str));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RevPointsChallengeItemMapper", null, illegalArgumentException, h0Var);
                i2 = i;
            }
            gfVar = new gf(i2);
        }
        return new RowDelegate.Model(strQ, image40, textLocalisedClause, null, 0, textClause, null, null, 0, aVar, false, null, false, null, null, null, null, null, gfVar, challenge, null, 0, 0, 0, 0, 530578392);
    }
}
