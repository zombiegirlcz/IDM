package pyb;

import aw0.k7;
import aw0.o9;
import aw0.p9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeAmount;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1c.c1;
import m1c.d1;
import m1c.e1;
import m1c.f1;
import m1c.r1;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tof.a3;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements fub.k {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.d f240750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.m f240751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f240752c;
    public final r d;

    public s(lfm.c appCompositeDisposable, thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f240750a = transactionIconResourcesMapper;
        this.f240751b = transactionTextResourcesMapper;
        this.f240752c = new q(this);
        this.d = new r(this);
        w.j0(appCompositeDisposable, new ifm.a(new oma.r(this, 10), 0));
    }

    public final Image b(a3 a3Var, k71.q qVar) {
        Map mapG;
        Map mapG2;
        r61.c cVarA;
        Map mapG3;
        Map mapG4;
        Map mapG5;
        if (qVar == null || (mapG = qVar.d) == null) {
            mapG = r0.g();
        }
        Map map = mapG;
        if (qVar == null || (mapG2 = qVar.e) == null) {
            mapG2 = r0.g();
        }
        Map map2 = mapG2;
        if (qVar == null || (cVarA = qVar.f181799j) == null) {
            r61.c.Companion.getClass();
            cVarA = r61.b.a();
        }
        r61.c cVar = cVarA;
        if (qVar == null || (mapG3 = qVar.f181804q) == null) {
            mapG3 = r0.g();
        }
        Map map3 = mapG3;
        do3.n nVar = qVar != null ? qVar.f181794a : null;
        if (qVar == null || (mapG4 = qVar.f181795b) == null) {
            mapG4 = r0.g();
        }
        Map map4 = mapG4;
        if (qVar == null || (mapG5 = qVar.f181806s) == null) {
            mapG5 = r0.g();
        }
        return thf.d.a(this.f240750a, a3Var, map, map2, cVar, map3, nVar, map4, mapG5, null, null, null, 1792);
    }

    public final RowDelegate.Model c(RevPointsTransaction revPointsTransaction, a3 a3Var, k71.q qVar, TimeClause.Format format) {
        Custom custom;
        String strQ = j6.a.q("TransactionListItem_", revPointsTransaction.f84054a);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(revPointsTransaction.f84059j != null ? i1c.b.d(revPointsTransaction) : a3Var != null ? b(a3Var, qVar) : i1c.b.c(revPointsTransaction), i1c.b.e(revPointsTransaction), null, false, null, false, 60);
        Clause textClause = null;
        Clause clauseF = i1c.b.f(revPointsTransaction, a3Var != null ? ((bnf.r) this.f240751b).g(a3Var) : null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TimeClause(revPointsTransaction.d, format, null, null, 12));
        ArrayList arrayList2 = new ArrayList();
        if (revPointsTransaction.f == f1.RECURRING_PURCHASE) {
            arrayList2.add(Integer.valueOf(R$drawable.uikit_icn_20_reccuring));
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ImageClause(((Number) it8.next()).intValue(), Integer.valueOf(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28));
        }
        CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList);
        RevPoints revPoints = revPointsTransaction.f84056c;
        int i = p.f240747a[revPointsTransaction.f84057g.ordinal()];
        if (i == 1) {
            custom = null;
        } else if (i == 2) {
            custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        } else if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            custom = null;
        } else {
            custom = new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
        TextLocalisedQuantityClause textLocalisedQuantityClauseQ = nub.a.q(revPoints, custom, new nub.e(p9.ALWAYS), null, 4);
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount = revPointsTransaction.f84060l;
        if (revPointsTransactionExchangeAmount != null) {
            dj0.d dVar = revPointsTransactionExchangeAmount.f84065a;
            if (dVar != null) {
                textClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
            } else {
                String str = revPointsTransactionExchangeAmount.f84066b;
                if (str != null) {
                    textClause = new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                }
            }
            textClause = textClause;
        }
        return new RowDelegate.Model(strQ, image40, clauseF, null, 0, compositeClauseM, null, null, 0, new RowDelegate.Model.c.b(textLocalisedQuantityClauseQ, textClause, null, false, 124), false, null, false, null, null, null, null, null, null, revPointsTransaction, null, 0, 0, 0, 0, 532675544);
    }

    public final ArrayList d(List transactions, k71.q extraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        List list = transactions;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(RowDelegate.Model.x((RowDelegate.Model) this.d.c((e1) it8.next(), new o(extraData)), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -1, 15));
        }
        return arrayList;
    }

    public final RowDelegate.Model e(RevPointsTransaction revPointsTransaction, TimeClause.Format.Pretty timeFormat) {
        Intrinsics.checkNotNullParameter(revPointsTransaction, "revPointsTransaction");
        Intrinsics.checkNotNullParameter(timeFormat, "timeFormat");
        return c(revPointsTransaction, null, null, timeFormat);
    }

    public final RowDelegate.Model f(e1 transactionContent, k71.q extraData, TimeClause.Format timeFormat) {
        Map mapG;
        Map mapG2;
        r61.c cVarA;
        Map mapG3;
        do3.n nVar;
        Intrinsics.checkNotNullParameter(transactionContent, "transactionContent");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(timeFormat, "timeFormat");
        String str = null;
        if (transactionContent instanceof d1) {
            return c(((d1) transactionContent).f201353c, null, extraData, timeFormat);
        }
        if (!(transactionContent instanceof c1)) {
            throw new NoWhenBranchMatchedException();
        }
        a3 a3Var = ((c1) transactionContent).f201349c;
        String strQ = j6.a.q("TransactionListItem_", a3Var.f272579a);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(b(a3Var, extraData), null, null, false, null, false, 62);
        if (extraData == null || (mapG = extraData.f181795b) == null) {
            mapG = r0.g();
        }
        Map map = mapG;
        Map map2 = extraData != null ? extraData.d : null;
        if (extraData == null || (mapG2 = extraData.e) == null) {
            mapG2 = r0.g();
        }
        Map map3 = mapG2;
        if (extraData == null || (cVarA = extraData.f181799j) == null) {
            r61.c.Companion.getClass();
            cVarA = r61.b.a();
        }
        r61.c cVar = cVarA;
        if (extraData != null && (nVar = extraData.f181794a) != null) {
            str = nVar.f116408a;
        }
        String str2 = str;
        if (extraData == null || (mapG3 = extraData.f181806s) == null) {
            mapG3 = r0.g();
        }
        return new RowDelegate.Model(strQ, image40, new TextClause(thf.m.a(this.f240751b, a3Var, map, map2, map3, cVar, str2, mapG3, 128), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TimeClause(a3Var.f272591g.getMillis(), timeFormat, null, null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(a3Var.k, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, a3Var, null, 0, 0, 0, 0, 532675544);
    }

    public final RowDelegate.Model g(r1 transactionContent, k71.q extraData, TimeClause.Format timeFormat) {
        Intrinsics.checkNotNullParameter(transactionContent, "transactionContent");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(timeFormat, "timeFormat");
        return c(transactionContent.f201449a, transactionContent.f201450b, extraData, timeFormat);
    }

    public final ArrayList h(List transactions, k71.q extraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        List list = transactions;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(RowDelegate.Model.x((RowDelegate.Model) this.f240752c.c((r1) it8.next(), new o(extraData)), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -1, 15));
        }
        return arrayList;
    }
}
