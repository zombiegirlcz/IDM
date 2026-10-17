package jzc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0005\u0010)¨\u0006+"}, d2 = {"Ljzc/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "", "b", "Ljava/util/List;", "getQuestions", "()Ljava/util/List;", "questions", "Ljzc/r;", "c", "Ljzc/r;", "g", "()Ljzc/r;", "incomeSource", "Ljzc/k;", "d", "Ljzc/k;", "f", "()Ljzc/k;", "incomeFrequency", "Ljzc/q;", "Ljzc/q;", "h", "()Ljzc/q;", "reviewState", "amount", "i", "title", "description", "Ljzc/d;", "documents", "Ljzc/a;", "j", "Ljzc/a;", "()Ljzc/a;", "actionToDo", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("questions")
    @NotNull
    private final List<Object> questions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("incomeSource")
    @NotNull
    private final r incomeSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("incomeFrequency")
    @NotNull
    private final k incomeFrequency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("reviewState")
    @NotNull
    private final q reviewState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final String amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<d> documents;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("actionToDo")
    private final a actionToDo;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getActionToDo() {
        return this.actionToDo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.questions, iVar.questions) && Intrinsics.f(this.incomeSource, iVar.incomeSource) && Intrinsics.f(this.incomeFrequency, iVar.incomeFrequency) && Intrinsics.f(this.reviewState, iVar.reviewState) && Intrinsics.f(this.amount, iVar.amount) && Intrinsics.f(this.title, iVar.title) && Intrinsics.f(this.description, iVar.description) && Intrinsics.f(this.documents, iVar.documents) && Intrinsics.f(this.actionToDo, iVar.actionToDo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getIncomeFrequency() {
        return this.incomeFrequency;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final r getIncomeSource() {
        return this.incomeSource;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final q getReviewState() {
        return this.reviewState;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c((this.reviewState.hashCode() + ((this.incomeFrequency.hashCode() + ((this.incomeSource.hashCode() + p.a.d(this.id.hashCode() * 31, 31, this.questions)) * 31)) * 31)) * 31, 31, this.amount), 31, this.title), 31, this.description), 31, this.documents);
        a aVar = this.actionToDo;
        return iD + (aVar == null ? 0 : aVar.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
