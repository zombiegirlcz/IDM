package j34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.repositories.impl.plugins.financial_evidence.FinancialEvidenceRepositoryImpl$getDocumentsType$1;
import d14.m;
import ft3.h1;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d14.g f170968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f170969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f170970c;
    public final CreditPluginsService d;
    public final ve0.c e;
    public final m31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f170971g;

    public g(d14.g financialEvidenceV1ConfigDtoMapper, m financialEvidenceV2ConfigDtoMapper, p creditApplicationDtoMapper, CreditPluginsService creditPluginsService, ve0.c storage, m31.c multipartHelper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(financialEvidenceV1ConfigDtoMapper, "financialEvidenceV1ConfigDtoMapper");
        Intrinsics.checkNotNullParameter(financialEvidenceV2ConfigDtoMapper, "financialEvidenceV2ConfigDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f170968a = financialEvidenceV1ConfigDtoMapper;
        this.f170969b = financialEvidenceV2ConfigDtoMapper;
        this.f170970c = creditApplicationDtoMapper;
        this.d = creditPluginsService;
        this.e = storage;
        this.f = multipartHelper;
        this.f170971g = featureToggleInteractor;
    }

    public static final List a(g gVar, h1 h1Var) {
        ve0.c cVar = gVar.e;
        String strC = c(h1Var);
        Type type = new FinancialEvidenceRepositoryImpl$getDocumentsType$1().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getDocumentsType(...)");
        return (List) cVar.v0(f0.f322471a, strC, type);
    }

    public static final String b(g gVar, h1 h1Var) {
        gVar.getClass();
        return j6.a.q("financial-evidence-evidence-holder-type-", h1Var.f137835a);
    }

    public static String c(h1 h1Var) {
        return j6.a.q("financial-evidence-documents-", h1Var.f137835a);
    }

    public static String d(h1 h1Var) {
        return j6.a.q("financial-evidence-revolut-account-", h1Var.f137835a);
    }

    public static String e(h1 h1Var) {
        return j6.a.q("financial-evidence-revolut-transaction-ids-", h1Var.f137835a);
    }
}
