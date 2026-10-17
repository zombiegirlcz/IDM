package us6;

import com.revolut.feature.freelancer.impl.database.FreelancerDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k3 implements e4m.e {
    public static is6.d a(FreelancerDatabase database) {
        h3.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        is6.d dVarI = database.i();
        vc.s.k(dVarI);
        return dVarI;
    }
}
