package v3e;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.data.model.Data;
import efm.h0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class s implements kfm.o, kfm.c, kfm.p, kfm.g, efm.v, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285918b;

    public /* synthetic */ s(Object obj2, int i) {
        this.f285917a = i;
        this.f285918b = obj2;
    }

    @Override // efm.v
    public efm.y a(efm.y p0) {
        tm.a aVar = (tm.a) this.f285918b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (efm.y) aVar.invoke(p0);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f285917a) {
            case 7:
                ((qza.q) this.f285918b).invoke(obj2);
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                ((sri.p) this.f285918b).invoke(obj2);
                break;
            case 12:
                ((vf0.u) this.f285918b).invoke(obj2);
                break;
            case 13:
                ((vf0.u) this.f285918b).invoke(obj2);
                break;
            case 14:
                ((vf0.u) this.f285918b).invoke(obj2);
                break;
            case 15:
                ((vf0.u) this.f285918b).invoke(obj2);
                break;
            case 16:
                ((f2) this.f285918b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f285917a) {
            case 0:
                n nVar = (n) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar.invoke(p0);
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                whi.b bVar = (whi.b) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PinCodeView.Header) bVar.invoke(p0);
            case 3:
                tm.a aVar = (tm.a) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar.invoke(p0);
            case 4:
                tm.a aVar2 = (tm.a) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) aVar2.invoke(p0);
            case 5:
                tm.a aVar3 = (tm.a) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar3.invoke(p0);
            case 6:
                vf0.m mVar = (vf0.m) this.f285918b;
                Throwable throwable = (Throwable) p0;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (!((Boolean) mVar.d.invoke(throwable)).booleanValue()) {
                    int i = mVar.e + 1;
                    mVar.e = i;
                    if (i <= mVar.f288460c) {
                        return efm.r.timer(mVar.f, TimeUnit.MILLISECONDS).doOnNext(new vdl.s(29, new vdl.a(mVar, 13)));
                    }
                }
                return efm.r.error(throwable);
            case 10:
                qza.q qVar = (qza.q) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) qVar.invoke(p0);
            case 11:
                tm.a aVar4 = (tm.a) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar4.invoke(p0);
            case 18:
                whi.b bVar2 = (whi.b) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar2.invoke(p0);
        }
    }

    public xb.b b(gpk.c cVar) throws IOException {
        xb.c cVar2 = (xb.c) this.f285918b;
        URL url2 = (URL) cVar.f145463a;
        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url2);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar2.f303924g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cVar.f145465c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    wif.a aVar = cVar2.f303921a;
                    yb.n nVar = (yb.n) cVar.f145464b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    xe.d dVar = (xe.d) aVar.f297889a;
                    xe.e eVar = new xe.e(bufferedWriter, dVar.f304508a, dVar.f304509b, dVar.f304510c, dVar.d);
                    eVar.a(nVar);
                    eVar.c();
                    eVar.f304512b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    nim.a.j(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    nim.a.j(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new xb.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new xb.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            xb.b bVar = new xb.b(responseCode, null, yb.v.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f312140a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException e) {
            e = e;
            nim.a.k("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new xb.b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            nim.a.k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new xb.b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            nim.a.k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new xb.b(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            nim.a.k("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new xb.b(400, null, 0L);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f285917a) {
            case 2:
                qza.q qVar = (qza.q) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) qVar.invoke(p0)).booleanValue();
            default:
                qza.q qVar2 = (qza.q) this.f285918b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                qVar2.invoke(p0);
                return Boolean.TRUE.booleanValue();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        zf.a aVar = (zf.a) this.f285918b;
        if (task.isSuccessful()) {
            ag.e eVar = aVar.f321808c;
            synchronized (eVar) {
                eVar.f4684c = Tasks.forResult(null);
            }
            ag.v vVar = eVar.f4683b;
            synchronized (vVar) {
                vVar.f4743a.deleteFile(vVar.f4744b);
            }
            ag.g gVar = (ag.g) task.getResult();
            if (gVar != null) {
                JSONArray jSONArray = gVar.d;
                qd.b bVar = aVar.f321806a;
                if (bVar != null) {
                    try {
                        bVar.c(zf.a.d(jSONArray));
                    } catch (AbtException e) {
                    } catch (JSONException e2) {
                    }
                }
                com.google.firebase.messaging.t tVar = aVar.i;
                try {
                    dg.d dVarG = ((ao.h) tVar.f49544c).g(gVar);
                    Iterator it8 = ((Set) tVar.e).iterator();
                    while (it8.hasNext()) {
                        ((Executor) tVar.d).execute(new bg.b((fe.b) it8.next(), dVarG, 0));
                    }
                } catch (FirebaseRemoteConfigException e4) {
                }
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        pq0.d dVar = (pq0.d) this.f285918b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Data) dVar.invoke(p0, p17);
    }
}
