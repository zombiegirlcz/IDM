package l7c;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u001a\u0010 \u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f¨\u0006!"}, d2 = {"Ll7c/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "i", "type", "g", "state", "d", "h", "title", "", "e", "J", "()J", "amount", "f", "currency", "nextDate", "", "Z", "()Z", "recurring", "Ll7c/c;", "Ll7c/c;", "()Ll7c/c;", "receiverInfo", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

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
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextDate")
    @NotNull
    private final String nextDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurring")
    private final boolean recurring;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("receiverInfo")
    @NotNull
    private final c receiverInfo;

    public b(String id10, String type, String state, String title, long j2, String currency, String nextDate, boolean z, c receiverInfo) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(nextDate, "nextDate");
        Intrinsics.checkNotNullParameter(receiverInfo, "receiverInfo");
        this.id = id10;
        this.type = type;
        this.state = state;
        this.title = title;
        this.amount = j2;
        this.currency = currency;
        this.nextDate = nextDate;
        this.recurring = z;
        this.receiverInfo = receiverInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNextDate() {
        return this.nextDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getReceiverInfo() {
        return this.receiverInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.title, bVar.title) && this.amount == bVar.amount && Intrinsics.f(this.currency, bVar.currency) && Intrinsics.f(this.nextDate, bVar.nextDate) && this.recurring == bVar.recurring && Intrinsics.f(this.receiverInfo, bVar.receiverInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRecurring() {
        return this.recurring;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.receiverInfo.hashCode() + j6.a.c(p.a.c(p.a.c(d.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.state), 31, this.title), 31, this.amount), 31, this.currency), 31, this.nextDate), 31, this.recurring);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
