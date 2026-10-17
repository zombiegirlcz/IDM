package wt6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006$"}, d2 = {"Lwt6/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "j", "taxType", "c", "g", "period", "d", "h", "state", "", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "accountingStartDate", "accountingEndDate", "completedDate", "J", "()J", "filingStartDate", "i", "filingEndDate", "", "Lwt6/b$b;", "Ljava/util/List;", "()Ljava/util/List;", "steps", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxType")
    @NotNull
    private final String taxType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final String period;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("accountingStartDate")
    private final Long accountingStartDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("accountingEndDate")
    private final Long accountingEndDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedDate")
    private final Long completedDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("filingStartDate")
    private final long filingStartDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("filingEndDate")
    private final long filingEndDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<C1658b> steps;

    /* JADX INFO: renamed from: wt6.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0012"}, d2 = {"Lwt6/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "stepType", "c", "state", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "completedDate", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1658b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("stepType")
        @NotNull
        private final String stepType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("completedDate")
        private final Long completedDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getCompletedDate() {
            return this.completedDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStepType() {
            return this.stepType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1658b)) {
                return false;
            }
            C1658b c1658b = (C1658b) obj2;
            return Intrinsics.f(this.id, c1658b.id) && Intrinsics.f(this.stepType, c1658b.stepType) && Intrinsics.f(this.state, c1658b.state) && Intrinsics.f(this.completedDate, c1658b.completedDate);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.stepType), 31, this.state);
            Long l2 = this.completedDate;
            return iC + (l2 == null ? 0 : l2.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAccountingEndDate() {
        return this.accountingEndDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getAccountingStartDate() {
        return this.accountingStartDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getCompletedDate() {
        return this.completedDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getFilingEndDate() {
        return this.filingEndDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getFilingStartDate() {
        return this.filingStartDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.taxType, bVar.taxType) && Intrinsics.f(this.period, bVar.period) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.accountingStartDate, bVar.accountingStartDate) && Intrinsics.f(this.accountingEndDate, bVar.accountingEndDate) && Intrinsics.f(this.completedDate, bVar.completedDate) && this.filingStartDate == bVar.filingStartDate && this.filingEndDate == bVar.filingEndDate && Intrinsics.f(this.steps, bVar.steps);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.taxType), 31, this.period), 31, this.state);
        Long l2 = this.accountingStartDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.accountingEndDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.completedDate;
        return this.steps.hashCode() + a0.d.c(a0.d.c((iHashCode2 + (l4 != null ? l4.hashCode() : 0)) * 31, 31, this.filingStartDate), 31, this.filingEndDate);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTaxType() {
        return this.taxType;
    }
}
