package pgc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g {
    public abstract void a();

    public void b(ArrayList entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        d();
        i(entities);
    }

    public void c(ArrayList entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        a();
        i(entities);
    }

    public abstract void d();

    public abstract List e();

    public abstract rgc.i f(String str);

    public abstract List g();

    public abstract void h(rgc.i iVar);

    public abstract void i(ArrayList arrayList);
}
