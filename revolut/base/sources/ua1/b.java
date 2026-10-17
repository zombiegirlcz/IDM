package ua1;

import efm.d0;
import i26.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qa1.k;
import rd0.c;
import rd0.d;
import retrofit2.HttpException;
import ulm.r1;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final d0 a(o gson, Throwable exception, k errorCode, Function0 action) {
        jz5.a aVar;
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(action, "action");
        if (exception instanceof HttpException) {
            HttpException httpException = (HttpException) exception;
            if (httpException.code() == 422) {
                jz5.a.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(httpException, "httpException");
                Intrinsics.checkNotNullParameter(gson, "gson");
                r1 r1VarM = l.m(httpException);
                String strString = r1VarM != null ? r1VarM.string() : null;
                if (strString != null) {
                    try {
                        aVar = (jz5.a) gson.c(strString, jz5.a.class);
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                        d.a(c.ERROR, null, null, e, h0Var);
                        aVar = null;
                    }
                } else {
                    aVar = null;
                }
                return Intrinsics.f(aVar != null ? aVar.getCode() : null, errorCode.a()) ? (d0) action.invoke() : d0.l(exception);
            }
        }
        return d0.l(exception);
    }
}
