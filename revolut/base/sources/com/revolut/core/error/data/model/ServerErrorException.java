package com.revolut.core.error.data.model;

import d0m.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.d0;
import m3g.c;
import mmm.h;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import retrofit2.HttpException;
import retrofit2.Invocation;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import ulm.b1;
import ulm.j1;
import ulm.s1;
import ulm.x0;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00032\u00060\u0001j\u0002`\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/error/data/model/ServerErrorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Companion", "a", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServerErrorException extends RuntimeException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Lazy i = j.b(new c(29));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f51366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51367c;
    public final String d;
    public final int e;
    public final ServerError f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f51368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f51369h;

    /* JADX INFO: renamed from: com.revolut.core.error.data.model.ServerErrorException$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        private Companion() {
        }

        public static final String a(Companion companion, int i, ServerError serverError, String str, String str2, String str3) {
            String upperCase;
            companion.getClass();
            if (str != null) {
                upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            String str4 = Intrinsics.f(upperCase, "GET") ? null : upperCase;
            if (str4 == null) {
                str4 = "";
            }
            int i2 = serverError.f51362a;
            if (str3 == null || d0.W(str3)) {
                str3 = b.a(d0.A0('?', String.valueOf(str2)));
            }
            String string = Integer.toString(Math.abs(("ServerErrorException HTTP code: " + i + ", Error code: " + str4 + i2 + ", Request URL: " + str3 + ", Request ID: null").hashCode()), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public static final String b(Companion companion, int i, ServerError serverError, String str, String str2, String str3) {
            String strConcat;
            companion.getClass();
            if (str == null || (strConcat = str.concat(" ")) == null) {
                strConcat = "";
            }
            int i2 = serverError.f51362a;
            Regex regex = b.f110450a;
            return j6.a.w(com.google.android.gms.internal.mlkit_vision_face.a.w("HTTP code: ", i, i2, ", Error code: ", ", Request URL: "), strConcat, b.a(String.valueOf(str2)), ", Request ID: ", str3);
        }

        public static ServerErrorException c(HttpException exception, o gson) {
            String str;
            String strValue;
            String str2;
            Invocation invocation;
            Method method;
            ServerError serverError;
            Response responseRaw;
            Response responseRaw2;
            String strString;
            ResponseBody responseBodyErrorBody;
            Intrinsics.checkNotNullParameter(exception, "exception");
            Intrinsics.checkNotNullParameter(gson, "gson");
            try {
                retrofit2.Response<?> response = exception.response();
                if (response == null || (responseBodyErrorBody = response.errorBody()) == null) {
                    strString = null;
                } else {
                    ServerErrorException.INSTANCE.getClass();
                    h hVarClone = responseBodyErrorBody.source().C5().clone();
                    s1 s1Var = ResponseBody.Companion;
                    b1 b1VarContentType = responseBodyErrorBody.contentType();
                    long jContentLength = responseBodyErrorBody.contentLength();
                    s1Var.getClass();
                    strString = s1.b(hVarClone, b1VarContentType, jContentLength).string();
                }
                str = strString;
            } catch (Throwable unused) {
                str = null;
            }
            retrofit2.Response<?> response2 = exception.response();
            j1 j1Var = (response2 == null || (responseRaw2 = response2.raw()) == null) ? null : responseRaw2.f226087a;
            x0 x0Var = j1Var != null ? j1Var.f281095a : null;
            String str3 = j1Var != null ? j1Var.f281096b : null;
            retrofit2.Response<?> response3 = exception.response();
            String strF = (response3 == null || (responseRaw = response3.raw()) == null) ? null : responseRaw.f("request-id", null);
            if (j1Var != null) {
                try {
                    invocation = (Invocation) j1Var.c(Invocation.class);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                if (invocation == null || (method = invocation.method()) == null) {
                    strValue = null;
                } else {
                    Annotation[] annotations = method.getAnnotations();
                    Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
                    int length = annotations.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            strValue = null;
                            break;
                        }
                        Annotation annotation = annotations[i];
                        strValue = annotation instanceof DELETE ? ((DELETE) annotation).value() : annotation instanceof GET ? ((GET) annotation).value() : annotation instanceof HEAD ? ((HEAD) annotation).value() : annotation instanceof HTTP ? ((HTTP) annotation).path() : annotation instanceof PATCH ? ((PATCH) annotation).value() : annotation instanceof POST ? ((POST) annotation).value() : annotation instanceof PUT ? ((PUT) annotation).value() : null;
                        if (strValue != null) {
                            break;
                        }
                        i++;
                    }
                    if (strValue == null) {
                        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
                    }
                    strValue = null;
                }
                str2 = strValue;
            } else {
                str2 = null;
            }
            try {
                mf0.b bVar = (mf0.b) gson.c(str, mf0.b.class);
                Intrinsics.h(bVar);
                serverError = tz4.d.v(bVar);
            } catch (Throwable unused2) {
                serverError = new ServerError(1, "", null, null);
            }
            return new ServerErrorException(str3, x0Var, str2, strF, exception.code(), serverError, str);
        }

        public Companion(int i) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ServerErrorException(String str, x0 x0Var, String str2, String str3, int i2, ServerError serverError, String str4) {
        String str5;
        String str6;
        String str7;
        int i3;
        ServerError serverError2;
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        Companion companion = INSTANCE;
        if (x0Var != null) {
            str5 = x0Var.i;
            str6 = str;
            str7 = str3;
            serverError2 = serverError;
            i3 = i2;
        } else {
            str5 = null;
            str6 = str;
            str7 = str3;
            i3 = i2;
            serverError2 = serverError;
        }
        String str8 = str6;
        super(Companion.b(companion, i3, serverError2, str6, str5, str7));
        this.f51365a = str8;
        this.f51366b = x0Var;
        this.f51367c = str2;
        this.d = str7;
        this.e = i3;
        this.f = serverError2;
        this.f51368g = str4;
        String str9 = x0Var != null ? x0Var.i : null;
        this.f51369h = str9;
        StackTraceElement stackTraceElement = new StackTraceElement("com.revolut.core.error.data.model.ServerErrorException", j6.a.q("fromHttpException", Companion.a(companion, i3, serverError2, str8, str9, str2)), "ServerErrorException.kt", 0);
        s0 s0Var = new s0(2);
        s0Var.a(stackTraceElement);
        s0Var.b(getStackTrace());
        ArrayList arrayList = s0Var.f186433a;
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ServerErrorException)) {
            return false;
        }
        ServerErrorException serverErrorException = (ServerErrorException) obj2;
        return Intrinsics.f(this.f51365a, serverErrorException.f51365a) && Intrinsics.f(this.f51366b, serverErrorException.f51366b) && Intrinsics.f(this.f51367c, serverErrorException.f51367c) && Intrinsics.f(this.d, serverErrorException.d) && this.e == serverErrorException.e && Intrinsics.f(this.f, serverErrorException.f) && Intrinsics.f(this.f51368g, serverErrorException.f51368g);
    }

    public final int hashCode() {
        String str = this.f51365a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        x0 x0Var = this.f51366b;
        int iHashCode2 = (iHashCode + (x0Var == null ? 0 : x0Var.i.hashCode())) * 31;
        String str2 = this.f51367c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (this.f.hashCode() + j6.a.b(this.e, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31;
        String str4 = this.f51368g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return j6.a.q("ServerErrorException ", getMessage());
    }
}
