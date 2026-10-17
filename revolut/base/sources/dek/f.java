package dek;

import com.revolut.retail.feature.pod_nominees.impl.data.database.PodNomineesDatabase;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f implements e4m.e {
    public static cek.c a(PodNomineesDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        cek.c cVarG = db8.g();
        s.k(cVarG);
        return cVarG;
    }
}
