package l1b;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f191523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f80.a f191524b;

    public i(d decoder, f80.a uriHelper, uli.f deeplinkSchemeProvider) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkSchemeProvider, "deeplinkSchemeProvider");
        this.f191523a = decoder;
        this.f191524b = uriHelper;
    }

    public final String a(String deeplink, String str) {
        if (deeplink == null || deeplink.length() == 0) {
            return null;
        }
        if (!Intrinsics.f(str, "ENCODED_DEEPLINK")) {
            return deeplink;
        }
        d dVar = this.f191523a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new String(dVar.f191515a.f(deeplink), Charsets.UTF_8);
    }
}
