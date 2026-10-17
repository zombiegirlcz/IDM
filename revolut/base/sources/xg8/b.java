package xg8;

import com.revolut.core.error.data.model.ServerError;
import efm.d0;
import kg.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import pfm.z;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f305625b;

    public /* synthetic */ b(j jVar, int i) {
        this.f305624a = i;
        this.f305625b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ResponseBody responseBodyErrorBody;
        switch (this.f305624a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                j jVar = this.f305625b;
                sf0.h hVar = jVar.f305632b;
                o oVar = jVar.e;
                ServerError serverErrorA = hVar.a(error);
                Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                if (numValueOf != null && numValueOf.intValue() == 9505) {
                    Response<?> response = ((HttpException) error).response();
                    responseBodyErrorBody = response != null ? response.errorBody() : null;
                    if (responseBodyErrorBody == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Integer graduationAge = ((vg8.a) oVar.c(responseBodyErrorBody.string(), vg8.a.class)).getGraduationAge();
                    ufm.b bVarM = d0.m(new ig8.b(graduationAge != null ? graduationAge.intValue() : 18));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (numValueOf == null || numValueOf.intValue() != 9014) {
                    return d0.l(error);
                }
                Response<?> response2 = ((HttpException) error).response();
                responseBodyErrorBody = response2 != null ? response2.errorBody() : null;
                if (responseBodyErrorBody != null) {
                    return d0.m(new ig8.c(((vg8.b) oVar.c(responseBodyErrorBody.string(), vg8.b.class)).getOtp()));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j jVar2 = this.f305625b;
                z zVarD = jVar2.f305631a.confirmGraduation().D(ig8.a.f161083a);
                Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                return ue0.e.D(zVarD, new b(jVar2, 0));
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                z zVarD2 = this.f305625b.f305631a.resignGraduation().D(Unit.f186387a);
                Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
                return zVarD2;
            case 3:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                j jVar3 = this.f305625b;
                z zVarD3 = jVar3.f305631a.completeGraduation(new vg8.e(zBooleanValue)).D(d.Completed);
                Intrinsics.checkNotNullExpressionValue(zVarD3, "toSingleDefault(...)");
                ufm.i iVar = new ufm.i(ue0.e.D(zVarD3, new b(jVar3, 4)), new xg6.k(new b(jVar3, 5), 6), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 4:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                ServerError serverErrorA2 = this.f305625b.f305632b.a(error2);
                Integer numValueOf2 = serverErrorA2 != null ? Integer.valueOf(serverErrorA2.f51362a) : null;
                return (numValueOf2 != null && numValueOf2.intValue() == 9014) ? d0.m(d.ConfirmationRequired) : d0.l(error2);
            case 5:
                d result = (d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                d0 d0VarFirstOrError = m70.a.g(rd0.e.c(this.f305625b.f.b(Unit.f186387a, w4l.j.f294644c), kotlin.coroutines.g.f186406a), null, new xce.d(10), 1).map(new xg6.k(new xd2.n(17), 7)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return new ufm.i(ue0.e.F(d0VarFirstOrError, Boolean.FALSE), new xg6.k(new xe7.a(result, 5), 8), 1);
            default:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (od0.i) this.f305625b.f305633c.get("ASSET_MEMORY_CACHE_KEY");
        }
    }
}
