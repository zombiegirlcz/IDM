package us6;

import com.revolut.feature.freelancer.impl.database.FreelancerDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n3 implements e4m.e {
    public static is6.y a(FreelancerDatabase database) {
        h3.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        is6.y yVarL = database.l();
        vc.s.k(yVarL);
        return yVarL;
    }
}
