package ad9;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.onboarding.api.user_migration.PlannedUserMigrationResult;
import com.revolut.feature.onboarding.api.user_migration.UnsupportedMigrationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f3306b;

    public /* synthetic */ p(s sVar, int i) {
        this.f3305a = i;
        this.f3306b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        switch (this.f3305a) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof UnsupportedMigrationException) {
                    return new PlannedUserMigrationResult.MigrationNotSupported((UnsupportedMigrationException) throwable);
                }
                ServerError serverErrorA = this.f3306b.f3308a.a(throwable);
                if (serverErrorA == null || serverErrorA.f51362a != 2000) {
                    return ((throwable instanceof HttpException) && ((HttpException) throwable).code() == 404) ? PlannedUserMigrationResult.NoPlannedMigrations.f78217a : new PlannedUserMigrationResult.Error(throwable);
                }
                Intrinsics.checkNotNullParameter("Migration is not supported in current app version", "message");
                return new PlannedUserMigrationResult.MigrationNotSupported(new UnsupportedMigrationException("Migration is not supported in current app version"));
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ServerError serverErrorA2 = this.f3306b.f3308a.a(throwable);
                Integer numValueOf = serverErrorA2 != null ? Integer.valueOf(serverErrorA2.f51362a) : null;
                return (numValueOf != null && numValueOf.intValue() == 3324) ? a99.b.f2386a : new a99.a(throwable);
        }
    }
}
