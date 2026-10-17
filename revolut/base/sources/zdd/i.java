package zdd;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0018\u0010'R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b\u0010\u0010'R\u001c\u0010-\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\f\u0010'R\u001c\u0010/\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b.\u0010'R\u001c\u00103\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b)\u00102R\"\u00109\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b\u001c\u00108R\u001c\u0010=\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b\u0015\u0010<R\"\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b+\u00108R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b@\u0010\u0004R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\u0004R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\b6\u0010\u0004¨\u0006I"}, d2 = {"Lzdd/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "m", "savingsAccountId", "c", "n", "state", "Lzdd/b;", "d", "Lzdd/b;", "o", "()Lzdd/b;", "stateReason", "e", "q", "type", "f", "i", "ownerId", "accountType", "h", "getName", "name", "Ljo3/a;", "Ljo3/a;", "getBalance", "()Ljo3/a;", "balance", "", "j", "Ljava/lang/Long;", "()Ljava/lang/Long;", "goal", "k", "banner", "l", "deadline", "createdDate", "r", "updatedDate", "Lzdd/p;", "Lzdd/p;", "()Lzdd/p;", "pocket", "", "Lzdd/l;", "p", "Ljava/util/List;", "()Ljava/util/List;", "members", "Lzdd/h;", "Lzdd/h;", "()Lzdd/h;", "deposit", "Lzdd/a;", "recurringPayments", "s", "workflowId", "t", "pendingActivationReason", "u", "getScope", "scope", "v", "subtype", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("savingsAccountId")
    private final String savingsAccountId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("stateReason")
    private final b stateReason;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ownerId")
    @NotNull
    private final String ownerId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountType")
    @NotNull
    private final String accountType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("balance")
    private final jo3.a balance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("goal")
    private final Long goal;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("banner")
    private final String banner;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("deadline")
    private final Long deadline;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final Long updatedDate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("pocket")
    private final p pocket;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("members")
    private final List<l> members;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("deposit")
    private final h deposit;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurringPayments")
    private final List<a> recurringPayments;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("workflowId")
    private final String workflowId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("pendingActivationReason")
    private final String pendingActivationReason;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("scope")
    private final String scope;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("subtype")
    private final String subtype;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getDeposit() {
        return this.deposit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.savingsAccountId, iVar.savingsAccountId) && Intrinsics.f(this.state, iVar.state) && Intrinsics.f(this.stateReason, iVar.stateReason) && Intrinsics.f(this.type, iVar.type) && Intrinsics.f(this.ownerId, iVar.ownerId) && Intrinsics.f(this.accountType, iVar.accountType) && Intrinsics.f(this.name, iVar.name) && Intrinsics.f(this.balance, iVar.balance) && Intrinsics.f(this.goal, iVar.goal) && Intrinsics.f(this.banner, iVar.banner) && Intrinsics.f(this.deadline, iVar.deadline) && Intrinsics.f(this.createdDate, iVar.createdDate) && Intrinsics.f(this.updatedDate, iVar.updatedDate) && Intrinsics.f(this.pocket, iVar.pocket) && Intrinsics.f(this.members, iVar.members) && Intrinsics.f(this.deposit, iVar.deposit) && Intrinsics.f(this.recurringPayments, iVar.recurringPayments) && Intrinsics.f(this.workflowId, iVar.workflowId) && Intrinsics.f(this.pendingActivationReason, iVar.pendingActivationReason) && Intrinsics.f(this.scope, iVar.scope) && Intrinsics.f(this.subtype, iVar.subtype);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getMembers() {
        return this.members;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.savingsAccountId;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.state);
        b bVar = this.stateReason;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.type), 31, this.ownerId), 31, this.accountType);
        String str2 = this.name;
        int iHashCode2 = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.a aVar = this.balance;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Long l2 = this.goal;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.banner;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.deadline;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.createdDate;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.updatedDate;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        p pVar = this.pocket;
        int iHashCode9 = (iHashCode8 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        List<l> list = this.members;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        h hVar = this.deposit;
        int iHashCode11 = (iHashCode10 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        List<a> list2 = this.recurringPayments;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.workflowId;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pendingActivationReason;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.scope;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subtype;
        return iHashCode15 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPendingActivationReason() {
        return this.pendingActivationReason;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final p getPocket() {
        return this.pocket;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getRecurringPayments() {
        return this.recurringPayments;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSavingsAccountId() {
        return this.savingsAccountId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final b getStateReason() {
        return this.stateReason;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }
}
