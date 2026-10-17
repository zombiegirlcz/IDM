package qx6;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import ox6.i;
import ox6.p;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f250026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jr6.n f250027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx6.b f250028c;

    public e(c actionsStateMapper, jr6.n invoiceMapper, tx6.b invoiceItemsMapper, ct6.c freelancerBannerFactory, qy6.b recurringInvoiceClauseFactory) {
        Intrinsics.checkNotNullParameter(actionsStateMapper, "actionsStateMapper");
        Intrinsics.checkNotNullParameter(invoiceMapper, "invoiceMapper");
        Intrinsics.checkNotNullParameter(invoiceItemsMapper, "invoiceItemsMapper");
        Intrinsics.checkNotNullParameter(freelancerBannerFactory, "freelancerBannerFactory");
        Intrinsics.checkNotNullParameter(recurringInvoiceClauseFactory, "recurringInvoiceClauseFactory");
        this.f250026a = actionsStateMapper;
        this.f250027b = invoiceMapper;
        this.f250028c = invoiceItemsMapper;
    }

    public static List b(FreelancerInvoice freelancerInvoice) {
        String str = freelancerInvoice.u;
        if (str == null || str.length() == 0) {
            return null;
        }
        List listC = u.c(new CellDetailsNoteDelegate.Model("ITEM_ID_INVOICE_NOTES", new TextLocalisedClause(R$string.freelancer_sale_details_section_note_title, null, null, 14), null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public final List a(List list) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_details_section_invoice_history_title, null, null, 14);
        m70.a.c(t0.f186434a);
        eVarB.add(new CellDetailsDelegate.Model("ITEM_ID_INVOICE_HISTORY", textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((tx6.e) this.f250027b).b((FreelancerInvoice) it8.next()));
        }
        a0.x(arrayList, eVarB);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    @Override // cli.n
    public final o c(j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f230624a, new qwd.o(22), new qsk.d(20), new qbg.j(this, 17));
    }

    public final List d(FreelancerInvoice freelancerInvoice) {
        if (freelancerInvoice == null) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_details_section_recurring_series_title, null, null, 14);
        m70.a.c(t0.f186434a);
        eVarB.add(new CellDetailsDelegate.Model("ITEM_ID_INVOICE_PARENT", textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        eVarB.add(((tx6.e) this.f250027b).b(freelancerInvoice));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
