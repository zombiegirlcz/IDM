package aa7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements a97.g {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.f f2775b;

    public i(m mapper, r10.f inputProcessor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputProcessor, "inputProcessor");
        this.f2774a = mapper;
        this.f2775b = inputProcessor;
    }

    @Override // a97.g
    public final a97.h e() {
        return new a97.h(a97.a.class);
    }

    @Override // a97.g
    public final a97.k f() {
        return new g(this);
    }
}
