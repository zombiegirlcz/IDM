package ei3;

import com.revolut.feature.checkout.models.PreorderPreconditions;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lei3/n;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "code", "Lei3/n$a;", "b", "Lei3/n$a;", "()Lei3/n$a;", "params", "feature_checkout_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final Integer code = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("params")
    private final a params = null;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lei3/n$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "preorderId", "b", "cardId", "", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "preorderEndDate", "Luh3/b;", "Luh3/b;", "getPreconditionsDto", "()Luh3/b;", "preconditionsDto", "feature_checkout_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("preorderId")
        private final String preorderId = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cardId")
        private final String cardId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("preorderEndDate")
        private final Long preorderEndDate = null;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("preconditions")
        private final uh3.b preconditionsDto = null;
        public final Lazy e = yhm.j.b(new e58.e(this, 10));

        public static PreorderPreconditions a(a aVar) {
            uh3.b bVar = aVar.preconditionsDto;
            if (bVar != null) {
                return fi3.a.a(bVar);
            }
            return null;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        public final PreorderPreconditions c() {
            return (PreorderPreconditions) this.e.getValue();
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getPreorderEndDate() {
            return this.preorderEndDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPreorderId() {
            return this.preorderId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.preorderId, aVar.preorderId) && Intrinsics.f(this.cardId, aVar.cardId) && Intrinsics.f(this.preorderEndDate, aVar.preorderEndDate) && Intrinsics.f(this.preconditionsDto, aVar.preconditionsDto);
        }

        public final int hashCode() {
            String str = this.preorderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cardId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l2 = this.preorderEndDate;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            uh3.b bVar = this.preconditionsDto;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getParams() {
        return this.params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.code, nVar.code) && Intrinsics.f(this.params, nVar.params);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        a aVar = this.params;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
