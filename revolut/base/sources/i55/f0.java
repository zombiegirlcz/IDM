package i55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\t\u000f\u0005\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\u0011\u0010!¨\u0006#"}, d2 = {"Li55/f0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "token", "b", "i", "type", "c", "j", "variant", "d", "behaviour", "e", "g", "settlementType", "f", "scheduleUpdateType", "", "J", "()J", "amount", "currency", "Li55/f0$b;", "Li55/f0$b;", "()Li55/f0$b;", "breakdown", "Li55/f0$d;", "Li55/f0$d;", "()Li55/f0$d;", "scheduleInfo", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("variant")
    @NotNull
    private final String variant;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("behaviour")
    @NotNull
    private final String behaviour;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("settlementType")
    private final String settlementType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("scheduleUpdateType")
    private final String scheduleUpdateType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("breakdown")
    private final b breakdown;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduleInfo")
    private final d scheduleInfo;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Li55/f0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCurrency", "currency", "", "b", "J", "()J", "current", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "new", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("current")
        private final long current;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("new")
        private final Long new;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCurrent() {
            return this.current;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getNew() {
            return this.new;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.currency, aVar.currency) && this.current == aVar.current && Intrinsics.f(this.new, aVar.new);
        }

        public final int hashCode() {
            int iC = a0.d.c(this.currency.hashCode() * 31, 31, this.current);
            Long l2 = this.new;
            return iC + (l2 == null ? 0 : l2.hashCode());
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static abstract class b {

        /* JADX INFO: loaded from: classes21.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Li55/f0$b$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "amount", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("amount")
            private final long amount;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getAmount() {
                return this.amount;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.amount == ((a) obj2).amount;
            }

            public final int hashCode() {
                return Long.hashCode(this.amount);
            }
        }

        /* JADX INFO: renamed from: i55.f0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Li55/f0$b$b;", "Li55/f0$b;", "", "toString", "()Ljava/lang/String;", "Li55/f0$b$b$a;", "a", "Li55/f0$b$b$a;", "()Li55/f0$b$b$a;", "innerBreakdown", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0909b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("breakdown")
            @NotNull
            private final a innerBreakdown;

            /* JADX INFO: renamed from: i55.f0$b$b$a */
            /* JADX INFO: loaded from: classes21.dex */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Li55/f0$b$b$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "principal", "b", "e", "rescheduledPrincipal", "Li55/b;", "c", "Li55/b;", "()Li55/b;", "interest", "fee", "Li55/f0$b$a;", "Li55/f0$b$a;", "()Li55/f0$b$a;", "breakageFee", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("principal")
                private final Long principal;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("rescheduledPrincipal")
                private final Long rescheduledPrincipal;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("interest")
                private final i55.b interest;

                /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                @lg.b("fee")
                private final i55.b fee;

                /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                @lg.b("breakageFee")
                private final a breakageFee;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final a getBreakageFee() {
                    return this.breakageFee;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final i55.b getFee() {
                    return this.fee;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final i55.b getInterest() {
                    return this.interest;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final Long getPrincipal() {
                    return this.principal;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final Long getRescheduledPrincipal() {
                    return this.rescheduledPrincipal;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj2;
                    return Intrinsics.f(this.principal, aVar.principal) && Intrinsics.f(this.rescheduledPrincipal, aVar.rescheduledPrincipal) && Intrinsics.f(this.interest, aVar.interest) && Intrinsics.f(this.fee, aVar.fee) && Intrinsics.f(this.breakageFee, aVar.breakageFee);
                }

                public final int hashCode() {
                    Long l2 = this.principal;
                    int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
                    Long l3 = this.rescheduledPrincipal;
                    int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
                    i55.b bVar = this.interest;
                    int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                    i55.b bVar2 = this.fee;
                    int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
                    a aVar = this.breakageFee;
                    return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getInnerBreakdown() {
                return this.innerBreakdown;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0909b) && Intrinsics.f(this.innerBreakdown, ((C0909b) obj2).innerBreakdown);
            }

            public final int hashCode() {
                return this.innerBreakdown.hashCode();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Li55/f0$b$c;", "Li55/f0$b;", "", "toString", "()Ljava/lang/String;", "Li55/f0$b$c$a;", "a", "Li55/f0$b$c$a;", "()Li55/f0$b$c$a;", "innerBreakdown", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("breakdown")
            @NotNull
            private final a innerBreakdown;

            /* JADX INFO: loaded from: classes21.dex */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Li55/f0$b$c$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "principal", "b", "e", "rescheduledPrincipal", "Li55/b;", "c", "Li55/b;", "()Li55/b;", "interest", "penalty", "Li55/f0$b$a;", "Li55/f0$b$a;", "()Li55/f0$b$a;", "breakageFee", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("principal")
                private final Long principal;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("rescheduledPrincipal")
                private final Long rescheduledPrincipal;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("interest")
                private final i55.b interest;

                /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                @lg.b("penalty")
                private final i55.b penalty;

                /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                @lg.b("breakageFee")
                private final a breakageFee;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final a getBreakageFee() {
                    return this.breakageFee;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final i55.b getInterest() {
                    return this.interest;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final i55.b getPenalty() {
                    return this.penalty;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final Long getPrincipal() {
                    return this.principal;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final Long getRescheduledPrincipal() {
                    return this.rescheduledPrincipal;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj2;
                    return Intrinsics.f(this.principal, aVar.principal) && Intrinsics.f(this.rescheduledPrincipal, aVar.rescheduledPrincipal) && Intrinsics.f(this.interest, aVar.interest) && Intrinsics.f(this.penalty, aVar.penalty) && Intrinsics.f(this.breakageFee, aVar.breakageFee);
                }

                public final int hashCode() {
                    Long l2 = this.principal;
                    int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
                    Long l3 = this.rescheduledPrincipal;
                    int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
                    i55.b bVar = this.interest;
                    int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                    i55.b bVar2 = this.penalty;
                    int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
                    a aVar = this.breakageFee;
                    return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getInnerBreakdown() {
                return this.innerBreakdown;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.innerBreakdown, ((c) obj2).innerBreakdown);
            }

            public final int hashCode() {
                return this.innerBreakdown.hashCode();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Li55/f0$b$d;", "Li55/f0$b;", "", "toString", "()Ljava/lang/String;", "Li55/f0$b$d$a;", "a", "Li55/f0$b$d$a;", "()Li55/f0$b$d$a;", "innerBreakdown", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("breakdown")
            @NotNull
            private final a innerBreakdown;

            /* JADX INFO: loaded from: classes21.dex */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Li55/f0$b$d$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "principal", "b", "c", "monthlyRepayment", "additionalRepayment", "d", "overdueRepayment", "Li55/f0$b$a;", "Li55/f0$b$a;", "()Li55/f0$b$a;", "breakageFee", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("principal")
                private final Long principal;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("monthlyRepayment")
                private final Long monthlyRepayment;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("additionalRepayment")
                private final Long additionalRepayment;

                /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                @lg.b("overdueRepayment")
                private final Long overdueRepayment;

                /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                @lg.b("breakageFee")
                private final a breakageFee;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Long getAdditionalRepayment() {
                    return this.additionalRepayment;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final a getBreakageFee() {
                    return this.breakageFee;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final Long getMonthlyRepayment() {
                    return this.monthlyRepayment;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final Long getOverdueRepayment() {
                    return this.overdueRepayment;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final Long getPrincipal() {
                    return this.principal;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj2;
                    return Intrinsics.f(this.principal, aVar.principal) && Intrinsics.f(this.monthlyRepayment, aVar.monthlyRepayment) && Intrinsics.f(this.additionalRepayment, aVar.additionalRepayment) && Intrinsics.f(this.overdueRepayment, aVar.overdueRepayment) && Intrinsics.f(this.breakageFee, aVar.breakageFee);
                }

                public final int hashCode() {
                    Long l2 = this.principal;
                    int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
                    Long l3 = this.monthlyRepayment;
                    int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
                    Long l4 = this.additionalRepayment;
                    int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
                    Long l5 = this.overdueRepayment;
                    int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
                    a aVar = this.breakageFee;
                    return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getInnerBreakdown() {
                return this.innerBreakdown;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.innerBreakdown, ((d) obj2).innerBreakdown);
            }

            public final int hashCode() {
                return this.innerBreakdown.hashCode();
            }
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Li55/f0$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "current", "b", "new", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("current")
        @NotNull
        private final String current;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("new")
        private final String new;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrent() {
            return this.current;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNew() {
            return this.new;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.current, cVar.current) && Intrinsics.f(this.new, cVar.new);
        }

        public final int hashCode() {
            int iHashCode = this.current.hashCode() * 31;
            String str = this.new;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000b\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Li55/f0$d;", "", "", "toString", "()Ljava/lang/String;", "Li55/f0$a;", "a", "Li55/f0$a;", "d", "()Li55/f0$a;", "nextRepayment", "b", "c", "monthlyRepayment", "finalRepayment", "Li55/f0$c;", "Li55/f0$c;", "e", "()Li55/f0$c;", "nextRepaymentDate", "finalRepaymentDate", "f", "Ljava/lang/String;", "repaymentType", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextRepayment")
        private final a nextRepayment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("monthlyRepayment")
        private final a monthlyRepayment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("finalRepayment")
        private final a finalRepayment;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("nextRepaymentDate")
        private final c nextRepaymentDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("finalRepaymentDate")
        private final c finalRepaymentDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("repaymentType")
        @NotNull
        private final String repaymentType;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getFinalRepayment() {
            return this.finalRepayment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getFinalRepaymentDate() {
            return this.finalRepaymentDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getMonthlyRepayment() {
            return this.monthlyRepayment;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a getNextRepayment() {
            return this.nextRepayment;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final c getNextRepaymentDate() {
            return this.nextRepaymentDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.nextRepayment, dVar.nextRepayment) && Intrinsics.f(this.monthlyRepayment, dVar.monthlyRepayment) && Intrinsics.f(this.finalRepayment, dVar.finalRepayment) && Intrinsics.f(this.nextRepaymentDate, dVar.nextRepaymentDate) && Intrinsics.f(this.finalRepaymentDate, dVar.finalRepaymentDate) && Intrinsics.f(this.repaymentType, dVar.repaymentType);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRepaymentType() {
            return this.repaymentType;
        }

        public final int hashCode() {
            a aVar = this.nextRepayment;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            a aVar2 = this.monthlyRepayment;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            a aVar3 = this.finalRepayment;
            int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            c cVar = this.nextRepaymentDate;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            c cVar2 = this.finalRepaymentDate;
            return this.repaymentType.hashCode() + ((iHashCode4 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBehaviour() {
        return this.behaviour;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getBreakdown() {
        return this.breakdown;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getScheduleInfo() {
        return this.scheduleInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.token, f0Var.token) && Intrinsics.f(this.type, f0Var.type) && Intrinsics.f(this.variant, f0Var.variant) && Intrinsics.f(this.behaviour, f0Var.behaviour) && Intrinsics.f(this.settlementType, f0Var.settlementType) && Intrinsics.f(this.scheduleUpdateType, f0Var.scheduleUpdateType) && this.amount == f0Var.amount && Intrinsics.f(this.currency, f0Var.currency) && Intrinsics.f(this.breakdown, f0Var.breakdown) && Intrinsics.f(this.scheduleInfo, f0Var.scheduleInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getScheduleUpdateType() {
        return this.scheduleUpdateType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSettlementType() {
        return this.settlementType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.token.hashCode() * 31, 31, this.type), 31, this.variant), 31, this.behaviour);
        String str = this.settlementType;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scheduleUpdateType;
        int iC2 = p.a.c(a0.d.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.amount), 31, this.currency);
        b bVar = this.breakdown;
        int iHashCode2 = (iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.scheduleInfo;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }
}
