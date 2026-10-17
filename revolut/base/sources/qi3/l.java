package qi3;

import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ozc.z;
import qce.m0;
import qfm.r0;
import qg7.v;
import te0.w;
import zhm.a0;

/* JADX INFO: loaded from: classes21.dex */
public class l extends pri.b implements q {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sri.m f246639h;
    public final f9b.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f246640j;
    public final com.revolut.feature.chooser.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ChooserScreenContract$Configuration f246641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ypi.i f246642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hqi.l f246643n;
    public final opi.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tpi.j f246644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f01.c f246645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f246646r;

    public l(sri.m navigator, f9b.f errorView, r router, com.revolut.feature.chooser.c presentationModel, ChooserScreenContract$Configuration configuration, ypi.i nextButtonView, hqi.l toolbarView, opi.d expandableDialog, tpi.j progressView, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        Intrinsics.checkNotNullParameter(expandableDialog, "expandableDialog");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f246639h = navigator;
        this.i = errorView;
        this.f246640j = router;
        this.k = presentationModel;
        this.f246641l = configuration;
        this.f246642m = nextButtonView;
        this.f246643n = toolbarView;
        this.o = expandableDialog;
        this.f246644p = progressView;
        this.f246645q = uiKitResources;
        this.f246646r = yhm.j.b(new qh0.d(18));
    }

    public static TextClause O(l lVar, String str, boolean z, int i, int i2) {
        int i3 = R$attr.uikit_colorAccent;
        if ((i2 & 8) != 0) {
            i = R$attr.uikit_colorForeground;
        }
        if (!z) {
            i3 = i;
        }
        return new TextClause(str, (Style) new Custom(Integer.valueOf(i3), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void h(s view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVar = this.f246640j;
        if (rVar instanceof e0m.d) {
            ((e0m.d) rVar).init();
        }
        ChooserConfiguration chooserConfiguration = (ChooserConfiguration) this.f246641l;
        boolean z = chooserConfiguration.f65895j;
        ypi.i iVar = this.f246642m;
        iVar.setVisible(z);
        int i = R$drawable.uikit_icn_24_back_button_arrow;
        hqi.l lVar = this.f246643n;
        lVar.F(i);
        String str = chooserConfiguration.e;
        if (str != null) {
            lVar.n(str);
        }
        String str2 = chooserConfiguration.f65893g;
        if (str2 != null) {
            lVar.l(str2);
        }
        efm.r rVarTakeUntil = o70.a.f(rVar.d()).takeUntil(new qe0.g(9, new v(8)));
        Intrinsics.checkNotNullExpressionValue(rVarTakeUntil, "takeUntil(...)");
        i iVar2 = new i(1, this.f246639h, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 1);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarTakeUntil.onErrorResumeNext(new nw8.d(8, new m0(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(12, iVar2), new ly7.g(12, function1K), new z(19, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        efm.r rVarF = o70.a.f(rVarEmpty);
        i iVar3 = new i(1, this, l.class, "showDialog", "showDialog(Lcom/revolut/feature/chooser/ChooserScreenContract$DialogModel;)V", 0, 2);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF.onErrorResumeNext(new nw8.d(8, new m0(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new ly7.g(12, iVar3), new ly7.g(12, function1K2), new z(19, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        com.revolut.feature.chooser.c cVar = this.k;
        efm.r map = cVar.m().map(new qe0.g(10, new i(1, this, l.class, "mapModelsToListItems", "mapModelsToListItems(Ljava/util/List;)Ljava/util/List;", 0, 3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF2 = o70.a.f(w.l(map, cVar.j()));
        c cVar2 = new c(this, 0);
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF2.onErrorResumeNext(new nw8.d(8, new m0(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new ly7.g(12, cVar2), new ly7.g(12, function1K3), new z(19, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.b bVarSwitchMapCompletable = lVar.j().switchMapCompletable(new qe0.g(11, new i(1, this.k, com.revolut.feature.chooser.c.class, "updateSearchQuery", "updateSearchQuery(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K4 = K();
        nw8.d dVar = new nw8.d(8, new m0(new BreadcrumbException(), 6));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new ly7.g(12, function1K4), new z(19, f.f246634a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        r0 r0VarD = w.D(iVar.s(), new c(this, 1));
        Function1 function1K5 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new nw8.d(8, new m0(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar2.w(new ly7.g(12, function1K5), new z(19, g.f246635a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.r map2 = lVar.i().map(new q2j.k(11));
        ChooserActivity chooserActivity = (ChooserActivity) view;
        ?? r92 = chooserActivity.C0;
        efm.r rVarHide = chooserActivity.f65886t0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarMergeWith = map2.mergeWith(rVarHide);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        r0 r0VarD2 = w.D(rVarMergeWith, new c(this, 2));
        Function1 function1K6 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new nw8.d(8, new m0(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar3.w(new ly7.g(12, function1K6), new z(19, h.f246636a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        efm.r rVarMerge = efm.r.merge(((RowDelegate) chooserActivity.z0.getValue()).f53218h, ((AccountCellItemDelegate) chooserActivity.A0.getValue()).f51551c.f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        efm.r map3 = rVarMerge.map(new qe0.g(12, new v(9)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        i iVar4 = new i(1, this, l.class, "onItemClicked", "onItemClicked(Ljava/lang/String;)V", 0, 0);
        Function1 function1K7 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = map3.onErrorResumeNext(new nw8.d(8, new m0(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new ly7.g(12, iVar4), new ly7.g(12, function1K7), new z(19, function0J4));
        w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.b bVarSwitchMapCompletable2 = efm.r.merge(((LargeActionButtonDelegate) chooserActivity.B0.getValue()).d.f121375b.map(new qe0.g(13, new v(7))), ((TwinHorizontalButtonDelegate) r92.getValue()).f53572c.f121375b.map(new qe0.g(14, new v(10))), ((TwinHorizontalButtonDelegate) r92.getValue()).d.f121375b.map(new qe0.g(15, new v(11)))).doOnNext(new qe0.g(16, new c(this, 3))).switchMapCompletable(new qe0.g(17, new c(this, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        Function1 function1K8 = K();
        nw8.d dVar2 = new nw8.d(8, new m0(new BreadcrumbException(), 10));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable2, dVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar4.w(new ly7.g(12, function1K8), new z(19, k.f246638a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public koi.j P(com.revolut.feature.chooser.ChooserScreenContract$Model r49) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi3.l.P(com.revolut.feature.chooser.ChooserScreenContract$Model):koi.j");
    }

    public List Q(List list) {
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("models", list);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ChooserScreenContract$Model chooserScreenContract$Model = (ChooserScreenContract$Model) it8.next();
            koi.j jVarP = P(chooserScreenContract$Model);
            if (chooserScreenContract$Model.f65911n && (jVarP instanceof qv0.i)) {
                arrayList.add(jVarP);
            } else {
                if (!arrayList.isEmpty()) {
                    yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                    a0.x(arrayList, arrayListY);
                    arrayList.clear();
                }
                arrayListY.add(jVarP);
            }
        }
        if (!arrayList.isEmpty()) {
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            a0.x(arrayList, arrayListY);
        }
        String str = ((ChooserConfiguration) this.f246641l).f;
        if (str == null) {
            return arrayListY;
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ck0 ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
        int i = R$attr.uikit_dp48;
        return i2b.a.q(new TextDelegate.Model("CHOOSER_CONFIGURATION_SUBTITLE", textClause, false, ck0Var, null, null, R$attr.uikit_dp16, R$attr.uikit_dp24, i, i, 116), arrayListY);
    }
}
