package zh2;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("ID_SEND_MONEY_ACTION", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_wero, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.wero_payment_area_section_contact_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wero_payment_area_section_contact_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model2 = new RowDelegate.Model("ID_REQUEST_MONEY_ACTION", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_link, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.wero_payment_area_section_request_link_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model3 = new RowDelegate.Model("ID_QR_CODE_ACTION", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_scan_qr, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.wero_payment_area_section_pay_qr_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        return new d(v.k(model, model2, model3));
    }
}
