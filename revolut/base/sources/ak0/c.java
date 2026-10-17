package ak0;

import aj0.o;
import kotlin.jvm.internal.Intrinsics;
import lmm.e;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import te0.w;
import xj0.m;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij0.a f5628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5630c;
    public final Object d;

    public c(ij0.a configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f5628a = configuration;
        this.f5629b = w.y0(new o(10));
        this.f5630c = w.y0(new o(11));
        this.d = w.y0(new o(12));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    public final OkHttpClient.a a(OkHttpClient.a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (this.f5628a.getLogEnabled()) {
            builder.b((e) this.f5629b.getValue());
            builder.b((xj0.b) this.f5630c.getValue());
            builder.b((m) this.d.getValue());
        }
        return builder;
    }
}
