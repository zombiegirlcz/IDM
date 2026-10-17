package bz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lbz1/g;", "", "", "toString", "()Ljava/lang/String;", "Lbz1/e;", "a", "Lbz1/e;", "()Lbz1/e;", "defaultReceiver", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultReceiver")
    private final e defaultReceiver;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getDefaultReceiver() {
        return this.defaultReceiver;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.defaultReceiver, ((g) obj2).defaultReceiver);
    }

    public final int hashCode() {
        e eVar = this.defaultReceiver;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }
}
