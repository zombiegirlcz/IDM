package zrf;

import aw0.o9;
import cm4.o;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetController;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetControllerContract$InputData;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.core.R$plurals;
import com.revolut.retail.feature.payments.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import yhm.m;
import ymk.u;
import zhm.d0;
import zhm.v;
import zhm.w;
import zrd.q;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends vrf.j implements vki.b {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vt4.h f324737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vki.a f324738m;

    public m(vt4.h creditCardSuggestedBarDelegateMapper) {
        Intrinsics.checkNotNullParameter(creditCardSuggestedBarDelegateMapper, "creditCardSuggestedBarDelegateMapper");
        this.f324737l = creditCardSuggestedBarDelegateMapper;
        this.f324738m = pyd.c.a(this, j.f324735a);
    }

    @Override // vrf.j
    public final List Z2(vrf.f fVar) {
        List listK;
        vrf.b data = (vrf.b) fVar;
        Intrinsics.checkNotNullParameter(data, "data");
        TransferQuoteSplit transferQuoteSplit = data.f291579a;
        int i = data.f291580b;
        ArrayList arrayList = transferQuoteSplit.f92287a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(Integer.valueOf(((TransferQuoteSplitOption) it8.next()).f92290c));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transfer_instalments_select_term_item_split_in, null, null, 14);
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.transfer_common_instalments, Integer.valueOf(i), (List) null, (Style) null, 28);
        List listO0 = d0.O0(arrayList2);
        if (listO0.size() <= 6) {
            listK = arrayList2;
        } else {
            listK = ((Number) d0.m0(listO0)).intValue() <= 12 ? v.k(1, 3, 6, 9, 12) : v.k(1, 6, 12, 24, 36);
        }
        return this.f324737l.b(textLocalisedClause, textLocalisedQuantityClause, i, arrayList2, listK, 6);
    }

    @Override // vrf.j
    public final boolean b3(vrf.f data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data instanceof vrf.b;
    }

    @Override // vrf.j
    public final boolean c3(Object obj2, String listId) throws Throwable {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = 0;
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        if (oVar instanceof cm4.n) {
            X2(this.f324738m, new v1.m(18, new sx4.b(obj2, 25)));
            return true;
        }
        if (!(oVar instanceof cm4.m)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<TransferQuoteSplitOption> arrayList = e3().f324733b.f92287a;
        if (arrayList.isEmpty()) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException("Quote split options are empty: unable to show instalment picker");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (TransferQuoteSplitOption transferQuoteSplitOption : arrayList) {
                int i2 = transferQuoteSplitOption.f92290c;
                dj0.d dVar = transferQuoteSplitOption.d;
                if (dVar == null) {
                    dVar = e3().f324734c;
                }
                List listK = v.k(new TextLocalisedQuantityClause(R$plurals.transfer_common_instalments, Integer.valueOf(i2), (List) null, (Style) null, 28), sx4.f.b(3, null, null, dVar));
                m70.a.a(t0.f186434a);
                arrayList2.add(new gy4.j(new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), Integer.valueOf(i2)));
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transfer_instalments_select_term_sheet_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.transfer_instalments_select_term_sheet_action, null, null, 14);
            Iterator it8 = arrayList2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    i = -1;
                    break;
                }
                if (((Integer) ((gy4.j) it8.next()).f147828b).intValue() == e3().f324732a) {
                    break;
                }
                i++;
            }
            N2(new PickerBottomSheetController(new PickerBottomSheetControllerContract$InputData(textLocalisedClause, textLocalisedClause2, arrayList2, i)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new q(this, 2));
        }
        return true;
    }

    @Override // vrf.j
    public final Flow d3(vrf.i input) {
        Intrinsics.checkNotNullParameter(input, "input");
        TransferQuoteSplit transferQuoteSplit = input.d;
        if (transferQuoteSplit != null) {
            ArrayList arrayList = transferQuoteSplit.f92287a;
            if (arrayList.size() > 1) {
                vki.a aVar = this.f324738m;
                if (!(((j2) aVar.f22677a).getValue() instanceof i)) {
                    X2(aVar, new a94.e(((TransferQuoteSplitOption) d0.b0(arrayList)).f92290c, transferQuoteSplit, input, 17));
                }
                return vkm.q.q(new u(new vkm.t0(aVar.B(new zr2.o(8)), 1), input, 16));
            }
        }
        return new go.g(vrf.a.f291578a, 2);
    }

    public final i e3() {
        vki.a aVar = this.f324738m;
        Object value = ((j2) aVar.f22677a).getValue();
        i iVar = value instanceof i ? (i) value : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(((j2) aVar.f22677a).getValue(), "State.Content is required but current state is "));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f324738m;
    }
}
