package wxf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public abstract void a();

    public abstract void b(String str);

    public abstract void c(String str, ArrayList arrayList);

    public abstract void d(ArrayList arrayList);

    public abstract List e();

    public abstract List f(String str);

    public abstract List g(String str, ArrayList arrayList);

    public abstract List h(ArrayList arrayList);

    public abstract void i(oxf.b... bVarArr);

    public void j(String state, oxf.b... travelBookingEntities) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(travelBookingEntities, "travelBookingEntities");
        b(state);
        i((oxf.b[]) Arrays.copyOf(travelBookingEntities, travelBookingEntities.length));
    }

    public void k(ArrayList types, String state, oxf.b... travelBookingEntities) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(travelBookingEntities, "travelBookingEntities");
        c(state, types);
        i((oxf.b[]) Arrays.copyOf(travelBookingEntities, travelBookingEntities.length));
    }

    public void l(ArrayList types, oxf.b... travelBookingEntities) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(travelBookingEntities, "travelBookingEntities");
        d(types);
        i((oxf.b[]) Arrays.copyOf(travelBookingEntities, travelBookingEntities.length));
    }

    public void m(oxf.b... travelBookingEntities) {
        Intrinsics.checkNotNullParameter(travelBookingEntities, "travelBookingEntities");
        a();
        i((oxf.b[]) Arrays.copyOf(travelBookingEntities, travelBookingEntities.length));
    }
}
