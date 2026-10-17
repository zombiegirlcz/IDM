package b1e;

import auj.o;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import efm.d0;
import g1e.h;
import java.io.File;
import kge.d;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import pfm.n;
import qfm.i2;
import t90.g;
import te0.s;
import te0.w;
import ufm.i;
import uyd.z;
import uz4.c;
import wl2.f;
import x8h.n0;
import xy7.j;
import xyk.b;
import xyk.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11795a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11797c;

    public a(d interactor, b state) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f11796b = interactor;
        this.f11797c = state;
    }

    @Override // wl2.f
    public final d0 a(BackendFlow answers) {
        switch (this.f11795a) {
            case 0:
                Intrinsics.checkNotNullParameter(answers, "answers");
                d0 d0VarFirstOrError = ((h) ((g1e.b) this.f11797c)).w0().c(s.f270018a).firstOrError();
                b0a.h hVar = new b0a.h(6, new as9.a(this, answers, 18));
                d0VarFirstOrError.getClass();
                i iVar = new i(d0VarFirstOrError, hVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 1:
                Intrinsics.checkNotNullParameter(answers, "answers");
                rz4.b bVar = (rz4.b) this.f11796b;
                Intrinsics.checkNotNullParameter(answers, "backendFlow");
                c cVar = bVar.f258509a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(answers, "backendFlow");
                d0<q90.i> d0VarPostFinancialDifficultiesSurvey = cVar.f284588a.postFinancialDifficultiesSurvey(cVar.f284589b.b(answers));
                z zVar = new z(18, new ux7.i(1, cVar.f284589b, g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", 0, 15));
                d0VarPostFinancialDifficultiesSurvey.getClass();
                i iVar2 = new i(d0VarPostFinancialDifficultiesSurvey, zVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return w.i0(iVar2);
            case 2:
                Intrinsics.checkNotNullParameter(answers, "answers");
                return w.o0(kotlin.coroutines.g.f186406a, new s09.c(this, answers, null, 14));
            default:
                Intrinsics.checkNotNullParameter(answers, "answers");
                d0 d0VarFirstOrError2 = ((e) ((b) this.f11797c)).w0().c(s.f270018a).firstOrError();
                j jVar = new j(3, new xyc.j(this, answers, 1));
                d0VarFirstOrError2.getClass();
                i iVar3 = new i(d0VarFirstOrError2, jVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                return iVar3;
        }
    }

    @Override // wl2.f
    public final d0 b(File file) {
        switch (this.f11795a) {
            case 0:
                Intrinsics.checkNotNullParameter(file, "file");
                throw new UnsupportedOperationException();
            case 1:
                Intrinsics.checkNotNullParameter(file, "file");
                throw new NotImplementedError(null, 1, null);
            case 2:
                Intrinsics.checkNotNullParameter(file, "file");
                ufm.c cVarL = d0.l(new NotImplementedError(null, 1, null));
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            default:
                Intrinsics.checkNotNullParameter(file, "file");
                throw new UnsupportedOperationException("Documents upload not supported for trading extended hours onboarding!");
        }
    }

    @Override // wl2.f
    public final d0 k() {
        switch (this.f11795a) {
            case 0:
                d0 d0VarFirstOrError = ((h) ((g1e.b) this.f11797c)).w0().c(s.f270018a).firstOrError();
                b0a.h hVar = new b0a.h(7, new o(this, 25));
                d0VarFirstOrError.getClass();
                i iVar = new i(d0VarFirstOrError, hVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 1:
                c cVar = ((rz4.b) this.f11796b).f258509a;
                d0<q90.i> financialDifficultiesSurvey = cVar.f284588a.getFinancialDifficultiesSurvey();
                z zVar = new z(20, new ux7.i(1, cVar.f284589b, g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", 0, 13));
                financialDifficultiesSurvey.getClass();
                i iVar2 = new i(financialDifficultiesSurvey, zVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                i2 i2VarP = w.i0(iVar2).p(new ryd.j(new ryd.i(this, 2), 5));
                Intrinsics.checkNotNullExpressionValue(i2VarP, "retryWhen(...)");
                return i2VarP;
            case 2:
                return w.o0(kotlin.coroutines.g.f186406a, new s64.a(this, null, 0));
            default:
                d0 d0VarFirstOrError2 = ((e) ((b) this.f11797c)).w0().c(s.f270018a).firstOrError();
                j jVar = new j(4, new xw9.c(this, 22));
                d0VarFirstOrError2.getClass();
                i iVar3 = new i(d0VarFirstOrError2, jVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                return iVar3;
        }
    }

    @Override // wl2.f
    public final efm.b removeFile(String id10, String remoteId) {
        switch (this.f11795a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(remoteId, "remoteId");
                n nVarN = efm.b.n(new NotImplementedError(null, 1, null));
                Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                return nVarN;
            case 1:
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(remoteId, "remoteId");
                n nVarN2 = efm.b.n(new NotImplementedError(null, 1, null));
                Intrinsics.checkNotNullExpressionValue(nVarN2, "error(...)");
                return nVarN2;
            case 2:
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(remoteId, "remoteId");
                n nVarN3 = efm.b.n(new NotImplementedError(null, 1, null));
                Intrinsics.checkNotNullExpressionValue(nVarN3, "error(...)");
                return nVarN3;
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(remoteId, "remoteId");
                n nVarN4 = efm.b.n(new NotImplementedError(null, 1, null));
                Intrinsics.checkNotNullExpressionValue(nVarN4, "error(...)");
                return nVarN4;
        }
    }

    public a(n0 stockLendingInteractor, g1e.b state) {
        Intrinsics.checkNotNullParameter(stockLendingInteractor, "stockLendingInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f11796b = stockLendingInteractor;
        this.f11797c = state;
    }

    public a(pw3.b coBorrowerConsentPartnerInteractor, p54.e state) {
        Intrinsics.checkNotNullParameter(coBorrowerConsentPartnerInteractor, "coBorrowerConsentPartnerInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f11796b = coBorrowerConsentPartnerInteractor;
        this.f11797c = state;
    }

    public a(rz4.b forbearanceInteractor, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(forbearanceInteractor, "forbearanceInteractor");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f11796b = forbearanceInteractor;
        this.f11797c = connectivityRepository;
    }
}
