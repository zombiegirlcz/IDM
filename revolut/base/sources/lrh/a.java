package lrh;

import com.revolut.feature.wealth_protection.sso.api.error.WealthProtectionSsoError;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import okhttp3.ResponseBody;
import rd0.c;
import rd0.d;
import retrofit2.HttpException;
import retrofit2.Response;
import ulm.b1;
import ulm.s1;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f199517a;

    public a(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f199517a = gson;
    }

    public final WealthProtectionSsoError a(Throwable throwable) throws IOException {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        b bVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        WealthProtectionSsoError wealthProtectionSsoError = null;
        HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
        if (httpException != null && (response = httpException.response()) != null && (responseBodyErrorBody = response.errorBody()) != null) {
            s1 s1Var = ResponseBody.Companion;
            h hVarClone = responseBodyErrorBody.source().getBuffer().clone();
            b1 b1VarContentType = responseBodyErrorBody.contentType();
            long jContentLength = responseBodyErrorBody.contentLength();
            s1Var.getClass();
            String strString = s1.b(hVarClone, b1VarContentType, jContentLength).string();
            if (strString != null) {
                try {
                    bVar = (b) this.f199517a.c(strString, b.class);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.a(c.ERROR, null, null, e, h0Var);
                    bVar = null;
                }
                if (bVar != null && response.code() == 401 && bVar.getCode() == 9401) {
                    List acceptedAuthenticationContexts = bVar.getAcceptedAuthenticationContexts();
                    if (acceptedAuthenticationContexts == null) {
                        acceptedAuthenticationContexts = v.l(bVar.getAcceptedLevel());
                    }
                    wealthProtectionSsoError = new WealthProtectionSsoError(bVar.getState(), response.raw().f226087a.f281095a.i, acceptedAuthenticationContexts);
                }
            }
        }
        return wealthProtectionSsoError;
    }
}
