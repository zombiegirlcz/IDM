package zrf;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.core.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends vrf.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f324721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yrf.a f324722m;

    public c(m transferInstalmentSelectionSectionProvider, yrf.a sectionDialogMapper) {
        Intrinsics.checkNotNullParameter(transferInstalmentSelectionSectionProvider, "transferInstalmentSelectionSectionProvider");
        Intrinsics.checkNotNullParameter(sectionDialogMapper, "sectionDialogMapper");
        this.f324721l = transferInstalmentSelectionSectionProvider;
        this.f324722m = sectionDialogMapper;
    }

    @Override // vrf.j
    public final List Z2(vrf.f fVar) {
        LocalDate localDate;
        vrf.c data = (vrf.c) fVar;
        Intrinsics.checkNotNullParameter(data, "data");
        LocalDate localDate2 = data.f291582b;
        dj0.d dVar = data.f291581a;
        a aVar = (localDate2 == null || (localDate = data.f291583c) == null) ? null : new a(dVar, localDate2, localDate);
        boolean z = aVar != null;
        List listC = u.c(new CellDetailsDelegate.Model("id_transfer_item_instalment_monthly_repayment", new t0(new TextLocalisedClause(R$string.payments_instalment_breakdown_sheet_item_monthly_repayment, null, null, 14), z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, 0, z, 20), sx4.f.b(3, null, null, dVar), null, aVar, null, null, 0, null, false, false, null, null, 32696));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    @Override // vrf.j
    public final boolean b3(vrf.f data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data instanceof vrf.c;
    }

    @Override // vrf.j
    public final boolean c3(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        dj0.d dVar = aVar.f324717a;
        LocalDate localDate = aVar.f324718b;
        LocalDate localDate2 = aVar.f324719c;
        this.f324722m.getClass();
        yji.n.P2(this, yrf.a.a(dVar, localDate, localDate2), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return true;
    }

    @Override // vrf.j
    public final Flow d3(vrf.i input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new zfd.e((j2) this.f324721l.f324738m.f22677a, 8);
    }
}
