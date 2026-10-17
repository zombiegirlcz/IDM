package wf6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements ke6.d0 {

    @NotNull
    private static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f296996a;

    public l0(q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f296996a = deeplinkParser;
    }

    public static IllegalArgumentException a(String str) {
        return new IllegalArgumentException(p.a.p("Can't parse ", str, " deeplink here"));
    }
}
