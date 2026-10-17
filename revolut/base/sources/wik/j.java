package wik;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lwik/j;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "code", "Lwik/j$a;", "b", "Lwik/j$a;", "()Lwik/j$a;", "params", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final Integer code = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("params")
    private final a params = null;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lwik/j$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "preorderId", "b", "planId", "", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "preorderEndDate", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "credit", "Luh3/b;", "Luh3/b;", "()Luh3/b;", "preconditions", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("preorderId")
        @NotNull
        private final String preorderId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("planId")
        private final String planId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("preorderEndDate")
        private final Long preorderEndDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("credit")
        private final Boolean credit;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("preconditions")
        private final uh3.b preconditions;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getCredit() {
            return this.credit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final uh3.b getPreconditions() {
            return this.preconditions;
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
            return Intrinsics.f(this.preorderId, aVar.preorderId) && Intrinsics.f(this.planId, aVar.planId) && Intrinsics.f(this.preorderEndDate, aVar.preorderEndDate) && Intrinsics.f(this.credit, aVar.credit) && Intrinsics.f(this.preconditions, aVar.preconditions);
        }

        public final int hashCode() {
            int iHashCode = this.preorderId.hashCode() * 31;
            String str = this.planId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l2 = this.preorderEndDate;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Boolean bool = this.credit;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            uh3.b bVar = this.preconditions;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
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
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.code, jVar.code) && Intrinsics.f(this.params, jVar.params);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        a aVar = this.params;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
