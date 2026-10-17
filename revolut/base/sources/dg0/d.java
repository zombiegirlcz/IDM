package dg0;

import cg0.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Ldg0/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "state", "", "Lcg0/l;", "b", "Ljava/util/List;", "()Ljava/util/List;", "scoredFaqs", "Ldg0/e;", "Ldg0/e;", "d", "()Ldg0/e;", "summarisation", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "pollingTime", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("scoredFaqs")
    @NotNull
    private final List<l> scoredFaqs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("summarisation")
    private final e summarisation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pollingTime")
    private final Integer pollingTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getPollingTime() {
        return this.pollingTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getScoredFaqs() {
        return this.scoredFaqs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getSummarisation() {
        return this.summarisation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.state, dVar.state) && Intrinsics.f(this.scoredFaqs, dVar.scoredFaqs) && Intrinsics.f(this.summarisation, dVar.summarisation) && Intrinsics.f(this.pollingTime, dVar.pollingTime);
    }

    public final int hashCode() {
        int iD = p.a.d(this.state.hashCode() * 31, 31, this.scoredFaqs);
        e eVar = this.summarisation;
        int iHashCode = (iD + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Integer num = this.pollingTime;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
