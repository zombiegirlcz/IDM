package ea4;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreenContract$InputData;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SummaryScreenContract$InputData f124146a;

    public v(SummaryScreenContract$InputData inputData, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f124146a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        boolean z3;
        CompositeClause compositeClause;
        CompositeClause compositeClause2;
        boolean z4;
        Object obj2;
        char c2;
        f fVar;
        Iterator it8;
        RowDelegate.Model model;
        int i;
        AccentCircleBadge accentCircleBadge;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SummaryScreenContract$InputData summaryScreenContract$InputData = this.f124146a;
        ny3.o oVar = summaryScreenContract$InputData.f67597b;
        ResourceImage resourceImageA = q74.b.a(summaryScreenContract$InputData.d);
        int i2 = R$string.credit_application_documents_upload_summary_title;
        String str = oVar.f220653a;
        ny3.n nVar = oVar.f220655c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, zhm.u.c(str), null, 12);
        String str2 = oVar.f220654b;
        if (str2 == null && nVar == null) {
            compositeClause2 = null;
            z = true;
            z3 = false;
        } else {
            TextLocalisedClause textLocalisedClause2 = str2 != null ? new TextLocalisedClause(R$string.credit_application_documents_upload_summary_description, zhm.u.c(str2), null, 12) : null;
            if (nVar != null) {
                int i3 = R$drawable.uikit_icn_24_info;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                Float fValueOf = Float.valueOf(16.0f);
                z = true;
                z3 = false;
                List listK = zhm.v.k(new ImageClause(i3, numValueOf, fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.credit_application_documents_upload_summary_second_description, zhm.u.c(nVar.f220651a), new Click(28, (Integer) null, (Object) nVar.f220652b, "id-second-description", false), 8));
                m70.a.t(t0.f186434a);
                compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            } else {
                z = true;
                z3 = false;
                compositeClause = null;
            }
            Object[] elements = {textLocalisedClause2, compositeClause};
            Intrinsics.checkNotNullParameter(elements, "elements");
            compositeClause2 = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        String str3 = oVar.e;
        TextLocalisedClause textLocalisedClause3 = str3 != null ? new TextLocalisedClause(R$string.credit_application_documents_upload_summary_disclaimer, zhm.u.c(str3), null, 12) : null;
        CompositeClause compositeClause3 = compositeClause2;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_documents_upload_summary_button, zhm.u.c(oVar.f), null, 12);
        List list = summaryScreenContract$InputData.f67598c;
        if ((list instanceof Collection) && list.isEmpty()) {
            z4 = z;
        } else {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                if (((Collection) domainState.f124130a.getOrDefault((String) it9.next(), f0.f322471a)).isEmpty()) {
                    z4 = z3;
                    break;
                }
            }
            z4 = z;
        }
        List list2 = oVar.d;
        int i5 = 10;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            ny3.l lVar = (ny3.l) it10.next();
            ArrayList<ny3.m> arrayList2 = lVar.f220647b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i5));
            for (ny3.m mVar : arrayList2) {
                boolean z6 = mVar.d;
                String str4 = mVar.f220649b;
                a1 a1Var = mVar.f220650c;
                if (z6) {
                    fVar = domainState;
                    int size = ((List) domainState.f124130a.getOrDefault(mVar.f220648a, f0.f322471a)).size();
                    String str5 = mVar.f220648a;
                    GlyphImage glyphImageD = a1Var.d();
                    if (size > 0) {
                        i = size;
                        accentCircleBadge = new AccentCircleBadge(dw0.a.Checked);
                    } else {
                        i = size;
                        accentCircleBadge = null;
                    }
                    it8 = it10;
                    model = new RowDelegate.Model(str5, new RowDelegate.Model.MainImage.Image40(glyphImageD, accentCircleBadge, null, false, null, false, 60), new TextLocalisedClause(R$string.credit_application_documents_upload_summary_document_title, zhm.u.c(str4), null, 12), null, 0, i == 0 ? new TextLocalisedClause(R$string.credit_application_documents_upload_summary_document_subtitle_not_uploaded, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.credit_application_documents_upload_summary_document_subtitle_files_count, Integer.valueOf(i), zhm.u.c(Integer.valueOf(i)), (Style) null, 24), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), z3), true, null, false, null, null, null, null, null, null, mVar, null, 0, 0, 0, 0, 532673496);
                } else {
                    fVar = domainState;
                    it8 = it10;
                    model = new RowDelegate.Model(mVar.f220648a, new RowDelegate.Model.MainImage.Image40(a1Var.d(), new AccentCircleBadge(dw0.a.Checked), null, false, null, false, 60), new TextLocalisedClause(R$string.credit_application_documents_upload_summary_document_title, zhm.u.c(str4), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                }
                arrayList3.add(model);
                domainState = fVar;
                it10 = it8;
            }
            f fVar2 = domainState;
            Iterator it11 = it10;
            String str6 = lVar.f220646a;
            if (str6 == null) {
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                obj2 = null;
                c2 = '\f';
            } else {
                obj2 = null;
                c2 = '\f';
                arrayList3 = yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("documents-upload-summary-items-header-".concat(str6), (Image) null, (Clause) new TextLocalisedClause(R$string.credit_application_documents_upload_summary_documents_title, zhm.u.c(str6), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            }
            arrayList.add(arrayList3);
            domainState = fVar2;
            it10 = it11;
            i5 = 10;
        }
        return new s(w.u(arrayList), resourceImageA, textLocalisedClause, compositeClause3, textLocalisedClause3, textLocalisedClause4, z4);
    }
}
