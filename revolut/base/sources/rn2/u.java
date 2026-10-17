package rn2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0018"}, d2 = {"Lrn2/u;", "", "", "toString", "()Ljava/lang/String;", "Lrn2/a;", "a", "Lrn2/a;", "b", "()Lrn2/a;", "fromBank", "e", "toBank", "", "Lrn2/x;", "c", "Ljava/util/List;", "()Ljava/util/List;", "documents", "Lrn2/b0;", "d", "terms", "Lrn2/c;", "sections", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromBank")
    @NotNull
    private final a fromBank;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("toBank")
    @NotNull
    private final a toBank;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    private final List<x> documents;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("terms")
    private final List<b0> terms;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("sections")
    private final List<c> sections;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getFromBank() {
        return this.fromBank;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getToBank() {
        return this.toBank;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.fromBank, uVar.fromBank) && Intrinsics.f(this.toBank, uVar.toBank) && Intrinsics.f(this.documents, uVar.documents) && Intrinsics.f(this.terms, uVar.terms) && Intrinsics.f(this.sections, uVar.sections);
    }

    public final int hashCode() {
        int iHashCode = (this.toBank.hashCode() + (this.fromBank.hashCode() * 31)) * 31;
        List<x> list = this.documents;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<b0> list2 = this.terms;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<c> list3 = this.sections;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }
}
