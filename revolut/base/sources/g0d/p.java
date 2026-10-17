package g0d;

import a08.o0;
import a08.p0;
import akl.s;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sow.impl.ui.status.SowStatusFragment;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import gzc.q;
import gzc.x;
import ip0.c20;
import ip0.pb0;
import ip0.xh0;
import ip0.y10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import le.u1;
import ozc.t;
import ozc.t0;
import ozc.v0;
import te0.w;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends bsi.a implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f139468j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ozc.f f139469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mxc.b f139470m;

    public p(ozc.d presentationModel, c sowStatusMapper, ozc.f router, mxc.b errorItemsFactory) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(sowStatusMapper, "sowStatusMapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(errorItemsFactory, "errorItemsFactory");
        this.f139468j = presentationModel;
        this.k = sowStatusMapper;
        this.f139469l = router;
        this.f139470m = errorItemsFactory;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarHide = ((t) this.f139468j).f231334l.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.b bVarSwitchMapCompletable = rVarHide.switchMapCompletable(new fwj.h(new h(this, 8), 23));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        p0 p0Var = new p0(14, new fa9.c(new BreadcrumbException(), 29));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, p0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ea9.c cVar = new ea9.c(11, k.f139462a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new o0(17, sVar), cVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        SowStatusFragment sowStatusFragment = (SowStatusFragment) view;
        efm.b bVarSwitchMapCompletable2 = ((RowDelegate) sowStatusFragment.f0.getValue()).f53218h.filter(new fwj.h(new h(this, 9), 24)).switchMapCompletable(new fwj.h(new h(this, 10), 25));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        p0 p0Var2 = new p0(14, new fa9.c(new BreadcrumbException(), 27));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, p0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(17, sVar), new ea9.c(11, i.f139460a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarSwitchMapCompletable3 = ((RowDelegate) sowStatusFragment.f0.getValue()).f53218h.filter(new fwj.h(new fwf.n(28), 14)).switchMapCompletable(new fwj.h(new h(this, 1), 15));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        p0 p0Var3 = new p0(14, new fa9.c(new BreadcrumbException(), 28));
        bVarSwitchMapCompletable3.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable3, p0Var3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o0(17, sVar), new ea9.c(11, j.f139461a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        efm.b bVarSwitchMapCompletable4 = ((ErrorDelegate) sowStatusFragment.f85968h0.getValue()).f52226c.switchMapCompletable(new fwj.h(new h(this, 0), 18));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable4, "switchMapCompletable(...)");
        p0 p0Var4 = new p0(14, new m(new BreadcrumbException(), 0));
        bVarSwitchMapCompletable4.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable4, p0Var4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new o0(17, sVar), new ea9.c(11, l.f139463a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        efm.b bVarQ = Q();
        p0 p0Var5 = new p0(14, new m(new BreadcrumbException(), 1));
        bVarQ.getClass();
        pfm.a aVar6 = new pfm.a(bVarQ, p0Var5, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new o0(17, sVar), new ea9.c(11, n.f139466a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
        efm.b bVarSwitchMapCompletable5 = ((SwipeToActionDelegate) sowStatusFragment.g0.getValue()).f.switchMapCompletable(new fwj.h(new h(this, 7), 22));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable5, "switchMapCompletable(...)");
        p0 p0Var6 = new p0(14, new m(new BreadcrumbException(), 2));
        bVarSwitchMapCompletable5.getClass();
        pfm.a aVar7 = new pfm.a(bVarSwitchMapCompletable5, p0Var6, 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new o0(17, sVar), new ea9.c(11, o.f139467a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar, hVarW6);
    }

    public final efm.b Q() {
        t tVar = (t) this.f139468j;
        nzc.d dVar = (nzc.d) tVar.f231330c.f185148b;
        w4l.f fVar = dVar.e;
        Unit unit = Unit.f186387a;
        r rVarSwitchMap = nim.a.w(fVar.f(unit, true), new nzc.b(dVar, 0)).switchMap(new fwj.h(new h(this, 5), 19));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "observeConfigData(...)");
        nzc.d dVar2 = (nzc.d) tVar.f231330c.f185148b;
        r rVarSwitchMap2 = nim.a.w(dVar2.f221021h.f(unit, true), new nzc.b(dVar2, 7)).switchMap(new fwj.h(new h(this, 4), 17));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "observeLatestSubmission(...)");
        efm.b bVarIgnoreElements = o70.a.f(nim.a.w(u1.d(rVarSwitchMap, rVarSwitchMap2), new h(this, 2))).doOnNext(new fwj.h(new h(this, 3), 16)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    public final List R(Data data) {
        sa saVar;
        gzc.s sVar;
        gzc.t tVar;
        Object content = data.getContent();
        c cVar = this.k;
        if (content == null || data.getError() != null) {
            if (!data.getLoading()) {
                return u.c(((g) cVar).a());
            }
            IntRange intRange = new IntRange(3, 5, 1);
            ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList.add(new pb0(a0.d.n("LOADING_ITEM_LIST_ID", it8.nextInt())));
            }
            return arrayList;
        }
        Object content2 = data.getContent();
        Intrinsics.h(content2);
        q qVar = (q) content2;
        gzc.a actionToDo = qVar.f148030h;
        if (actionToDo != null) {
            ((g) cVar).getClass();
            Intrinsics.checkNotNullParameter(actionToDo, "actionToDo");
            saVar = new sa("STATUS_WARNING_LIST_ID", (Clause) null, (Clause) new TextClause(actionToDo.f147986b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), (List) null, false, (c20) null, (y10) null, (Object) null, Constants.TAG_EMV_ICC_CONFIG_VERSION);
            yp0.b.l(saVar, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        } else {
            saVar = null;
        }
        g gVar = (g) cVar;
        RowDelegate.Model modelA = gVar.a();
        if (!qVar.f148028c && actionToDo == null) {
            modelA = null;
        }
        ArrayList submissions = qVar.d;
        x submissionState = qVar.f148026a;
        t0 t0Var = gVar.f139457a;
        Intrinsics.checkNotNullParameter(submissions, "submissions");
        Intrinsics.checkNotNullParameter(submissionState, "submissionState");
        ArrayList arrayList2 = new ArrayList(zhm.w.t(submissions, 10));
        Iterator it9 = submissions.iterator();
        while (it9.hasNext()) {
            gzc.p pVar = (gzc.p) it9.next();
            String str = pVar.f148021a;
            LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cash, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 8.0f, null, null, 48);
            TextClause textClause = new TextClause(pVar.f148023c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            v0 v0Var = (v0) t0Var;
            TextClause textClauseB = v0Var.b(pVar.e);
            RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new TextClause(pVar.f148022b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(pVar.f.f148012b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, 124);
            x xVar = x.UNKNOWN;
            gzc.p pVar2 = submissionState != xVar ? pVar : null;
            RowDelegate.Model model = new RowDelegate.Model(str, layeredImageB, null, null, textClause, textClauseB, null, null, 0, bVar, true, false, (pVar2 == null || (sVar = pVar2.e) == null || (tVar = sVar.f148036a) == null) ? null : v0Var.a(tVar), null, null, null, null, pVar, null, 0, 0, 0, 0, 1056941932);
            Iterator it10 = it9;
            SwipeToActionDelegate.SwipeAction swipeAction = new SwipeToActionDelegate.SwipeAction("DELETE_ACTION_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_delete, null, null, 14), xh0.NEGATIVE, null, null, null, 112);
            if (submissionState != xVar) {
                swipeAction = null;
            }
            arrayList2.add(new wh(str, model, v.l(swipeAction), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            it9 = it10;
        }
        List listQ = i2b.a.q(modelA, arrayList2);
        gVar.getClass();
        List listR = i2b.a.r(saVar, new ListSubheaderDelegate.Model("HEADER_SOF_ITEM_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.sow_home_evidences_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        yp0.b.k(listQ, 0, 0, 0, 0, 31);
        return i2b.a.o(listR, listQ);
    }
}
