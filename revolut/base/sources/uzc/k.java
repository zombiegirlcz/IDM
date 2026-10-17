package uzc;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sow.impl.ui.destination.SowIncomeDestinationFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ip0.iq;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ozc.s0;
import ozc.t;
import t1i.n;
import te0.w;
import up5.s;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f284665j;
    public final ozc.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f284666l;

    public k(ozc.d presentationModel, ozc.f router, b mapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f284665j = presentationModel;
        this.k = router;
        this.f284666l = mapper;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        TextLocalisedClause textLocalisedClause;
        rri.a view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVar = (t) this.f284665j;
        od0.i selectedIncomeDestination = (od0.i) ((s0) tVar.f231329b).E0().get();
        ((f) this.f284666l).getClass();
        Intrinsics.checkNotNullParameter(selectedIncomeDestination, "selectedIncomeDestination");
        gzc.k[] kVarArrValues = gzc.k.values();
        ArrayList arrayList = new ArrayList(kVarArrValues.length);
        int length = kVarArrValues.length;
        for (int i = 0; i < length; i++) {
            gzc.k kVar = kVarArrValues[i];
            String str = "INCOME_DESTINATION_ITEM_ID" + kVar;
            iq iqVar = iq.RADIO_BUTTON;
            int i2 = g.f284660a[kVar.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.sow_transfer_direction_to_other_bank, null, null, 14);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.sow_transfer_direction_to_revolut, null, null, 14);
            }
            arrayList.add(new InputChecklistDelegate.Model(str, textLocalisedClause, selectedIncomeDestination.g() == kVar, false, null, iqVar, null, null, kVar, null, 0, 0, 0, 523992));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        ((BaseLayoutBuilderFragment) view).setItems(arrayList);
        efm.b bVarSwitchMapCompletable = ((InputChecklistDelegate) ((SowIncomeDestinationFragment) view).f0.getValue()).f52518c.switchMapCompletable(new uz7.f(3, new h(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        ly7.g gVar = new ly7.g(23, new s(new BreadcrumbException(), 21));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        n nVar = new n(10, i.f284663a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new n1i.b(23, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable2 = tVar.w3().switchMapCompletable(new uz7.f(4, new h(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        ly7.g gVar2 = new ly7.g(23, new s(new BreadcrumbException(), 22));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, gVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new n1i.b(23, sVar), new n(10, j.f284664a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
