package u68;

import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityNavigateCommand f277507a;

    public g(ActivityNavigateCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f277507a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f277507a.equals(((g) obj2).f277507a);
    }

    public final int hashCode() {
        return this.f277507a.hashCode();
    }
}
