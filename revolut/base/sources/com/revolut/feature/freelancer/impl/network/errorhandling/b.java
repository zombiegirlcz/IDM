package com.revolut.feature.freelancer.impl.network.errorhandling;

import com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError;
import it6.c;
import it6.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f73542a;

    public b(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f73542a = gson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError] */
    public final FreelancerServerError a(Throwable error) {
        it6.a aVar;
        it6.b params;
        String reason;
        a aVar2;
        Pair pair;
        Pair pair2;
        Integer code;
        ResponseBody responseBodyErrorBody;
        Intrinsics.checkNotNullParameter(error, "error");
        if (!(error instanceof HttpException)) {
            return null;
        }
        HttpException httpException = (HttpException) error;
        Response<?> response = httpException.response();
        String strString = (response == null || (responseBodyErrorBody = response.errorBody()) == null) ? null : responseBodyErrorBody.string();
        if (strString != null) {
            try {
                aVar = (it6.a) this.f73542a.c(strString, it6.a.class);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (httpException.code() == 404) {
            if (aVar == null || (code = aVar.getCode()) == null || code.intValue() != 6502) {
                return FreelancerServerError.NoMerchantFound.f73539a;
            }
            it6.b params2 = aVar.getParams();
            return Intrinsics.f(params2 != null ? params2.getReason() : null, "PRE_ONBOARDING") ? FreelancerServerError.PendingPreOnboarding.f73541a : FreelancerServerError.PendingOnboarding.f73540a;
        }
        if (aVar != null) {
            Integer code2 = aVar.getCode();
            int i = 0;
            if (code2 != null && code2.intValue() == 6507) {
                it6.b params3 = aVar.getParams();
                String nextAvailableNumber = params3 != null ? params3.getNextAvailableNumber() : null;
                List listN0 = d0.n0(nextAvailableNumber == null ? "" : nextAvailableNumber, new String[]{"-"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listN0) {
                    if (!d0.W((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                if (size == 1) {
                    pair = new Pair(null, arrayList.get(0));
                } else if (size != 2) {
                    pair2 = new Pair(null, null);
                    accountClosurePrerequisitesNotMet = new FreelancerServerError.InvoiceNumberTaken(nextAvailableNumber, (String) pair2.f186385a, (String) pair2.f186386b);
                } else {
                    pair = new Pair(arrayList.get(0), arrayList.get(1));
                }
                pair2 = pair;
                accountClosurePrerequisitesNotMet = new FreelancerServerError.InvoiceNumberTaken(nextAvailableNumber, (String) pair2.f186385a, (String) pair2.f186386b);
            } else if (code2 != null && code2.intValue() == 6511 && (params = aVar.getParams()) != null && (reason = params.getReason()) != null) {
                a[] aVarArrValues = a.values();
                int length = aVarArrValues.length;
                while (true) {
                    if (i >= length) {
                        aVar2 = null;
                        break;
                    }
                    aVar2 = aVarArrValues[i];
                    if (a0.z(aVar2.name(), reason, true)) {
                        break;
                    }
                    i++;
                }
                if (aVar2 != null) {
                    accountClosurePrerequisitesNotMet = new FreelancerServerError.AccountClosurePrerequisitesNotMet(aVar2, aVar.getParams().getAmount(), aVar.getParams().getDate());
                }
            }
        }
        return accountClosurePrerequisitesNotMet;
    }
}
