package xek;

import efm.d0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public abstract d0 a();

    public abstract void b();

    public abstract void c(ArrayList arrayList);

    public void d(ArrayList pases) {
        Intrinsics.checkNotNullParameter(pases, "pases");
        b();
        c(pases);
    }
}
