package zzj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public abstract void a(rzj.c cVar);

    public abstract List b(rzj.c cVar);

    public abstract void c(ArrayList arrayList);

    public void d(rzj.c scope, ArrayList data) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(data, "data");
        a(scope);
        c(data);
    }
}
