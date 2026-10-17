package mi3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Lmi3/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "f", "type", "Lmi3/b;", "Lmi3/b;", "()Lmi3/b;", "card", "Lmi3/d;", "d", "Lmi3/d;", "()Lmi3/d;", "plan", "", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "endDate", "Lmi3/f;", "Lmi3/f;", "()Lmi3/f;", "preconditions", "feature_checkout_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("card")
    private final b card;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("plan")
    private final d plan;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("endDate")
    private final Long endDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("preconditions")
    private final f preconditions;

    public c(String id10, String type, b bVar, d dVar, Long l2, f fVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id10;
        this.type = type;
        this.card = bVar;
        this.plan = dVar;
        this.endDate = l2;
        this.preconditions = fVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getPreconditions() {
        return this.preconditions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.card, cVar.card) && Intrinsics.f(this.plan, cVar.plan) && Intrinsics.f(this.endDate, cVar.endDate) && Intrinsics.f(this.preconditions, cVar.preconditions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.type);
        b bVar = this.card;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.plan;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Long l2 = this.endDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        f fVar = this.preconditions;
        return iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
    }
}
