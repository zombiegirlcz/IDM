package us6;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.freelancer.impl.database.FreelancerDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m3 implements e4m.e {
    public static FreelancerDatabase a(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        h3.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        FreelancerDatabase freelancerDatabase = (FreelancerDatabase) FreelancerDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{ls6.k.f199637c, ls6.o.f199641c, ls6.r.f199642c, ls6.s.f199643c, ls6.t.f199644c, ls6.u.f199645c, ls6.v.f199646c, ls6.w.f199647c, ls6.x.f199648c, ls6.a.f199627c, ls6.b.f199628c, ls6.c.f199629c, ls6.d.f199630c, ls6.e.f199631c, ls6.f.f199632c, ls6.g.f199633c, ls6.h.f199634c, ls6.i.f199635c, ls6.j.f199636c, ls6.l.f199638c, ls6.m.f199639c, ls6.n.f199640c}, databaseEncryptionMigratorFactory);
        vc.s.k(freelancerDatabase);
        return freelancerDatabase;
    }
}
