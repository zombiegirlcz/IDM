package nz5;

import com.revolut.core.network.exceptions.NetworkConnectException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import pz5.h;
import ulm.j1;
import ulm.y0;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Interceptor {

    @NotNull
    public static final d Companion = new d();

    public e(h requestIdHeader) {
        Intrinsics.checkNotNullParameter(requestIdHeader, "requestIdHeader");
    }

    public static void a(Response response, j1 j1Var, String str) {
        Regex regex = d0m.b.f110450a;
        String strA = d0m.b.a(j1Var.f281095a.i);
        String str2 = j1Var.f281096b;
        Pair pair = new Pair("request_id", str);
        int i = response.d;
        LinkedHashMap linkedHashMapN = r0.n(pair, new Pair("http_status_code", String.valueOf(i)), new Pair("http_method", str2), new Pair("request_url", strA));
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.DEBUG;
        StringBuilder sb6 = new StringBuilder("HTTP ");
        sb6.append(i);
        sb6.append(" error for ");
        sb6.append(str2);
        sb6.append(" ");
        String strW = j6.a.w(sb6, strA, " [request-id: ", str, "]");
        ArrayList arrayList = new ArrayList(linkedHashMapN.size());
        for (Map.Entry entry : linkedHashMapN.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        rd0.d.b(cVar, null, strW, null, d0.i1(arrayList), 2);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) throws Exception {
        Intrinsics.checkNotNullParameter(chain, "chain");
        j1 j1Var = ((zlm.h) chain).e;
        String strA = j1Var.a("Request-Id");
        if (strA == null) {
            strA = "no_request_id";
        }
        try {
            Response responseB = ((zlm.h) chain).b(j1Var);
            if (responseB.f226097q || responseB.d < 400) {
                return responseB;
            }
            String strF = responseB.f("Request-Id", null);
            if (strF == null) {
                strF = strA;
            }
            a(responseB, j1Var, strF);
            return responseB;
        } catch (Exception e) {
            LinkedHashMap linkedHashMapN = r0.n(new Pair("request_id", strA));
            if (!(e instanceof NetworkConnectException) || e.getCause() == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar = rd0.c.DEBUG;
                String message = e.getMessage();
                ArrayList arrayList = new ArrayList(linkedHashMapN.size());
                for (Map.Entry entry : linkedHashMapN.entrySet()) {
                    arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                }
                rd0.d.b(cVar, null, message, e, d0.i1(arrayList), 2);
                throw e;
            }
            NetworkConnectException networkConnectException = (NetworkConnectException) e;
            linkedHashMapN.put("is_online", String.valueOf(networkConnectException.f51446a));
            linkedHashMapN.put("http_method", networkConnectException.f51447b);
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.c cVar2 = rd0.c.DEBUG;
            Throwable cause = e.getCause();
            String message2 = cause != null ? cause.getMessage() : null;
            Throwable cause2 = e.getCause();
            ArrayList arrayList2 = new ArrayList(linkedHashMapN.size());
            for (Map.Entry entry2 : linkedHashMapN.entrySet()) {
                arrayList2.add(new Pair(entry2.getKey(), entry2.getValue()));
            }
            rd0.d.b(cVar2, null, message2, cause2, d0.i1(arrayList2), 2);
            throw e;
        }
    }
}
