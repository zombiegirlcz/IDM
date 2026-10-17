package x8i;

import bde.o;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerActivity;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import d71.j;
import d71.k;
import ip0.c2;
import ip0.nb0;
import ip0.pb0;
import ip0.yo0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x94.n;
import xzg.m0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303413a;

    public /* synthetic */ h(int i) {
        this.f303413a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        j jVar;
        int i = this.f303413a;
        LitePosFlowContract$Step.Catalogue catalogue = LitePosFlowContract$Step.Catalogue.f60732a;
        z = false;
        z = false;
        boolean z = false;
        switch (i) {
            case 0:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.getContent() != null);
            case 1:
                int i2 = CreditApplicationDocumentViewerActivity.z0;
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                int i3 = jli.h.f175850a;
                return Unit.f186387a;
            case 2:
                Pair it9 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(((su3.a) it9.f186386b).f265637c);
            case 3:
                Pair it10 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (su3.a) it10.f186386b;
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                yo0 yo0Var = (yo0) pair.f186385a;
                List list = (List) pair.f186386b;
                if (n.f303557a[yo0Var.ordinal()] == 1) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it11 = list2.iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                if (Intrinsics.f(((koi.j) it11.next()).getF52424a(), "id_anchor_item_id")) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ArrayList arrayList = new ArrayList(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    arrayList.add(nb0.b(pb0.Companion, String.valueOf(i5), false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new x9b.e(arrayList);
            case 6:
                x9f.h update = (x9f.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new x9f.h(null, true, false);
            case 7:
                zel.h result = (zel.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ArrayList arrayList2 = result.f321803b;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it12 = arrayList2.iterator();
                while (it12.hasNext()) {
                    arrayList3.add(new vel.g(((ScreenerInstrument) it12.next()).f105162a, vel.h.STOCK, (dj0.d) null, 12));
                }
                return arrayList3;
            case 8:
                m0 it13 = (m0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f310013b;
            case 9:
                m0 it14 = (m0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f310014c;
            case 10:
                Intrinsics.checkNotNullParameter((ya0.b) obj2, "it");
                return Unit.f186387a;
            case 11:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.TRUE;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ContactsWidgetDelegate.Model.Companion companion = ContactsWidgetDelegate.Model.INSTANCE;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_area_contacts_title, null, null, 14);
                c2 c2Var = c2.CIRCLE;
                companion.getClass();
                return u.c(ContactsWidgetDelegate.Model.Companion.a("PIX_AREA_BENEFICIARY_WIDGET_ID", textLocalisedClause, c2Var, null, null));
            case 13:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(RowsWidgetDelegate.Model.Companion.g(RowsWidgetDelegate.Model.INSTANCE, "ApmAreaTransactionsMapper_header", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_area_transactions_title, null, null, 14)));
            case 15:
                do3.n it15 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it15);
            case 16:
                NaviCommand it16 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it16);
            case 17:
                NaviCommand it17 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it17);
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 19:
                xag.c updateFilters = (xag.c) obj2;
                Intrinsics.checkNotNullParameter(updateFilters, "$this$updateFilters");
                return xag.c.b(updateFilters, c8g.a.x(updateFilters.f303876a), null, null, 6);
            case 20:
                xag.c updateFilters2 = (xag.c) obj2;
                Intrinsics.checkNotNullParameter(updateFilters2, "$this$updateFilters");
                return xag.c.b(updateFilters2, null, c8g.a.x(updateFilters2.f303877b), null, 5);
            case 21:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "args");
                throw null;
            case 22:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return new xb1.f();
            case 23:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "args");
                throw null;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return xb6.i.b();
            case 25:
                ((Function0) obj2).invoke();
                return Unit.f186387a;
            case 26:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Boolean bool = (Boolean) pair2.f186385a;
                boolean zBooleanValue = ((Boolean) pair2.f186386b).booleanValue();
                tcb.a aVar = tcb.a.MONEY;
                tcb.a aVar2 = tcb.a.TRADING;
                Intrinsics.h(bool);
                if (!bool.booleanValue()) {
                    aVar2 = null;
                }
                tcb.a[] elements = {aVar, aVar2, zBooleanValue ? tcb.a.CRYPTO : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 27:
                List banners = (List) obj2;
                Intrinsics.checkNotNullParameter(banners, "banners");
                List<o> list3 = banners;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                for (o oVar : list3) {
                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                    String title = oVar.getTitle();
                    String content = oVar.getContent();
                    bde.n mainAction = oVar.getMainAction();
                    Intrinsics.checkNotNullParameter(mainAction, "<this>");
                    j jVar2 = new j(mainAction.getTitle(), mainAction.getLink());
                    bde.n secondaryAction = oVar.getSecondaryAction();
                    if (secondaryAction != null) {
                        Intrinsics.checkNotNullParameter(secondaryAction, "<this>");
                        jVar = new j(secondaryAction.getTitle(), secondaryAction.getLink());
                    } else {
                        jVar = null;
                    }
                    arrayList4.add(new d71.i(title, content, jVar2, jVar, oVar.getImage()));
                }
                return new k(arrayList4);
            case 28:
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.a update2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.a.a(update2, catalogue.getF70838b(), null, null, 13);
            default:
                return com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.a.a((com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.a) obj2, catalogue.getF70838b(), null, null, 13);
        }
    }
}
