package xr7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f308291a;

    public e(ArrayList policies) {
        Intrinsics.checkNotNullParameter(policies, "policies");
        this.f308291a = policies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f308291a.equals(((e) obj2).f308291a);
    }

    public final int hashCode() {
        return this.f308291a.hashCode();
    }
}
