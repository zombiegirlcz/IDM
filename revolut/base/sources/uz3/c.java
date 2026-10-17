package uz3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Luz3/c;", "Luz3/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "deeplink", "Luz3/g;", "()Luz3/g;", "beforeAction", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("deeplink")
    @NotNull
    private final String deeplink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("beforeAction")
    private final g beforeAction;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getBeforeAction() {
        return this.beforeAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.deeplink, cVar.deeplink) && Intrinsics.f(this.beforeAction, cVar.beforeAction);
    }

    public final int hashCode() {
        int iHashCode = this.deeplink.hashCode() * 31;
        g gVar = this.beforeAction;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
