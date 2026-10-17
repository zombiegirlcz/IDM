package xg6;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.network.models.openbanking.AccountLinkingExpirationRequestDto;
import com.revolut.data.network.models.openbanking.AuthorizationRequestDto;
import com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService;
import efm.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th6.i f305588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qsg.b f305589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f305590c;

    public l(th6.i linkExternalInstitutionsRepository, qsg.b walletsRepository, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsRepository, "linkExternalInstitutionsRepository");
        Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f305588a = linkExternalInstitutionsRepository;
        this.f305589b = walletsRepository;
        this.f305590c = transactionsInteractor;
    }

    public static Object c(l lVar, String str, gim.c cVar) {
        return ((th6.m) lVar.f305588a).a(str, null, null, cVar);
    }

    public final pfm.a a(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        d0 d0VarFirstOrError = m70.a.g(((atg.v) this.f305589b).h(AccountId.Personal.f51414a, w4l.h.f294642c), null, new xce.d(8), 1).firstOrError();
        x2l.a aVar = new x2l.a(6, new xd2.n(13));
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(new ufm.f(d0VarFirstOrError, aVar, 1), new k(new xf0.j(this, institutionId, 5), 0), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }

    public final ufm.n b(String institutionId, String str, String str2, List list, qe6.a aVar) {
        AccountLinkingExpirationRequestDto accountLinkingExpirationRequestDto;
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        th6.m mVar = (th6.m) this.f305588a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        LinkExternalInstitutionsService linkExternalInstitutionsService = mVar.f271282a;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            accountLinkingExpirationRequestDto = new AccountLinkingExpirationRequestDto(aVar.f245084a, aVar.f245085b);
        } else {
            accountLinkingExpirationRequestDto = null;
        }
        d0<uh6.b> authorizationUrl = linkExternalInstitutionsService.getAuthorizationUrl(new AuthorizationRequestDto(institutionId, str, str2, null, null, null, list, accountLinkingExpirationRequestDto, 56, null));
        tcg.q qVar = new tcg.q(25, new tfh.a(3));
        authorizationUrl.getClass();
        ufm.i iVar = new ufm.i(authorizationUrl, qVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(ue0.e.I(iVar, h0.f322473a, new th6.j(mVar, 0)));
    }

    public final ufm.n d(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        th6.m mVar = (th6.m) this.f305588a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        d0<uh6.l> d0VarRevokeInstitution = mVar.f271282a.revokeInstitution(institutionId);
        tcg.q qVar = new tcg.q(26, new tfh.a(4));
        d0VarRevokeInstitution.getClass();
        ufm.i iVar = new ufm.i(d0VarRevokeInstitution, qVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }
}
