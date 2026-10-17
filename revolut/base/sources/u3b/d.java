package u3b;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276885a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f276885a, ((d) obj2).f276885a);
    }

    public final int hashCode() {
        return this.f276885a.hashCode();
    }

    public d(Data maintenanceMarginWidgetState) {
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetState, "maintenanceMarginWidgetState");
        this.f276885a = maintenanceMarginWidgetState;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, false, 7, null));
    }
}
