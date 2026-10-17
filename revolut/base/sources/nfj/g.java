package nfj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.esim.impl.network.EsimConfigurationService;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements e {

    @NotNull
    public static final f Companion = new f();
    public static final Type f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimConfigurationService f214946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f214947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f214948c;
    public final ue0.c d;
    public final x4l.c e;

    static {
        Type type = new TypeToken<kfj.h>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimConfigurationRepositoryImpl$Companion$configurationDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f = type;
    }

    public g(EsimConfigurationService api2, ne0.j memoryCache, gte.a featureToggleInteractor, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f214946a = api2;
        this.f214947b = memoryCache;
        this.f214948c = featureToggleInteractor;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new k3c.k(this, continuation, 18), new n7h.c(this, 28), new n8i.e(this, 13), new mta.c(this, continuation, 28), new l05.b(this, continuation, 21));
    }
}
