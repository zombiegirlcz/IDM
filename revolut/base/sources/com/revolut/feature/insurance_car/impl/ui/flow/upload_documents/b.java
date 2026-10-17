package com.revolut.feature.insurance_car.impl.ui.flow.upload_documents;

import br7.f;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.list.UploadDocumentsListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.list.UploadDocumentsListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.DocumentsPreviewScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.DocumentsPreviewScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.rejection_reason.RejectionReasonScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.rejection_reason.RejectionReasonScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import g9i.s;
import kl7.z1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ll7.v;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements gn7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final UploadDocumentsFlowContract$InputData f75507t;
    public final v u;
    public final UploadDocumentsFlowContract$Step.DocumentsList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final UploadDocumentsFlowContract$State f75508w;

    public b(UploadDocumentsFlowContract$InputData inputData, v policyRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        this.f75507t = inputData;
        this.u = policyRepository;
        this.v = UploadDocumentsFlowContract$Step.DocumentsList.f75500a;
        this.f75508w = new UploadDocumentsFlowContract$State(f0.f322471a);
    }

    public final void O2(RequestedDocument requestedDocument) {
        if (requestedDocument.f75302b == z1.DRIVING_LICENCE) {
            P2(new UploadDocumentsFlowContract$Step.FilesLicenceFront(requestedDocument));
        } else {
            P2(new UploadDocumentsFlowContract$Step.FilesGeneric(requestedDocument));
        }
    }

    public final void P2(UploadDocumentsFlowContract$Step uploadDocumentsFlowContract$Step) {
        E2(uploadDocumentsFlowContract$Step, true, null, false);
    }

    public final UploadFilesListScreen Q2(RequestedDocument requestedDocument, f fVar) {
        UploadFilesListScreen uploadFilesListScreen = new UploadFilesListScreen(new UploadFilesListScreenContract$InputData(requestedDocument, fVar));
        gn7.b bVar = new gn7.b(this, requestedDocument, 3);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        uploadFilesListScreen.H = bVar;
        return uploadFilesListScreen;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        UploadDocumentsFlowContract$Step step = (UploadDocumentsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof UploadDocumentsFlowContract$Step.DocumentsList) {
            UploadDocumentsListScreen uploadDocumentsListScreen = new UploadDocumentsListScreen(new UploadDocumentsListScreenContract$InputData(this.f75507t.f75496a));
            s sVar = new s(1, this, b.class, "handleDocumentsListScreenResult", "handleDocumentsListScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/upload_documents/list/UploadDocumentsListScreenContract$OutputData;)V", 0, 25);
            Intrinsics.checkNotNullParameter(sVar, "<set-?>");
            uploadDocumentsListScreen.H = sVar;
            return uploadDocumentsListScreen;
        }
        if (step instanceof UploadDocumentsFlowContract$Step.DocumentUploadHint) {
            RequestedDocument requestedDocument = ((UploadDocumentsFlowContract$Step.DocumentUploadHint) step).f75499a;
            DocumentsHintScreen documentsHintScreen = new DocumentsHintScreen(new DocumentsHintScreenContract$InputData(requestedDocument, null, new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14), 2));
            gn7.b bVar = new gn7.b(this, requestedDocument, 2);
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            documentsHintScreen.H = bVar;
            return documentsHintScreen;
        }
        if (step instanceof UploadDocumentsFlowContract$Step.DocumentRejectionReason) {
            RequestedDocument requestedDocument2 = ((UploadDocumentsFlowContract$Step.DocumentRejectionReason) step).f75498a;
            RejectionReasonScreen rejectionReasonScreen = new RejectionReasonScreen(new RejectionReasonScreenContract$InputData(requestedDocument2));
            gn7.b block = new gn7.b(this, requestedDocument2, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            rejectionReasonScreen.H = block;
            return rejectionReasonScreen;
        }
        if (step instanceof UploadDocumentsFlowContract$Step.DocumentsPreview) {
            RequestedDocument requestedDocument3 = ((UploadDocumentsFlowContract$Step.DocumentsPreview) step).f75501a;
            DocumentsPreviewScreen documentsPreviewScreen = new DocumentsPreviewScreen(new DocumentsPreviewScreenContract$InputData(requestedDocument3));
            gn7.b block2 = new gn7.b(this, requestedDocument3, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            documentsPreviewScreen.H = block2;
            return documentsPreviewScreen;
        }
        if (step instanceof UploadDocumentsFlowContract$Step.FilesGeneric) {
            return Q2(((UploadDocumentsFlowContract$Step.FilesGeneric) step).f75502a, f.GENERIC);
        }
        if (step instanceof UploadDocumentsFlowContract$Step.FilesLicenceFront) {
            return Q2(((UploadDocumentsFlowContract$Step.FilesLicenceFront) step).f75504a, f.LICENCE_FRONT);
        }
        if (step instanceof UploadDocumentsFlowContract$Step.FilesLicenceBack) {
            return Q2(((UploadDocumentsFlowContract$Step.FilesLicenceBack) step).f75503a, f.LICENCE_BACK);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f75508w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
