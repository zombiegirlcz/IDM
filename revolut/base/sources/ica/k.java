package ica;

import android.os.Parcelable;
import aw0.k7;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_REFUND_ORIGINAL_TRANSACTION_HEADER_TAG", (Image) null, (Clause) new TextLocalisedClause(R$string.pix_refund_review_label_original_transaction, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        String str = domainState.d;
        String str2 = domainState.f160225b;
        ContactImage contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_20_plus_badge, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextClause textClause = new TextClause(domainState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Instant instant = domainState.f;
        List listK = v.k(model, new RowDelegate.Model("ID_REFUND_ORIGINAL_TRANSACTION_TAG", contactImage, null, null, textClause, instant != null ? new TimeClause(instant.toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12) : null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(domainState.e, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), null, null, false, 126), false, false, resourceImage, null, null, null, null, null, null, 0, 0, 0, 0, 1073723244));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_REFUND_AMOUNT_TAG", new TextLocalisedClause(R$string.pix_refund_review_label_refund_amount, null, null, 14), new MoneyClause(domainState.f160224a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        CellDetailsNoteDelegate.Model model3 = new CellDetailsNoteDelegate.Model("ID_REFUND_REFERENCE_TAG", new TextLocalisedClause(R$string.pix_refund_reference_hint, null, null, 14), null, str2.length() == 0 ? null : new TextClause(domainState.f160225b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, str2.length() == 0 ? new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), str2.length() == 0 ? new TextLocalisedClause(R.string.common_action_add, null, null, 14) : new TextLocalisedClause(R$string.pix_refund_review_reference_edit, null, null, 14), null, null, null, 0, 130676);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        return new j(d0.E0(v.k(model2, model3), listK));
    }
}
