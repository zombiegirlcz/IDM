package bd9;

import cd9.d;
import cd9.e;
import cd9.f;
import com.revolut.feature.onboarding.api.user_migration.UnsupportedMigrationException;
import com.revolut.feature.onboarding.api.user_migration.model.UserMigration;
import com.revolut.feature.onboarding.api.user_migration.model.UserMigrationRequirement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import le.u1;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, e.class, "toDomain", "toDomain(Lcom/revolut/feature/onboarding/impl/user_migration/data/network/UserMigrationDto;)Lcom/revolut/feature/onboarding/api/user_migration/model/UserMigration;", 1);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws UnsupportedMigrationException {
        d p0 = (d) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = e.f23219a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        b99.a aVar = (b99.a) u1.v(p0.getStatus(), e.f23219a);
        if (aVar == null) {
            throw new UnsupportedMigrationException(p.a.p("status ", p0.getStatus(), " is not supported"));
        }
        List<f> requirements = p0.getRequirements();
        ArrayList arrayList = new ArrayList(w.t(requirements, 10));
        for (f fVar : requirements) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            b99.c cVar = (b99.c) u1.v(fVar.getState(), e.f23220b);
            if (cVar == null) {
                throw new UnsupportedMigrationException(j6.a.s("state ", fVar.getState(), " for migration ", fVar.getName(), " is not supported"));
            }
            b99.b bVar = (b99.b) u1.v(fVar.getName(), e.f23221c);
            if (bVar == null) {
                throw new UnsupportedMigrationException(p.a.p("migration ", fVar.getName(), " is not supported"));
            }
            b99.d dVar = (b99.d) u1.v(fVar.getType(), e.d);
            if (dVar == null) {
                throw new UnsupportedMigrationException(j6.a.s("type ", fVar.getType(), " for migration ", fVar.getName(), " is not supported"));
            }
            arrayList.add(new UserMigrationRequirement(cVar, bVar, dVar));
        }
        return new UserMigration(aVar, arrayList);
    }
}
