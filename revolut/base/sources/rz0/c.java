package rz0;

import android.util.Base64;
import c8.g;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.e;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import qz0.f;
import ulm.i1;
import ulm.j1;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258463a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OkHttpClient f258464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f258465c;

    public c(OkHttpClient okHttpClient, d url2) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f258464b = okHttpClient;
        this.f258465c = url2;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f258463a) {
            case 0:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        switch (this.f258463a) {
        }
        return c8.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(h priority, com.bumptech.glide.load.data.d callback) {
        switch (this.f258463a) {
            case 0:
                d dVar = (d) this.f258465c;
                Intrinsics.checkNotNullParameter(priority, "priority");
                Intrinsics.checkNotNullParameter(callback, "callback");
                try {
                    i1 i1Var = new i1();
                    i1Var.e(dVar.f258466a);
                    Map headers = dVar.f258467b.getHeaders();
                    Intrinsics.checkNotNullExpressionValue(headers, "getHeaders(...)");
                    for (Map.Entry entry : headers.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        Intrinsics.h(str);
                        Intrinsics.h(str2);
                        i1Var.a(str, str2);
                    }
                    Response responseExecute = FirebasePerfOkHttpClient.execute(this.f258464b.b(new j1(i1Var)));
                    if (responseExecute.f226097q) {
                        ResponseBody responseBody = responseExecute.f226090g;
                        if (responseBody == null) {
                            throw new IOException("No response from base64 image request");
                        }
                        callback.d(ByteBuffer.wrap(Base64.decode(responseBody.string(), 0)));
                        return;
                    }
                    throw new IOException("Request failed with code: " + responseExecute.d);
                } catch (Exception e) {
                    callback.e(e);
                    return;
                }
            default:
                f fVar = (f) this.f258465c;
                Intrinsics.checkNotNullParameter(priority, "priority");
                Intrinsics.checkNotNullParameter(callback, "callback");
                try {
                    i1 i1Var2 = new i1();
                    i1Var2.e(fVar.f250322a);
                    Map headers2 = fVar.f250323b.getHeaders();
                    Intrinsics.checkNotNullExpressionValue(headers2, "getHeaders(...)");
                    for (Map.Entry entry2 : headers2.entrySet()) {
                        String str3 = (String) entry2.getKey();
                        String str4 = (String) entry2.getValue();
                        Intrinsics.h(str3);
                        Intrinsics.h(str4);
                        i1Var2.a(str3, str4);
                    }
                    Response responseExecute2 = FirebasePerfOkHttpClient.execute(this.f258464b.b(new j1(i1Var2)));
                    if (!responseExecute2.f226097q) {
                        throw new IOException("Request failed with code: " + responseExecute2.d);
                    }
                    ResponseBody responseBody2 = responseExecute2.f226090g;
                    if (responseBody2 == null) {
                        throw new IOException("No response from redirect");
                    }
                    y8.d dVar2 = new y8.d(responseBody2.byteStream(), responseBody2.contentLength());
                    Intrinsics.checkNotNullExpressionValue(dVar2, "obtain(...)");
                    callback.d(dVar2);
                    return;
                } catch (Exception e2) {
                    callback.e(e2);
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f258463a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        int i = this.f258463a;
    }

    public c(f url2, OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f258465c = url2;
        this.f258464b = okHttpClient;
    }
}
