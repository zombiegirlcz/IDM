package plc;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.robo.impl.data.network.TemplateService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfk.o0;
import pij.d1;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements phm.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateService f237322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f237323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f237324c;
    public final Type d;

    public b(TemplateService service, ne0.d cache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f237322a = service;
        this.f237323b = cache;
        this.f237324c = storage;
        this.d = new TypeToken<List<? extends tlc.a>>() { // from class: com.revolut.feature.robo.impl.data.dods.BenchmarksDodProvider$BENCHMARKS_TYPE$1
        }.getType();
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x4l.c get() {
        return new x4l.c(new o29.l(this, null, 25), new d1(this, 11), new plb.g(this, 1), new o0(this, (Continuation) null, 13), new pfk.q(this, null, 7));
    }
}
