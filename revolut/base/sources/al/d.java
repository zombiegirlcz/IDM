package al;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.json.Json;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zhm.r0;
import zlm.h;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements Interceptor {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6134c;
    public final String d;
    public final Json e;

    public d(String sdkVersion, String sdkVariant, String sdkWrapperPlatform, String sdkWrapperVersion, Json jsonParser) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkVariant, "sdkVariant");
        Intrinsics.checkNotNullParameter(sdkWrapperPlatform, "sdkWrapperPlatform");
        Intrinsics.checkNotNullParameter(sdkWrapperVersion, "sdkWrapperVersion");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.f6132a = sdkVersion;
        this.f6133b = sdkVariant;
        this.f6134c = sdkWrapperPlatform;
        this.d = sdkWrapperVersion;
        this.e = jsonParser;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Map mapK = r0.k(new Pair("integration", this.f6134c), new Pair("integration_version", this.d), new Pair("variant", this.f6133b));
        h hVar = (h) chain;
        i1 i1VarB = hVar.e.b();
        i1VarB.a("x-onfido-sdk-platform", "android");
        i1VarB.a("x-onfido-sdk-version", this.f6132a);
        Json json = this.e;
        i1VarB.a("x-onfido-sdk-metadata", json.c(jh.d.v(json.f187949b, o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))), mapK));
        return hVar.b(new j1(i1VarB));
    }
}
