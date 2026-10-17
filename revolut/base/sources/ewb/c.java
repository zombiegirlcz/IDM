package ewb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\r\u0010\u001cR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004¨\u0006!"}, d2 = {"Lewb/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "i", "source", "", "c", "J", "h", "()J", "purchaseDate", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expiryDate", "g", "name", "f", "logoImageUrl", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "amount", "availableAmount", "j", "state", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchaseDate")
    private final long purchaseDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiryDate")
    private final Long expiryDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("logoImageUrl")
    @NotNull
    private final String logoImageUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.b amount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableAmount")
    private final jo3.b availableAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    public c(String id10, String source, long j2, Long l2, String name, String logoImageUrl, jo3.b amount, jo3.b bVar, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.source = source;
        this.purchaseDate = j2;
        this.expiryDate = l2;
        this.name = name;
        this.logoImageUrl = logoImageUrl;
        this.amount = amount;
        this.availableAmount = bVar;
        this.state = state;
    }

    public static c a(c cVar, String state) {
        String id10 = cVar.id;
        String source = cVar.source;
        long j2 = cVar.purchaseDate;
        Long l2 = cVar.expiryDate;
        String name = cVar.name;
        String logoImageUrl = cVar.logoImageUrl;
        jo3.b amount = cVar.amount;
        jo3.b bVar = cVar.availableAmount;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        return new c(id10, source, j2, l2, name, logoImageUrl, amount, bVar, state);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getAvailableAmount() {
        return this.availableAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.source, cVar.source) && this.purchaseDate == cVar.purchaseDate && Intrinsics.f(this.expiryDate, cVar.expiryDate) && Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.logoImageUrl, cVar.logoImageUrl) && Intrinsics.f(this.amount, cVar.amount) && Intrinsics.f(this.availableAmount, cVar.availableAmount) && Intrinsics.f(this.state, cVar.state);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getPurchaseDate() {
        return this.purchaseDate;
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.source), 31, this.purchaseDate);
        Long l2 = this.expiryDate;
        int iE = y.e(this.amount, p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.name), 31, this.logoImageUrl), 31);
        jo3.b bVar = this.availableAmount;
        return this.state.hashCode() + ((iE + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
