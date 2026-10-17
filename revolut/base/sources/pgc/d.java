package pgc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public abstract void a();

    public void b(ArrayList collections) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        a();
        d(collections);
    }

    public abstract List c();

    public abstract void d(ArrayList arrayList);
}
