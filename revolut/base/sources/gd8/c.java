package gd8;

import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentPromptService;
import dp4.z0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorConsentPromptService f143077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f143078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f143079c;
    public final x4l.c d;
    public final ConcurrentHashMap e;

    public c(JuniorConsentPromptService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f143077a = service;
        this.f143078b = storage;
        this.f143079c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new e6d.f(this, continuation, 11), new gd3.i(this, 1), new g75.i(this, 19), new g85.f(this, continuation, 6), new z0(this, continuation, 20));
        this.e = new ConcurrentHashMap();
    }
}
