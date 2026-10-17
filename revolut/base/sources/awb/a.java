package awb;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lawb/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductId", "productId", "b", "getIdempotencyKey", "idempotencyKey", "c", "getPointsAmount", "pointsAmount", "Ljo3/a;", "d", "Ljo3/a;", "getMonetaryAmount", "()Ljo3/a;", "monetaryAmount", "e", "getToken", "token", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("productId")
    @NotNull
    private final String productId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("idempotencyKey")
    @NotNull
    private final String idempotencyKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("pointsAmount")
    @NotNull
    private final String pointsAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("monetaryAmount")
    @NotNull
    private final jo3.a monetaryAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("token")
    @NotNull
    private final String token;

    public a(String productId, String idempotencyKey, String pointsAmount, String token, jo3.a monetaryAmount) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(pointsAmount, "pointsAmount");
        Intrinsics.checkNotNullParameter(monetaryAmount, "monetaryAmount");
        Intrinsics.checkNotNullParameter(token, "token");
        this.productId = productId;
        this.idempotencyKey = idempotencyKey;
        this.pointsAmount = pointsAmount;
        this.monetaryAmount = monetaryAmount;
        this.token = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.productId, aVar.productId) && Intrinsics.f(this.idempotencyKey, aVar.idempotencyKey) && Intrinsics.f(this.pointsAmount, aVar.pointsAmount) && Intrinsics.f(this.monetaryAmount, aVar.monetaryAmount) && Intrinsics.f(this.token, aVar.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + v7.j(this.monetaryAmount, p.a.c(p.a.c(this.productId.hashCode() * 31, 31, this.idempotencyKey), 31, this.pointsAmount), 31);
    }
}
