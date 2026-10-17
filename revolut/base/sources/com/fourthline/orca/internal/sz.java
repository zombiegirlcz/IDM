package com.fourthline.orca.internal;

import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sz extends X509ExtendedTrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X509ExtendedTrustManager f33162a = a();

    private final X509ExtendedTrustManager a() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNullExpressionValue(trustManagers, "getTrustManagers(...)");
        ArrayList arrayList = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509ExtendedTrustManager) {
                arrayList.add(trustManager);
            }
        }
        X509ExtendedTrustManager x509ExtendedTrustManager = (X509ExtendedTrustManager) zhm.d0.d0(arrayList);
        if (x509ExtendedTrustManager != null) {
            return x509ExtendedTrustManager;
        }
        throw new IllegalStateException("Fourthline SDK: PKIX trust manager must be X509ExtendedTrustManager (required for Android network security config and TLS hostname checks).");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f33162a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f33162a.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.f33162a.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f33162a.checkClientTrusted(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f33162a.checkServerTrusted(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine engine) throws CertificateException {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.f33162a.checkClientTrusted(x509CertificateArr, str, engine);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine engine) throws CertificateException {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.f33162a.checkServerTrusted(x509CertificateArr, str, engine);
    }
}
