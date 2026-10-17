package hmc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f153670a;

    public y(Template newTemplate) {
        Intrinsics.checkNotNullParameter(newTemplate, "newTemplate");
        this.f153670a = newTemplate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f153670a, ((y) obj2).f153670a);
    }

    public final int hashCode() {
        return this.f153670a.hashCode();
    }
}
