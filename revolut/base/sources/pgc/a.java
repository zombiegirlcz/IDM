package pgc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public abstract void a();

    public void b(ArrayList categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        a();
        d(categories);
    }

    public abstract List c();

    public abstract void d(ArrayList arrayList);
}
