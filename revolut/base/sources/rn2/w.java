package rn2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\t\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\r\u0010\u0018¨\u0006!"}, d2 = {"Lrn2/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "status", "b", "g", "switchMethod", "Lrn2/a;", "c", "Lrn2/a;", "h", "()Lrn2/a;", "toBank", "d", "fromBank", "", "Lrn2/y;", "e", "Ljava/util/List;", "()Ljava/util/List;", "stages", "Lrn2/v;", "Lrn2/v;", "()Lrn2/v;", "cancellation", "Lrn2/x;", "documents", "faq", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("switchMethod")
    @NotNull
    private final String switchMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("toBank")
    @NotNull
    private final a toBank;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fromBank")
    @NotNull
    private final a fromBank;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("stages")
    @NotNull
    private final List<y> stages;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cancellation")
    private final v cancellation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<x> documents;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("faq")
    @NotNull
    private final List<x> faq;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getFaq() {
        return this.faq;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getFromBank() {
        return this.fromBank;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getStages() {
        return this.stages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.status, wVar.status) && Intrinsics.f(this.switchMethod, wVar.switchMethod) && Intrinsics.f(this.toBank, wVar.toBank) && Intrinsics.f(this.fromBank, wVar.fromBank) && Intrinsics.f(this.stages, wVar.stages) && Intrinsics.f(this.cancellation, wVar.cancellation) && Intrinsics.f(this.documents, wVar.documents) && Intrinsics.f(this.faq, wVar.faq);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSwitchMethod() {
        return this.switchMethod;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getToBank() {
        return this.toBank;
    }

    public final int hashCode() {
        int iD = p.a.d((this.fromBank.hashCode() + ((this.toBank.hashCode() + p.a.c(this.status.hashCode() * 31, 31, this.switchMethod)) * 31)) * 31, 31, this.stages);
        v vVar = this.cancellation;
        return this.faq.hashCode() + p.a.d((iD + (vVar == null ? 0 : vVar.hashCode())) * 31, 31, this.documents);
    }
}
