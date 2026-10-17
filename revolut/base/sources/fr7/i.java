package fr7;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.data.model.DocumentFile;
import com.revolut.feature.insurance_car.impl.data.model.DocumentFilesGroup;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.DocumentsPreviewScreenContract$InputData;
import com.revolut.feature.view.image.api.navigation.ViewImageDestination;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import fjd.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl7.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import ll7.v;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements f {
    public final DocumentsPreviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f137403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f137404q;

    public i(n stateMapper, DocumentsPreviewScreenContract$InputData inputData, v policyRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        this.o = inputData;
        this.f137403p = policyRepository;
        this.f137404q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String documentId = this.o.f75692a.f75301a;
        e0 e0Var = (e0) this.f137403p;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, e0Var.f196620r.b(documentId, loadingStrategy), null, null, new fna.f(this, null, 5), 3);
    }

    public final void I2(Object obj2, String listId) {
        Object dVar;
        ViewImageDestination.InputData remote;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        if (obj2 instanceof RequestedDocument) {
            yji.l.g2(this, new DocumentsHintScreen(new DocumentsHintScreenContract$InputData((RequestedDocument) obj2, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 4)), ModalDestination.Style.POPUP.f98311a, null, 2);
            return;
        }
        if (obj2 instanceof DocumentFile) {
            DocumentFilesGroup documentFilesGroup = (DocumentFilesGroup) ((e) ((j2) this.f137404q.f22677a).getValue()).f137398a.getContent();
            if (documentFilesGroup != null) {
                DocumentFile documentFile = (DocumentFile) obj2;
                Intrinsics.checkNotNullParameter(documentFilesGroup, "<this>");
                Intrinsics.checkNotNullParameter(documentFile, "documentFile");
                r0 r0Var = documentFile.f75206b;
                String str = documentFile.f75207c;
                int i = sl7.f.f264157a[r0Var.ordinal()];
                if (i == 1) {
                    List list = documentFilesGroup.f75210a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((DocumentFile) obj3).f75206b == r0.IMAGE) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it8.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (Intrinsics.f((DocumentFile) it8.next(), documentFile)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 < 0 || arrayList.size() <= 1) {
                        remote = new ViewImageDestination.InputData.Remote(null, str);
                    } else {
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(new UrlImage(((DocumentFile) it9.next()).f75207c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
                        }
                        remote = new ViewImageDestination.InputData.Gallery(arrayList2, i2);
                    }
                    dVar = new sl7.d(new ViewImageDestination(remote));
                } else if (i == 2) {
                    dVar = new sl7.e(new f9i.c(new f9i.e(str, true)));
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = new sl7.d(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, WebViewScreenTitleSource.Html.f98166a, true)), null, true));
                }
            } else {
                dVar = null;
            }
            if (dVar instanceof sl7.d) {
                C1(((sl7.d) dVar).f264155a);
            } else if (dVar instanceof sl7.e) {
                A1(new g0(this, (sl7.e) dVar, continuation, 13), new yi5.b(25));
            } else {
                if (dVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.f186387a;
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f137404q;
    }
}
