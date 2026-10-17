package ac5;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u0015\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\f\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006*"}, d2 = {"Lac5/n;", "Lac5/o;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "h", "type", "c", "g", "state", "Lac5/p;", "Lac5/p;", "f", "()Lac5/p;", "source", "Lac5/x;", "e", "Lac5/x;", "()Lac5/x;", "day", "Lac5/j;", "Lac5/j;", "()Lac5/j;", "amount", "Ljava/time/Instant;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "nextPaymentDate", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "daysInAdvance", "", "i", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isStateToggleable", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n implements o {

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
    @lg.b("day")
    @NotNull
    private final x day;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final j amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPaymentDate")
    private final Instant nextPaymentDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("daysInAdvance")
    private final Integer daysInAdvance;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("isStateToggleable")
    private final Boolean isStateToggleable;

    public n(String id10, String type, String state, p source, x day, j amount, Instant instant, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.id = id10;
        this.type = type;
        this.state = state;
        this.source = source;
        this.day = day;
        this.amount = amount;
        this.nextPaymentDate = instant;
        this.daysInAdvance = num;
        this.isStateToggleable = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final x getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getDaysInAdvance() {
        return this.daysInAdvance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.id, nVar.id) && Intrinsics.f(this.type, nVar.type) && Intrinsics.f(this.state, nVar.state) && Intrinsics.f(this.source, nVar.source) && Intrinsics.f(this.day, nVar.day) && Intrinsics.f(this.amount, nVar.amount) && Intrinsics.f(this.nextPaymentDate, nVar.nextPaymentDate) && Intrinsics.f(this.daysInAdvance, nVar.daysInAdvance) && Intrinsics.f(this.isStateToggleable, nVar.isStateToggleable);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = (this.amount.hashCode() + ((this.day.hashCode() + ((this.source.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.state)) * 31)) * 31)) * 31;
        Instant instant = this.nextPaymentDate;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Integer num = this.daysInAdvance;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isStateToggleable;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsStateToggleable() {
        return this.isStateToggleable;
    }
}
