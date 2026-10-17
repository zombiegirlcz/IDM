package jj7;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0005\u0010\f¨\u0006\u000f"}, d2 = {"Ljj7/s0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "key", "Ljo3/a;", "Ljo3/a;", "c", "()Ljo3/a;", "moneyLimit", "excess", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("moneyLimit")
    @NotNull
    private final jo3.a moneyLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("excess")
    private final jo3.a excess;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getExcess() {
        return this.excess;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getMoneyLimit() {
        return this.moneyLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.key, s0Var.key) && Intrinsics.f(this.moneyLimit, s0Var.moneyLimit) && Intrinsics.f(this.excess, s0Var.excess);
    }

    public final int hashCode() {
        int iJ = v7.j(this.moneyLimit, this.key.hashCode() * 31, 31);
        jo3.a aVar = this.excess;
        return iJ + (aVar == null ? 0 : aVar.hashCode());
    }
}
