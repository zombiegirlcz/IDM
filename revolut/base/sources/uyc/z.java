package uyc;

import android.os.Parcelable;
import android.text.format.Formatter;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocumentPage;
import com.revolut.feature.selfserve.sot.api.models.SubmissionActionToDo;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import pyc.h0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f284160b;

    public /* synthetic */ z(d0 d0Var, int i) {
        this.f284159a = i;
        this.f284160b = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r23v5 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PlainTextDelegate.Model model;
        RowDelegate.Model model2;
        List list;
        switch (this.f284159a) {
            case 0:
                List files = (List) obj2;
                Intrinsics.checkNotNullParameter(files, "files");
                d0 d0Var = this.f284160b;
                EvidenceDocument evidenceDocumentO3 = ((pyc.t) d0Var.i).o3();
                TextClause textClause = null;
                ArrayList<EvidenceDocumentPage> arrayList = evidenceDocumentO3 != null ? evidenceDocumentO3.f85867c : null;
                if (files.isEmpty() && ue0.e.n(arrayList)) {
                    return zhm.u.c(d0.Q());
                }
                SubmissionActionToDo submissionActionToDoR = d0Var.R();
                if (submissionActionToDoR != null) {
                    model = new PlainTextDelegate.Model("REQUEST_MESSAGE_MODEL_ID", (UrlImage) null, (Clause) null, new TextClause(submissionActionToDoR.f85879b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorPink), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                } else {
                    model = null;
                }
                RowDelegate.Model modelQ = d0.Q();
                if (!ue0.e.n(arrayList) && submissionActionToDoR == null) {
                    modelQ = null;
                }
                List listR = i2b.a.r(model, modelQ);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sot_document_list_header_files_count, zhm.u.c(Integer.valueOf((arrayList != null ? arrayList.size() : 0) + ((d0Var.R() != null || ue0.e.n(arrayList)) ? files.size() : 0))), null, 12);
                int i = R$string.sot_document_list_header_total_size;
                p80.a aVar = d0Var.k;
                List list2 = files;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(Long.valueOf(((File) it8.next()).length()));
                }
                List listP = i2b.a.p(listR, new ListSubheaderDelegate.Model("FILES_HEADER_MODEL_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) (ue0.e.n(arrayList) ? new TextLocalisedClause(i, zhm.u.c(Formatter.formatFileSize(aVar.f233816a, zhm.d0.U0(arrayList2))), null, 12) : null), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61418));
                if (ue0.e.n(arrayList)) {
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(d0Var.S((File) it9.next(), null));
                    }
                    yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                    list = arrayList3;
                } else {
                    Intrinsics.h(arrayList);
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList, 10));
                    for (EvidenceDocumentPage evidenceDocumentPage : arrayList) {
                        if (evidenceDocumentPage.e == null || files.isEmpty()) {
                            String strQ = j6.a.q("UPLOADED_FILE_MODEL_ID ", evidenceDocumentPage.f85871b);
                            TextClause textClause2 = new TextClause(evidenceDocumentPage.f85871b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            SubmissionActionToDo submissionActionToDo = evidenceDocumentPage.e;
                            model2 = new RowDelegate.Model(strQ, new ResourceImage(R$drawable.uikit_icn_40_document_shape, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, textClause2, submissionActionToDo != null ? new TextClause(submissionActionToDo.f85879b, (Style) null, Integer.valueOf(R$attr.uikit_colorRed), false, (o9) null, (List) null, 122) : textClause, null, null, 0, submissionActionToDo != null ? new tf(4, new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true) : null, false, false, submissionActionToDo != null ? LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_cross_circle, Integer.valueOf(R$attr.uikit_colorRed), R$attr.uikit_colorBackground, 2.0f, null, null, 48) : textClause, null, null, null, null, evidenceDocumentPage, null, 0, 0, 0, 0, 1056946028);
                        } else {
                            model2 = d0Var.S((File) zhm.d0.b0(files), evidenceDocumentPage);
                        }
                        arrayList4.add(model2);
                        textClause = null;
                    }
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it10 = list2.iterator();
                    while (it10.hasNext()) {
                        arrayList5.add(d0Var.S((File) it10.next(), null));
                    }
                    List listO = i2b.a.o(arrayList4, d0Var.R() != null ? arrayList5 : null);
                    yp0.b.k(listO, 0, 0, 0, 0, 31);
                    list = listO;
                }
                return i2b.a.o(listP, list);
            case 1:
                d0 d0Var2 = this.f284160b;
                swl.a.t(d0Var2.f284133j, uc0.b.g(R$string.sot_document_list_media_picker_title, d0Var2.f284134l), new z(d0Var2, 3));
                return Unit.f186387a;
            case 2:
                RowDelegate.Model model3 = (RowDelegate.Model) obj2;
                Object obj3 = model3.u;
                boolean z = obj3 instanceof File;
                d0 d0Var3 = this.f284160b;
                if (z) {
                    File file = (File) obj3;
                    pyc.t tVar = (pyc.t) d0Var3.i;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(file, "file");
                    h0 h0Var = (h0) tVar.f240799b;
                    te0.e eVarZ0 = h0Var.z0();
                    Map map = (Map) h0Var.z0().get();
                    DocumentType documentTypeN3 = tVar.n3();
                    Object obj4 = map.get(documentTypeN3);
                    if (obj4 == null) {
                        obj4 = f0.f322471a;
                    }
                    eVarZ0.set(foh.i.w(documentTypeN3, zhm.d0.A0((Iterable) obj4, file), map));
                } else {
                    if (!(obj3 instanceof EvidenceDocumentPage)) {
                        String str = model3.f53228a;
                        Object obj5 = model3.u;
                        throw new UnsupportedOperationException(a0.d.s("No click handler found for listId=", str, ", parcelType=", obj5 != null ? obj5.getClass().getSimpleName() : null));
                    }
                    swl.a.t(d0Var3.f284133j, uc0.b.g(R$string.sot_document_list_media_picker_title, d0Var3.f284134l), new uif.d(d0Var3, model3, 26));
                }
                return Unit.f186387a;
            default:
                File file2 = (File) obj2;
                Intrinsics.checkNotNullParameter(file2, "file");
                d0 d0Var4 = this.f284160b;
                SubmissionActionToDo submissionActionToDoR2 = d0Var4.R();
                pyc.f fVar = d0Var4.i;
                if (submissionActionToDoR2 == null) {
                    SubmissionEvidence submissionEvidenceL3 = ((pyc.t) fVar).l3();
                    submissionActionToDoR2 = submissionEvidenceL3 != null ? submissionEvidenceL3.i : null;
                }
                String actionToDoId = submissionActionToDoR2 != null ? submissionActionToDoR2.f85878a : null;
                if (actionToDoId == null) {
                    actionToDoId = "";
                }
                pyc.t tVar2 = (pyc.t) fVar;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
                ((h0) tVar2.f240799b).w0().set(actionToDoId);
                tVar2.j3(file2);
                return Unit.f186387a;
        }
    }
}
