package qra;

import efm.r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f {
    public abstract void a(ArrayList arrayList);

    public abstract r b();

    public abstract sra.c c(String str);

    public abstract void d(sra.c cVar);

    public void e(long j2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        sra.c cVarC = c(id10);
        if (cVarC == null) {
            cVarC = new sra.c(id10);
        }
        d(sra.c.a(cVarC, j2));
    }
}
