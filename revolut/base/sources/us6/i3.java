package us6;

import com.revolut.feature.freelancer.impl.database.FreelancerDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i3 implements e4m.e {
    public static is6.a a(FreelancerDatabase database) {
        h3.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        is6.a aVarG = database.g();
        vc.s.k(aVarG);
        return aVarG;
    }
}
