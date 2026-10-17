package i2m;

import com.trustdockekyc.core.backend.domain.model.AppError;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.common.ErrorResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.common.ErrorResponseDetailEntity;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.common.ErrorResponseParameterEntity;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.ResponseBody;
import r10.v;
import retrofit2.CallAdapter;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;
import ulm.x0;
import zhm.f0;
import zhm.r0;
import zhm.w;
import zsc.p;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends CallAdapter.Factory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Regex f158061c = new Regex("^native-app-sdk(\\.review)?\\.trustdock\\.io$");

    public final AppError a(Response response, Retrofit retrofit, HttpException httpException) {
        ResponseBody responseBodyErrorBody = response.errorBody();
        List list = null;
        ErrorResponse errorResponse = responseBodyErrorBody == null ? null : (ErrorResponse) retrofit.responseBodyConverter(ErrorResponse.class, new Annotation[0]).convert(responseBodyErrorBody);
        if (errorResponse == null) {
            return new AppError.ServerError(new w1m.c(28, response.toString(), null, httpException));
        }
        x0 x0Var = response.raw().f226087a.f281095a;
        String str = x0Var.d;
        int i = x0Var.e;
        int iCode = response.code();
        ErrorResponseDetailEntity errorResponseDetailEntity = errorResponse.f107378b;
        if (errorResponseDetailEntity != null) {
            List<ErrorResponseParameterEntity> list2 = errorResponseDetailEntity.f107379a;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (ErrorResponseParameterEntity errorResponseParameterEntity : list2) {
                arrayList.add(r0.k(new Pair("name", errorResponseParameterEntity.f107380a), new Pair("code", errorResponseParameterEntity.f107381b)));
            }
            list = arrayList;
        }
        String str2 = errorResponse.f107377a;
        int iCode2 = response.code();
        String str3 = iCode + p.SPACE_CHAR + x0Var.b();
        if (list == null) {
            list = f0.f322471a;
        }
        w1m.c cVar = new w1m.c(str2, httpException, Integer.valueOf(iCode2), str3, list);
        return ((this.f158061c.f(str) || (str.equals("localhost") && i == a.NativeAppApi.a())) && iCode == 422) ? new AppError.IllegalArgumentError(cVar) : iCode == 404 ? new AppError.NotFoundError(cVar) : iCode == 412 ? new AppError.MismatchedMyNumberCard(cVar) : iCode == 503 ? new AppError.MaintenanceError(cVar) : (400 > iCode || iCode >= 500) ? (500 > iCode || iCode >= 600) ? new AppError.UnknownError(cVar) : new AppError.ServerError(cVar) : new AppError.NetworkResponseError(cVar);
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException(f.f.toString());
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
        Intrinsics.h(parameterUpperBound);
        return new v(this, retrofit, parameterUpperBound);
    }
}
