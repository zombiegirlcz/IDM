package com.revolut.feature.onboarding.impl.user_migration.data.network;

import cd9.a;
import cd9.c;
import cd9.d;
import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u000fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0012H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/impl/user_migration/data/network/UserMigrationService;", "", "", "state", "", "termsPassed", "Lefm/d0;", "Lcd9/d;", "getPlannedUserMigration", "(Ljava/lang/String;Ljava/lang/Boolean;)Lefm/d0;", "Lcd9/a;", "body", "Lefm/b;", "startMigration", "(Lcd9/a;)Lefm/b;", "Lcd9/c;", "submitPlaceOfBirth", "(Lcd9/c;)Lefm/b;", "Lcd9/b;", "submitOccupation", "(Lcd9/b;)Lefm/b;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserMigrationService {
    @GET("migration/requirements")
    @NotNull
    d0<d> getPlannedUserMigration(@NotNull @Query("state") String state, @Header("X-Terms-Passed") Boolean termsPassed);

    @POST("migration")
    @NotNull
    b startMigration(@Body @NotNull a body);

    @POST("migration-data/occupation")
    @NotNull
    b submitOccupation(@Body @NotNull cd9.b body);

    @POST("migration-data/place-of-birth")
    @NotNull
    b submitPlaceOfBirth(@Body @NotNull c body);
}
