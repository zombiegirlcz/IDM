package s93;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c {
    public abstract void a();

    public void b(ArrayList entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        a();
        d(entities);
    }

    public abstract List c();

    public abstract void d(ArrayList arrayList);
}
