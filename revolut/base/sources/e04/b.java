package e04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Le04/b;", "Le04/e;", "", "toString", "()Ljava/lang/String;", "a", "Le04/e;", "()Le04/e;", "beforeAction", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("beforeAction")
    private final e beforeAction;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getBeforeAction() {
        return this.beforeAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.beforeAction, ((b) obj2).beforeAction);
    }

    public final int hashCode() {
        e eVar = this.beforeAction;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }
}
