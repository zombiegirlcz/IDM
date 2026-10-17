package vne;

import aw0.o9;
import cli.n;
import cli.y;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.exemption.flows.main.TaxExemptionFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import vdl.c1;
import vfg.m;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends oki.h implements f {

    @NotNull
    public static final h Companion = new h();
    public final TaxExemptionFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nne.b f290802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f290803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f290804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f290805s;

    public i(TaxExemptionFlowContract$InputData inputData, n stateMapper, nne.b taxExemptionInteractor, j60.a bottomExpandableDialogExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(taxExemptionInteractor, "taxExemptionInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        this.o = inputData;
        this.f290802p = taxExemptionInteractor;
        this.f290803q = bottomExpandableDialogExtension;
        this.f290804r = new vii.b();
        this.f290805s = mra.d.b(this, new c(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f290804r, new c1(continuation, this, 19)), null, null, new m(this, continuation, 18), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            this.f290804r.a();
            return;
        }
        boolean zF = Intrinsics.f(listId, "EXEMPTION_DETAIL_ROW");
        TaxExemptionAggregate taxExemptionAggregate = null;
        Object obj3 = null;
        y yVar = this.f290805s;
        if (zF || Intrinsics.f(listId, "EXEMPTION_EDIT_ROW")) {
            List list = (List) ((c) ((j2) yVar.f22677a).getValue()).f290797a.getContent();
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (Intrinsics.f(s.k((TaxExemptionAggregate) next), ((c) ((j2) yVar.f22677a).getValue()).f290798b)) {
                        obj3 = next;
                        break;
                    }
                }
                taxExemptionAggregate = (TaxExemptionAggregate) obj3;
            }
            if (taxExemptionAggregate != null) {
                C2(new d(taxExemptionAggregate));
                return;
            }
            return;
        }
        boolean zF2 = Intrinsics.f(listId, "YEAR_SELECTION_ID");
        j60.a aVar = this.f290803q;
        if (!zF2) {
            if (Intrinsics.f(listId, "FAQ_LINK")) {
                C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.set-up-a-tax-exemption-order", true))));
                return;
            } else {
                if (obj2 instanceof TaxExemptionAggregate) {
                    H2(yVar, new vh2.j((TaxExemptionAggregate) obj2, 21));
                    j60.a.v(aVar, false, null, 3);
                    return;
                }
                return;
            }
        }
        List exemptions = (List) ((c) ((j2) yVar.f22677a).getValue()).f290797a.getContent();
        if (exemptions != null) {
            String str = ((c) ((j2) yVar.f22677a).getValue()).f290798b;
            Intrinsics.checkNotNullParameter(exemptions, "exemptions");
            t tVar = new t(new TextLocalisedClause(R$string.tax_exemption_tax_year_select_title, null, null, 14), null, null, 30);
            rp0.l lVar = rp0.l.WINDOW;
            List<TaxExemptionAggregate> list2 = exemptions;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (TaxExemptionAggregate taxExemptionAggregate2 : list2) {
                arrayList.add(new SingleChoiceDelegate.Model(j6.a.q("EXEMPTION_ITEM_", taxExemptionAggregate2.f89971b), new TextClause(taxExemptionAggregate2.f89971b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(s.k(taxExemptionAggregate2), str), null, taxExemptionAggregate2, YearClass.CLASS_2008));
            }
            yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
            aVar.x(new rp0.y(arrayList, tVar, lVar, null, null, null, 1016));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f290805s;
    }
}
