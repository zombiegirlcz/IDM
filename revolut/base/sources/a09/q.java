package a09;

import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnService f277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f279c;
    public final x4l.c d;

    public q(LearnService apiService, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f277a = apiService;
        this.f278b = memoryCache;
        this.f279c = storage;
        Continuation continuation = null;
        int i = 1;
        this.d = new x4l.c(new o(this, continuation, 0), new a0.c(this, 2), new b(this, i), new a07.d(this, continuation, i), new p(this, continuation, 0));
    }
}
