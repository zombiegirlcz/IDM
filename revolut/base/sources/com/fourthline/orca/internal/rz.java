package com.fourthline.orca.internal;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32872c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X509TrustManager f32873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLContext f32874b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public rz() throws NoSuchAlgorithmException, KeyManagementException {
        sz szVar = new sz();
        this.f32873a = szVar;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new X509TrustManager[]{szVar}, null);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "apply(...)");
        this.f32874b = sSLContext;
    }

    public final SSLContext a() {
        return this.f32874b;
    }

    public final X509TrustManager b() {
        return this.f32873a;
    }
}
