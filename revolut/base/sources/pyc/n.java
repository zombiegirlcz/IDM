package pyc;

import aw0.k7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.a3;
import tof.w5;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements c {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f240790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f240791b;

    public n(thf.m transactionTextResourcesMapper, thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f240790a = transactionTextResourcesMapper;
        this.f240791b = transactionIconResourcesMapper;
    }

    public final RowDelegate.Model a(a3 a3Var, hyc.c cVar, boolean z) {
        Image resourceImage;
        String strQ = j6.a.q("TRANSACTION_LIST_ID", a3Var.f272579a);
        Image imageA = thf.d.a(this.f240791b, a3Var, r0.g(), r0.g(), null, null, null, null, null, null, null, null, 2040);
        TextClause textClause = new TextClause(thf.m.a(this.f240790a, a3Var, r0.g(), r0.g(), r0.g(), null, null, null, 240), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        w5 w5Var = a3Var.f272624y;
        DateTime dateTime = a3Var.f272593h;
        Clause timeClause = w5Var.f273145c == io3.i.EXTERNAL ? new TimeClause(dateTime.getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12) : new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
        LayeredImage layeredImageB = null;
        if (z) {
            ArrayList arrayList = new ArrayList();
            int i = cVar == null ? -1 : m.f240789b[cVar.ordinal()];
            if (i == -1) {
                arrayList.add(timeClause);
                arrayList.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                arrayList.add(new TextLocalisedClause(R$string.sot_state_need_verification, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
            } else if (i == 1) {
                arrayList.add(timeClause);
                arrayList.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                arrayList.add(new TextLocalisedClause(R$string.transaction_verification_items_header_action_required, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
            } else if (i == 2) {
                arrayList.add(timeClause);
                arrayList.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                arrayList.add(new TextLocalisedClause(R$string.sot_summary_to_be_reviewed, null, null, 14));
            } else if (i == 3) {
                arrayList.add(timeClause);
                arrayList.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                arrayList.add(new TextLocalisedClause(R$string.sot_state_under_review, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
            } else if (i != 4) {
                arrayList.add(timeClause);
            } else {
                arrayList.add(new TextLocalisedClause(R$string.sot_state_verified, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
            }
            timeClause = new CompositeClause(arrayList, null, null, null, 14);
        }
        RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(k71.k.b(a3Var), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), null, null, false, 126);
        if (z) {
            int i2 = cVar == null ? -1 : m.f240789b[cVar.ordinal()];
            if (i2 == -1 || i2 == 1) {
                layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_exclamation_mark, Integer.valueOf(R$attr.uikit_colorOrange), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
            } else if (i2 == 2) {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_20_transfer_pending, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            } else if (i2 == 3) {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_20_awaiting_approval, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            } else if (i2 == 4) {
                layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_check_legacy, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
            }
            resourceImage = layeredImageB;
        } else {
            resourceImage = layeredImageB;
        }
        return new RowDelegate.Model(strQ, imageA, null, null, textClause, timeClause, null, null, 0, bVar, z, false, resourceImage, null, null, null, null, new hyc.d(a3Var), null, 0, 0, 0, 0, 1056941932);
    }
}
