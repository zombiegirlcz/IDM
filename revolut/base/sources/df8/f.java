package df8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Ldf8/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "state", "Ldf8/e;", "Ldf8/e;", "()Ldf8/e;", "moneyUsage", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("moneyUsage")
    private final e moneyUsage;

    public f(String state, e eVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.moneyUsage = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getMoneyUsage() {
        return this.moneyUsage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
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
        return Intrinsics.f(this.state, fVar.state) && Intrinsics.f(this.moneyUsage, fVar.moneyUsage);
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        e eVar = this.moneyUsage;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
