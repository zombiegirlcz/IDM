package myc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDetails;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocumentDetails;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocumentPage;
import com.revolut.feature.selfserve.sot.api.models.OriginRef;
import com.revolut.feature.selfserve.sot.api.models.SubmissionActionToDo;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidenceReviewState;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidenceType;
import com.revolut.feature.selfserve.sot.api.models.SubmissionVariantDetails;
import hyc.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kyc.b;
import kyc.d;
import kyc.e;
import kyc.f;
import kyc.j;
import kyc.l;
import kyc.m;
import kyc.n;
import kyc.o;
import kyc.s;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f210448a = r0.k(new Pair("APPROVED", c.APPROVED), new Pair("REJECTED", c.REJECTED), new Pair("UPLOADED", c.UPLOADED), new Pair("UNDER_REVIEW", c.UNDER_REVIEW), new Pair("UPDATE_REQUESTED", c.UPDATE_REQUESTED), new Pair("UPDATE_REQUIRED", c.UPDATE_REQUIRED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f210449b = r0.k(new Pair("NONE", hyc.a.NONE), new Pair("APPROVED", hyc.a.APPROVED), new Pair("REJECTED", hyc.a.REJECTED), new Pair("REQUIRED", hyc.a.REQUIRED), new Pair("REQUESTED", hyc.a.REQUESTED), new Pair("REQUIRED_UNDER_REVIEW", hyc.a.REQUIRED_UNDER_REVIEW), new Pair("REQUESTED_UNDER_REVIEW", hyc.a.REQUESTED_UNDER_REVIEW));

    public final SubmissionActionToDo a(l lVar) {
        ArrayList arrayList = null;
        if (lVar == null) {
            return null;
        }
        String id10 = lVar.getId();
        String message = lVar.getMessage();
        String action = lVar.getAction();
        String entityVariant = lVar.getEntityVariant();
        s entityVariantDetails = lVar.getEntityVariantDetails();
        SubmissionVariantDetails submissionVariantDetails = entityVariantDetails != null ? new SubmissionVariantDetails(entityVariantDetails.getTitle(), entityVariantDetails.getDescription()) : null;
        List evidences = lVar.getEvidences();
        if (evidences != null) {
            List list = evidences;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((m) it8.next()));
            }
        }
        return new SubmissionActionToDo(id10, message, action, entityVariant, submissionVariantDetails, arrayList);
    }

    public final SubmissionEvidence b(m mVar) {
        String id10 = mVar.getId();
        String title = mVar.getTitle();
        String description = mVar.getDescription();
        j originRef = mVar.getOriginRef();
        OriginRef originRef2 = new OriginRef(originRef.getValue(), originRef.getOrigin());
        o evidenceType = mVar.getEvidenceType();
        SubmissionEvidenceType submissionEvidenceType = new SubmissionEvidenceType(evidenceType.getType(), evidenceType.getTitle(), evidenceType.getDescription(), evidenceType.getPrimary());
        SubmissionEvidenceReviewState submissionEvidenceReviewStateC = c(mVar.getReviewState());
        b details = mVar.getDetails();
        EvidenceDetails evidenceDetails = new EvidenceDetails(details.getFlowType(), details.getUserDescription(), details.getUserNote());
        List documents = mVar.getDocuments();
        ArrayList arrayList = new ArrayList(w.t(documents, 10));
        Iterator it8 = documents.iterator();
        while (it8.hasNext()) {
            d dVar = (d) it8.next();
            String id11 = dVar.getId();
            f type = dVar.getType();
            Iterator it9 = it8;
            DocumentType documentType = new DocumentType(type.getType(), type.getTitle(), type.getDescription(), null);
            List<e> pages = dVar.getPages();
            ArrayList arrayList2 = new ArrayList(w.t(pages, 10));
            for (e eVar : pages) {
                arrayList2.add(new EvidenceDocumentPage(eVar.getId(), eVar.getFileName(), eVar.getMimeType(), eVar.getFileUrl(), a(eVar.getActionToDoId()), c(eVar.getReviewState())));
            }
            kyc.c details2 = dVar.getDetails();
            arrayList.add(new EvidenceDocument(id11, documentType, arrayList2, details2 != null ? new EvidenceDocumentDetails(details2.getUserDefinedType()) : null, c(dVar.getReviewState()), a(dVar.getActionToDoId())));
            it8 = it9;
        }
        return new SubmissionEvidence(id10, title, description, originRef2, submissionEvidenceType, submissionEvidenceReviewStateC, evidenceDetails, arrayList, a(mVar.getActionToDoId()));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final SubmissionEvidenceReviewState c(n nVar) {
        String title = nVar.getTitle();
        c cVar = (c) u1.v(nVar.getType(), this.f210448a);
        if (cVar == null) {
            cVar = c.UNDER_REVIEW;
        }
        return new SubmissionEvidenceReviewState(title, cVar);
    }
}
