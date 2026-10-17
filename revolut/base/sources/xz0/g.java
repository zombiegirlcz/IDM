package xz0;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import xz0.i;
import yem.o;
import ylm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements com.bumptech.glide.load.data.e {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f309762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OkHttpClient f309763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z80.b f309764c;
    public final e d;
    public y8.d e;
    public ResponseBody f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile q f309765g;

    public g(j userImageUrl, OkHttpClient authorizedOkHttpClient, z80.b phoneToolsProvider, e failedImageRequestsRepository) {
        Intrinsics.checkNotNullParameter(userImageUrl, "userImageUrl");
        Intrinsics.checkNotNullParameter(authorizedOkHttpClient, "authorizedOkHttpClient");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(failedImageRequestsRepository, "failedImageRequestsRepository");
        this.f309762a = userImageUrl;
        this.f309763b = authorizedOkHttpClient;
        this.f309764c = phoneToolsProvider;
        this.d = failedImageRequestsRepository;
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
    public final void c(com.bumptech.glide.h priority, com.bumptech.glide.load.data.d callback) {
        String phoneNumber;
        boolean z;
        String strE;
        String strE2;
        String strC;
        LocalDateTime localDateTimePlusMinutes;
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        i1 i1Var = new i1();
        i1Var.e(this.f309762a.f309768a);
        i iVar = this.f309762a.f309769b;
        if (iVar instanceof h) {
            phoneNumber = ((h) iVar).f309766a;
            z = true;
        } else {
            if (!iVar.equals(i.a.f309767a)) {
                throw new NoWhenBranchMatchedException();
            }
            phoneNumber = "";
            z = false;
        }
        try {
            e eVar = this.d;
            String url2 = this.f309762a.f309768a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(url2, "url");
            LocalDateTime localDateTime = (LocalDateTime) eVar.f309760a.T2(url2, LocalDateTime.class);
            if ((localDateTime == null || (localDateTimePlusMinutes = localDateTime.plusMinutes(30L)) == null) ? false : localDateTimePlusMinutes.isAfter(((l80.f) eVar.f309761b).f())) {
                throw new IOException("Load request failed previously with the code 404. It won't be executed again until cooldown is not reset.");
            }
            q qVarB = this.f309763b.b(new j1(i1Var));
            this.f309765g = qVarB;
            Response responseExecute = FirebasePerfOkHttpClient.execute(qVarB);
            ResponseBody responseBody = responseExecute.f226090g;
            this.f = responseBody;
            if (responseExecute.f226097q) {
                if (responseBody == null) {
                    throw new IOException("Empty response body.");
                }
                y8.d dVar = new y8.d(responseBody.byteStream(), responseBody.contentLength());
                this.e = dVar;
                callback.d(dVar);
                return;
            }
            int i = responseExecute.d;
            if (i == 404 || i >= 500) {
                e eVar2 = this.d;
                String url3 = this.f309762a.f309768a;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(url3, "url");
                eVar2.f309760a.G(((l80.f) eVar2.f309761b).f(), url3, LocalDateTime.class);
            }
            throw new IOException("Request failed with code: " + responseExecute.d);
        } catch (Exception e) {
            if (!z || !this.f309764c.k(phoneNumber, null)) {
                callback.e(e);
                return;
            }
            z80.b bVar = this.f309764c;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Context context = bVar.f320032a;
            yem.h hVar = bVar.d;
            if (a0.H(phoneNumber, "+", false)) {
                try {
                    o oVarT = hVar.t(phoneNumber, null);
                    Intrinsics.checkNotNullExpressionValue(oVarT, "parse(...)");
                    strE = hVar.e(oVarT, yem.e.NATIONAL);
                } catch (NumberParseException e2) {
                    z80.b.n(phoneNumber, "can't parse local phone number", e2);
                    strE = null;
                }
                strE2 = phoneNumber;
            } else {
                try {
                    wi0.b.Companion.getClass();
                    o oVarT2 = hVar.t(phoneNumber, "GB");
                    Intrinsics.checkNotNullExpressionValue(oVarT2, "parse(...)");
                    strE2 = hVar.e(oVarT2, yem.e.INTERNATIONAL);
                } catch (NumberParseException e4) {
                    z80.b.n(phoneNumber, "can't parse international phone number", e4);
                    strE2 = null;
                }
                strE = phoneNumber;
            }
            try {
                strC = !TextUtils.isEmpty(strE) ? z80.b.c(context, strE) : null;
                try {
                    if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strE2)) {
                        strC = z80.b.c(context, strE2);
                    }
                } catch (SecurityException unused) {
                }
            } catch (SecurityException unused2) {
                strC = null;
            }
            Object objOpenContactPhotoInputStream = strC != null ? ContactsContract.Contacts.openContactPhotoInputStream(context.getContentResolver(), Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, strC), false) : null;
            if (objOpenContactPhotoInputStream != null) {
                callback.d(objOpenContactPhotoInputStream);
            } else {
                callback.e(new Exception("Can't load and find image for this phone:".concat(phoneNumber)));
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        q qVar = this.f309765g;
        if (qVar != null) {
            qVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        try {
            y8.d dVar = this.e;
            if (dVar != null) {
                dVar.close();
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
    }
}
