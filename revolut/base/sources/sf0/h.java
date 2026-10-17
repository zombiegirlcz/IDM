package sf0;

import ch.qos.logback.core.util.FileSize;
import com.revolut.core.error.data.model.ServerError;
import io.reactivex.exceptions.CompositeException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import ulm.b1;
import ulm.j1;
import ulm.s1;
import ulm.x0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f262257a;

    public h(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f262257a = gson;
    }

    public final ServerError a(Throwable th10) {
        Object next;
        if (th10 instanceof HttpException) {
            return c((HttpException) th10);
        }
        if (th10 instanceof CompositeException) {
            List list = ((CompositeException) th10).f163108a;
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((Throwable) next) instanceof HttpException) {
                    break;
                }
            }
            Throwable th11 = (Throwable) next;
            if (th11 != null) {
                return c((HttpException) th11);
            }
        }
        return null;
    }

    public final ServerError b(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return d(response.h(FileSize.MB_COEFFICIENT).string(), response);
    }

    public final ServerError c(HttpException httpException) throws IOException {
        String strString;
        ResponseBody responseBodyErrorBody;
        Intrinsics.checkNotNullParameter(httpException, "httpException");
        retrofit2.Response<?> response = httpException.response();
        Response responseRaw = null;
        if (response == null || (responseBodyErrorBody = response.errorBody()) == null) {
            strString = null;
        } else {
            mmm.h hVarClone = responseBodyErrorBody.source().C5().clone();
            s1 s1Var = ResponseBody.Companion;
            b1 b1VarContentType = responseBodyErrorBody.contentType();
            long jContentLength = responseBodyErrorBody.contentLength();
            s1Var.getClass();
            strString = s1.b(hVarClone, b1VarContentType, jContentLength).string();
        }
        if (strString == null) {
            return null;
        }
        try {
            responseRaw = response.raw();
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        return d(strString, responseRaw);
    }

    public final ServerError d(String str, Response response) {
        mf0.b bVar;
        x0 x0Var;
        j1 j1Var = response != null ? response.f226087a : null;
        Regex regex = d0m.b.f110450a;
        String string = (j1Var == null || (x0Var = j1Var.f281095a) == null) ? null : x0Var.k().toString();
        if (string == null) {
            string = "";
        }
        String strA = d0m.b.a(string);
        try {
            bVar = (mf0.b) this.f262257a.c(str, mf0.b.class);
        } catch (Exception e) {
            IllegalStateException illegalStateException = new IllegalStateException("Can't parse server error for code " + (response != null ? Integer.valueOf(response.d) : null) + " and " + (j1Var != null ? j1Var.f281096b : null) + " " + strA, e);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        ServerError serverErrorV = bVar != null ? tz4.d.v(bVar) : null;
        if (serverErrorV != null && serverErrorV.getF51362a() == 1) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Empty error code received for the request: ", strA));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
        }
        return serverErrorV;
    }
}
