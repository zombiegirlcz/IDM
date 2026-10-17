package th6;

import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import com.revolut.feature.external_accounts.impl.repository.network.InstitutionAccountsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstitutionAccountsService f271268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f271269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f271270c;

    public c(InstitutionAccountsService service, ne0.j memoryCache, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f271268a = service;
        this.f271269b = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.f271270c = new w4l.f(te0.w.k0(connectivityRepository, new Function1(this) { // from class: th6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f271264b;

            {
                this.f271264b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ExternalInstitutionAuthData params = (ExternalInstitutionAuthData) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<uh6.i>> accountsToSelect = this.f271264b.f271268a.getAccountsToSelect(params.f72213a, params.f72214b, params.f72215c);
                        tcg.q qVar = new tcg.q(23, new tfh.a(2));
                        accountsToSelect.getClass();
                        ufm.i iVar = new ufm.i(accountsToSelect, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(params, "it");
                        return (List) this.f271264b.f271269b.get(c.a(params));
                }
            }
        }), new Function1(this) { // from class: th6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f271264b;

            {
                this.f271264b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ExternalInstitutionAuthData params = (ExternalInstitutionAuthData) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<uh6.i>> accountsToSelect = this.f271264b.f271268a.getAccountsToSelect(params.f72213a, params.f72214b, params.f72215c);
                        tcg.q qVar = new tcg.q(23, new tfh.a(2));
                        accountsToSelect.getClass();
                        ufm.i iVar = new ufm.i(accountsToSelect, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(params, "it");
                        return (List) this.f271264b.f271269b.get(c.a(params));
                }
            }
        }, new ta8.a(this, 17), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String a(ExternalInstitutionAuthData externalInstitutionAuthData) {
        String str = externalInstitutionAuthData.f72213a;
        String str2 = externalInstitutionAuthData.f72214b;
        return v0.a.i(v0.a.m("ExternalInstitutionAuthData(institutionId=", str, ", state=", str2, ", authToken="), externalInstitutionAuthData.f72215c, ")");
    }
}
