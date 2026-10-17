package o29;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;
import nya.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements b {

    @NotNull
    public static final c Companion = new c();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifestyleHomeService f221551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f221552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f221553c;
    public final x4l.c d;

    static {
        Type type = new TypeToken<l29.a>() { // from class: com.revolut.feature.lifestyle.core.impl.data.repository.LifestyleHomeOnboardingRepositoryImpl$Companion$ONBOARDING_INFO_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public d(LifestyleHomeService lifestyleHomeService, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(lifestyleHomeService, "lifestyleHomeService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f221551a = lifestyleHomeService;
        this.f221552b = memoryCache;
        this.f221553c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new mtj.k(this, continuation, 27), new b0(this, 24), new nx2.f(this, 14), new nwc.f(this, continuation, 16), new l1(this, continuation, 8));
    }
}
