package com.revolut.network;

import com.revolut.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R(\u0010#\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00070\u00070\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001a\u0010&\u001a\u00020%8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001a\u0010,\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u0006¨\u0006."}, d2 = {"Lcom/revolut/network/RetailCoreNetworkConfiguration;", "Lij0/a;", "<init>", "()V", "", "signRequests", "()Z", "", "baseUrl", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "debug", "Z", "getDebug", "logEnabled", "getLogEnabled", "Lij0/b;", "mandatoryInterceptorsProvider", "Lij0/b;", "getMandatoryInterceptorsProvider", "()Lij0/b;", "Lkotlin/Function0;", "needToSimulatedDelay", "Lkotlin/jvm/functions/Function0;", "getNeedToSimulatedDelay", "()Lkotlin/jvm/functions/Function0;", "sslHostPattern", "getSslHostPattern", "", "revolutHosts", "Ljava/util/List;", "getRevolutHosts", "()Ljava/util/List;", "kotlin.jvm.PlatformType", "sslPins", "getSslPins", "", "versionCode", "I", "getVersionCode", "()I", "versionName", "getVersionName", "endToEndMode", "getEndToEndMode", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailCoreNetworkConfiguration implements ij0.a {
    private static final boolean debug = false;
    private static final boolean endToEndMode = false;
    private static final boolean logEnabled = false;

    @NotNull
    private static final List<String> sslPins;
    private static final int versionCode;

    @NotNull
    private static final Function0<String> versionName;

    @NotNull
    public static final RetailCoreNetworkConfiguration INSTANCE = new RetailCoreNetworkConfiguration();

    @NotNull
    private static final String baseUrl = "https://api.revolut.com";

    @NotNull
    private static final ij0.b mandatoryInterceptorsProvider = new a5.a(7);

    @NotNull
    private static final Function0<Boolean> needToSimulatedDelay = new af0.a(4);

    @NotNull
    private static final String sslHostPattern = "*.revolut.com";

    @NotNull
    private static final List<String> revolutHosts = v.k("https://sso.revolut.com", "https://vision-api.revolut.com", "https://auth.revolut.com");

    static {
        String[] SSL_PINS = BuildConfig.SSL_PINS;
        Intrinsics.checkNotNullExpressionValue(SSL_PINS, "SSL_PINS");
        sslPins = d.v0(SSL_PINS);
        versionCode = 1030151101;
        versionName = new af0.a(5);
    }

    private RetailCoreNetworkConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean needToSimulatedDelay$lambda$0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String versionName$lambda$0() {
        return "10.151";
    }

    @Override // ij0.a
    public /* bridge */ boolean failingBackendEnabled() {
        return false;
    }

    @Override // ij0.a
    public /* bridge */ String getAppTypeHeader() {
        return null;
    }

    @Override // ij0.a
    @NotNull
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override // ij0.a
    public boolean getDebug() {
        return debug;
    }

    @Override // ij0.a
    public boolean getEndToEndMode() {
        return endToEndMode;
    }

    @Override // ij0.a
    public boolean getLogEnabled() {
        return logEnabled;
    }

    @Override // ij0.a
    @NotNull
    public ij0.b getMandatoryInterceptorsProvider() {
        return mandatoryInterceptorsProvider;
    }

    @Override // ij0.a
    @NotNull
    public Function0<Boolean> getNeedToSimulatedDelay() {
        return needToSimulatedDelay;
    }

    @Override // ij0.a
    @NotNull
    public List<String> getRevolutHosts() {
        return revolutHosts;
    }

    @Override // ij0.a
    @NotNull
    public String getSslHostPattern() {
        return sslHostPattern;
    }

    @Override // ij0.a
    @NotNull
    public List<String> getSslPins() {
        return sslPins;
    }

    @Override // ij0.a
    public int getVersionCode() {
        return versionCode;
    }

    @Override // ij0.a
    @NotNull
    public Function0<String> getVersionName() {
        return versionName;
    }

    @Override // ij0.a
    public /* bridge */ long requestDelayMs() {
        return super.requestDelayMs();
    }

    @Override // ij0.a
    public boolean signRequests() {
        return true;
    }
}
