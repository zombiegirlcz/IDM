package uyc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f284137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubmissionEvidence f284138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284139c;
    public final List d;
    public final EvidenceDocument e;

    public j(DocumentType documentType, SubmissionEvidence submissionEvidence, String actionToDoId, List files, EvidenceDocument evidenceDocument) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
        Intrinsics.checkNotNullParameter(files, "files");
        this.f284137a = documentType;
        this.f284138b = submissionEvidence;
        this.f284139c = actionToDoId;
        this.d = files;
        this.e = evidenceDocument;
    }

    public static j a(j jVar, String str, List list, int i) {
        DocumentType documentType = jVar.f284137a;
        SubmissionEvidence submissionEvidence = jVar.f284138b;
        if ((i & 4) != 0) {
            str = jVar.f284139c;
        }
        String actionToDoId = str;
        if ((i & 8) != 0) {
            list = jVar.d;
        }
        List files = list;
        EvidenceDocument evidenceDocument = jVar.e;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
        Intrinsics.checkNotNullParameter(files, "files");
        return new j(documentType, submissionEvidence, actionToDoId, files, evidenceDocument);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f284137a, jVar.f284137a) && Intrinsics.f(this.f284138b, jVar.f284138b) && Intrinsics.f(this.f284139c, jVar.f284139c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f284137a.hashCode() * 31;
        SubmissionEvidence submissionEvidence = this.f284138b;
        int iD = p.a.d(p.a.c((iHashCode + (submissionEvidence == null ? 0 : submissionEvidence.hashCode())) * 31, 31, this.f284139c), 31, this.d);
        EvidenceDocument evidenceDocument = this.e;
        return iD + (evidenceDocument != null ? evidenceDocument.hashCode() : 0);
    }
}
