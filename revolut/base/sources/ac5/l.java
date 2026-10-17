package ac5;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lac5/l;", "Lac5/o;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "e", "type", "c", "d", "state", "Lac5/p;", "Lac5/p;", "()Lac5/p;", "source", "Ljava/time/Instant;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "nextPaymentDate", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final p source;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("nextPaymentDate")
    private final Instant nextPaymentDate;

    public l(String id10, String type, String state, p source, Instant instant) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = id10;
        this.type = type;
        this.state = state;
        this.source = source;
        this.nextPaymentDate = instant;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Instant getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final p getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.type, lVar.type) && Intrinsics.f(this.state, lVar.state) && Intrinsics.f(this.source, lVar.source) && Intrinsics.f(this.nextPaymentDate, lVar.nextPaymentDate);
    }

    public final int hashCode() {
        int iHashCode = (this.source.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.state)) * 31;
        Instant instant = this.nextPaymentDate;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }
}
