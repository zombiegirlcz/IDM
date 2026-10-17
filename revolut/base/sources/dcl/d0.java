package dcl;

import hcl.x2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d0 {
    public abstract void a();

    public abstract List b();

    public abstract void c(x2 x2Var);

    public abstract efm.r d(List list);

    public abstract efm.r e();

    public void f(x2 recentlyViewed) {
        Intrinsics.checkNotNullParameter(recentlyViewed, "recentlyViewed");
        c(recentlyViewed);
        a();
    }

    public abstract void g(ArrayList arrayList);
}
