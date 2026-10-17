package xn6;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f307333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final en6.l f307334b;

    public p(f inputData, en6.l mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f307333a = inputData;
        this.f307334b = mapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration = this.f307333a.f307319a;
        Data institutionsData = domainState.f307317b;
        String query = domainState.f307318c;
        boolean z = domainState.f307316a;
        oe6.g institutionPurpose = domainState.d;
        String str = domainState.e;
        Intrinsics.checkNotNullParameter(institutionsData, "institutionsData");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(institutionPurpose, "institutionPurpose");
        return new l((List) iii.c.f(institutionsData, new elb.a(12), new en6.a(0), new en6.b(this.f307334b, externalInstitutionsConfiguration, query, z, institutionPurpose, str)));
    }
}
