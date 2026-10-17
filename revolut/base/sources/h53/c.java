package h53;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.card_personalisation.generation.impl.network.CustomisationImageGenerationService;
import dp4.z0;
import e6d.f;
import gqh.o;
import gwe.d;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f149445g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomisationImageGenerationService f149446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f149447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wj0.a f149448c;
    public final j d;
    public final ue0.c e;
    public final x4l.c f;

    static {
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.feature.card_personalisation.generation.impl.repository.CustomisationImageGenerationRepositoryImpl$Companion$LIST_OF_STRINGS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f149445g = type;
    }

    public c(CustomisationImageGenerationService service, tl0.a base64Wrapper, wj0.a idempotencyKeyHolder, j memoryCache, ue0.c customisationImageGenerationStorage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(customisationImageGenerationStorage, "customisationImageGenerationStorage");
        this.f149446a = service;
        this.f149447b = base64Wrapper;
        this.f149448c = idempotencyKeyHolder;
        this.d = memoryCache;
        this.e = customisationImageGenerationStorage;
        Continuation continuation = null;
        this.f = new x4l.c(new f(this, continuation, 14), new d(this, 26), new h1c.c(this, 8), new o(this, continuation, 16), new z0(this, continuation, 25));
    }
}
