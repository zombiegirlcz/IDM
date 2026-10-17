package zzd;

import android.os.Parcelable;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f326687a;

    public l0(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f326687a = uiKitResources;
    }

    public final List a(wxd.u uVar, w0 w0Var) {
        LargeActionButtonDelegate.Model model;
        ResourceImage resourceImage;
        int i;
        wxd.u tab2 = uVar;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        wxd.x xVar = tab2.f300890c;
        wxd.w wVar = xVar instanceof wxd.w ? (wxd.w) xVar : null;
        if (wVar == null) {
            return zhm.f0.f322471a;
        }
        ArrayList<wxd.q> arrayList = wVar.f300892a;
        ArrayList arrayList2 = new ArrayList();
        for (wxd.q qVar : arrayList) {
            String str = tab2.f300888a;
            String strS = a0.d.s("tab:", str, ":section:", qVar.f300877a);
            ArrayList<wxd.l> arrayList3 = qVar.f300879c;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
            for (wxd.l lVar : arrayList3) {
                String str2 = qVar.f300877a;
                String str3 = lVar.f300870a;
                StringBuilder sbM = v0.a.m("tab:", str, ":section:", str2, ":item:");
                sbM.append(str3);
                String string = sbM.toString();
                String str4 = lVar.d;
                if (str4 != null) {
                    int iIntValue = R$drawable.uikit_icn_24_document;
                    int iA = this.f326687a.a(str4);
                    Integer numValueOf = Integer.valueOf(iA);
                    if (iA == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                    resourceImage = new ResourceImage(iIntValue, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                } else {
                    resourceImage = null;
                }
                ff ffVar = ff.DP_24;
                TextClause textClause = new TextClause(lVar.f300871b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str5 = lVar.f300872c;
                TextClause textClause2 = str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                wxd.e eVar = lVar.e;
                if (eVar instanceof wxd.b) {
                    i = R$drawable.uikit_icn_24_chevron_right;
                } else {
                    if (!(eVar instanceof wxd.c) && !(eVar instanceof wxd.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_download;
                }
                arrayList4.add(new RowDelegate.Model(string, resourceImage, ffVar, null, textClause, textClause2, null, null, 0, new tf(6, new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, false, null, null, null, null, null, eVar, new AnalyticsContext(w0Var), 0, 0, 0, 0, 1023407976));
            }
            String str6 = qVar.f300878b;
            if (str6 != null) {
                arrayList4 = yp0.b.g(arrayList4, new ListSubheaderDelegate.Model(a0.d.r(strS, ":header"), (Image) null, (Clause) new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            } else {
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
            }
            String strR = a0.d.r(strS, ":footer-action");
            wxd.i iVar = qVar.d;
            if (iVar != null) {
                model = new LargeActionButtonDelegate.Model(strR, LargeActionButton.ButtonStyle.o, null, new TextClause(iVar.f300863a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, iVar.f300864b, new AnalyticsContext(w0Var), 232);
                yp0.b.r(model, 0, 0, 0, 0, 15);
            } else {
                model = null;
            }
            zhm.a0.x(zhm.d0.E0(zhm.v.l(model), arrayList4), arrayList2);
            tab2 = uVar;
        }
        return arrayList2;
    }
}
