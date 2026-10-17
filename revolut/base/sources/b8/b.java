package b8;

import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.e;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import i8.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ulm.i1;
import ulm.j1;
import ulm.o;
import ulm.p;
import y8.f;
import ylm.q;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements e, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f13070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f13071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y8.d f13072c;
    public ResponseBody d;
    public com.bumptech.glide.load.data.d e;
    public volatile q f;

    public b(o oVar, k kVar) {
        this.f13070a = oVar;
        this.f13071b = kVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        return c8.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(h hVar, com.bumptech.glide.load.data.d dVar) {
        i1 i1Var = new i1();
        i1Var.e(this.f13071b.b());
        for (Map.Entry entry : this.f13071b.f159379a.getHeaders().entrySet()) {
            i1Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        j1 j1Var = new j1(i1Var);
        this.e = dVar;
        this.f = ((OkHttpClient) this.f13070a).b(j1Var);
        FirebasePerfOkHttpClient.enqueue(this.f, this);
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        q qVar = this.f;
        if (qVar != null) {
            qVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        try {
            y8.d dVar = this.f13072c;
            if (dVar != null) {
                dVar.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.e = null;
    }

    @Override // ulm.p
    public final void onFailure(Call call, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
        }
        this.e.e(iOException);
    }

    @Override // ulm.p
    public final void onResponse(Call call, Response response) {
        ResponseBody responseBody = response.f226090g;
        this.d = responseBody;
        if (!response.f226097q) {
            this.e.e(new HttpException(response.f226089c, response.d, null));
            return;
        }
        f.c(responseBody, "Argument must not be null");
        y8.d dVar = new y8.d(this.d.byteStream(), responseBody.contentLength());
        this.f13072c = dVar;
        this.e.d(dVar);
    }
}
