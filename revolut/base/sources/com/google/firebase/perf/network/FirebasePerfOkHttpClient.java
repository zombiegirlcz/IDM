package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import rf.d;
import tf.g;
import ulm.b1;
import ulm.j1;
import ulm.p;
import ulm.x0;
import wf.e;

/* JADX INFO: loaded from: classes17.dex */
public class FirebasePerfOkHttpClient {
    public static void a(Response response, d dVar, long j2, long j3) throws IOException {
        j1 j1Var = response.f226087a;
        if (j1Var == null) {
            return;
        }
        dVar.W(j1Var.f281095a.k().toString());
        dVar.c(j1Var.f281096b);
        RequestBody requestBody = j1Var.d;
        if (requestBody != null) {
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                dVar.e(jContentLength);
            }
        }
        ResponseBody responseBody = response.f226090g;
        if (responseBody != null) {
            long jContentLength2 = responseBody.contentLength();
            if (jContentLength2 != -1) {
                dVar.J(jContentLength2);
            }
            b1 b1VarContentType = responseBody.contentType();
            if (b1VarContentType != null) {
                dVar.z(b1VarContentType.f281065a);
            }
        }
        dVar.d(response.d);
        dVar.j(j2);
        dVar.T(j3);
        dVar.b();
    }

    @Keep
    public static void enqueue(Call call, p pVar) {
        Timer timer = new Timer();
        call.d(new ne0.p(pVar, e.f296850s, timer, timer.f49592a));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        d dVar = new d(e.f296850s);
        Timer timer = new Timer();
        long j2 = timer.f49592a;
        try {
            Response responseExecute = call.execute();
            a(responseExecute, dVar, j2, timer.a());
            return responseExecute;
        } catch (IOException e) {
            j1 j1VarRequest = call.request();
            if (j1VarRequest != null) {
                x0 x0Var = j1VarRequest.f281095a;
                if (x0Var != null) {
                    dVar.W(x0Var.k().toString());
                }
                String str = j1VarRequest.f281096b;
                if (str != null) {
                    dVar.c(str);
                }
            }
            dVar.j(j2);
            dVar.T(timer.a());
            g.c(dVar);
            throw e;
        }
    }
}
