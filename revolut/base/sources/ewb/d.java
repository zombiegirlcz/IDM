package ewb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0014"}, d2 = {"Lewb/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "", "b", "D", "c", "()D", "pointsAmount", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "monetaryAmount", "d", "token", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsAmount")
    private final double pointsAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("monetaryAmount")
    @NotNull
    private final jo3.b monetaryAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("token")
    private final String token;

    public d(String id10, double d, jo3.b monetaryAmount, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(monetaryAmount, "monetaryAmount");
        this.id = id10;
        this.pointsAmount = d;
        this.monetaryAmount = monetaryAmount;
        this.token = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getMonetaryAmount() {
        return this.monetaryAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getPointsAmount() {
        return this.pointsAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Double.compare(this.pointsAmount, dVar.pointsAmount) == 0 && Intrinsics.f(this.monetaryAmount, dVar.monetaryAmount) && Intrinsics.f(this.token, dVar.token);
    }

    public final int hashCode() {
        int iE = y.e(this.monetaryAmount, m72.b.c(this.id.hashCode() * 31, this.pointsAmount, 31), 31);
        String str = this.token;
        return iE + (str == null ? 0 : str.hashCode());
    }
}
