package sz0;

import a01.f;
import android.content.SharedPreferences;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.e;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.revolut.core.error.data.model.NoAuthTokenException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import skm.a2;
import ulm.i1;
import ulm.j1;
import ylm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f266714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OkHttpClient f266715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.b f266716c;
    public final a01.b d;
    public volatile FileInputStream e;
    public volatile ResponseBody f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f266717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile q f266718h;

    public a(b userImageUrl, OkHttpClient authorizedOkHttpClient, zk0.b fileSystemRepository, a01.b avatarStorage) {
        Intrinsics.checkNotNullParameter(userImageUrl, "userImageUrl");
        Intrinsics.checkNotNullParameter(authorizedOkHttpClient, "authorizedOkHttpClient");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(avatarStorage, "avatarStorage");
        this.f266714a = userImageUrl;
        this.f266715b = authorizedOkHttpClient;
        this.f266716c = fileSystemRepository;
        this.d = avatarStorage;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        return c8.a.REMOTE;
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00e9: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:34:0x00e9 */
    @Override // com.bumptech.glide.load.data.e
    public final void c(h priority, com.bumptech.glide.load.data.d callback) throws Throwable {
        String string;
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        i1 i1Var = new i1();
        i1Var.e(this.f266714a.f266719a);
        zk0.b bVar = this.f266716c;
        zk0.a aVar = zk0.a.INTERNAL_CACHE;
        File fileM = ((a80.h) bVar).m(aVar, "USER_AVATAR_IMAGE_CACHE_FILE_NAME");
        FileInputStream fileInputStream = fileM.exists() ? new FileInputStream(fileM) : null;
        if (fileInputStream != null) {
            this.e = fileInputStream;
        }
        if (((a80.h) this.f266716c).m(aVar, "USER_AVATAR_IMAGE_CACHE_FILE_NAME").exists()) {
            Object value = ((f) this.d).d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            string = ((SharedPreferences) value).getString("PROFILE_LAST_MODIFIED_KEY", null);
        } else {
            string = null;
        }
        if (string != null) {
            i1Var.b("If-Modified-Since", string);
        }
        if (this.f266717g) {
            return;
        }
        boolean z4 = true;
        try {
            try {
                q qVarB = this.f266715b.b(new j1(i1Var));
                this.f266718h = qVarB;
                Response responseExecute = FirebasePerfOkHttpClient.execute(qVarB);
                ResponseBody responseBody = responseExecute.f226090g;
                this.f = responseBody;
                z = false;
                try {
                    if (responseExecute.f226097q && responseExecute.d != 204) {
                        if (responseBody == null) {
                            throw new IOException("Empty response body.");
                        }
                        y8.d dVarF = y8.d.f(responseBody.byteStream(), responseBody.contentLength());
                        String strF = responseExecute.f("last-modified", null);
                        f fVar = (f) this.d;
                        a2 a2Var = fVar.f;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        fVar.f = null;
                        fVar.e = 2;
                        Object value2 = fVar.d.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((SharedPreferences) value2).edit().putString("PROFILE_LAST_MODIFIED_KEY", strF).commit();
                        ((a80.h) this.f266716c).n(aVar, dVarF, "USER_AVATAR_IMAGE_CACHE_FILE_NAME");
                        File fileM2 = ((a80.h) this.f266716c).m(aVar, "USER_AVATAR_IMAGE_CACHE_FILE_NAME");
                        FileInputStream fileInputStream2 = fileM2.exists() ? new FileInputStream(fileM2) : null;
                        this.e = fileInputStream2;
                        if (this.f266717g) {
                            return;
                        }
                        callback.d(fileInputStream2);
                        return;
                    }
                    int i = responseExecute.d;
                    if (i != 204) {
                        if (i != 304) {
                            if (i != 404) {
                                if (!this.f266717g) {
                                    callback.e(new IOException("Request failed with code: " + responseExecute.d));
                                }
                            }
                        } else if (fileInputStream == null && !this.f266717g) {
                            callback.e(new IOException("Request failed with code: " + responseExecute.d + ". And no cached file is available"));
                        }
                        if (fileInputStream == null || this.f266717g) {
                            return;
                        }
                        callback.d(fileInputStream);
                        return;
                    }
                    ((f) this.d).a();
                    ((a80.h) this.f266716c).e(aVar, "USER_AVATAR_IMAGE_CACHE_FILE_NAME");
                    if (this.f266717g) {
                        return;
                    }
                    callback.e(new IOException("Request failed with code: " + responseExecute.d + ". User does not probably have an avatar"));
                } catch (NoAuthTokenException e) {
                    e = e;
                    ((f) this.d).f104b = true;
                    if (fileInputStream == null && !this.f266717g) {
                        callback.e(e);
                    }
                    if (!z || fileInputStream == null || this.f266717g) {
                        return;
                    }
                    callback.d(fileInputStream);
                }
            } catch (Throwable th10) {
                th = th10;
                z4 = z3;
                if (z4 && fileInputStream != null && !this.f266717g) {
                    callback.d(fileInputStream);
                }
                throw th;
            }
        } catch (NoAuthTokenException e2) {
            e = e2;
            z = true;
        } catch (Throwable th11) {
            th = th11;
            if (z4) {
                callback.d(fileInputStream);
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f266717g = true;
        q qVar = this.f266718h;
        if (qVar != null) {
            qVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        try {
            FileInputStream fileInputStream = this.e;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        ResponseBody responseBody = this.f;
        if (responseBody != null) {
            responseBody.close();
        }
        this.e = null;
        this.f = null;
    }
}
