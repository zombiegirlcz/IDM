package l7k;

import aw0.o9;
import bnf.r;
import com.google.android.gms.tapandpay.TapAndPayStatusCodes;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.retail.feature.payments.core.R$string;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import thf.m;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements g7k.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f192704a;

    public b(t7k.a transferLinkMapper, m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(transferLinkMapper, "transferLinkMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f192704a = transactionTextResourcesMapper;
    }

    public static CompositeClause b(int i, int i2) {
        return new CompositeClause(v.k(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10)), new DotDividerClause((Integer) null), null, null, 12);
    }

    public static j8 c(int i) {
        return new j8(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 16, 16, 31), (Clause) null, 190));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(do3.n r30) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7k.b.a(do3.n):java.util.List");
    }

    public final List d(TransferLinkDetails.Active transferLink) {
        Intrinsics.checkNotNullParameter(transferLink, "transferLink");
        CompositeClause compositeClause = new CompositeClause(u.c(new TextLocalisedClause(R$string.bank_transfer_tracker_title_pending_steps, v.k("1", "3"), null, 12)), new DotDividerClause((Integer) null), null, null, 12);
        m70.a.c(t0.f186434a);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_TRACKER_HEADER", compositeClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        TimeClause timeClauseD = t7k.a.d(transferLink);
        int i = R$attr.uikit_colorBlue;
        List listK = v.k(model, new r40("ID_TRACKER_ROW_1", timeClauseD, new TextLocalisedClause(R$string.payment_link_tracker_title_created, null, null, 14), new TextLocalisedClause(R$string.payment_link_tracker_created_subtitle_expiration, u.c(((r) this.f192704a).q(transferLink.e)), null, 12), null, null, i, false, new o40(n40.PAST), 0, 0, 0, null, 16048), new r40("ID_TRACKER_ROW_2", null, new TextLocalisedClause(R$string.payment_link_tracker_title_claimed, null, null, 14), null, null, null, R$attr.uikit_colorBlue, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048), new r40("ID_TRACKER_ROW_3", null, new TextLocalisedClause(R$string.payment_link_tracker_title_received, null, null, 14), null, null, null, R$attr.uikit_colorGrey10, false, new o40(n40.FUTURE), 0, R$attr.uikit_dp16, 0, null, TapAndPayStatusCodes.TAP_AND_PAY_TOKENIZE_ERROR));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }
}
