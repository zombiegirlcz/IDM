package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lq90/j4;", "Lq90/q0;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j4 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243379a;

    public j4(String jsonString) {
        Intrinsics.checkNotNullParameter("UNSUPPORTED", "itemId");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        this.f243379a = jsonString;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j4) && Intrinsics.f(this.f243379a, ((j4) obj2).f243379a);
    }

    public final int hashCode() {
        return this.f243379a.hashCode() - 469955445;
    }
}
