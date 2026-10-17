package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lkfj/i5;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "iccId", "b", "c", "state", "", "Z", "()Z", "locked", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("iccId")
    private final String iccId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("locked")
    private final boolean locked;

    public i5(String str, String state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.iccId = str;
        this.state = state;
        this.locked = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIccId() {
        return this.iccId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj2;
        return Intrinsics.f(this.iccId, i5Var.iccId) && Intrinsics.f(this.state, i5Var.state) && this.locked == i5Var.locked;
    }

    public final int hashCode() {
        String str = this.iccId;
        return Boolean.hashCode(this.locked) + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.state);
    }
}
