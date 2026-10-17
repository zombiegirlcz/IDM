package uue;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Luue/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "Luue/a$a;", "b", "Luue/a$a;", "()Luue/a$a;", "upperBoundLimit", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("upperBoundLimit")
    private final C1564a upperBoundLimit;

    /* JADX INFO: renamed from: uue.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Luue/a$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "totalLimit", "b", "d", "usedLimit", "remainingLimit", "remainingLimitInTopUpCurrency", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1564a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalLimit")
        @NotNull
        private final jo3.a totalLimit;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("usedLimit")
        @NotNull
        private final jo3.a usedLimit;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("remainingLimit")
        @NotNull
        private final jo3.a remainingLimit;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("remainingLimitInTopupCurrency")
        @NotNull
        private final jo3.a remainingLimitInTopUpCurrency;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getRemainingLimit() {
            return this.remainingLimit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getRemainingLimitInTopUpCurrency() {
            return this.remainingLimitInTopUpCurrency;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getTotalLimit() {
            return this.totalLimit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getUsedLimit() {
            return this.usedLimit;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1564a)) {
                return false;
            }
            C1564a c1564a = (C1564a) obj2;
            return Intrinsics.f(this.totalLimit, c1564a.totalLimit) && Intrinsics.f(this.usedLimit, c1564a.usedLimit) && Intrinsics.f(this.remainingLimit, c1564a.remainingLimit) && Intrinsics.f(this.remainingLimitInTopUpCurrency, c1564a.remainingLimitInTopUpCurrency);
        }

        public final int hashCode() {
            return this.remainingLimitInTopUpCurrency.hashCode() + v7.j(this.remainingLimit, v7.j(this.usedLimit, this.totalLimit.hashCode() * 31, 31), 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C1564a getUpperBoundLimit() {
        return this.upperBoundLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.upperBoundLimit, aVar.upperBoundLimit);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        C1564a c1564a = this.upperBoundLimit;
        return iHashCode + (c1564a == null ? 0 : c1564a.hashCode());
    }
}
