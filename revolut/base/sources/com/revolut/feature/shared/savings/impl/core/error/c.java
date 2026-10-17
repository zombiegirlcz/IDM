package com.revolut.feature.shared.savings.impl.core.error;

import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$DepositLimitsReachedException;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$IneligibleForSavingsException;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$JointSavingsPendingAccountAlreadyExists;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist;
import dj0.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ulm.b1;
import ulm.s1;
import zhm.h0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f86459a;

    public c(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f86459a = gson;
    }

    public static String a(b bVar, String str) {
        Map params = bVar.getParams();
        Object obj2 = params != null ? params.get(str) : null;
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public final Throwable b(Throwable error) {
        String strString;
        Throwable savingsServerErrorContract$DepositLimitsReachedException;
        ResponseBody responseBodyErrorBody;
        Intrinsics.checkNotNullParameter(error, "error");
        if (!(error instanceof HttpException)) {
            return error;
        }
        o oVar = this.f86459a;
        Response<?> response = ((HttpException) error).response();
        Throwable savingsServerErrorContract$JointSavingsPendingAccountAlreadyExists = null;
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
            b bVar = (b) oVar.c(strString, b.class);
            int code = bVar.getCode();
            if (code == 11124) {
                Map params = bVar.getParams();
                if (params != null) {
                    jo3.a aVar = (jo3.a) oVar.c(r0.h("totalLimit", params).toString(), jo3.a.class);
                    jo3.a aVar2 = (jo3.a) oVar.c(r0.h("limitLeft", params).toString(), jo3.a.class);
                    Intrinsics.h(aVar);
                    d dVarO = mo3.a.o(aVar);
                    Intrinsics.h(aVar2);
                    savingsServerErrorContract$DepositLimitsReachedException = new SavingsServerErrorContract$DepositLimitsReachedException(dVarO, mo3.a.o(aVar2));
                    savingsServerErrorContract$JointSavingsPendingAccountAlreadyExists = savingsServerErrorContract$DepositLimitsReachedException;
                }
            } else if (code == 11150) {
                String strA = a(bVar, "moneyBoxId");
                String strA2 = a(bVar, "savingsAccountId");
                if (strA != null && strA2 != null) {
                    savingsServerErrorContract$JointSavingsPendingAccountAlreadyExists = new SavingsServerErrorContract$JointSavingsPendingAccountAlreadyExists(strA, strA2);
                }
            } else if (code == 11132) {
                Map params2 = bVar.getParams();
                if (params2 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(params2.size()));
                    for (Object obj2 : params2.entrySet()) {
                        Object key = ((Map.Entry) obj2).getKey();
                        Object value = ((Map.Entry) obj2).getValue();
                        Intrinsics.i(value, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put(key, (String) value);
                    }
                    savingsServerErrorContract$JointSavingsPendingAccountAlreadyExists = new SavingsServerErrorContract$IneligibleForSavingsException(linkedHashMap);
                }
            } else if (code == 11133 && bVar.getParams() != null) {
                String strA3 = a(bVar, "id");
                if (strA3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                savingsServerErrorContract$DepositLimitsReachedException = new SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist(strA3);
                savingsServerErrorContract$JointSavingsPendingAccountAlreadyExists = savingsServerErrorContract$DepositLimitsReachedException;
            }
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        return savingsServerErrorContract$JointSavingsPendingAccountAlreadyExists == null ? error : savingsServerErrorContract$JointSavingsPendingAccountAlreadyExists;
    }
}
