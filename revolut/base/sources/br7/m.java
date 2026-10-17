package br7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreenContract$InputData;
import com.revolut.feature.view.image.api.navigation.ViewImageDestination;
import com.revolut.kompot.common.ModalDestination;
import e60.s;
import ip0.u00;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.p;
import kl7.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ll7.l f17945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e60.a f17946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f17947r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vn7.a f17948s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zk0.b f17949t;
    public final e u;
    public Function0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, UploadFilesListScreenContract$InputData inputData, ll7.l filesRepository, e60.a mediaPickerControllerExtension, j60.a bottomDialogExtension, vn7.a hintPopupFactory, zk0.b fileSystemRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(filesRepository, "filesRepository");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f17945p = filesRepository;
        this.f17946q = mediaPickerControllerExtension;
        this.f17947r = bottomDialogExtension;
        this.f17948s = hintPopupFactory;
        this.f17949t = fileSystemRepository;
        this.u = new e(inputData.f75687a, inputData.f75688b, f0.f322471a);
        this.v = new br4.e(5);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(((s) this.f17946q).f122868g), null, null, new bi2.n(this, null, 22), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y2(Object obj2, String listId) {
        r0 r0VarO;
        Object dVar;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        switch (listId.hashCode()) {
            case -2071202089:
                if (listId.equals("PROCEED_BUTTON_ID")) {
                    v2(new g(((e) t2()).f17937c));
                    return;
                }
                break;
            case -1545538559:
                if (listId.equals("ADD_DOCUMENT_ID")) {
                    int i = l.f17944a[((e) t2()).f17935a.f75302b.ordinal()];
                    if (i == 1) {
                        textLocalisedClause = ((e) t2()).f17936b == f.LICENCE_FRONT ? new TextLocalisedClause(R$string.car_insurance_file_picker_title_driving_licence_front, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_file_picker_title_driving_licence_back, null, null, 14);
                    } else {
                        if (i != 2 && i != 3 && i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_file_picker_title_document, null, null, 14);
                    }
                    ((s) this.f17946q).T(new e60.i(null, textLocalisedClause, null, true, 0, 0, null, null, false, u00.BACK, null, 15861));
                    return;
                }
                break;
            case 861755389:
                if (listId.equals("DOCUMENT_REQUIREMENTS_BUTTON_ID")) {
                    if ((obj2 instanceof RequestedDocument ? (RequestedDocument) obj2 : null) != null) {
                        yji.l.g2(this, new DocumentsHintScreen(new DocumentsHintScreenContract$InputData((RequestedDocument) obj2, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 4)), ModalDestination.Style.POPUP.f98311a, null, 2);
                        return;
                    }
                    return;
                }
                break;
            case 1204616143:
                if (listId.equals("ICON_VALUE_ID")) {
                    if ((obj2 instanceof File ? (File) obj2 : null) != null) {
                        this.v = new bc1.a(this, (File) obj2, 23);
                        this.f17947r.x(vn7.a.b(this.f17948s, R$string.car_insurance_document_selection_delete_confirmation_title, null, R$string.car_insurance_common_delete, 10));
                        return;
                    }
                    return;
                }
                break;
        }
        if (a0.H(listId, "FILE_ROW_ID_", false)) {
            if ((obj2 instanceof File ? (File) obj2 : null) != null) {
                File file = (File) obj2;
                String strJ = ((a80.h) this.f17949t).j(file);
                Intrinsics.checkNotNullParameter(file, "<this>");
                if (strJ == null || (r0VarO = czi.c.O(strJ)) == null) {
                    r0VarO = r0.IMAGE;
                }
                int i2 = sl7.f.f264157a[r0VarO.ordinal()];
                if (i2 == 1) {
                    dVar = new sl7.d(new ViewImageDestination(new ViewImageDestination.InputData.Local(file)));
                } else if (i2 == 2) {
                    dVar = new sl7.e(new f9i.c(new f9i.d(file)));
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Throwable th10 = new Throwable(j6.a.q("Unknown file extension: ", lim.o.n(file)));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                    dVar = null;
                }
                if (dVar instanceof sl7.d) {
                    C1(((sl7.d) dVar).f264155a);
                } else if (dVar instanceof sl7.e) {
                    A1(new be7.s(this, (sl7.e) dVar, continuation, 21), new yi5.b(25));
                } else {
                    if (dVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Unit unit = Unit.f186387a;
                }
            }
        }
    }
}
