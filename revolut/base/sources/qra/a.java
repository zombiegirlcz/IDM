package qra;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public abstract void a(String str);

    public abstract List b();

    public abstract sra.b c(String str);

    public abstract void d(sra.b bVar);

    public abstract void e(ArrayList arrayList);

    public abstract void f();

    public void g(ArrayList cardOwners) {
        Intrinsics.checkNotNullParameter(cardOwners, "cardOwners");
        f();
        e(cardOwners);
    }

    public abstract void h(sra.b bVar);
}
