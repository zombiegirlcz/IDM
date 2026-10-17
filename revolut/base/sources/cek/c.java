package cek;

import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c {
    public abstract List a();

    public abstract void b(ArrayList arrayList);

    public abstract r c(String str);

    public abstract void d();

    public void e(ArrayList podNominees) {
        Intrinsics.checkNotNullParameter(podNominees, "podNominees");
        d();
        b(podNominees);
    }
}
