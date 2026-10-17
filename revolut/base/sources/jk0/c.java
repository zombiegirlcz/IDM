package jk0;

import java.util.List;
import kj0.h;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.converter.gson.GsonConverterFactory;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ik0.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f175032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GsonConverterFactory f175034c;
    public final kj0.a d;
    public final h e;
    public final ih0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f175035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f175036h;
    public final Lazy i;

    public c(OkHttpClient baseHttpClient, String defaultBaseUrl, GsonConverterFactory defaultConverterFactory, kj0.a circuitBreakerCallAdapterFactory, h revolutCircuitBreakerCallAdapterFactory, ih0.b remoteConfig, List defaultCallAdapterFactories) {
        Intrinsics.checkNotNullParameter(baseHttpClient, "baseHttpClient");
        Intrinsics.checkNotNullParameter(defaultBaseUrl, "defaultBaseUrl");
        Intrinsics.checkNotNullParameter(defaultConverterFactory, "defaultConverterFactory");
        Intrinsics.checkNotNullParameter(circuitBreakerCallAdapterFactory, "circuitBreakerCallAdapterFactory");
        Intrinsics.checkNotNullParameter(revolutCircuitBreakerCallAdapterFactory, "revolutCircuitBreakerCallAdapterFactory");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(defaultCallAdapterFactories, "defaultCallAdapterFactories");
        this.f175032a = baseHttpClient;
        this.f175033b = defaultBaseUrl;
        this.f175034c = defaultConverterFactory;
        this.d = circuitBreakerCallAdapterFactory;
        this.e = revolutCircuitBreakerCallAdapterFactory;
        this.f = remoteConfig;
        this.f175035g = defaultCallAdapterFactories;
        final int i = 0;
        this.f175036h = j.b(new Function0(this) { // from class: jk0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f175031b;

            {
                this.f175031b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i) {
                    case 0:
                        zB = ((ii0.b) this.f175031b.f).b("PM_ANDROID_CIRCUIT_BREAKER_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f175031b.f).b("PM_ANDROID_GLOBAL_AND_SERVICE_CIRCUIT_BREAKER_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
        final int i2 = 1;
        this.i = j.b(new Function0(this) { // from class: jk0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f175031b;

            {
                this.f175031b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i2) {
                    case 0:
                        zB = ((ii0.b) this.f175031b.f).b("PM_ANDROID_CIRCUIT_BREAKER_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f175031b.f).b("PM_ANDROID_GLOBAL_AND_SERVICE_CIRCUIT_BREAKER_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
    }
}
