package sb3;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import com.revolut.feature.cash_topup.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import rp0.t;
import sb3.i;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends oki.h implements l {
    public final t1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f261490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f261491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ob3.b f261492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f261493s;

    public p(t1 barcodeInteractor, j60.a bottomDialogExtension, a dialogMapper, ob3.b barcodeScannedExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(barcodeInteractor, "barcodeInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(barcodeScannedExtension, "barcodeScannedExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = barcodeInteractor;
        this.f261490p = bottomDialogExtension;
        this.f261491q = dialogMapper;
        this.f261492r = barcodeScannedExtension;
        this.f261493s = mra.d.b(this, new h(null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void I2(String itemId) {
        BarcodeDetails barcode;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        int iHashCode = itemId.hashCode();
        j60.a aVar = this.f261490p;
        y yVar = this.f261493s;
        switch (iHashCode) {
            case -1822761528:
                if (itemId.equals("DELETE_LIST_ID")) {
                    C2(i.a.f261481a);
                    break;
                }
                break;
            case -1658575146:
                if (itemId.equals("ISSUE_LIST_ID")) {
                    C2(new k(((h) ((j2) yVar.f22677a).getValue()).f261480a));
                    break;
                }
                break;
            case -944351294:
                if (itemId.equals("INSTRUCTIONS_LIST_ID")) {
                    C2(i.d.f261484a);
                    break;
                }
                break;
            case 372017243:
                if (itemId.equals("LOCATIONS_LIST_ID")) {
                    C2(i.e.f261485a);
                    break;
                }
                break;
            case 1145887783:
                if (itemId.equals("GOT_IT_BUTTON_ID")) {
                    j60.a.v(aVar, false, null, 3);
                    break;
                }
                break;
            case 1190824067:
                if (itemId.equals("FEE_LIST_ID") && (barcode = ((h) ((j2) yVar.f22677a).getValue()).f261480a) != null) {
                    this.f261491q.getClass();
                    Intrinsics.checkNotNullParameter(barcode, "barcode");
                    t tVar = new t(new TextLocalisedClause(R$string.topup_cash_barcode_fee_tip_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_barcode_fee_tip_description, null, null, 14), null, 28);
                    rp0.l lVar = rp0.l.WINDOW;
                    s0 s0Var = new s0(2);
                    List listK = v.k(new CellDetailsDelegate.Model("AMOUNT_LIST_ID", new TextLocalisedClause(R$string.topup_cash_barcode_fee_tip_total, null, null, 14), new MoneyClause(barcode.f65586c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("FEE_LIST_ID", new TextLocalisedClause(R$string.topup_cash_barcode_fee_tip_fee_amount, null, null, 14), new MoneyClause(barcode.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("AMOUNT_AFTER_FEE_LIST_ID", new TextLocalisedClause(R$string.topup_cash_barcode_fee_tip_final_amount, null, null, 14), new MoneyClause(pyd.c.H(barcode.f65586c, barcode.d), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    s0Var.b(listK.toArray(new CellDetailsDelegate.Model[0]));
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.topup_cash_amount_dialog_button_common_got_it, null, null, 14), false, null, null, null, null, 1000);
                    yp0.b.r(model, 0, R$attr.uikit_dp24, 0, 0, 13);
                    s0Var.a(model);
                    ArrayList arrayList = s0Var.f186433a;
                    aVar.x(new rp0.y(v.k(arrayList.toArray(new Object[arrayList.size()])), tVar, lVar, null, null, null, 1016));
                }
                break;
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(this.o.j()), null, new n(this, null), 3);
        yji.l.b1(this, this.f261492r.Z2(), null, new o(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f261493s;
    }
}
