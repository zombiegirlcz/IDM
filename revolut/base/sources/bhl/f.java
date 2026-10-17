package bhl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {
    public abstract void a();

    public abstract void b(ArrayList arrayList);

    public abstract List c();

    public void d(ArrayList events) {
        Intrinsics.checkNotNullParameter(events, "events");
        a();
        b(events);
    }
}
