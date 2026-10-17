package us6;

import com.revolut.feature.freelancer.impl.database.FreelancerDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j3 implements e4m.e {
    public static is6.c a(FreelancerDatabase database) {
        h3.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        is6.c cVarH = database.h();
        vc.s.k(cVarH);
        return cVarH;
    }
}
