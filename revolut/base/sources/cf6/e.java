package cf6;

import bf6.f;
import bf6.g;
import c65.i;
import com.revolut.feature.external_accounts.impl.repository.network.CrossBorderOpenBankingService;
import dcl.q;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrossBorderOpenBankingService f23564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf6.a f23565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bf6.b f23566c;
    public final f d;
    public final g e;
    public final ue0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue0.c f23567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ue0.c f23568h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f23569j;
    public final Lazy k;

    public e(j memoryCache, CrossBorderOpenBankingService crossBorderOpenBankingService, bf6.a crossBorderExternalInstitutionDtoMapper, bf6.b crossBorderExternalInstitutionEntityMapper, f countryDepartmentDtoMapper, g countryDepartmentEntityMapper, bf6.e externalInstitutionBranchDtoMapper, q externalInstitutionBranchEntityMapper, ue0.c crossBorderInstitutionsStorage, ue0.c countryDepartmentsStorage, ue0.c externalInstitutionBranchesStorage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(crossBorderOpenBankingService, "crossBorderOpenBankingService");
        Intrinsics.checkNotNullParameter(crossBorderExternalInstitutionDtoMapper, "crossBorderExternalInstitutionDtoMapper");
        Intrinsics.checkNotNullParameter(crossBorderExternalInstitutionEntityMapper, "crossBorderExternalInstitutionEntityMapper");
        Intrinsics.checkNotNullParameter(countryDepartmentDtoMapper, "countryDepartmentDtoMapper");
        Intrinsics.checkNotNullParameter(countryDepartmentEntityMapper, "countryDepartmentEntityMapper");
        Intrinsics.checkNotNullParameter(externalInstitutionBranchDtoMapper, "externalInstitutionBranchDtoMapper");
        Intrinsics.checkNotNullParameter(externalInstitutionBranchEntityMapper, "externalInstitutionBranchEntityMapper");
        Intrinsics.checkNotNullParameter(crossBorderInstitutionsStorage, "crossBorderInstitutionsStorage");
        Intrinsics.checkNotNullParameter(countryDepartmentsStorage, "countryDepartmentsStorage");
        Intrinsics.checkNotNullParameter(externalInstitutionBranchesStorage, "externalInstitutionBranchesStorage");
        this.f23564a = crossBorderOpenBankingService;
        this.f23565b = crossBorderExternalInstitutionDtoMapper;
        this.f23566c = crossBorderExternalInstitutionEntityMapper;
        this.d = countryDepartmentDtoMapper;
        this.e = countryDepartmentEntityMapper;
        this.f = crossBorderInstitutionsStorage;
        this.f23567g = countryDepartmentsStorage;
        this.f23568h = externalInstitutionBranchesStorage;
        Continuation continuation = null;
        this.i = new x4l.c(new b6a.d(this, continuation, 21), new bek.c(memoryCache, 2), new bek.d(memoryCache, 2), new i(this, continuation, 11), new awd.b(this, continuation, 17));
        this.f23569j = new x4l.c(new b(this, continuation, 1), new bek.c(memoryCache, 3), new bek.d(memoryCache, 3), new c(this, continuation, 1), new d(this, continuation, 1));
        this.k = yhm.j.b(new a(this, memoryCache, 0));
    }
}
