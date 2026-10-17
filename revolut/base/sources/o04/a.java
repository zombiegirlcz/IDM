package o04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo04/a;", "Lo04/c;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx4.n f221117a;

    public a(nx4.n action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f221117a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f221117a, ((a) obj2).f221117a);
    }

    public final int hashCode() {
        return this.f221117a.hashCode();
    }
}
