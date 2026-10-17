package zdd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lzdd/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "name", "", "b", "J", "getAmount", "()J", "setAmount", "(J)V", "amount", "c", "Ljava/lang/Long;", "getDeadline", "()Ljava/lang/Long;", "setDeadline", "(Ljava/lang/Long;)V", "deadline", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("goal")
    private long amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("deadline")
    private Long deadline;

    public j(String name, long j2, Long l2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.amount = j2;
        this.deadline = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.name, jVar.name) && this.amount == jVar.amount && Intrinsics.f(this.deadline, jVar.deadline);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.name.hashCode() * 31, 31, this.amount);
        Long l2 = this.deadline;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
