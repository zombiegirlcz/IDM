package cx3;

import b80.c;
import cn0.d;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import efm.d0;
import ft3.h1;
import java.io.File;
import kotlin.NotImplementedError;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import ow3.e;
import pfm.n;
import q90.i;
import qfm.i2;
import ryd.j;
import rz4.b;
import skm.p0;
import t90.g;
import te0.w;
import uyd.z;
import wl2.f;
import zr5.k;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109891a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f109892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f109893c;
    public final Object d;

    public a(b forbearanceInteractor, c connectivityRepository, wp0.b facilityIdProvider) {
        Intrinsics.checkNotNullParameter(forbearanceInteractor, "forbearanceInteractor");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(facilityIdProvider, "facilityIdProvider");
        this.f109893c = forbearanceInteractor;
        this.f109892b = connectivityRepository;
        this.d = facilityIdProvider;
    }

    public static final h1 c(a aVar) {
        return w0.F((CreditApplicationPluginFlowContract$Configuration) ((qv3.a) aVar.d).n0().get());
    }

    @Override // wl2.f
    public final d0 a(BackendFlow answers) {
        switch (this.f109891a) {
            case 0:
                Intrinsics.checkNotNullParameter(answers, "answers");
                return w.o0(p0.f264003c, new d(this, answers, (Continuation) null, 24));
            case 1:
                Intrinsics.checkNotNullParameter(answers, "answers");
                b bVar = (b) this.f109893c;
                String facilityId = (String) ((wp0.b) this.d).invoke();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(answers, "backendFlow");
                uz4.c cVar = bVar.f258509a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(answers, "backendFlow");
                d0<i> d0VarPostForbearanceSurvey = cVar.f284588a.postForbearanceSurvey(facilityId, cVar.f284589b.b(answers));
                z zVar = new z(19, new ux7.i(1, cVar.f284589b, g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", 0, 16));
                d0VarPostForbearanceSurvey.getClass();
                ufm.i iVar = new ufm.i(d0VarPostForbearanceSurvey, zVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return w.i0(iVar);
            default:
                Intrinsics.checkNotNullParameter(answers, "answers");
                return w.o0(p0.f264003c, new k(this, answers, null, 12));
        }
    }

    @Override // wl2.f
    public final d0 b(File file) {
        switch (this.f109891a) {
            case 0:
                Intrinsics.checkNotNullParameter(file, "file");
                ufm.c cVarL = d0.l(new NotImplementedError(null, 1, null));
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            case 1:
                Intrinsics.checkNotNullParameter(file, "file");
                throw new NotImplementedError(null, 1, null);
            default:
                Intrinsics.checkNotNullParameter(file, "file");
                return w.o0(p0.f264003c, new k(this, file, null, 14));
        }
    }

    @Override // wl2.f
    public final d0 k() {
        switch (this.f109891a) {
            case 0:
                return w.n0(w.o0(p0.f264003c, new cq6.k(this, null, 6)), this.f109892b);
            case 1:
                b bVar = (b) this.f109893c;
                String facilityId = (String) ((wp0.b) this.d).invoke();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                uz4.c cVar = bVar.f258509a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                d0<i> forbearanceSurvey = cVar.f284588a.getForbearanceSurvey(facilityId);
                z zVar = new z(21, new ux7.i(1, cVar.f284589b, g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", 0, 14));
                forbearanceSurvey.getClass();
                ufm.i iVar = new ufm.i(forbearanceSurvey, zVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                i2 i2VarP = new ufm.i(w.i0(iVar), new j(new rz4.a(this, 0), 8), 0).p(new j(new rz4.a(this, 1), 9));
                Intrinsics.checkNotNullExpressionValue(i2VarP, "retryWhen(...)");
                return i2VarP;
            default:
                return w.n0(w.o0(p0.f264003c, new zp5.g(this, null, 8)), this.f109892b);
        }
    }

    @Override // wl2.f
    public final efm.b removeFile(String id10, String remoteId) {
        switch (this.f109891a) {
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
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(remoteId, "remoteId");
                return pd.b.n(p0.f264003c, new k(this, remoteId, null, 13));
        }
    }

    public a(c connectivityRepository, e interactor, qv3.a state) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f109892b = connectivityRepository;
        this.f109893c = interactor;
        this.d = state;
    }

    public a(qv3.a state, zx3.a interactor, c networkStateRepository) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.d = state;
        this.f109893c = interactor;
        this.f109892b = networkStateRepository;
    }
}
