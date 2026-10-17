package wy1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0011"}, d2 = {"Lwy1/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "operationId", "b", "d", "state", "Lwy1/f$a;", "Lwy1/f$a;", "()Lwy1/f$a;", "alias", "failureReason", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("operationId")
    @NotNull
    private final String operationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("alias")
    @NotNull
    private final a alias;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("failureReason")
    private final String failureReason;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lwy1/f$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "b", "value", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.value, aVar.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.operationId, fVar.operationId) && Intrinsics.f(this.state, fVar.state) && Intrinsics.f(this.alias, fVar.alias) && Intrinsics.f(this.failureReason, fVar.failureReason);
    }

    public final int hashCode() {
        int iHashCode = (this.alias.hashCode() + p.a.c(this.operationId.hashCode() * 31, 31, this.state)) * 31;
        String str = this.failureReason;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
