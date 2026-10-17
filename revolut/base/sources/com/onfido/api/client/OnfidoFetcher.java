package com.onfido.api.client;

import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.serialization.json.Json;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import ulm.a1;
import ulm.b1;
import ulm.h1;
import ulm.t;
import ulm.w0;
import ulm.x0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFetcher {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Retrofit f50117a;

    public OnfidoFetcher(OkHttpClient okHttpClient, OnfidoTokenProvider onfidoTokenProvider, String str, String[] strArr, String str2, String str3, String str4, String str5, Json json) {
        TrustManager[] trustManagers;
        String str6 = str;
        lmm.e eVar = new lmm.e(0);
        lmm.b level = lmm.b.BASIC;
        Intrinsics.checkNotNullParameter(level, "level");
        eVar.d = level;
        OkHttpClient.a aVarA = okHttpClient.a();
        ArrayList arrayList = aVarA.f226072c;
        ArrayList interceptors = new ArrayList(arrayList);
        aVarA.a(new o(onfidoTokenProvider));
        aVarA.a(new al.d(str2, str3, str4, str5, json));
        aVarA.a(eVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVarA.d(30L, timeUnit);
        aVarA.f(30L, timeUnit);
        aVarA.h(60L, timeUnit);
        aVarA.e(u.c(h1.HTTP_1_1));
        aVarA.f = true;
        aVarA.a(new al.b(0));
        Intrinsics.checkNotNullParameter(aVarA, "<this>");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        arrayList.removeAll(interceptors);
        Iterator it8 = interceptors.iterator();
        while (it8.hasNext()) {
            aVarA.a((Interceptor) it8.next());
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            trustManagers = trustManagerFactory.getTrustManagers();
        } catch (KeyManagementException unused) {
            m.b();
        } catch (KeyStoreException unused2) {
            m.b();
        } catch (NoSuchAlgorithmException unused3) {
            m.b();
        }
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                aVarA.g(new q(0), (X509TrustManager) trustManager);
                if (strArr != null && strArr.length != 0) {
                    x0.Companion.getClass();
                    String str7 = w0.c(str6).d;
                    ulm.q qVar = new ulm.q();
                    for (String str8 : strArr) {
                        qVar.a(str7, str8);
                    }
                    aVarA.c(new t(d0.i1(qVar.f281123a), null));
                }
                b1.Companion.getClass();
                Retrofit retrofitBuild = new Retrofit.Builder().client(new OkHttpClient(aVarA)).addConverterFactory(ek.b.a(json, a1.a("application/json"))).addCallAdapterFactory(RxJava3CallAdapterFactory.create()).baseUrl(a0.y(str6, "/", false) ? str6 : str6.concat("/")).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                this.f50117a = retrofitBuild;
                return;
            }
        }
        throw new IllegalStateException(("Unexpected default trust managers:" + Arrays.toString(trustManagers)).toString());
    }

    public final Object a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return this.f50117a.create(clazz);
    }
}
