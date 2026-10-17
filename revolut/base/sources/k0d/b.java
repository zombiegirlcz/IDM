package k0d;

import com.revolut.feature.semi_independent_activation.impl.data.service.SemiIndependentActivationConfigService;
import jkc.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiIndependentActivationConfigService f180012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f180013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f180014c;
    public final x4l.c d;

    public b(SemiIndependentActivationConfigService service, ne0.d memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f180012a = service;
        this.f180013b = memoryCache;
        this.f180014c = storage;
        int i = 29;
        Continuation continuation = null;
        this.d = new x4l.c(new e6d.f(this, continuation, i), new jud.d(this, i), new jnf.d(this, 25), new g(this, continuation, 26), new hwi.b(this, continuation, 16));
    }
}
