package ku1;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import ip0.gn0;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import tof.l2;
import tof.l3;

/* JADX INFO: loaded from: classes20.dex */
public final class i0 implements jki.p {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f189613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f189614b;

    public i0(thf.c transactionCategoryResourcesMapper, j0 feeBreakdownMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(feeBreakdownMapper, "feeBreakdownMapper");
        this.f189613a = transactionCategoryResourcesMapper;
        this.f189614b = feeBreakdownMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        Collection collectionI;
        qv0.i iVar2;
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        c02.j jVar = domainState.f189608a;
        if (jVar == null) {
            return new o(zhm.f0.f322471a, false);
        }
        dj0.d dVar = jVar.f20116c;
        Data data = domainState.f189609b;
        Data pocketData = domainState.f189610c;
        Data quoteData = domainState.d;
        aim.e eVarB = zhm.u.b();
        eVarB.add(new gn0("TWO_LOGOS_HEADER_LIST_ID", ApmBlik.f61809c.j()));
        long j2 = jVar.f20118h;
        c02.b bVar = jVar.e;
        long j3 = j2 - jVar.f20117g;
        int i = h0.f189611a[jVar.f20115b.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_pos_payment_title, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_atm_withdraw_title, null, null, 14);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_online_payment_title, null, null, 14);
        } else if (i == 4) {
            textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_online_refund_title, null, null, 14);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_pos_refund_title, null, null, 14);
        }
        eVarB.add(new np0.b("TIMER_LIST_ID", j3, j2, textLocalisedClause));
        String str = bVar.f20099b;
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        TimeClause timeClause = new TimeClause(jVar.i, TimeClause.Format.TimeDefault.f57977b, null, null, 12);
        TextClause textClause2 = new TextClause(bVar.f20098a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause clause = textClause == null ? timeClause : textClause;
        TimeClause timeClause2 = textClause != null ? timeClause : null;
        RowDelegate.Model.c.b bVar2 = new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
        String strB = jVar.f;
        if (strB == null) {
            strB = l3.b(l2.GENERAL);
        }
        RowDelegate.Model model = new RowDelegate.Model("MERCHANT_LIST_ID", new RowDelegate.Model.MainImage.Image40(((wjf.e) this.f189613a).h(strB), null, null, false, null, false, 60), textClause2, null, 0, clause, timeClause2, null, 0, bVar2, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869784);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        qv0.i iVar3 = (qv0.i) iii.c.f(pocketData, new ksk.h(10), new f0(1), new koe.y(this, dVar, (c02.f) quoteData.getContent()));
        if (iVar3 == null || (collectionI = yp0.b.i(iVar3, new ListSubheaderDelegate.Model("ID_PAYMENT_FROM_ITEM_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_payment_from_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp32, LDSFile.EF_DG4_TAG)) == null) {
            collectionI = zhm.f0.f322471a;
        }
        eVarB.addAll(collectionI);
        Intrinsics.checkNotNullParameter(quoteData, "quoteData");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        j0 j0Var = this.f189614b;
        eVarB.addAll((List) iii.c.f(quoteData, new ksk.h(j0Var, 11), new f0(2), new dbg.a(pocketData, j0Var)));
        Address address = bVar.f20100c;
        if (address != null && (iVar2 = (qv0.i) iii.c.f(data, new ksk.h(9), new f0(0), new kcg.j(address, 13))) != null) {
            eVarB.add(iVar2);
        }
        return new o(zhm.u.a(eVarB), true);
    }
}
