package mx7;

import a08.p0;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import qfm.r0;
import qi3.l;
import qi3.r;
import qi3.s;
import sri.m;
import te0.w;
import tpi.j;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f210226s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g presentationModel, m navigator, f9b.f errorView, j progressView, opi.d expandableDialog, r router, ChooserScreenContract$Configuration configuration, ypi.i nextButtonModel, hqi.l toolbarView, f01.c uiKitResources) {
        super(navigator, errorView, router, presentationModel, configuration, nextButtonModel, toolbarView, expandableDialog, progressView, uiKitResources);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(expandableDialog, "expandableDialog");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(nextButtonModel, "nextButtonModel");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f210226s = presentationModel;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qi3.l, pri.b, pri.e
    /* JADX INFO: renamed from: N */
    public final void h(s view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        ChooserActivity chooserActivity = (ChooserActivity) view;
        efm.r rVarMerge = efm.r.merge(((RowDelegate) chooserActivity.z0.getValue()).f53218h, ((AccountCellItemDelegate) chooserActivity.A0.getValue()).f51551c.f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        r0 r0VarD = w.D(rVarMerge, new a7(this, 9));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new t1(new ms2.j(new BreadcrumbException(), 3), (byte) 0), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        e function = e.f210225a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar.w(new p0(28, function1K), new a1l.c(11));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }

    @Override // qi3.l
    public final koi.j P(ChooserScreenContract$Model chooserModel) {
        Intrinsics.checkNotNullParameter(chooserModel, "chooserModel");
        int i = d.f210224a[chooserModel.d.ordinal()];
        if (i == 1) {
            return new ListSubheaderDelegate.Model(chooserModel.f65903a, (Image) null, (Clause) new TextClause(chooserModel.f65904b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String str = chooserModel.f65903a;
        TextClause textClause = new TextClause(chooserModel.f65904b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = chooserModel.e;
        return new RowDelegate.Model(str, null, textClause, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, chooserModel.f65909l, null, 0, 0, 0, 0, 532676570);
    }

    @Override // qi3.l
    public final List Q(List models) {
        Intrinsics.checkNotNullParameter(models, "models");
        List list = models;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(P((ChooserScreenContract$Model) it8.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = -1;
        for (Object obj2 : arrayList) {
            int i3 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            koi.j jVar = (koi.j) obj2;
            boolean z = jVar instanceof ListSubheaderDelegate.Model;
            if (z) {
                if (i2 != -1) {
                    List listSubList = arrayList.subList(i2, i);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listSubList) {
                        if (obj3 instanceof qv0.i) {
                            arrayList3.add(obj3);
                        }
                    }
                    yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                    arrayList2.addAll(arrayList3);
                    i2 = -1;
                }
                arrayList2.add(jVar);
            }
            if (!z && i2 == -1) {
                i2 = i;
            }
            if (i == arrayList.size() - 1 && i2 != -1) {
                List listSubList2 = arrayList.subList(i2, arrayList.size());
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : listSubList2) {
                    if (obj4 instanceof qv0.i) {
                        arrayList4.add(obj4);
                    }
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                arrayList2.addAll(arrayList4);
            }
            i = i3;
        }
        return arrayList2;
    }
}
