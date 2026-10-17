package com.revolut.feature.kyc.impl.errorhandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import my8.k;
import n14.e;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import rw8.f;
import rw8.g;
import ulm.b1;
import ulm.s1;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f77645a;

    public d(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f77645a = gson;
    }

    public final b a(HttpException httpException) throws IOException {
        String strString;
        ResponseBody responseBodyErrorBody;
        Response<?> response = httpException.response();
        if (response == null || (responseBodyErrorBody = response.errorBody()) == null) {
            strString = null;
        } else {
            s1 s1Var = ResponseBody.Companion;
            h hVarClone = responseBodyErrorBody.source().getBuffer().clone();
            b1 b1VarContentType = responseBodyErrorBody.contentType();
            long jContentLength = responseBodyErrorBody.contentLength();
            s1Var.getClass();
            strString = s1.b(hVarClone, b1VarContentType, jContentLength).string();
        }
        try {
            return (b) this.f77645a.c(strString, b.class);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public final rw8.h b(Throwable error) throws IOException {
        b bVarA;
        Integer code;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof HttpException) {
            Integer numM = e.m(error);
            if ((numM != null && numM.intValue() == 500) || (numM != null && numM.intValue() == 502)) {
                b bVarA2 = a((HttpException) error);
                if (bVarA2 != null && (code = bVarA2.getCode()) != null) {
                    iIntValue = code.intValue();
                }
                return new rw8.e(iIntValue);
            }
            if (((numM != null && numM.intValue() == 422) || (numM != null && numM.intValue() == 400)) && (bVarA = a((HttpException) error)) != null) {
                Integer code2 = bVarA.getCode();
                if (code2 != null && code2.intValue() == 9103) {
                    return new g(bVarA.getCode().intValue());
                }
                if (code2 == null || code2.intValue() != 20220) {
                    if (code2 != null && code2.intValue() == 20221) {
                        int iIntValue = bVarA.getCode().intValue();
                        Integer timeoutMinutes = bVarA.getTimeoutMinutes();
                        return timeoutMinutes == null ? new rw8.a(iIntValue) : new f(iIntValue, timeoutMinutes.intValue());
                    }
                    if (code2 != null && code2.intValue() == 20203) {
                        return new rw8.d(bVarA.getCode().intValue());
                    }
                    Integer code3 = bVarA.getCode();
                    return new rw8.a(code3 != null ? code3.intValue() : 123);
                }
                int iIntValue2 = bVarA.getCode().intValue();
                Set consents = bVarA.getConsents();
                if (consents == null) {
                    consents = h0.f322473a;
                }
                Set missingConsents = bVarA.getMissingConsents();
                if (missingConsents == null) {
                    missingConsents = h0.f322473a;
                }
                boolean zContains = consents.contains(null);
                Set<c> set = missingConsents;
                boolean z = false;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it8 = set.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        if (((c) it8.next()).getType() == null) {
                            z = true;
                            break;
                        }
                    }
                }
                Set setI1 = d0.i1(d0.Z(consents));
                if (z || zContains) {
                    return new rw8.a(iIntValue2);
                }
                if (missingConsents.isEmpty()) {
                    if (setI1.isEmpty()) {
                        return new rw8.a(iIntValue2);
                    }
                    Set set2 = setI1;
                    ArrayList arrayList = new ArrayList(w.t(set2, 10));
                    Iterator it9 = set2.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(new rw8.b((k) it9.next(), null));
                    }
                    return new rw8.c(iIntValue2, d0.i1(arrayList));
                }
                ArrayList arrayList2 = new ArrayList(w.t(set, 10));
                for (c cVar : set) {
                    k type = cVar.getType();
                    if (type == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList2.add(new rw8.b(type, cVar.getScope()));
                }
                return new rw8.c(iIntValue2, d0.i1(arrayList2));
            }
        }
        return null;
    }
}
