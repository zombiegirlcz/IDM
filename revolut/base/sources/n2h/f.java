package n2h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f211545a;

    public f(Data actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f211545a = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f211545a, ((f) obj2).f211545a);
    }

    public final int hashCode() {
        return this.f211545a.hashCode();
    }
}
