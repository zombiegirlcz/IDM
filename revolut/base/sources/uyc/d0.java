package uyc;

import android.text.format.Formatter;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocumentPage;
import com.revolut.feature.selfserve.sot.api.models.SubmissionActionToDo;
import com.revolut.feature.selfserve.sot.impl.ui.evidencelist.EvidenceListFragment;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends pri.a implements b {

    @NotNull
    public static final a0 Companion = new a0();
    public final pyc.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final swl.a f284133j;
    public final p80.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t70.g f284134l;

    public d0(pyc.f presentationModel, swl.a mediaPickerPresenterDelegate, p80.a fileFormatter, t70.g localization, pri.f authorizedPresenterDelegate) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mediaPickerPresenterDelegate, "mediaPickerPresenterDelegate");
        Intrinsics.checkNotNullParameter(fileFormatter, "fileFormatter");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        this.i = presentationModel;
        this.f284133j = mediaPickerPresenterDelegate;
        this.k = fileFormatter;
        this.f284134l = localization;
        P(zhm.v.k(authorizedPresenterDelegate, mediaPickerPresenterDelegate));
    }

    public static RowDelegate.Model Q() {
        RowDelegate.Model model = new RowDelegate.Model("ADD_FILE_MODEL_ID", new ResourceImage(R$drawable.uikit_icn_32_add_new, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.sot_document_list_upload_document, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        efm.r map = ((pyc.t) this.i).t3().map(new uwf.b(12, new z(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        uu9.b bVar = new uu9.b(view, 12);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new o0(20, new up5.s(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new twl.o(2, bVar), new twl.o(2, function1K), new t1i.n(8, function0J));
        ifm.b bVar2 = this.f239031a;
        te0.w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        EvidenceListFragment evidenceListFragment = (EvidenceListFragment) view;
        efm.r rVarDoOnNext = ((RowDelegate) evidenceListFragment.f0.getValue()).f53218h.filter(new uwf.b(13, new uwi.v(17))).doOnNext(new uwf.b(14, new z(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarDoOnNext.onErrorResumeNext(new o0(20, new up5.s(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new twl.o(2, b0.f284131a), new twl.o(2, function1K2), new t1i.n(8, function0J2));
        te0.w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarDoOnNext2 = ((RowDelegate) evidenceListFragment.f0.getValue()).k.doOnNext(new uwf.b(15, new z(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarDoOnNext2.onErrorResumeNext(new o0(20, new up5.s(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new twl.o(2, c0.f284132a), new twl.o(2, function1K3), new t1i.n(8, function0J3));
        te0.w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }

    public final SubmissionActionToDo R() {
        EvidenceDocument evidenceDocumentO3 = ((pyc.t) this.i).o3();
        if (evidenceDocumentO3 != null) {
            return evidenceDocumentO3.f;
        }
        return null;
    }

    public final RowDelegate.Model S(File file, EvidenceDocumentPage evidenceDocumentPage) {
        String strQ = j6.a.q("FILE_MODEL_ID ", file.getName());
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new RowDelegate.Model(strQ, new FileImage(file, R$drawable.uikit_icn_40_document_shape, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505)), null, null, new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(Formatter.formatFileSize(this.k.f233816a, file.length()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new tf(4, new ResourceImage(evidenceDocumentPage == null ? R$drawable.uikit_icn_24_delete : R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, evidenceDocumentPage != null ? evidenceDocumentPage : file, null, 0, 0, 0, 0, 1056962412);
    }
}
