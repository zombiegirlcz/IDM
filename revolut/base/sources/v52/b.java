package v52;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qx1.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lv52/b;", "Lv52/c;", "", "toString", "()Ljava/lang/String;", "Lqx1/a;", "Lqx1/e;", "a", "Lqx1/a;", "()Lqx1/a;", "recipient", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final qx1.a<e> recipient;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final qx1.a getRecipient() {
        return this.recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.recipient, ((b) obj2).recipient);
    }

    public final int hashCode() {
        return this.recipient.hashCode();
    }
}
