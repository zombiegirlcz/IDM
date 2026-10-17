package v58;

import com.revolut.core.error.data.model.ServerError;
import efm.d0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r58.c;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f286169b;

    public /* synthetic */ j(k kVar, int i) {
        this.f286168a = i;
        this.f286169b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IOException {
        r58.c cVar;
        switch (this.f286168a) {
            case 0:
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccessful()) {
                    if (response.code() == 202) {
                        ufm.b bVarM = d0.m(b.f286161a);
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    }
                    ufm.b bVarM2 = d0.m(new a(c.e.f251545a));
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                HttpException httpException = new HttpException(response);
                ServerError serverErrorC = this.f286169b.f286171b.c(httpException);
                Integer numValueOf = serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null;
                if (numValueOf != null && numValueOf.intValue() == 20011) {
                    cVar = c.a.f251541a;
                } else if (numValueOf != null && numValueOf.intValue() == 20012) {
                    cVar = c.d.f251544a;
                } else if (numValueOf != null && numValueOf.intValue() == 20017) {
                    cVar = c.C1388c.f251543a;
                } else {
                    if (numValueOf == null || numValueOf.intValue() != 20018) {
                        ufm.c cVarL = d0.l(httpException);
                        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                        return cVarL;
                    }
                    cVar = c.b.f251542a;
                }
                ufm.b bVarM3 = d0.m(new a(cVar));
                Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                return bVarM3;
            default:
                u58.d dto = (u58.d) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                k kVar = this.f286169b;
                d0<Response<Unit>> d0VarClaimAccountActivation = kVar.f286170a.claimAccountActivation(dto);
                v4a.i iVar = new v4a.i(17, new j(kVar, 0));
                d0VarClaimAccountActivation.getClass();
                ufm.i iVar2 = new ufm.i(d0VarClaimAccountActivation, iVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                return iVar2;
        }
    }
}
