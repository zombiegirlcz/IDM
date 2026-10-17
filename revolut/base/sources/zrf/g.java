package zrf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.core.R$string;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends vrf.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f324730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yrf.a f324731m;

    public g(m transferInstalmentSelectionSectionProvider, yrf.a sectionDialogMapper) {
        Intrinsics.checkNotNullParameter(transferInstalmentSelectionSectionProvider, "transferInstalmentSelectionSectionProvider");
        Intrinsics.checkNotNullParameter(sectionDialogMapper, "sectionDialogMapper");
        this.f324730l = transferInstalmentSelectionSectionProvider;
        this.f324731m = sectionDialogMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit.models.Clause] */
    @Override // vrf.j
    public final List Z2(vrf.f fVar) {
        TextLocalisedClause textLocalisedClause;
        dj0.d dVar;
        LocalDate localDate;
        LocalDate localDate2;
        Object objF;
        dj0.d dVar2;
        vrf.d data = (vrf.d) fVar;
        Intrinsics.checkNotNullParameter(data, "data");
        CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
        dj0.d dVar3 = data.f291584a;
        TransferQuoteSplitOption transferQuoteSplitOption = data.f291586c;
        Object dVar4 = null;
        MoneyClause moneyClauseB = sx4.f.b(3, null, null, dVar3);
        if (data.d) {
            dj0.d dVar5 = transferQuoteSplitOption != null ? transferQuoteSplitOption.d : null;
            dj0.d dVar6 = data.f291585b;
            TextLocalisedClause textLocalisedClause2 = dVar5 != null ? new TextLocalisedClause(R$string.money_transfers_amount_input_per_month, u.c(sx4.f.b(3, null, null, dVar5)), null, 12) : null;
            if (dVar6 != null) {
                int i = R$string.money_transfers_amount_input_including_charges;
                if (transferQuoteSplitOption != null && (dVar2 = transferQuoteSplitOption.f92289b) != null) {
                    dVar6 = dVar2;
                }
                textLocalisedClause = new TextLocalisedClause(i, u.c(sx4.f.b(3, null, null, dVar6)), null, 12);
            } else {
                textLocalisedClause = null;
            }
            TextLocalisedClause[] elements = {textLocalisedClause2, textLocalisedClause};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            if (((ArrayList) listL).isEmpty()) {
                objF = new TextLocalisedClause(R$string.money_transfers_amount_input_no_fees, null, null, 14);
            } else {
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_info_outline, ImageClauseTint.TextColor.f57790a, (Float) null, (Float) null, 28);
                m70.a.a(t0.f186434a);
                CompositeClause compositeClause = new CompositeClause(v.k(imageClause, yoj.b.m(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL)), sx4.g.e(2), null, null, 12);
                int i2 = R$attr.uikit_colorGreyTone50;
                if (transferQuoteSplitOption != null && (dVar = transferQuoteSplitOption.d) != null && (localDate = transferQuoteSplitOption.e) != null && (localDate2 = transferQuoteSplitOption.f) != null) {
                    dVar4 = new d(dVar, localDate, localDate2);
                }
                objF = sx4.g.f(compositeClause, new Click(12, Integer.valueOf(i2), dVar4, "id_transfer_counter_text_hint", false));
            }
            dVar4 = objF;
        }
        CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(companion, "id_transfer_header", null, moneyClauseB, dVar4, null, null, 0, 0, 4082);
        yp0.b.r(modelA, 0, 0, 0, 0, 15);
        return u.c(modelA);
    }

    @Override // vrf.j
    public final boolean b3(vrf.f data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data instanceof vrf.d;
    }

    @Override // vrf.j
    public final boolean c3(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        dj0.d dVar2 = dVar.f324723a;
        LocalDate localDate = dVar.f324724b;
        LocalDate localDate2 = dVar.f324725c;
        this.f324731m.getClass();
        yji.n.P2(this, yrf.a.a(dVar2, localDate, localDate2), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return true;
    }

    @Override // vrf.j
    public final Flow d3(vrf.i input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new ymk.u((j2) this.f324730l.f324738m.f22677a, input, 15);
    }
}
