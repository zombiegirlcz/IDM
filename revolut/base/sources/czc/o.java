package czc;

import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSource f110209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubmissionEvidence f110210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110211c;
    public final String d;
    public final List e;
    public final DocumentType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f110212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f110213h;
    public final Data i;

    public o(IncomeSource incomeSource, SubmissionEvidence submissionEvidence, String description, String note, List documentsToUpload, DocumentType documentType, String str, boolean z, Data transaction) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(documentsToUpload, "documentsToUpload");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f110209a = incomeSource;
        this.f110210b = submissionEvidence;
        this.f110211c = description;
        this.d = note;
        this.e = documentsToUpload;
        this.f = documentType;
        this.f110212g = str;
        this.f110213h = z;
        this.i = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f110209a, oVar.f110209a) && Intrinsics.f(this.f110210b, oVar.f110210b) && Intrinsics.f(this.f110211c, oVar.f110211c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f110212g, oVar.f110212g) && this.f110213h == oVar.f110213h && Intrinsics.f(this.i, oVar.i);
    }

    public final int hashCode() {
        IncomeSource incomeSource = this.f110209a;
        int iHashCode = (incomeSource == null ? 0 : incomeSource.hashCode()) * 31;
        SubmissionEvidence submissionEvidence = this.f110210b;
        int iD = p.a.d(p.a.c(p.a.c((iHashCode + (submissionEvidence == null ? 0 : submissionEvidence.hashCode())) * 31, 31, this.f110211c), 31, this.d), 31, this.e);
        DocumentType documentType = this.f;
        int iHashCode2 = (iD + (documentType == null ? 0 : documentType.hashCode())) * 31;
        String str = this.f110212g;
        return this.i.hashCode() + j6.a.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f110213h);
    }
}
