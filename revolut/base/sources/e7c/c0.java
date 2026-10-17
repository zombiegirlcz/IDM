package e7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0006\n\u000b\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\r"}, d2 = {"Le7c/c0;", "", "", "toString", "()Ljava/lang/String;", "Le7c/c0$a;", "a", "Le7c/c0$a;", "()Le7c/c0$a;", "details", "c", "b", "e7c/d0", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final a details;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\f\u0010\u0004¨\u0006\u0019"}, d2 = {"Le7c/c0$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "e", "()Ljo3/a;", "totalAmount", "Le7c/d0;", "b", "Le7c/d0;", "d", "()Le7c/d0;", "status", "Le7c/c0$c;", "c", "Le7c/c0$c;", "()Le7c/c0$c;", "requirements", "Ljava/lang/String;", "merchantCountry", "merchantDescriptor", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalAmount")
        @NotNull
        private final jo3.a totalAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("status")
        @NotNull
        private final d0 status;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("requirements")
        @NotNull
        private final c requirements;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("merchantCountry")
        @NotNull
        private final String merchantCountry;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("merchantDescriptor")
        private final String merchantDescriptor;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMerchantCountry() {
            return this.merchantCountry;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMerchantDescriptor() {
            return this.merchantDescriptor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c getRequirements() {
            return this.requirements;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d0 getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getTotalAmount() {
            return this.totalAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.totalAmount, aVar.totalAmount) && this.status == aVar.status && Intrinsics.f(this.requirements, aVar.requirements) && Intrinsics.f(this.merchantCountry, aVar.merchantCountry) && Intrinsics.f(this.merchantDescriptor, aVar.merchantDescriptor);
        }

        public final int hashCode() {
            int iC = p.a.c((this.requirements.hashCode() + ((this.status.hashCode() + (this.totalAmount.hashCode() * 31)) * 31)) * 31, 31, this.merchantCountry);
            String str = this.merchantDescriptor;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static abstract class b {

        @NotNull
        public static final a Companion = new a(0);

        /* JADX INFO: loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public a(int i) {
            }
        }

        /* JADX INFO: renamed from: e7c.c0$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Le7c/c0$b$b;", "Le7c/c0$b;", "", "toString", "()Ljava/lang/String;", "Le7c/d0;", "a", "Le7c/d0;", "b", "()Le7c/d0;", "status", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "cashbackAmount", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0718b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("status")
            @NotNull
            private final d0 status;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("cashbackAmount")
            private final jo3.a cashbackAmount;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jo3.a getCashbackAmount() {
                return this.cashbackAmount;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final d0 getStatus() {
                return this.status;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0718b)) {
                    return false;
                }
                C0718b c0718b = (C0718b) obj2;
                return this.status == c0718b.status && Intrinsics.f(this.cashbackAmount, c0718b.cashbackAmount);
            }

            public final int hashCode() {
                int iHashCode = this.status.hashCode() * 31;
                jo3.a aVar = this.cashbackAmount;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }
        }

        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019¨\u0006\u001b"}, d2 = {"Le7c/c0$b$c;", "Le7c/c0$b;", "", "toString", "()Ljava/lang/String;", "Le7c/d0;", "a", "Le7c/d0;", "e", "()Le7c/d0;", "status", "", "b", "J", "c", "()J", "minTimesCompletion", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "minTransactionThreshold", "cashbackAmount", "", "Z", "()Z", "boundToMerchant", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("status")
            @NotNull
            private final d0 status;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("minTimesCompletion")
            private final long minTimesCompletion;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("minTransactionThreshold")
            private final jo3.a minTransactionThreshold;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("cashbackAmount")
            private final jo3.a cashbackAmount;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("boundToMerchant")
            private final boolean boundToMerchant;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getBoundToMerchant() {
                return this.boundToMerchant;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final jo3.a getCashbackAmount() {
                return this.cashbackAmount;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final long getMinTimesCompletion() {
                return this.minTimesCompletion;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final jo3.a getMinTransactionThreshold() {
                return this.minTransactionThreshold;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final d0 getStatus() {
                return this.status;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return this.status == cVar.status && this.minTimesCompletion == cVar.minTimesCompletion && Intrinsics.f(this.minTransactionThreshold, cVar.minTransactionThreshold) && Intrinsics.f(this.cashbackAmount, cVar.cashbackAmount) && this.boundToMerchant == cVar.boundToMerchant;
            }

            public final int hashCode() {
                int iC = a0.d.c(this.status.hashCode() * 31, 31, this.minTimesCompletion);
                jo3.a aVar = this.minTransactionThreshold;
                int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
                jo3.a aVar2 = this.cashbackAmount;
                return Boolean.hashCode(this.boundToMerchant) + ((iHashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
            }
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Le7c/c0$c;", "", "", "toString", "()Ljava/lang/String;", "", "Le7c/c0$b;", "a", "Ljava/util/List;", "()Ljava/util/List;", "groups", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("groups")
        @NotNull
        private final List<b> groups;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getGroups() {
            return this.groups;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.groups, ((c) obj2).groups);
        }

        public final int hashCode() {
            return this.groups.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDetails() {
        return this.details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.details, ((c0) obj2).details);
    }

    public final int hashCode() {
        a aVar = this.details;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
