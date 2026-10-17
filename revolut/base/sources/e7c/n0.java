package e7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Le7c/n0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "outcome", "b", "checkedAt", "", "Le7c/n0$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "additionalConditions", "Le7c/n0$b;", "notAllowedReasons", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("outcome")
    @NotNull
    private final String outcome;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkedAt")
    @NotNull
    private final String checkedAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("conditions")
    private final List<a> additionalConditions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("notAllowedReasons")
    private final List<b> notAllowedReasons;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Le7c/n0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.type, ((a) obj2).type);
        }

        public final int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Le7c/n0$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.type, ((b) obj2).type);
        }

        public final int hashCode() {
            return this.type.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalConditions() {
        return this.additionalConditions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheckedAt() {
        return this.checkedAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getNotAllowedReasons() {
        return this.notAllowedReasons;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.outcome, n0Var.outcome) && Intrinsics.f(this.checkedAt, n0Var.checkedAt) && Intrinsics.f(this.additionalConditions, n0Var.additionalConditions) && Intrinsics.f(this.notAllowedReasons, n0Var.notAllowedReasons);
    }

    public final int hashCode() {
        int iC = p.a.c(this.outcome.hashCode() * 31, 31, this.checkedAt);
        List<a> list = this.additionalConditions;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.notAllowedReasons;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
