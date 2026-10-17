package dz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Ldz1/n;", "T", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "present", "Ljava/lang/Object;", "()Ljava/lang/Object;", "newValue", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("present")
    private final boolean present;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("newValue")
    private final T newValue;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getNewValue() {
        return this.newValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPresent() {
        return this.present;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.present == nVar.present && Intrinsics.f(this.newValue, nVar.newValue);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.present) * 31;
        T t2 = this.newValue;
        return iHashCode + (t2 == null ? 0 : t2.hashCode());
    }
}
